/*
  Silly Serpents: Jason Zhou, Vansh Saboo, Tiggy, Tiffany
  APCS PD8
  Lab 02
  2021-12-13
*/

//DISCO: Collections of Integers... what if we made this an 
//       interface and had OrderedArrayList<String>, <Integer>, <Double> etc
//QCC:

import java.util.ArrayList;

public class ALTester {
    public static boolean sorted(ArrayList<Integer> data) {
        for (int i = 0; i < data.size() - 1; i++) {
            if (data.get(i) > data.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayList<Integer> e = new ArrayList<Integer>();
        ArrayList<Integer> o = new ArrayList<Integer>();
        e.add(3);
        e.add(3);
        e.add(3);
        e.add(3);
        e.add(3);
        e.add(3);
        e.add(3);
        System.out.println(sorted(e));
        for (int i = 0; i < 23; i++) {
            o.add((int) (Math.random() * 50));
            
        }
        System.out.println(sorted(o));

    }
}