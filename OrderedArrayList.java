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

  public boolean addLinear(Integer newVal) {
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
  public void addBinary(Integer newVal) {
    if (this.size() == 0) {
      _data.add(newVal);
    } else {
      _data.add(binary(0, this.size()-1, newVal), newVal);
    }
  }
  public int binary(int left, int right, int target) {
    int middle = (left + right) / 2;
    if (this.get(middle) == target) {
      return middle;
    }
    if (left - right >= 1) {
      return this.size () - 1;
    }
    if (right - left <= 1 && this.get(middle) > target) {
      return left;
    }
    if (right - left < 1) {
      return right + 1;
    }


    if (this.get(middle) > target) {
      return  binary(left, middle - 1, target);

    }
    return binary(middle+1, right, target);
  }
  public static void main(String[] args) {
    OrderedArrayList e = new OrderedArrayList();
    for( int i = 0; i < 15; i++ )
      e.addBinary( (int)( 50 * Math.random() ) );
    System.out.println( e );

  }


}
