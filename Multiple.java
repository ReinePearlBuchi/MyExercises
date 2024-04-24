import java.util.Scanner;
	public class Multiple{
		public static void main(String[] args){
	
			int total = 0;
	
			for(int num = 1;  num < 200001;  num++){
			if(num % 10 == 0){
			total = total + num;

			System.out.println(num);
			
			}
			
			}
			
			System.out.println(total);
			

		}

	}