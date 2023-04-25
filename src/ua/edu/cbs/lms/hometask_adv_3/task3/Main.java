package ua.edu.cbs.lms.hometask_adv_3.task3;

public class Main {
    public static void main(String[] args) {
        String someString = "public String substring(int beginIndex, int endIndex) - " +
                "Returns a new string that is a substring of this string. The substring begins at " +
                "the specified beginIndex and extends to the character at index endIndex - " +
                "1. Thus the length of the substring is endIndex-beginIndex.";

        System.out.println("We have a string: ");
        System.out.println(someString);

        System.out.println("We split this string on 2 equals substring:");
        System.out.println("1: " + someString.substring(0,someString.length()/2));
        System.out.println("2: " + someString.substring(someString.length()/2));

        System.out.println("\n\nBut this split not like. That is better: ");

        int indexSplit = someString.indexOf(" ",someString.length()/2);
        System.out.println("1: " + someString.substring(0, indexSplit));
        System.out.println("2: " + someString.substring(indexSplit+1));

        System.out.println("\n\n Or: ");
        indexSplit = someString.indexOf(".",someString.length()/2);
        System.out.println("1: " + someString.substring(0, indexSplit+1));
        System.out.println("2: " + someString.substring(indexSplit+1).trim());
    }
}
