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
    public static void main(String[] a) throws IOException {
        Document doc = Jsoup.connect("http://vzaperti.com.ua/quest/pharaoh").get();
        Elements links = doc.select("a[href]");
     //   System.out.println(links);
        Iterator var6 = links.iterator();

           Element link;
           link = (Element) var6.next();
           System.out.println(link);
           link.attributes();
          // System.out.println(link.html());
          // Document doc2 = Jsoup.connect(link.baseUri()).get();
           System.out.println(link.baseUri());


         // System.out.println(doc2);

          Elements links2 = doc.select("meta[name=keywords]");
          System.out.println(links2.first().attr("content"));

    }

}
