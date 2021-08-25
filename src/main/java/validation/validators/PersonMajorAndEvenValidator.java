package validation.validators;

import validation.rules.PersonAgeEvenRule;
import validation.rules.PersonMajorRule;

public class PersonMajorAndEvenValidator extends GenericValidator {

	public PersonMajorAndEvenValidator() {
		this.rules.add(new PersonMajorRule());
		this.rules.add(new PersonAgeEvenRule());
	}

}
