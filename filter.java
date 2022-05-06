



import java.awt.Color;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;


public class filter {
		public static void makeOrange(){
			BufferedImage img = edit.getBufferedImg();
			//loops through each pixel in the image
			for(int y = 0; y < img.getHeight(); y++) { 
				for(int x = 0; x < img.getWidth(); x++) { 
					//obtains the pixel
					int pixel = img.getRGB(x,y); 
					
					//bit shift by location of the color component, add 0xFF (Decimal value of 255)
					int a = (pixel>>24)&0xff; 
					int R = (pixel>>16)&0xff; 
					int G = (pixel>>8)&0xff; 
					int B = pixel&0xff;
					//changes pixel value
					int newRed = 2*R; 
					int newGreen = (int) (1.1*G); 
					int newBlue = (int) (0.5*B);
					
					//if greater than 255, set the color component to 255
					if (newRed > 255) 
						R = 255; 
					else
						R = newRed; 
					if (newGreen > 255) 
						G = 255; 
					else
						G = newGreen; 
					if (newBlue > 255) 
						B = 255; 
					else
						B = newBlue;
					//shift back, set the pixel value as the new RGB value
					pixel = (a <<24) |(R<<16) | (G<<8) | B; 
					img.setRGB(x, y, pixel); 
				}
				edit.saveNewImg(img);
			}
		}
		public static void makeBlue(){
			BufferedImage img = edit.getBufferedImg();
			for(int y = 0; y < img.getHeight(); y++) { 
				for(int x = 0; x < img.getWidth(); x++) { 
					int pixel = img.getRGB(x,y); 
					int a = (pixel>>24)&0xff; 
					int R = (pixel>>16)&0xff; 
					int G = (pixel>>8)&0xff; 
					int B = pixel&0xff; 
					int newRed = (int)(.2*R); 
					int newGreen = (int)(.6*G); 
					int newBlue = (int)(1.5*B); //set blue to a higher value
					if (newRed > 255) 
						R = 255; 
					else
						R = newRed; 
					if (newGreen > 255) 
						G = 255; 
					else
						G = newGreen; 
					if (newBlue > 255) 
						B = 255; 
					else
						B = newBlue;
					//set new RGB value 
					pixel = (a<<24) | (R<<16) | (G<<8) | B; 
				}
			}
			edit.saveNewImg(img);
		}
		public static void makePink(){
			BufferedImage img = edit.getBufferedImg();
			for(int y = 0; y < img.getHeight(); y++) { 
				for(int x = 0; x < img.getWidth(); x++) { 
					int pixel = img.getRGB(x,y); 
					int a = (pixel>>24)&0xff; 
					int R = (pixel>>16)&0xff; 
					int G = (pixel>>8)&0xff; 
					int B = pixel&0xff; 
					int newRed = (int)(2*R); 
					int newGreen = (int)(.3*G); 
					int newBlue = (int)(1.25*B); 
					if (newRed > 255) 
						R = 255; 
					else
						R = newRed; 
					if (newGreen > 255) 
						G = 255; 
					else
						G = newGreen; 
					if (newBlue > 255) 
						B = 255; 
					else
						B = newBlue;
					pixel = (a<<24) | (R<<16) | (G<<8) | B; 
					img.setRGB(x, y, pixel); 
				} 
			} 
			edit.saveNewImg(img);
		}
		
		public static void makeSepia(){
					BufferedImage img = edit.getBufferedImg();
					for(int y = 0; y < img.getHeight(); y++) { 
						for(int x = 0; x < img.getWidth(); x++) { 
							int pixel = img.getRGB(x,y); 
							int a = (pixel>>24)&0xff; 
							int R = (pixel>>16)&0xff; 
							int G = (pixel>>8)&0xff; 
							int B = pixel&0xff; 
							
							//values for the sepia filter 
							int newRed = (int)(0.393*R + 0.769*G + 0.189*B); 
							int newGreen = (int)(0.349*R + 0.686*G + 0.168*B); 
							int newBlue = (int)(0.272*R + 0.534*G + 0.131*B); 
							
							if (newRed > 255) 
								R = 255; 
							else
								R = newRed; 
							if (newGreen > 255) 
								G = 255; 
							else
								G = newGreen; 
							if (newBlue > 255) 
								B = 255; 
							else
								B = newBlue;
							 
							pixel = (a<<24) | (R<<16) | (G<<8) | B; 
							img.setRGB(x, y, pixel); 
						} 
					} 
					edit.saveNewImg(img);
				} 
		
