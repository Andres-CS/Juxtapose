import java.io.IOException;

public class Application {

	public static void main(String[] args) throws IOException {	
		System.out.println("TESTING");
		
		pdfFiles var = new pdfFiles();
		
		var.setFilename("C:\\Users\\18628\\Desktop\\Development\\TEST_Files\\002272__DBJPM 2020-C9\\Preliminary\\PPM\\DBJPM 2020-C9 - PPM__MERGED.pdf");
		
		var.getPDFinfo();

	}

}
