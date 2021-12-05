/**
 * @author Kathleen Prasatko
 * 
 * Calculates the file size of a sound file
 * general formula: (resolution * frequency * channels) * duration in seconds
 * to get the right file size one has to beware of the measurement units like bit and byte or Hz and MHz
 * as well as the unit of the wanted result
 */

package de.kathleenprasatko.fileSize;

public class Soundfile {
	private double resolution;
	private double frequency;
	private double channels;
	private double duration;
	private double durationSec = duration * 60;
		
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

	public double calculateFileSize() {
		double bitSize = (this.resolution * this.frequency * this.channels) * this.durationSec;
		double fileSize = bitSize / 8 / (1024*1024);
		return fileSize;
	}
}