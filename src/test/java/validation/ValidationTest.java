package validation;

import org.junit.Assert;
import org.junit.Test;

import entity.Person;
import validation.validators.PersonMajorAndEvenAndNameStartsVowelValidator;
import validation.validators.PersonMajorValidator;

public class ValidationTest {

	PersonMajorValidator v1 = new PersonMajorValidator();
	PersonMajorAndEvenAndNameStartsVowelValidator v2 = new PersonMajorAndEvenAndNameStartsVowelValidator();

	/**
	 * Validation test with 1 rule return true if achieve them
	 */
	@Test
	public void personIsMajor() {
		Person p = new Person(1, "John", 21);
		Boolean status = v1.isValid(p);
		Assert.assertEquals(Boolean.TRUE, status);
	}

	/**
	 * Validation test with 1 rule throwing a exception if dont achieve them
	 */
	@Test
	public void personIsMajorThrowingException() {
		Person p = new Person(1, "John", 23);
		Boolean status = v1.isValid(p, true);
		Assert.assertEquals(Boolean.TRUE, status);
	}

	/**
	 * Validation test with 3 rules return true if achieve all of them
	 */
	@Test
	public void personIsMajorAndEvenAndNameStartsVowel() {
		Person p = new Person(1, "Ana", 18);
		Boolean status = v2.isValid(p);
		Assert.assertEquals(Boolean.TRUE, status);
	}

	/**
	 * Validation test with 3 rules throwing a exception if dont achieve all of them
	 */
	@Test
	public void personIsMajorAndEvenAndNameStartsVowelThrowingException() {
		Person p = new Person(1, "Eva", 22);
		Boolean status = v2.isValid(p, true);
		Assert.assertEquals(Boolean.TRUE, status);
	}

}
