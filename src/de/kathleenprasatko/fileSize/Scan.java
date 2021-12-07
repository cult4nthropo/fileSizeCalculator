package de.kathleenprasatko.fileSize;

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

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getDepth() {
		return depth;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}

	public double getResolution() {
		return resolution;
	}

	public void setResolution(double resolution) {
		this.resolution = resolution;
	}

	public double getCompression() {
		return compression;
	}

	public void setCompression(double compression) {
		this.compression = compression;
	}

	public final double calculateFileSize(Scan scan) {
		/**
		 * takes all the values and calculates the file size of a scan
		 * @return file size of a scan
		 */
		double heightInch = this.height / 2.54;
		double widthInch = this.width / 2.54;
		double bitSize = (((widthInch *this.resolution) * (heightInch * this.resolution)) * this.depth) / this.compression;
		double fileSize = bitSize/8/(1024*1024);
		return fileSize;
	}
}