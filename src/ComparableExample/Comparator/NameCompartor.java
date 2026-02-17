package ComparableExample.Comparator;

import java.util.Comparator;

class NameCompartor implements Comparator<Students> {

	@Override
	public int compare(Students s1,Students s2) {
		return s1.name.compareTo(s2.name);
	}
	

}
