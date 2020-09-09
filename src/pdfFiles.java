
import java.io.File;
import java.lang.String;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentInformation;

public class pdfFiles {
	
	private String FName;
	
	
	//Constructors
	public pdfFiles() {
		//Default Constructor;
	}
	
	public pdfFiles(String FilePath) {
		this.FName = FilePath;
		System.out.println("File to work on is: " + this.FName);
		
		if(this.hasdotpdf(FilePath)) {
			System.out.println("GOOD TO GO.");
		}
		
	}
	
	//Check file has correct File extension
	private boolean hasdotpdf(String FilePath) {
		boolean fileOK = false;
		String pdfext = ".pdf";
		int lastPOSperiod = FilePath.lastIndexOf(".");
		int sizeofFileName = FilePath.length();
		String fileext = FilePath.substring(lastPOSperiod, sizeofFileName);
		
		if(pdfext.compareTo(fileext) == 0) { fileOK = true; }
		
		return fileOK;
	}
	
	
	//Setters
	public void setFilename(String FilePath) {
		this.FName = FilePath;
		if(this.hasdotpdf(FilePath)) {
			System.out.println("GOOD TO GO.");
		}
	}
	

}
