/**
 * @author Kathleen Prasatko
 * 
 * Calculates the file size of a scan
 * general formula: ((size of a frame * depth * frames per Second)/compression) * duration in seconds
 * to get the right file size one has to beware of the measurement units like bit and byte or minutes and seconds
 * as well as the unit of the wanted result
 */

package de.kathleenprasatko.fileSize;

public class Videofile {
	private double width;
	private double height;
	private double frame = width * height;
	private double framesPerSecond;
	private double duration;
	private double depth;
	private double compression;
		
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getFramesPerSecond() {
		return framesPerSecond;
	}

	public void setFramesPerSecond(double framesPerSecond) {
		this.framesPerSecond = framesPerSecond;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public double getDepth() {
		return depth;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}

	public double getCompression() {
		return compression;
	}

	public void setCompression(double compression) {
		this.compression = compression;
	}

	public double calculateFileSize() {	
		double bitSize = ((this.frame * this.depth * this.framesPerSecond)/this.compression) * this.duration;
		double fileSize = bitSize / 8 / (1024*1024);
		return fileSize;
	}
}