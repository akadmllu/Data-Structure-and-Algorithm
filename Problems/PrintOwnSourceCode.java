import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintOwnSourceCode {
	private static FileInputStream objFileInputStream = null;
	private static BufferedReader objBufferedReader = null;
	public static void main(String[] args) {
		try {
			objFileInputStream = new FileInputStream("./src/PrintOwnSourceCode.java");
			objBufferedReader = new BufferedReader(new InputStreamReader(objFileInputStream));
			String sLine = null;
			while((sLine = objBufferedReader.readLine()) != null) {
				System.out.println(sLine);
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(objFileInputStream != null) {
				try {
					objFileInputStream.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
