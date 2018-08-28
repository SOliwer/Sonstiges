package Logik;
import java.util.ArrayList;

public class Main {
//https://www.reddit.com/r/dailyprogrammer/comments/8g0iil/20180430_challenge_359_easy_regular_paperfold/	
		public static void main(String[] args) {
			String count = new String();
			count = "0";
			
			for (int i= 0;i<=10;i++) {
				
				Dragon dragon = new Dragon(count);
				System.out.println(count = dragon.getStream());
				
				dragon = null;
				
			}
		   
		}
	

}
