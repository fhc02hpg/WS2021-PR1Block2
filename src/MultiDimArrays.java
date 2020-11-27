public class MultiDimArrays {

  public static void main(String[] args) {

    /*
     [ [...], [...] , [...], ... ]

     [   0 1 2
     0  [7,0,0],
     1  [0,0,-4]
     ]


     */

    int[][] matrix = new int[2][3];
    matrix[0][0] = 7;
    matrix[1][2] = -4;

    System.out.println(matrix[0][0]);
    System.out.println(matrix[1][2]);
    System.out.println(matrix[0][2]);

    char[][] chars = {
        //s         0    1   2
        /*z    0*/{'a','b','c'},
        /*z    1*/{'d','e','f'},
        /*z    2*/{'g','h','i'}
    };

    for(int z=0; z < chars.length; z++) {
      for(int s=0;s < chars[z].length; s++) {
        System.out.print(chars[z][s]+" ");
      }
      System.out.println();
    }







  }

}
