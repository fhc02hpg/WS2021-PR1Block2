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

    int[] punkteNeu = {99,-5,0,0,13};

    System.out.println(punkteNeu[3]);
    System.out.println(punkteNeu[0]);

    punkteNeu[2] = -1;
    punkteNeu[3] = 1;

    System.out.println(punkteNeu[2]);
    System.out.println(punkteNeu[3]);

    String[] myNames = new String[5];
    System.out.println(myNames[0]);
    myNames[3] = "John";
    System.out.println(myNames[4]);
    System.out.println(myNames[3]);

    //index must be type int
    int i = 3;
    System.out.println(myNames[i]);
















  }

}
