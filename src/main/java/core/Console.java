package core;


import model.*;

import java.util.List;
import java.util.Scanner;
import java.io.PrintStream;
import java.io.IOException;

/** 
 * This class implements a user console for
 * interacting with a database.
 * 
 * Additional protocols may be added.
 */
public class Console {
	/**
	 * This is the entry point for execution
	 * with user input/output.
	 * 
	 * Do not modify the protocol.
	 */
	public static void main(String[] args) {
		try (
			final Database db = new Database();
			final Scanner in = new Scanner(System.in);
			final PrintStream out = System.out;
		) 
		{
			out.print(">> "); // TODO: known issue with IntelliJ IDEA
			String text = in.nextLine();
	
			List<Response> responses = db.interpret(text);
	
			out.println("Success: " + responses.get(0).getSuccess());
			out.println("Message: " + responses.get(0).getMessage());
	
			// TODO: For Module 4, pretty-print the table.
			out.println("Table:   " + responses.get(0).getTable());
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
