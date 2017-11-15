package by.it.examples.lesson14.listing18;

// Create a subclass by extending class A.
class B extends A { 
  int k; 
 
  B(int a, int b, int c) { 
    super(a, b); 
    k = c;
  } 
 
  // overload show() 
  void show(String msg) { 
    System.out.println(msg + k); 
  } 
}