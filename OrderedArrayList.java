// Clyde "Thluffy" Sinclair
// APCS pd00
// Lab02
// 2021-12-13

/**********************************************
 * class OrderedArrayList
 * wrapper class for ArrayList
 * maintains invariant that elements are ordered (ascending)
 * (SKELETON)
 **********************************************/

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
    //hmm...not clean at all...
    boolean found = false;
    
    for (int i = 0; i < this.size(); i++) {
      if (newVal <= this.get(i)) {
        found = true;
        _data.add(i, newVal);
        return true;
      } 
    }
    if (!found) {
      _data.add(newVal);
      return true;
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