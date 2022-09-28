package com.code;

import java.util.*;

class student{
    String name;
    int roll_no;
    student(String name,int roll_no)
    {
        this.name=name;
        this.roll_no=roll_no;

    }
}
class rollno_comapre implements Comparator<student> {

    @Override
    public int compare(student o1, student o2) {
        if (o1.roll_no == o2.roll_no) {
            return 0;
        } else if (o1.roll_no > o2.roll_no) {
            return 1;
        } else return -1;
    }


}
class name_compare implements Comparator<student>{

    @Override
    public int compare(student o1, student o2) {
        return  o1.name.compareTo (o2.name);
    }
}
public class Collection_list_example {
    public static void main(String[] args) {
       List<Integer> obj1 = new ArrayList<Integer> ();
        obj1.add (20);
        obj1.add (100);
        obj1.add (21);
        Iterator<Integer> i = obj1.iterator ();
        while (i.hasNext ()){
            System.out.println (i.next ());
        }
        List<student> obj =new LinkedList<> ();
        obj.add(new student ("raghav",21));
        obj.add(new student ("meet ",22));
        obj.add(new student ("jeet",1));
        obj.add(new student ("deep",81));
        Collections.sort (obj,new rollno_comapre ());
        Collections.sort (obj,new name_compare ());
        Iterator<student> x =obj.iterator ();
        while(x.hasNext ()){
            System.out.println (x.next ().name);
        }

    }
}

