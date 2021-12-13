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

public class OrderedArrayList {

  private ArrayList<Integer> _data;

  public OrderedArrayList() {
    _data = new ArrayList<Integer>();
  }
  
  public String toString() {
    return _data.toString();
  }

  //I'm assuming at index i
  public Integer remove( int i ) {
    return _data.remove(i);
  }

  public int size() { 
    return _data.size();
  }

  public Integer get( int i ) {
    if (i < 0 || i >= this.size()) throw new IndexOutOfBoundsException("Out of bounds");
    return _data.get(i);
  }

  public boolean add(Integer newVal) {
    boolean isAdded = false;
    
    for (int i = 0; i < this.size() && !isAdded; i++) {
      if (newVal <= this.get(i)) {
        isAdded = true;
        _data.add(i, newVal);
      } 
    }
    if (!isAdded) {
      _data.add(newVal);
    }
    return true;
    
  }
  public static void main(String[] args) {
    OrderedArrayList e = new OrderedArrayList();
    e.add(6);
    e.add(7);
    e.add(3);
    e.add(1);
    System.out.println(e);
  }
  

}
