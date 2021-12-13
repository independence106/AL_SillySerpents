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

public class OrderedArrayList
{


  // instance of class ArrayList, holding objects of type Integer
  // (i.e., objects of a class that implements interface Integer)
  private ArrayList<Integer> _data;

  // default constructor
  // initializes instance variables
  public OrderedArrayList()
  {
    _data = new ArrayList<Integer>();
  }
  
  public String toString()
  {
    return _data.toString();
  }

  //I'm assuming at index i
  public Integer remove( int i )
  {
    return _data.remove(i);
  }

  public int size()
  { 
    //check this!!
    return _data.size();
  }

  public Integer get( int i )
  {
    //needs to throw an exception !!!!
    if (i < 0 || i >= this.size()) throw new IndexOutOfBoundsException("Out of bounds");
    return _data.get(i);
  }

  // inserts newVal at the appropriate index
  // maintains ascending order of elements
  // uses a linear search to find appropriate index
  public void addLinear(Integer newVal)
  {
    //hmm...not clean at all...
    boolean found = false;
    
    for (int i = 0; i < this.size(); i++) {
      if (newVal <= this.get(i)) {
        found = true;
        _data.add(i, newVal);
        break;
      } 
    }
    if (!found) {
      _data.add(newVal);
    }
    
  }

  // inserts newVal at the appropriate index
  // maintains ascending order of elements
  // uses a binary search to find appropriate index
  public void addBinary(Integer newVal)
  {
    _data.add(binarySearch(0, this.size(), newVal), newVal);
  }	

  //helper function binary search (very general)
  //returns index at which to insert
  public int binarySearch(int left, int right, int target) {
      //init integer that stores the index at which we are comparing to
      int middle = (left + right) / 2;

      //checks if _data is empty
      if (right - left == 0) {
        return 0;
      }

      //if middle if equal to our value returns middle
      if (this.get(middle) == target)
        return middle;

      //tells whether to add to after or before the value at middle 
      if (right - left <= 1 && this.get(middle) > target) {
        return left;
      }
      if (right - left <= 1) {
        return right;
      }

      //recursion
      if (this.get(middle) > target)
          return binarySearch(left, middle - 1, target);

      return binarySearch(middle + 1, right, target);
  }

  // main method solely for testing purposes
  public static void main( String[] args )
  {
    
    
    OrderedArrayList Franz = new OrderedArrayList();
    // testing linear search
    // testing linear search

    // testing binary search
    
    Franz = new OrderedArrayList();
    for( int i = 0; i < 15; i++ ) 
      Franz.addBinary( (int)( 50 * Math.random() ) );
    System.out.println( Franz );
  

  }//end main()

}//end class OrderedArrayList