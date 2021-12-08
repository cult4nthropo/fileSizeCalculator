package de.kathleenprasatko.fileSize;
import de.kathleenprasatko.fileSize.calculator.InvalidValueException;

/**
 * Class Scan with width, height, color depth, resolution and compression
 * Calculates the file size of a scan
 * general formula: ((width * height) * resolution) / compression
 * 
 * @since 1.0.0
 * 
 * @author Kathleen Prasatko
 */

public class Scan {
	private double width;
	private double height;
	private double depth;
	private double resolution;
	private double compression;
		
	public double getWidth() {
		return width;
	}
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
	
	public double getHeight() {
		return height;
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
	
	public double getDepth() {
		return depth;
	}
	/**
	 * sets the values of a scan and throws an exception if the user puts negative values.
	 * @param depth
	 * @throws InvalidValueException
	 */
	public void setDepth(double depth) throws InvalidValueException {
		if(depth  <= 0) {
			throw new InvalidValueException("The value can not be negative.");
		}
		this.depth = depth;
	}

	public double getResolution() {
		return resolution;
	}
	/**
	 * sets the values of a scan and throws an exception if the user puts negative values.
	 * @param resolution
	 * @throws InvalidValueException
	 */
	public void setResolution(double resolution) throws InvalidValueException {
		if(resolution  <= 0) {
			throw new InvalidValueException("The value can not be negative. and has to be a number");
		}
		this.resolution = resolution;
	}

	public double getCompression() {
		return compression;
	}
	/**
	 * sets the values of a scan and throws an exception if the user puts negative values.
	 * @param compression
	 * @throws InvalidValueException
	 */
	public void setCompression(double compression) throws InvalidValueException {
		if(resolution  <= 0) {
			throw new InvalidValueException("The value can not be negative.");
		}
		this.compression = compression;
	}
	/**
	 * takes all the values and calculates the file size of a scan
	 * @return file size of a scan
	 */
	public final double calculateFileSize(Scan scan) {
		double heightInch = this.height / 2.54;
		double widthInch = this.width / 2.54;
		double bitSize = (((widthInch *this.resolution) * (heightInch * this.resolution)) * this.depth) / this.compression;
		double fileSize = bitSize/8/(1024*1024);
		return fileSize;
	}
}