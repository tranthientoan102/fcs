package Recursive.DecodeString;

import java.util.Scanner;

public class Main {

	final char GROUPMARK_START = '[';
	final char GROUPMARK_END = ']';
//	String content;

	public static void main(String[] args) {
		System.out.print("Your message is : ");
		Scanner scanner = new Scanner(System.in);
		String code = scanner.next();


//		String code = "1[START_]2[^bc2[_d3[AA]_2[ZZ]]]2[_END]";
//		String code = "2[b]";

		Main decodeString = new Main();
		System.out.println(decodeString.decode(code));

	}


	public String decode(String input){
		String result;
		int coreStartIndex = input.indexOf(GROUPMARK_START);

//		System.out.println("coreStartIndex = " + coreStartIndex);

		if (coreStartIndex==-1) return input;
		else {
			int coreEndIndex = findCoreEndIndex(coreStartIndex, input);
			int scalarStartIndex = getScalarIndex(coreStartIndex, input);

//			System.out.println("scalarStartIndex = " + scalarStartIndex);
			
			int scalar = getScalar(scalarStartIndex, coreStartIndex, input);
			String core = input.substring(coreStartIndex + 1, coreEndIndex);
			System.out.printf("Decoding %d times %s ...\n", scalar, core);
			String coreDecoded = decode(core);
			StringBuilder builder = new StringBuilder();
			for (; scalar>=1; scalar--){
				builder.append(coreDecoded);
			}
			String oldGroup = input.substring(scalarStartIndex, coreEndIndex+1);
			return decode(input.replace(oldGroup, builder.toString()));
		}

	}

	private int findCoreEndIndex(int coreStartIndex, String input){
		int innerGroup = 1;

		for(int i= coreStartIndex+1; i < input.length(); i++){
			if (input.charAt(i)- GROUPMARK_START == 0){
				innerGroup += 1;
			}else if (input.charAt(i) - GROUPMARK_END == 0) {
				innerGroup -= 1;
				if (innerGroup==0) return i;
			}

		}
		throw new IllegalArgumentException("Input format is incorrect: " + input);
	}
	private int getScalarIndex(int groupStartIndex , String input){
		int result = 0;
		for (int i= groupStartIndex-1; i >=0; i--){
			if (!checkCharIsNumber(input.charAt(i))) {
//				String scalarString = content.substring(i + 1, groupStartIndex);
//				result = Integer.parseInt(scalarString);
				return i+1;
			}
		}
		return result;
	}
	private boolean checkCharIsNumber(char input){
		return ((input- '0')>0 && (input - '9')<0);
	}
	private int getScalar(int scalarStartIndex, int scalarEndIndex, String input){
		String scalarRaw = input.substring(scalarStartIndex, scalarEndIndex);
		return Integer.parseInt(scalarRaw);
	}

}
