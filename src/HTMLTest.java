import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HTMLTest {

	@Test
	public void testContainsSpecialCharacters() {
		
		String HTML = "<!p> </p>";
		Assertions.assertFalse(Lab7Regex.validateHTML(HTML));
	}
	
	@Test
	public void testContainsNonForwardSlash() {
		
		String HTML = "<h1> <h1>";
		Assertions.assertFalse(Lab7Regex.validateHTML(HTML));
	}
	
	@Test
	public void testContainsEndTag() {
		
		String HTML = "<p> </p>";
		Assertions.assertTrue(Lab7Regex.validateHTML(HTML));
	}
	
	@Test
	public void testUpperCase() {
		
		String HTML = "<P> </P>";
		Assertions.assertTrue(Lab7Regex.validateHTML(HTML));
	}
	
	@Test
	public void testWords() {
		
		String HTML = "<body> body </body>";
		Assertions.assertTrue(Lab7Regex.validateHTML(HTML));
	}

}
