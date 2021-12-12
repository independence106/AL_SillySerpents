import java.util.ArrayList;

public class OrderedArrayList {

  private ArrayList<Integer> _data;
  private int _index;

  public OrderedArrayList() {
    this._data = new ArrayList<Integer>(10);
    this._index = 0;
  }

  public boolean add(int value) {
    return true;
  }
  private void expand() {
    int[] temp = new int[ _data.length * 2 ];
    for( int i = 0; i < _data.length; i++ ) {
      temp[i] = _data[i];
    }
    _data = temp;
  }
  public int size() {
    return _data.size();
  }
  
  public boolean isSorted(ArrayList<Integer> list){
      for(int i = 0; i < _data.size() - 1; i++){
          if(_data.get(i) > _data.get(i + 1)) return false; // If an element is greater than the element that succeeds it, then the list is not sorted - return false
      }
      return true; // If each element in the list is greater than the preceding element, it is sorted - return true
  } 
  
  public void add(int num){
        boolean isAdded = false; // Flag for breaking for-loop or appending element to the end of the list
        for(int i = 0 ; i < _data.size() && !isAdded; i++ ){
            if(_data.get(i) >= num){ 
                // At the first instance of an element being greater than or equal to than the new value, 
              // add the value at the index of that element and set isAdded true to break the for-loop
                _data.add(i, num);
                isAdded = true;
            }
        }
        
        if (!isAdded) _data.add(num); // If the new value is greater than all of the elements in the list (and thus was not added) append it to the end
    }
}
