package validation.validators;

import validation.rules.PersonMajorRule;

public class PersonMajorValidator extends GenericValidator {

	public PersonMajorValidator() {
		this.rules.add(new PersonMajorRule());
	}

}
