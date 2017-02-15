package project;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PigLatinTranslatorTests {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
    public void test_translate_awesome_returns_awesomeway() {
        String word = "awesome";
        String expectedOutcome = "awesomeway";
        assertEquals(expectedOutcome, PigLatinTranslator.translate(word));
    }

    @Test
    public void test_translate_child_returns_ildchay() {
        String word = "child";
        String expectedOutcome = "ildchay";
        assertEquals(expectedOutcome, PigLatinTranslator.translate(word));
    }

    @Test
    public void test_translate_happy_returns_appyhay() {
        String word = "happy";
        String expectedOutcome = "appyhay";
        assertEquals(expectedOutcome, PigLatinTranslator.translate(word));
    }

}
