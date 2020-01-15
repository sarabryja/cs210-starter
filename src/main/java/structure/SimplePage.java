package structure;

import model.*;

import java.util.List;
import java.nio.file.Path;

public class SimplePage
	implements Page
{
	/*
	 * TODO: For Module 7, implement the requirements.
	 * 
	 * Until then, this class is unused.
	 */
	public SimplePage(Path path, List<String> field_types, int key_index) {
		return;
	}

	@Override
	public Path getPath() {
		return null;
	}

	@Override
	public List<String> getFieldTypes() {
		return null;
	}

	@Override
	public int getKeyIndex() {
		return 0;
	}
	
	@Override
	public int length() {
		return 0;
	}

	@Override
	public void length(int length) {
		return;
	}

	@Override
	public int size() {
		return 0;
	}

	@Override
	public void size(int size) {
		return;
	}

	@Override
	public void write(int index, List<Object> entry) {
		return;
	}

	@Override
	public void writeNull(int index) {
		return;
	}

	@Override
	public List<Object> read(int index) {
		return null;
	}

	@Override
	public boolean isRecord(int index) {
		return false;
	}

	@Override
	public boolean isNull(int index) {
		return false;
	}
}
