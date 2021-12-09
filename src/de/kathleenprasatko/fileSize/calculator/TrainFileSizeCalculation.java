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
			Random rand = new Random();
			System.out.println("Do you want to calculate a [1] Scan, a [2] Soundfile or a [3] videofile. Press [0] to end the program?");
			String filechoice = scanner.next();
			
			switch (filechoice) {
				case "0":
					System.out.println("End");
					repeat = false;
					continue;
					
				case "1":
					Scan scan = new Scan();
					
					double widthScan = rand.nextInt((100 - 1 + 1) + 1);
					scan.setWidth(widthScan);
					double heightScan = rand.nextInt((100 - 1 + 1) + 1);
					scan.setHeight(heightScan);
					double depthScan = rand.nextInt((65 - 1 + 1) + 1);
					scan.setDepth(depthScan);
					double resolutionScan = rand.nextInt((100 - 1 + 1) + 1);
					scan.setResolution(resolutionScan);
					double compressionScan = rand.nextInt((13 - 1 + 1) + 1);
					scan.setCompression(compressionScan);
					scan.calculateFileSize(scan);
					//TODO: print the values, user input and if else to check the result
					break;
					
				case "2" :
					Soundfile soundfile = new Soundfile();
					double channelsSoundfile = rand.nextInt((16 -1 + 1) + 1);
					soundfile.setChannels(channelsSoundfile);
					double frequencySoundfile = rand.nextInt((3500 -1000 +1) + 1);
					soundfile.setFrequency(frequencySoundfile);
					double durationSoundfile = rand.nextInt((120 - 1 + 1) +1 );
					soundfile.setDuration(durationSoundfile);
					double resolutionSoundfile = rand.nextInt((36 - 1 + 1) + 1);
					soundfile.setResolution(resolutionSoundfile);
					soundfile.calculateFileSize(soundfile);
					//TODO: user input and if else to check the result
					break;
					
				case "3":
					Videofile videofile = new Videofile();
					double widthVideo = rand.nextInt((3600 - 1 + 1) + 1);
					videofile.setWidth(widthVideo);
					double heightVideo = rand.nextInt((7500 - 1 + 1) + 1);
					videofile.setHeight(heightVideo);
					double framesPerSecondVideo = rand.nextInt((56 - 1 + 1) + 1);
					videofile.setFramesPerSecond(framesPerSecondVideo);
					double depthVideofile = rand.nextInt((56 - 1 + 1) + 1);
					videofile.setDepth(depthVideofile);
					double durationVideofile = rand.nextInt((126 - 1 + 1) + 1);
					videofile.setDuration(durationVideofile);
					double compressionVideofile = rand.nextInt((24 - 1 + 1) + 1);
					videofile.setCompression(compressionVideofile);
					videofile.calculateFileSize(videofile);
					//TODO: print the values, user input and if else to check the result
						break;
				
				default:
					System.out.println("Please enter only [1], [2] or [3].");
			}
		}
		scanner.close();
	}
}