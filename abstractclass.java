package oops;
  abstract class abst{
      
    abstract void sum();
}
class abst2 extends abst{
  @Override
  void sum() {
    System.out.println("hello");
  }
}
public class abstractclass {
  public static void main(String[] args) {
    abst2 ab=new abst2();
    ab.sum();
  }
}
