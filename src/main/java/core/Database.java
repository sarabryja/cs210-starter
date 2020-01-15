package core;


import driver.*;
import model.*;
import structure.*;

import java.util.List;
import java.util.LinkedList;
import java.io.Closeable;
import java.io.IOException;

/** 
 * This class implements a database
 * management system.
 * 
 * Additional protocols may be added.
 */
public class Database
	implements Closeable
{
	private Driver[] drivers;
	private HashMap<String, Table> tables;

	/**
	 * Initialize the database with a set of tables
	 * and a sequence of drivers.
	 * 
	 * Do not modify the protocol.
	 */
	public Database() {
		setTables(new VolatileHashMap<>());
		
		// TODO: Initialize available drivers in sequence.
		this.drivers = new Driver[]{
			new Echo()
		};
	}
	
	/**
	 * Returns the tables of this database.
	 * 
	 * Do not modify the protocol.
	 * 
	 * @return the tables
	 */
	public HashMap<String, Table> getTables() {
		return tables;
	}
	
	/**
	 * Assigns the tables of this database.
	 * 
	 * Do not modify the protocol.
	 * 
	 * @param tables the tables
	 */
	public void setTables(HashMap<String, Table> tables) {
		this.tables = tables;
	}

	/**
	 * Interprets a script and returns a list of
	 * responses to each query when executed.
	 * 
	 * Do not modify the protocol.
	 * 
	 * @param script the script
	 * @return the list of responses to each query
	 */
	public List<Response> interpret(String script) {
		String query = script;

		List<Response> responses = new LinkedList<Response>();
		responses.add(drivers[0].execute(query, this));

		return responses;
	}
	
	/**
	 * Execute any required tasks when
	 * the database is closed.
	 * 
	 * Do not modify the protocol.
	 */
	@Override
	public void close() throws IOException {
		
	}
}
