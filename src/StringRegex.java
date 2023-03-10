
public class StringRegex {

    public static void main(String[] args) {

        String names = "Mr.A, Mr.B, Mr.C, Mr.D, Mr.E";

        String[] namesArr = names.split(", "); //try ("\\s");  //try  (",\\s");

        for (String s :  namesArr) {
             System.out.println(s);
        }
    }
}
