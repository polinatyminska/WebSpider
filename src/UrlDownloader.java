import org.jsoup.nodes.Element;

/**
 * Created by ptyminska on 28.03.2016.
 */
public interface UrlDownloader {
    void getURLContent(Element link);
}
