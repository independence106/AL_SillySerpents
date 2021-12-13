# AL_SillySerpents

Silly Serpents: Jason Zhou, Vansh Saboo, Tiggy, Tiffany

APCS PD8

Lab 02

2021-12-13


DISCO: Collections of Integers... what if we made this an 
       interface and had OrderedArrayList 
       ```<String>, <Integer>, <Double>``` etc

QCC:

### ALTester:
* Iterates through the ArrayList and compares each value to the value at +1 index. Returns false if value at +1 index is smaller.

### OrderedArrayList
* ```toString()```: returns stringified version
* ```remove()```: removes value at given index
* ```get()```: returns value at given index, throws ```IndexOutOfBoundsException``` is index is not valid
* ```add()```: adds given value to appropriate index, shifts everything after it up 1, returns true

