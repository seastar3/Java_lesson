public class Dentaku_Sousa2 {
  public static void main( String args[] ) {
    Dentaku1 d1 = new Dentaku1();
    d1.tasu(5.0);
    d1.hiku(2.0);
    System.out.println("答は" + d1.tasu(0.0));

    Dentaku2 d2 = new Dentaku2();
    d2.tasu(5.0);
    d2.kakeru(2.0);
    System.out.println("答は" + d2.tasu(0.0));
  }
}
