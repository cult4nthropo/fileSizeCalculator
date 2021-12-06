package de.kathleenprasatko.fileSize.calculator;

import de.kathleenprasatko.fileSize.Scan;
import de.kathleenprasatko.fileSize.Soundfile;
import de.kathleenprasatko.fileSize.Videofile;

public class CalculateFileSize {

	public static void main(String[] args) {
		Scan scan = new Scan();
		scan.setWidth(10.5);
		scan.setHeight(12.0);
		scan.setDepth(32);
		scan.setResolution(360);
		scan.setCompression(8);
		
		//TO-DO: set those values by user input
		
		double fileSizeScan = scan.calculateFileSize(scan);
		
		System.out.println(fileSizeScan);
		
		Soundfile soundfile = new Soundfile();
		soundfile.setChannels(2);
		soundfile.setDuration(63);
		soundfile.setFrequency(3600);
		soundfile.setResolution(64);
		
		double fileSizeSound = soundfile.calculateFileSize(soundfile);
		
		System.out.println(fileSizeSound);
		
		Videofile videofile = new Videofile();
		videofile.setWidth(4500);
		videofile.setHeight(3500);
		videofile.setDepth(8);
		videofile.setFramesPerSecond(65);
		videofile.setDuration(125);
		videofile.setCompression(64);
		
		double fileSizeVideo = videofile.calculateFileSize(videofile);
		
		System.out.println(fileSizeVideo);
	}

}
