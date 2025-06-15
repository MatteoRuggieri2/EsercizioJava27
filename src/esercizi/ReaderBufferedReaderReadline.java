package esercizi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderBufferedReaderReadline {

	public static void main(String[] args) {
		ReaderBufferedReaderReadline rbrr = new ReaderBufferedReaderReadline();
		rbrr.run();

	}
	
	private void run() {
		File file = new File("src/text_files/sentences.txt");
		BufferedReader br = null;
		
		// Apro il nuovo file
		try {
			br = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
		
		String character = "";
		
		while (character != null) {
        	
        	// Leggo le righe del file e le stampo se non sono uguali a "null"
            try {
    			character = br.readLine();
    			if (character != null) { System.out.println(character); }
    		} catch (IOException e) {
    			e.printStackTrace();
    		}
			
		}

        
        
        // Chiudo il BufferedReader
        try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
