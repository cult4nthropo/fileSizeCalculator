package de.kathleenprasatko.fileSize;

/**
 * Calculates the file size of a sound file
 * general formula: (resolution * frequency * channels) * duration in seconds
 * to get the right file size one has to beware of the measurement units like bit and byte or Hz and MHz
 * as well as the unit of the wanted result
 * 
 * @since 1.0.0
 *  @author Kathleen Prasatko
 */

public class Soundfile {
	private double resolution;
	private double frequency;
	private double channels;
	private double duration;
		
	public double getResolution() {
		return resolution;
	}

	public void setResolution(double resolution) {
		this.resolution = resolution;
	}

	public double getFrequency() {
		return frequency;
	}

	public void setFrequency(double frequency) {
		this.frequency = frequency;
	}

	public double getChannels() {
		return channels;
	}

	public void setChannels(double channels) {
		this.channels = channels;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public final double calculateFileSize(Soundfile soundfile) {
		/**
		 * takes all the values and calculates the file size of a sound file
		 * @return file size of a sound file
		 */
		double durationSec = this.duration * 60;
		double bitSize = (this.resolution * this.frequency * this.channels) * durationSec;
		double fileSize = bitSize / 8 / (1024*1024);
		return fileSize;
	}
}