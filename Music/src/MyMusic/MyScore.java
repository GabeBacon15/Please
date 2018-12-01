package MyMusic;

import java.util.ArrayList;

import MusicComponents.Chord;
import jm.JMC;
import jm.gui.sketch.SketchScore;
import jm.music.data.CPhrase;
import jm.music.data.Note;
import jm.music.data.Part;
import jm.music.data.Phrase;
import jm.music.data.Score;
import jm.util.Play;
import jm.util.Write;
import jm.music.data.Note;
import jm.music.data.Phrase;
import jm.music.data.Score;
import jm.util.Play;

public class MyScore {
	
	private Score score;
	private int key;
	private int startingOctive;
	private int root;
	private int[] scale;
	
	public MyScore() {
		
		this.key = JMC.C0;
		this.startingOctive = 4;
		this.root = this.key + (startingOctive * 12);
		
	}
	public MyScore(int key, int startingOctive) {

		this.key = key;
		this.startingOctive = startingOctive;
		this.root = this.key + (startingOctive * 12);
		scale = new int[7];
		
	}
	

	
	public Score getScore() {
		return score;
	}
	public void playScore() {
		Play.midi(score);;
	}
	public void fillScale(int root) {
		
//		scale[0] = ;
//		
//		scale.add(new Note(root, 1));
//		scale.add(new Note(root + 2, 1));
//		scale.add(new Note(root + 4, 1));
//		scale.add(new Note(root + 5, 1));
//		scale.add(new Note(root + 7, 1));
//		scale.add(new Note(root + 9, 1));
//		scale.add(new Note(root + 11, 1));
//		scale.add(new Note(root + 12, 1));
//		Play.midi(scale);
	}
	public void playScale() {
		Phrase scale = new Phrase();
		scale.add(new Note(this.root, 1));
		scale.add(new Note(this.root + 2, 1));
		scale.add(new Note(this.root + 4, 1));
		scale.add(new Note(this.root + 5, 1));
		scale.add(new Note(this.root + 7, 1));
		scale.add(new Note(this.root + 9, 1));
		scale.add(new Note(this.root + 11, 1));
		scale.add(new Note(this.root + 12, 1));
		Play.midi(scale);
	}
}



//	public void test() {
//		
//		new Note(JMC.G5, 0.5);
//		
//		score = new Score(180.0);
//		Part rightHand = new Part(JMC.PIANO);
//		Part leftHand = new Part(JMC.PIANO);
//		
//		CPhrase rightPhrase = new CPhrase();
//		CPhrase leftPhrase = new CPhrase();
//
//		ArrayList<Chord> rightChords = new ArrayList<Chord>();
//		ArrayList<Chord> leftChords = new ArrayList<Chord>();
//		
//		rightChords.add(new Chord(new int[] {JMC.G5}, 1, JMC.F));
//		rightChords.add(new Chord(new int[] {JMC.F5}, 0.5, JMC.F));
//		rightChords.add(new Chord(new int[] {JMC.EF5}, 0.5, JMC.F));
//		rightChords.add(new Chord(new int[] {JMC.D5}, 0.5, JMC.F));
//		rightChords.add(new Chord(new int[] {JMC.BF4}, 0.5, JMC.F));
//		rightChords.add(new Chord(new int[] {JMC.G4}, 1, JMC.F));
//		rightChords.add(new Chord(new int[] {JMC.C5}, 0.5, JMC.F));
//		rightChords.add(new Chord(new int[] {JMC.D5}, 0.5, JMC.F));
//		rightChords.add(new Chord(new int [] {JMC.EF5}, 0.5, JMC.F));
//		rightChords.add(new Chord(new int [] {JMC.F5}, 0.5, JMC.F));
//		rightChords.add(new Chord(new int [] {JMC.D5}, 2.0, JMC.F));
//		
//		leftChords.add(new Chord(new int [] {JMC.F2, 0}, 0.5, JMC.P));
//		leftChords.add(new Chord(new int [] {JMC.F3}, 0.5, JMC.P));
//		leftChords.add(new Chord(new int [] {JMC.F2}, 0.5, JMC.P));
//		leftChords.add(new Chord(new int [] {JMC.F3}, 0.5, JMC.P));
//		leftChords.add(new Chord(new int [] {JMC.G2}, 0.5, JMC.P));
//		leftChords.add(new Chord(new int [] {JMC.G3}, 0.5, JMC.P));
//		leftChords.add(new Chord(new int [] {JMC.G2}, 0.5, JMC.P));
//		leftChords.add(new Chord(new int [] {JMC.G3}, 0.5, JMC.P));
//		leftChords.add(new Chord(new int [] {JMC.AF2}, 0.5, JMC.P));
//		leftChords.add(new Chord(new int [] {JMC.AF3}, 0.5, JMC.P));
//		leftChords.add(new Chord(new int [] {JMC.AF2}, 0.5, JMC.P));
//		leftChords.add(new Chord(new int [] {JMC.AF3}, 0.5, JMC.P));
//		
//		leftChords.add(new Chord(new int [] {JMC.G2, JMC.G3}, 1, JMC.P));
//		leftChords.add(new Chord(new int [] {JMC.G2, JMC.G3}, 0.5, JMC.P));
//		leftChords.add(new Chord(new int [] {JMC.G2, JMC.G3}, 0.5, JMC.P));
//		
//		for(Chord c: rightChords) {
//			rightPhrase.addChord(c.getPitches(), c.getLength(), c.getDynamic());
//		}
//		for(Chord c: leftChords) {
//			leftPhrase.addChord(c.getPitches(), c.getLength(), c.getDynamic());
//		}
//		
//		rightHand.addCPhrase(rightPhrase);
//		leftHand.addCPhrase(leftPhrase);
//		score.addPart(leftHand);
//		score.addPart(rightHand);
//		
//		SketchScore sketch = new SketchScore(score);
//		sketch.saveXMLFile();
//		
//		Play.midi(score);
//		Write.midi(score, "C:/Users/gabeb/Desktop/JMusic Midi Files/KirbyTest.mid");
//	}