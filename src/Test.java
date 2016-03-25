import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.Iterator;

/**
 * Created by ptyminska on 25.03.2016.
 */
public class Test {
    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("http://makeupme.ua/study/glaza-guby/").get();
        Elements links = doc.select("a[href]");
     //   System.out.println(links);
        Iterator var6 = links.iterator();

        Element link;
        link = (Element)var6.next();
        System.out.println(link);
        link.attributes();
        System.out.println(link.html());
        Document doc2 = Jsoup.connect(link.baseUri()).get();
        System.out.println(link.baseUri());
     //   System.out.println(doc2);

        Elements links2 = doc.select("meta");
        System.out.println(links2);
       // print(" * %s: <%s> %sx%s (%s)", new Object[]{link.tagName(), link.attr("abs:src"), link.attr("width"), link.attr("height"), trim(link.attr("alt"), 20)});
      //  print(link.toString());
/*        while(var6.hasNext()) {
            link = (Element)var6.next();
            if(link.tagName().equals("a")) {
                print(" * %s: <%s> %sx%s (%s)", new Object[]{link.tagName(), link.attr("abs:src"), link.attr("width"), link.attr("height"), trim(link.attr("alt"), 20)});
            } else {
                print(" * %s: <%s>", new Object[]{link.tagName(), link.attr("abs:src")});
            }
        }*/
    }

    private static void print(String msg, Object... args) {
        System.out.println(String.format(msg, args));
    }

    private static String trim(String s, int width) {
        return s.length() > width?s.substring(0, width - 1) + ".":s;
    }
}
