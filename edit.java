



import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class edit{
	private static String getImage;
	private static String returnImage;
	
	public edit(String input, String output){
		getImage = input;
		returnImage = output;
	}
	public static File stringToFile1(){ //gets the file of the image that will be edited
		File getFile = new File(getImage);
		return getFile;
	}
	public static File stringToFile2(){ //takes the inputted string for placement of the edited image
		File returnFile = new File(returnImage);
		return returnFile;
	}
	public static BufferedImage getBufferedImg(){//reads the image file
		BufferedImage img = null; 
		try{ 
			img = ImageIO.read(stringToFile1()); 
		} 
		catch(IOException e) { 
			System.out.println(e); 
		}
		return img; 	 
	}
	public static void saveNewImg(BufferedImage i){ //saves the image
		try{ 
			ImageIO.write(i, "jpg", stringToFile2()); 
		} 
		catch(IOException e) { 
			System.out.println(e); 
			System.out.println("Is your file path correct? Try again!");
		}
	}
		// TODO Auto-generated constructor stub
	}


