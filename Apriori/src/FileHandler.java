
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.supercsv.io.CsvListReader;
import org.supercsv.io.ICsvListReader;
import org.supercsv.prefs.CsvPreference;


/**
 * Class used to read a CSV file line by line until the end is reached
 * 
 * FileHandler.dispose() should be called once the object is finished being used
 * 
 * Current limitation is that a new object will need to be created if you need
 * to read through a file again.
 * 
 * 
 */
public class FileHandler {
	CsvPreference csvPrefs;
	ICsvListReader listReader;
	
	
	public FileHandler(String filename, char delimiter, boolean containsHeader) {
		try {			
			// Setup preferences for reader object
			setupCSVPrefs(delimiter);
			
			// Create new reader object
			listReader = new CsvListReader(new FileReader(filename), csvPrefs);
			
			
			// Dispose of header if it exists
			if (containsHeader)
				listReader.getHeader(true);			
		} catch (FileNotFoundException e) {
			// Should we rethrow this exception for the caller to catch?
			// I think so, because otherwise what do we do once this exception has been handled here
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	private void setupCSVPrefs(char delimiter) {
		csvPrefs = new CsvPreference.Builder('"', delimiter, "\n").build();
	}
	
	public List<String> getNextLine() {
		List<String> result = null;
		
		try {
			result = listReader.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public void dispose() {
		try {			
			if (listReader != null)
				listReader.close();
		} catch (IOException e) {
			// We should definitely just eat these exceptions
			e.printStackTrace();
		}


	}
}
