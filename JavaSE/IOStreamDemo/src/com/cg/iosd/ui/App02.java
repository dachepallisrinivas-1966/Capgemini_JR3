package com.cg.iosd.ui;

/* Read Line By Line */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class App02 {

	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter file name : ");
			String fileName = scan.nextLine();
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while(true) {
				line = br.readLine();
				if (line == null)			// EOF
					break;
				System.out.println(line);
			}
		} catch (FileNotFoundException excep) {
			System.out.println("No such file present.");
		} catch(IOException excep) {
			System.out.println("Could not read file.");
		} 

	}

}
