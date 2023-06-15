package com.code;

import java.util.*;

class newStudent {
    int enrollment;
    String name;

    public newStudent(int enrollment, String name) {
        this.enrollment = enrollment;
        this.name = name;
    }
}
class customecompare implements Comparator<newStudent> {

	@Override
	public int compare(newStudent o1, newStudent o2) {
		return o1.name.compareTo (o2.name);
	}
}
public class collection_Framwork {
    public static void main(String[] args) {
        /*
         Some method of collection
         add only one element addall containe all Object<> is
         contains method check to wheter element has in class or not
         equal method use to check two collection are same or not
         Iterator is main method is maily use to iterted the collections
         <Generic> Enter Class that you Want like Integer String and Like Custom class like newStudent

                List<String> l = new ArrayList<String> (Arrays.asList ("hello", "good", "world", "kem"));
                Iterator<String> i = l.iterator ();
                while (i.hasNext ()) {
                    System.out.println (i.next ().concat (" -- New Data "));
                }
        */


		List<newStudent> l1 = new ArrayList<newStudent> ();
		l1.add(new newStudent (12,"Raghav"));
		l1.add(new newStudent (22,"Jeet"));
		l1.add(new newStudent (32,"Geet"));
		l1.add(new newStudent (42,"Meet"));
		l1.add(new newStudent (52,"Aeet"));
		Collections.sort(l1,((o1, o2) -> o1.name.compareTo (o2.name)));
		Iterator<newStudent> i1 = l1.iterator ();
		while(i1.hasNext ()){
			newStudent temp = i1.next ();
			System.out.println (temp.enrollment + "   " + temp.name);
		}
		Stack<Integer> st = new Stack<Integer> ();
		st.add (4);
		st.add (4);
		st.add (4);
		System.out.println (st.peek ());
		int temp1;
		System.out.println ((  temp1  = st.search (4)) == -1 ? "not Found in Stack" : temp1);

		Queue<String> q = new LinkedList<String> ();
		q.offer ("Hello");
		q.offer ("String ");
		q.offer ("Good");
		System.out.println (q);

		/* Set is unordered Collection */
		Set<Integer> s = new HashSet<> ();
		s.add (40);
		s.add (40);
		System.out.println (s.size ());


		/* Map collection */
		HashMap<Integer,String> mp = new HashMap<> ();
		mp.put (1,"Raghav");
		mp.put (2,"jeet");
		mp.put(3,"meet");
		System.out.println (mp);
		for (Map.Entry<Integer,String> ep:mp.entrySet ()) {
			System.out.println (ep.getKey () + " --> " + ep.getValue () + " --> " + ep.hashCode () );
		}

    }
}
