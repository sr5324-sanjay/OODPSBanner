public class UC_6_OOPSBanner {
    public static void main(String[] args ){
        String[] O = buildO();
        String[] P = buildP();
        String[] S = buildS();

        String[][]word={O,O,P,S};
        for (int i = 0; i < O.length; i++) {
             for (String[] letter : word) {
                System.out.print(letter[i] + "  ");
        }
        System.out.println();
    } 
}
 static String[] buildO() {
        return new String[] {
            "   ***   ",
            " **   ** ",
            "**     **",
            "**     **",
            "**     **",
            " **   ** ",
            "   ***   "
        };
    }
static String[] buildP() {
        return new String[] {
            "******  ",
            "**    **",
            "**    **",
            "*****   ",
            "**      ",
            "**      ",
            "**      "
        };
    }
  static String[] buildS() {
        return new String[] {
            "  ***  ",
            "**   **",
            "**     ",
            " ***** ",
            "     **",
            "**   **",
            " ***** "
        };
    }
}
