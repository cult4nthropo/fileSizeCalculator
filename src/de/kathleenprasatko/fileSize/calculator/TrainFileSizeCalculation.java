package de.kathleenprasatko.fileSize.calculator;

import java.util.Random;
import java.util.Scanner;

import de.kathleenprasatko.fileSize.Scan;
import de.kathleenprasatko.fileSize.Videofile;
import de.kathleenprasatko.fileSize.Soundfile;

public class TrainFileSizeCalculation {

	public static void main(String[] args) throws InvalidValueException {
		System.out.println("This trainer will ask for the file size of a scan, soundfile or videofile with random values.");
		
		boolean repeat = true;
		Scanner scanner = new Scanner(System.in);
		while (repeat) {
			System.out.println("Do you want to calculate a [1] Scan, a [2] Soundfile or a [3] videofile. Press [0] to end the program?");
			String filechoice = scanner.next();
			
			switch (filechoice) {
				case "0":
					System.out.println("End");
					repeat = false;
					continue;
				//TODO: define realistic values in file variables
				case "1":
					Scan scan = new Scan();
					Random randomScan = new Random();
					scan.setWidth(randomScan.nextInt(36)+1);
					System.out.println(scan.getWidth());
					scan.setHeight(randomScan.nextInt(36)+1);
					System.out.println(scan.getHeight());
					scan.setDepth(randomScan.nextInt(36)+1);
					System.out.println(scan.getDepth());
					scan.setResolution(randomScan.nextInt(36)+1);
					System.out.println(scan.getResolution());
					scan.setCompression(randomScan.nextInt(36)+1);
					System.out.println(scan.getCompression());
					System.out.println(randomScan.nextInt(36)+1);
					//TODO: print the values, user input and if else to check the result
					break;
					
				case "2" :
					Soundfile soundfile = new Soundfile();
					Random randomSoundfile = new Random();
					soundfile.setChannels(randomSoundfile.nextInt(36)+1);
					soundfile.setFrequency(randomSoundfile.nextInt(36)+1);
					soundfile.setDuration(randomSoundfile.nextInt(36)+1);
					soundfile.setResolution(randomSoundfile.nextInt(36)+1);
					System.out.println(soundfile.calculateFileSize(soundfile));
					//TODO: user input and if else to check the result
					break;
					
				case "3":
					Videofile videofile = new Videofile();
					Random randomVideofile = new Random();
					videofile.setWidth(randomVideofile.nextInt(36)+1);
					videofile.setHeight(randomVideofile.nextInt(36)+1);
					videofile.setFramesPerSecond(randomVideofile.nextInt(36)+1);
					videofile.setDepth(randomVideofile.nextInt(36)+1);
					videofile.setDuration(randomVideofile.nextInt(36)+1);
					videofile.setCompression(randomVideofile.nextInt(36)+1);
					System.out.println(videofile.calculateFileSize(videofile));
					//TODO: print the values, user input and if else to check the result
						break;
				
				default:
					System.out.println("Please enter only [1], [2] or [3].");
			}
		}
		scanner.close();
	}
	
}