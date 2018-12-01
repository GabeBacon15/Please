package MusicComponents;

import jm.JMC;

public class Chord {

	private int[] pitches;
	private double length;
	private int dynamic;
	
	public Chord(int[] pitches, double length, int dynamic) {
		this.pitches = pitches;
		this.length = length;
		this.dynamic = dynamic;
	}
	public Chord(int[] pitches, double length) {
		this.pitches = pitches;
		this.length = length;
		this.dynamic = JMC.MF;
	}
	
	public int[] getPitches() {
		return pitches;
	}
	public double getLength() {
		return length;
	}
	public int getDynamic() {
		return dynamic;
	}
	
	public void setNewPitches(int[] newPitches) {
		this.pitches = newPitches;
	}
	//maybe
	//maybe not
	public void addPitch(int pitch) {
		int x = this.pitches.length;
		int[] temp = this.pitches;
		this.pitches = new int[x + 1];
		for(int e = 0; e < temp.length; e++) {
			this.pitches[e] = temp[e];
		}
		this.pitches[this.pitches.length-1] = pitch;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public void setDynamic(int dynamic) {
		this.dynamic = dynamic;
	}
	
}
