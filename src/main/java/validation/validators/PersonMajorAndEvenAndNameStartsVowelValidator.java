package validation.validators;

import validation.rules.PersonAgeEvenRule;
import validation.rules.PersonMajorRule;
import validation.rules.PersonNameStartsVowelRule;

public class PersonMajorAndEvenAndNameStartsVowelValidator extends GenericValidator {

	public PersonMajorAndEvenAndNameStartsVowelValidator() {
		this.rules.add(new PersonMajorRule());
		this.rules.add(new PersonAgeEvenRule());
		this.rules.add(new PersonNameStartsVowelRule());
	}

}
