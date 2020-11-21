public class TeilerFinden {

  //variante mit while-Schleife
  public static void main(String[] args) {

    int z = 24;
    //alle teiler ti testen: 2..11
    int t = 2;

    String teiler = "";
    //boolean hatTeiler = false;
    while (t < z) {
      int rest = z % t;
      if (rest == 0) {
        //System.out.print(t+", ");
        teiler = teiler + t + ", ";
        //hatTeiler = true;
      }
      t++;
    }

//    if(hatTeiler) {
//      System.out.println(teiler);
//    } else {
//      System.out.println("Es gibt keine Teiler für "+z);
//    }

    if(teiler.equals("")) {
      System.out.println("Es gibt keine Teiler für "+z);
    } else {
      System.out.println(teiler);
    }

  }


  //variante mit for-Schleife
  /*
  public static void main(String[] args) {

    int z = 24;
    String teiler = "";

    for (int t = 2; ;t++) {
      int rest = z % t;
      if (rest == 0) {
        teiler = teiler + t + ", ";
      }
      if(t == z-1) {
        break;
      }
    }

    if(teiler.equals("")) {
      System.out.println("Es gibt keine Teiler für "+z);
    } else {
      System.out.println(teiler);
    }

  }
   */

}
