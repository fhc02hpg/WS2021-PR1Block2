public class ArrayMonths {

  public static void main(String[] args) {

    String[] monate = {
        "Jan", "Feb", "Mrz",
        "Arp", "Mai", "Jun",
        "Jul",
        "Aug",
        "Sep",
        "Okt",
        "Nov",
        "Dez"
    };

    printMonths(monate);

  }

  public static void printMonths(String[] months) {
    for(int i = 0; i < months.length; i++) {
      System.out.println(months[i] + " ["+(i+1)+"]");
    }
  }

}
