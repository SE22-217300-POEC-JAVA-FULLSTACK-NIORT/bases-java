import java.util.ArrayList;
import java.util.Arrays;

public class EmailRates {
    public static void main(String[] args) {
//        var emails=new ArrayList<String>(Arrays.
//                asList(
//                        "christian.lisangola@gmail.com",
//                        "jean.paul@gmail.com",
//                        "alain@gmail.com",
//                        "lydie@yahoo.fr",
//                        "josephine.lajoie@yahoo.com",
//                        "luise@hotmail.fr",
//                        "philemon.turion@gmail.com",
//                        "jules.cesar@hotmail.fr"
//                ));
        var emails=new ArrayList<String>();


        emails.add("christian.lisangola@gmail.com");
        emails.add("jean.paul@gmail.com");
        emails.add("alain@gmail.com");
        emails.add("lydie@yahoo.fr");
        emails.add("josephine.lajoie@yahoo.com");
        emails.add("luise@hotmail.fr");
        emails.add("philemon.turion@gmail.com");
        emails.add("jules.cesar@hotmail.fr");

        var gmails=
                emails.stream().filter(value->value.contains("@gmail")).toList().size();

        var yahoos=
                emails.stream().filter(value->value.contains("@yahoo")).toList().size();

        var hotmails=
                emails.stream().filter(value->value.contains("@hotmail")).toList().size();

        System.out.printf("Gmail : %.2f%%\n",(double)(gmails*100)/emails.size());
        System.out.printf("Yahoos : %.2f%%\n",(double)(yahoos*100)/emails.size());
        System.out.printf("Hotmails : %.2f%%\n",(double)(hotmails*100)/emails.size());
    }
}
