package degiskenler;

 public class Box{

private int a;
 private int b;
 public Box(int a, int b) {
  this.a = a;
  this.b = b;
  System.out.println("a : " + a + " b : " + b);
 }

 public void area() {
  System.out.println(a * b);
 }


public static void main(String[] args) {
 Box box = new Box(2,5);
 box.area();
}
 }
