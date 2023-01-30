import java.util.Scanner;
public class lab1{
    public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		// taking input from user 
		
		System.out.println("Enter age");
		int age = sc.nextInt();
		
		System.out.println("Enter sex: M/F");
		char sex = sc.next().charAt(0);

    
		// checking if user is female
		if(sex == 'F') {
			System.out.println("The Employee is a female");
		}
		
		// checking if user is male
		if(sex == 'M') {
			System.out.println("The Employee is a female");
		}

				//System.out.println("Which part of India?(N/S/W/E)");
				//int p_state  = sc.next().charAt(0);
		
		System.out.println("Which state are you living in ?");
		String state = sc.next(); 

		switch (state) {
			case "Kerala","Andhra Pradesh","Karnataka","Tamil Nadu","Telangana":
				System.out.println("The Employee is from the southern part of India; Preferable work location is in"+state);
				break;
			case "Rajasthan","Haryana","Himachal Pradesh","Punjab","Chandigarh","Delhi","Jammu and Kashmir","Ladakh":
				System.out.println("The Employee is from the northern part of India; Preferable work location is in"+state);
				break;
			case "Maharashtra","Goa","Gujarat":
				System.out.println("The Employee is from the western part of India; Preferable work location is in"+state);
				break;
			case "Odisha","Bihar","West Bengal","Jharkhand":
				System.out.println("The Employee is from the eastern part of India; Preferable work location is in"+state);
				 break;
        
		}
		System.out.println("Which company are you living in ?");
		String company = sc.next();

		if (company == "Facebook" || "Goggle"){
			System.out.println("The Employee is working in MNC" );

		}
				
				
		else{
			System.out.println("The Employee is working in not MNC" );

		}

        
		}
	}





