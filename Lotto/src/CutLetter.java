import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CutLetter {
	public static void main(String[] args) throws FileNotFoundException {
//		String filePath = "C://Users//user//Dropbox//lotto//lotto.txt";
		String filePath = "C://Users//user//Dropbox//JeabLotto//lotto.txt";
		Scanner sc = new Scanner(new File(filePath));
		ArrayList<String> zero = new ArrayList<String>();
		ArrayList<String> one = new ArrayList<String>();
		ArrayList<String> two = new ArrayList<String>();
		ArrayList<String> three = new ArrayList<String>();
		ArrayList<String> four = new ArrayList<String>();
		ArrayList<String> five = new ArrayList<String>();
		ArrayList<String> six = new ArrayList<String>();
		ArrayList<String> seven = new ArrayList<String>();
		ArrayList<String> eight = new ArrayList<String>();
		ArrayList<String> nine = new ArrayList<String>();

		while (sc.hasNext()) {
			String s = sc.nextLine().substring(9, 13);
			//System.out.println(s);
			String last = s.substring(3);
			//System.out.println(last);
			switch(last) {
				case "0" :zero.add(s);
						  break;
				case "1" :one.add(s);
				  		  break;
				case "2" :two.add(s);
						  break;
				case "3" :three.add(s);
				          break;
				case "4" :four.add(s);
				          break;
				case "5" :five.add(s);
						  break;
				case "6" :six.add(s);
						  break;
				case "7" :seven.add(s);
						  break;
				case "8" :eight.add(s);
						  break;
				case "9" :nine.add(s);
						  break;
				default : System.out.println("Not number");
						  break;
			}
		}
		sc.close();
		Collections.sort(zero);
		Collections.sort(one);
		Collections.sort(two);
		Collections.sort(three);
		Collections.sort(four);
		Collections.sort(five);
		Collections.sort(six);
		Collections.sort(seven);
		Collections.sort(eight);
		Collections.sort(nine);
		
		for(String num : zero) {
			System.out.println(num);
		}
		for(String num : one) {
			System.out.println(num);
		}
		for(String num : two) {
			System.out.println(num);
		}
		for(String num : three) {
			System.out.println(num);
		}
		for(String num : four) {
			System.out.println(num);
		}
		for(String num : five) {
			System.out.println(num);
		}
		for(String num : six) {
			System.out.println(num);
		}
		for(String num : seven) {
			System.out.println(num);
		}
		for(String num : eight) {
			System.out.println(num);
		}
		for(String num : nine) {
			System.out.println(num);
		}
		
	}
}
