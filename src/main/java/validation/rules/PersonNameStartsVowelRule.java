package validation.rules;

import static util.StringUtil.isFirstLetterVowel;

import entity.Person;

public class PersonNameStartsVowelRule extends GenericRule {

	public PersonNameStartsVowelRule() {
		this.setErrorMessage("This person name dont starts with vowel.");
	}

	@Override
	public boolean ok(Object o) {
		Person p = ((Person) o);
		return isFirstLetterVowel(p.getName());
	}

}
