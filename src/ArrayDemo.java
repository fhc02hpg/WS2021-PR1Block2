public class ArrayDemo {

  public static void main(String[] args) {

    int[] punkte = new int[4]; //Platz für 4 'int' Elemente;

    System.out.println("punkte[0] = " + punkte[0]);
    punkte[0] = 11;
    System.out.println("punkte[0] = " + punkte[0]);

    punkte[1] = -1;
    punkte[2] = 100;
    punkte[3] = 42;
    System.out.println("punkte[1] = " + punkte[1]);
    System.out.println("punkte[2] = " + punkte[2]);
    System.out.println("punkte[3] = " + punkte[3]);

  }

}
