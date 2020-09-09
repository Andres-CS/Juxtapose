
import java.io.File;
import java.io.IOException;

import java.util.Calendar;

import java.lang.String;

import java.text.SimpleDateFormat;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentInformation;

public class pdfFiles {
	
	private String FName;
	private File pathFile; 
	
	
	/*
	  -- Constructors -- 
	*/
	public pdfFiles() {	}
	
	public pdfFiles(String FilePath) {
		if(this.hasdotpdf(FilePath)) {
			this.FName = FilePath;
			//Create File obj
			pathFile = new File(FilePath);
			System.out.println("File to work on is: " + this.FName);
		}
	}
	
	/*
	  -- Checkers -- 
	*/
	
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
	
	
	/*
	  -- Setters -- 
	*/
	public void setFilename(String FilePath) {
		this.FName = FilePath;
		if(this.hasdotpdf(FilePath)) {
			System.out.println("GOOD TO GO.");
		}
	}
	
	
	/*
	  -- Getters -- 
	*/
	
	public void getPDFinfo() throws IOException{
	
		try{
			System.out.println("getPDFinfo try");
			PDDocument document = PDDocument.load(new File(this.FName));
			PDDocumentInformation info = document.getDocumentInformation();
			
			//Retrieving the info of a PDF document
		    System.out.println("Author of the document is :"+ info.getAuthor());
		    System.out.println("Title of the document is :"+ info.getTitle());
		    System.out.println("Subject of the document is :"+ info.getSubject());
	
		    System.out.println("Creator of the document is :"+ info.getCreator());
		    
		    Calendar creationDate = info.getCreationDate();
		    SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
		    String formatted = format1.format(creationDate.getTime());
		    
		    System.out.println("Creation date of the document is :"+ formatted);
		    
		    Calendar modifDate = info.getModificationDate();
		    formatted = format1.format(modifDate.getTime());
		    
		    System.out.println("Modification date of the document is :"+ formatted); // info.getModificationDate()); 
		    System.out.println("Keywords of the document are :"+ info.getKeywords()); 
		     
		    //Closing the document 
		    document.close();
		}
		catch (IOException e) {
			System.out.println("Something happend" + e);
		}
	}
	

}
