package de.kathleenprasatko.fileSize;

import de.kathleenprasatko.fileSize.calculator.InvalidValueException;

/**
 * Calculates the file size of a scan
 * general formula: ((size of a frame * depth * frames per Second)/compression) * duration in seconds
 * to get the right file size one has to beware of the measurement units like bit and byte or minutes and seconds
 * as well as the unit of the wanted result
 */

public class Videofile {
	private double width;
	private double height;
	private double framesPerSecond;
	private double duration;
	private double depth;
	private double compression;

	/**
	 * sets the values of a scan and throws an exception if the user puts negative values.
	 * @param width
	 * @throws InvalidValueException
	 */
	public void setWidth(double width) throws InvalidValueException {
		if(width  <= 0) {
			throw new InvalidValueException("The value can not be negative.");
			}
		this.width = width;
	}

	/**
	 * sets the values of a scan and throws an exception if the user puts negative values.
	 * @param height
	 * @throws InvalidValueException
	 */
	public void setHeight(double height) throws InvalidValueException {
		if(height  <= 0) {
			throw new InvalidValueException("The value can not be negative.");
			}
		this.height = height;
	}

	/**
	 * sets the values of a scan and throws an exception if the user puts negative values.
	 * @param framesPerSecond
	 * @throws InvalidValueException
	 */
	public void setFramesPerSecond(double framesPerSecond) throws InvalidValueException {
		if(framesPerSecond  <= 0) {
			throw new InvalidValueException("The value can not be negative.");
			}
		this.framesPerSecond = framesPerSecond;
	}

	/**
	 * sets the values of a scan and throws an exception if the user puts negative values.
	 * @param duration
	 * @throws InvalidValueException
	 */
	public void setDuration(double duration) throws InvalidValueException {
		if(duration  <= 0) {
			throw new InvalidValueException("The value can not be negative.");
			}
		this.duration = duration;
	}

	/**
	 * sets the values of a scan and throws an exception if the user puts negative values.
	 * @param depth
	 * @throws InvalidValueException
	 */
	public void setDepth(double depth) throws InvalidValueException{
		if(depth  <= 0) {
			throw new InvalidValueException("The value can not be negative.");
			}
		this.depth = depth;
	}

	/**
	 * sets the values of a scan and throws an exception if the user puts negative values.
	 * @param compression
	 * @throws InvalidValueException
	 */
	public void setCompression(double compression) throws InvalidValueException{
		if(compression  <= 0) {
			throw new InvalidValueException("The value can not be negative.");
			}
		this.compression = compression;
	}
	/**
	 * takes all the values and calculates the file size of a video file
	 * @return file size of a video
	 */
	public final double calculateFileSize(Videofile videofile) {	
		double frame = this.width * this.height;
		double durationSec = this.duration *60;
		double bitSize = ((frame * this.depth * this.framesPerSecond)/this.compression) * durationSec;
		double fileSize = bitSize / 8 / (1024*1024);
		return fileSize;
	}
}