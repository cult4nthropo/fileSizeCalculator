package de.kathleenprasatko.fileSize;

import de.kathleenprasatko.fileSize.calculator.InvalidValueException;

/**
 * Calculates the file size of a sound file
 * general formula: (resolution * frequency * channels) * duration in seconds
 * to get the right file size one has to beware of the measurement units like bit and byte or Hz and MHz
 * as well as the unit of the wanted result
 */

public class Soundfile {
	private double resolution;
	private double frequency;
	private double channels;
	private double duration;

	/**
	 * sets the values of a scan and throws an exception if the user puts negative values.
	 * @param resolution
	 * @throws InvalidValueException
	 */
	public void setResolution(double resolution) throws InvalidValueException{
		if(resolution  <= 0) {
			throw new InvalidValueException("The value can not be negative.");
			}
		this.resolution = resolution;
	}

	/**
	 * sets the values of a scan and throws an exception if the user puts negative values.
	 * @param frequency
	 * @throws InvalidValueException
	 */
	public void setFrequency(double frequency) throws InvalidValueException{
		if(frequency  <= 0) {
			throw new InvalidValueException("The value can not be negative.");
			}
		this.frequency = frequency;
	}

	/**
	 * sets the values of a scan and throws an exception if the user puts negative values.
	 * @param channels
	 * @throws InvalidValueException
	 */
	public void setChannels(double channels) throws InvalidValueException{
		if(channels  <= 0) {
			throw new InvalidValueException("The value can not be negative.");
			}
		this.channels = channels;
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
	 * takes all the values and calculates the file size of a sound file
	 * @return file size of a sound file
	 */
	public final double calculateFileSize(Soundfile soundfile) {
		double durationSec = this.duration * 60;
		double bitSize = (this.resolution * this.frequency * this.channels) * durationSec;
		double fileSize = bitSize / 8 / (1024*1024);
		return fileSize;
	}
}