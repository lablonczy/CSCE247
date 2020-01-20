package Assn01;//lukacs ablonczy
import java.util.Random;

/**
 * Defines the Behavior known as Simple Speak
 * @author Lukacs Ablonczy
 */
public class SimpleSpeakBehavior implements TalkBehavior {

	Random r = new Random();
	String[] words = {"Wall-E","EVA!","Pop","Eva?","Eee-va?"};


	/**
	 * Defines the implemented talk behavior
	 * @return Randomly picks between "Wall-E", "EVA!", "Pop", "Eva?", and "Eee-va?" by using Java.util.Random to generate a number 0-4, then using that value as the index to an array
	 */
	public String talk() {
		return words[r.nextInt(5)];
	}

}
