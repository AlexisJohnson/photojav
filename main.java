



import java.util.Scanner;

public class main {
	
	public static void main(String args[]){
		int choice2;
		Scanner keyboard = new Scanner(System.in);
		String in, out, choice, name; 
		boolean a = true, b= false;
		System.out.println("| ___ \\| |           | |           (_) ");
		System.out.println("| |_/ /| |__    ___  | |_   ___     _   __ _ __   __");
		System.out.println("|  __/ | '_ \\  / _ \\ | __| / _ \\   | | / _` |\\ \\ / /");
		System.out.println("| |    | | | || (_) || |_ | (_) |  | || (_| | \\ V / ");
		System.out.println("\\_|    |_| |_| \\___/  \\__| \\___/   | | \\__,_|  \\_/  ");
		System.out.println("                                  _/ |              ");
		System.out.println("                                 |__/               ");
		System.out.println("Enter in the file path for the image you want to edit ex. Desktop/image.jpg:");
		in = keyboard.nextLine();
		while(a == true){
			//if there is no jpg or png extension at the end, will ask again
			if((in.substring(in.length()-4, in.length()).equals(".jpg"))||(in.substring(in.length()-4, in.length()).equals(".png"))){
				break;
			}
			else{
				System.out.println("An image file wasn't typed out. Try again!");
				in = keyboard.nextLine();
			}
		}
		System.out.println("What would you like the name of the new image to be? (Add jpg to the end)");
		name = keyboard.nextLine();
		//if user types in jpg or png, do nothing otherwise add jpg
		if((name.substring(name.length()-4, name.length()).equals(".jpg"))||(name.substring(name.length()-4, name.length()).equals(".png"))){
			name = name;
		}
		else{
			name = name + ".jpg";
		}
		System.out.println("Would you like your image to be saved into the same location? (y/n) ");
		choice = keyboard.nextLine();
		
		if(choice.equalsIgnoreCase("y")) {
			//take the in variable in, remove the original image and add the new name to the variable
			out = in.substring(0, in.lastIndexOf("/")+1) + name;
		}
		else if(choice.equalsIgnoreCase("n")){
			System.out.println("Enter in the file path of the destination you want your image in");
			out = keyboard.nextLine()+"/" + choice;
		}
		else{
			System.out.println("You didn't input a valid character. The new image file will be saved in the same location");
			out = in.substring(0, in.lastIndexOf("/")+1) + name;
		}
		
		//input = new File(in);
		//output = new File(out);
		System.out.println("What would you like to do with the image?");
		System.out.println("\n 1. Grayscale \n 2. Sepia \n 3. Negative \n 4. Red Overlay "
				+ "\n 5. Green Overlay \n 6. Blue Overlay \n 7. Pink Overlay \n 8. Orange Overlay \n 9. 4 color filter");
		
		//takes in the strings in and out for image processing
		edit e= new edit(in,out);
		
		//filter options
		choice2 = keyboard.nextInt();
			
			if(choice2 ==1)
				filter.makeGray();
			else if(choice2 == 2)
				filter.makeSepia();
			else if(choice2 == 3)
				filter.makeNegative();
			else if(choice2 == 4)
				filter.redOverlay();
			else if(choice2== 5)
				filter.greenOverlay();
			else if(choice2==6)
				filter.makeBlue();
			else if(choice2==7)
				filter.makePink();
			else if(choice2==8)
				filter.makeOrange();
			else if(choice2== 9){
				filter.fourColor();
			}
			else{
				System.out.println("You didn't input a number on the list! I hope you like grayscale");
				filter.makeGray();
			}
		
		
	}
}
///Users/lexijohnson/Downloads/amalfi.jpg
///Users/lexijohnson/Desktop/newImg2.jpg
