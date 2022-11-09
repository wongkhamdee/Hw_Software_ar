package edu.parinya.softarchdesign.behavioral2;
package javaFile;

import java.util.Comparator;
import java.util.List;

public class AgeSortStrategy implements SortStrategy {
    @Override
    public void customSort(List<Person> people) {
        // YOU ARE NOT ALLOWED TO MODIFY THE CODE ABOVE THIS COMMENT !!
        // YOU MAY ADD UP TO 5 LINES OF CODE BELOW THIS COMMENT !! A LINE OF CODE MAY CONTAIN UP TO ONE SEMI-COLON !!
    	comparator<Person> id = new comparator<Person>() {
    		@Override
    		public int compare(Person O1, Person O2) {
    			return Integer.valueOf(O1.getAge().compareTo(Integer.valueOf(O2.getAge())));
    		}
    	};
    	people.sort(id);
    }

}
