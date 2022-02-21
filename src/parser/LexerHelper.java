package parser;

import java.net.StandardSocketOptions;

public class LexerHelper {
	
	public static int lexemeToInt(String str) {
		try {
			return Integer.parseInt(str);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		return -1;
	}

	// TODO: Implement the lexemeToChar and lexemeToReal methods


	public static char lexemeToChar(String str){

		try{


			char s = str.charAt(1); //If we have " '\n' " as a String, ' is char 0, \n is char 1 and ' is char 2

			if(s == '\\'){ //If not standard char

				return checkCharBackslash(str);

			}

			return s;

		}catch(IndexOutOfBoundsException e){
			System.out.println(e);
		}


		return Character.MIN_VALUE;

	}



	public static double lexemeToReal(String str){

		try{
			return Double.parseDouble(str);
		}catch(NumberFormatException e){
			System.out.println(e);
		}

		return -1L;
	}



	private static char checkCharBackslash(String str){


		if(str.equals("'\\n'")) return '\n';
		if(str.equals("'\\t'")) return '\t';

		String aux = "";
		for(int i = 2; i<str.length()-1;i++){ //If '\125' take all chars from 1 to 5
			aux += str.charAt(i); //Concatenate numeric values of the char (if any) to compute corresponding char
		}


		try{
			int charInt = Integer.parseInt(aux); //Compute corresponding char
			if(charInt < 0 || charInt >= 128) return Character.MIN_VALUE; //If exceed limits of encoding
			return (char) charInt;

		}catch(NumberFormatException e){ //If not all elements in '\xxx' are numbers
			System.out.println(e);
			return Character.MIN_VALUE;
		}

	}

}
