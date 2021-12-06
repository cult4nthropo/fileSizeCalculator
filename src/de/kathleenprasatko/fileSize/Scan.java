/**
 * @author Kathleen Prasatko
 * 
 * Calculates the file size of a scan
 * general formula: ((width * height) * resolution) / compression
 * to get the right file size one has to beware of the measurement units like bit and byte or inch and centimeter
 * as well as the unit of the wanted result
 */

package de.kathleenprasatko.fileSize;

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
		double heightInch = this.height / 2.54;
		double widthInch = this.width / 2.54;
		double bitSize = (((widthInch *this.resolution) * (heightInch * this.resolution)) * this.depth) / this.compression;
		double fileSize = bitSize/8/(1024*1024);
		return fileSize;
	}
}