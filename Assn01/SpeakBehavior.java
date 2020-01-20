package Assn01;//lukacs ablonczy
import java.util.Random;


/**
 * Defines the Behavior known as Speak
 * @author Lukacs Ablonczy
 */
public class SpeakBehavior implements TalkBehavior {

	Random r = new Random();
	String[] words = {"Hello, How are you?","Good day"};

	/**
	 * Defines the implemented talk behavior
	 * @return Randomly picks between "Hello, How are you?" and "Good day" by using Java.util.Random to generate a number 0-1, then using that value as the index to an array
	 */
	public String talk() {
		return words[r.nextInt(2)];
	}

}
