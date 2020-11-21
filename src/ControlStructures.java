public class ControlStructures {

  public static void main(String[] args) {

    boolean inHomeOffice = true;

    //...
    if (inHomeOffice == false) {
      System.out.println("heute kein Home Office Tag!");
      System.out.println("machen wir was anderes im Freien");
    } else {
      System.out.println("im richtigen Büro!");
    }
    //...


    double tempOutside = 25.5;
    double tempFreezing = 0.0;

    if(tempOutside > tempFreezing) {
      System.out.println("normal heating mode");
    } else if (tempOutside > 20.0) { //NOTE: this condition is never checked if the 1st one above is already true!
      System.out.println("no heating necessary");
    } else if (tempOutside < -15.0) {
      System.out.println("extra heating mode");
    } else {
      System.out.println("in other cases");
    }

    //boolean expression && ||
    // a && b || c
    //   d    || c
    //   f

    // a && (b || c)
    // a &&    d
    //   f

    int i = 10;
    do {
      System.out.println("Ergebnis i: "+ i);
      i = i + 1;
    }
    while (i < 10);

    int j = 0;
    while (j < 10) {
      System.out.println("Ergebnis j: "+ j);
      j = j + 1;
    }

    System.out.println("hier geht's irgendwie weiter...");
    System.out.println("Program Ende");

  }

}
