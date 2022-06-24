import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q8 {

//    Use Regex with named parameters and a loop to parse the addresses below and print out
//    the street address, city, state & postal code. Transfer this list of addresses into your
//    program using a Java text block “”” String.
//              12345 First Street, First City, AA 90210
//              22222 Second Street, Second City, BB 22222
//              33333 Third Street, Third City, CC 33333
//              44444 Fourth Street, Fourth City, DD 44444
//              55555 Fifth Street, Fifth City, EE 55555
//              66666 Sixth Street, Sixth City, FF 66666
//              77777 Seventh Street, Seventh City, GG 77777
//              88888 Eighth Street, Eighth City, HH 88888
//              99999 Ninth Street, Ninth City, II 99999
//              00000 Tenth Street, Tenth City, JJ 00000

    public static void main(String[] args) {
        String addresses = """
                12345 First Street, First City, AA 90210
                22222 Second Street, Second City, BB 22222
                33333 Third Street, Third City, CC 33333
                44444 Fourth Street, Fourth City, DD 44444
                55555 Fifth Street, Fifth City, EE 55555
                66666 Sixth Street, Sixth City, FF 66666
                77777 Seventh Street, Seventh City, GG 77777
                88888 Eighth Street, Eighth City, HH 88888
                99999 Ninth Street, Ninth City, II 99999
                00000 Tenth Street, Tenth City, JJ 00000
                """;
        String regex = "(?<streetAddress>\\d{5}\\s\\w+\\s\\w+),\\s(?<city>\\w+\\s\\w+),\\s(?<stateAndCode>\\w{2}\\s\\d{5})\\n?";
        Pattern pat = Pattern.compile(regex);
        Matcher mat = pat.matcher(addresses);

        while(mat.find()) {
            System.out.printf("******************%n%n");
            System.out.println(mat.group("streetAddress"));
            System.out.println(mat.group("city"));
            System.out.println(mat.group("stateAndCode"));
            System.out.printf("%n");
        }
    }
}


