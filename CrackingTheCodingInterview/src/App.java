import Chapter1._1_IsUnique;
import Chapter1._3_URLify;

public class App {
    static _3_URLify urLify = new _3_URLify();

    public static void main(String[] args) {
        System.out.println("URLify: replace the spaces with '%20' on string: " + Constants.URLifyString);
        urLify.replaceSpaces(Constants.URLifyString.toCharArray(), Constants.URLifyString.trim().length());
    }
}
