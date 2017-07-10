package online.mrwallet.www.set;

public class States implements Comparable<States> {

	private String name;

	public States(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*
	 * This will cmpare the state names and brcause state names are String and
	 * STring has already overriden compareTo() we can use this method on STrnig
	 * Below will sort in a natural order of State class where it will be sorted in ascending order f state name
	 * 
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(States states) {
		return this.getName().compareTo(states.getName());
	}

}
