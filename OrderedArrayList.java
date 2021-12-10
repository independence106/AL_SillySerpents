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

}
