import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class PrintLetter {
	
	public PrintLetter() throws IOException{
		ReadLetterfromFile();
	}
	
	private void ReadLetterfromFile() throws IOException{
		BufferedReader inputStream = null;
		
		inputStream = new BufferedReader(new FileReader("letter.txt"));
		String read;
		while((read = inputStream.readLine()) != null){
			System.out.println(read);
		}
		
		if(inputStream != null)
			inputStream.close();
	}
	
	public void PrintUnformattedLetter(){
		// this prints a weird ascii letter
		// shit formatting just learning java printing
		String plusSign = "+";
		String minusSign = "---------------------------------------------";
		String spaces = "                                        " ;
		String spaces12 ="                 ";
		String spaces13 ="            ";
		String spaces14 ="           ";
		String newSpaces = "     ";
		String name = "Cuneyt Acar";
		String address = "12 BlahBlah road";
		String state = "Chicaco, IL 51123";
		
		
		System.out.println(plusSign+minusSign+plusSign);
		
		System.out.println("|" + spaces + "####" + " |");
		System.out.println("|" + spaces + "####" + " |");
		System.out.println("|" + spaces + "####" + " |");
		
		System.out.println("|" + spaces +newSpaces + "|");
		System.out.println("|" + spaces +newSpaces + "|");

		System.out.println("|" + spaces12 + name + spaces12 + "|");
		System.out.println("|" + spaces12 + address + spaces13 + "|");
		System.out.println("|" + spaces12 + state + spaces14 + "|");
		
		System.out.println("|" + spaces +newSpaces + "|");
		System.out.println(plusSign+minusSign+plusSign);
	}
}
