public class ArrayRechner {

  public static void main(String[] args) {

    int[] arrayA = {5,4,7};
    int[] arrayB = new int[3];
    arrayB[0] = 3;
    arrayB[1] = 0;
    arrayB[2] = 1;

    System.out.println("+ "+(arrayA[0]+arrayB[0])+", "
        + (arrayA[1]+arrayB[1])+", "+(arrayA[2]+arrayB[2]));

    System.out.println("* "+(arrayA[0]*arrayB[0])+", "
        + (arrayA[1]*arrayB[1])+", "+(arrayA[2]*arrayB[2]));

    System.out.println("length aa: "+arrayA.length);
    System.out.println("length ab: "+arrayB.length);

    for(int i = 0;i < arrayA.length;i++) {
      System.out.println(arrayA[i]);
    }



  }

}