		public static void makeGray(){
			BufferedImage img = edit.getBufferedImg();
			
			for(int y = 0; y < img.getHeight(); y++) { 
				for(int x = 0; x < img.getWidth(); x++) { 
					int pixel = img.getRGB(x,y); 
					int a = (pixel>>24)&0xff; 
					int R = (pixel>>16)&0xff; 
					int G = (pixel>>8)&0xff; 
					int B = pixel&0xff; 
					//takes the average of the three components
					int avg = (R+G+B)/3; 
					//sets each component as the average
	                pixel = (a<<24) | (avg<<16) | (avg<<8) | avg; 
	  
	                img.setRGB(x, y, pixel);
				}
			}
			edit.saveNewImg(img);
		}
		
		public static void makeNegative(){
			BufferedImage img = edit.getBufferedImg();
			for (int y = 0; y < img.getHeight(); y++) { 
	            for (int x = 0; x < img.getWidth(); x++) { 
	                int pixel = img.getRGB(x,y); 
	                int a = (pixel>>24)&0xff; 
	                int r = (pixel>>16)&0xff; 
	                int g = (pixel>>8)&0xff; 
	                int b = pixel&0xff; 
	                //Opposite value of each pixel
	                r = 255 - r; 
	                g = 255 - g; 
	                b = 255 - b; 
	  
	                pixel = (a<<24) | (r<<16) | (g<<8) | b; 
	                img.setRGB(x, y, pixel); 
	            } 
			}
			edit.saveNewImg(img);
		}
		
		public static void redOverlay(){
			BufferedImage img = edit.getBufferedImg();
			
			for (int y = 0; y < img.getHeight(); y++) { 
	            for (int x = 0; x < img.getWidth(); x++) { 
	                int pixel = img.getRGB(x,y); 
	                int a = (pixel>>24)&0xff; 
	                int r = (pixel>>16)&0xff;
	                pixel = (a<<24) | (r<<16) | (0<<8) | 0; 
	                img.setRGB(x, y, pixel); 
	            } 
			}
			edit.saveNewImg(img);
		}
		
		public static void greenOverlay(){
			BufferedImage img = edit.getBufferedImg();
			for (int y = 0; y < img.getHeight(); y++) { 
	            for (int x = 0; x < img.getWidth(); x++) { 
	                int pixel = img.getRGB(x,y); 
	                int a = (pixel>>24)&0xff; 
	                int r = (pixel>>16)&0xff; 
	                int g = (pixel>>8)&0xff;
	  
	                //set new RGB value 
	                pixel = (a<<24) | (r<<16) | (g<<8) | 0; 
	                img.setRGB(x, y, pixel); 
	            } 
			}
			edit.saveNewImg(img);
			
		}
		public static void fourColor(){
			BufferedImage img = edit.getBufferedImg();
			//make image grayscale
			filter.makeGray();
			for(int y=0; y<img.getHeight(); y++){
				for(int x=0; x<img.getWidth(); x++){
					int pixel = img.getRGB(x, y);
					int a = (pixel>>24)&0xff; 
					int r = (pixel>>16)&0xff; 
	                int g = (pixel>>8)&0xff; 
	                int b = pixel&0xff;
	                //it doesn't matter if it's r,g,b in the if statement bc all three are the same in grayscale
	                
	                //if pixel val is dark
	                if(r <= 63){ 
	                	r = 0;
	                	g = 22;
	                	b = 110;}
	                //if pixel val is medium-dark
	                else if(r > 63 && r <= 127){
	                	r = 166;
	                	g = 0;
	                	b = 0;
	                }
	                //if pixel val is medium
	                else if(r > 127 && r <= 195){
	                	r= 71;
	                	g = 179;
	                	b = 255;
	                }
	                else{
	                //if pixel val is light
	                	r = 255;
	                	g = 215;
	                	b = 156;
	                }
	                pixel = (a<<24) | (r<<16) | (g<<8) | b; 
	    			img.setRGB(x, y, pixel);
				}
			}
			edit.saveNewImg(img); 
		}
		
		/*
		public static void brighten(){
			BufferedImage img = edit.getBufferedImg();
			
			for(int y=0; y<img.getHeight(); y++){
				for(int x=0; x<img.getWidth(); x++){
					int pixel = img.getRGB(x, y);
					int a = (pixel>>24)&0xff; 
					int r = (pixel>>16)&0xff; 
	                int g = (pixel>>8)&0xff; 
	                int b = pixel&0xff;
					float[] hsb = Color.RGBtoHSB(r, g, b, null);
					float hue = hsb[0];
					float saturation = hsb[1];
					float brightness = hsb[2];
					brightness= brightness*2;
					pixel = Color.HSBtoRGB(hue, saturation, brightness);
					pixel = (a<<24) | (r<<16) | (g<<8) | 0; 
	                img.setRGB(x, y, pixel);
				}
			}
			edit.saveNewImg(img);
		}
	
	}
*/
}

