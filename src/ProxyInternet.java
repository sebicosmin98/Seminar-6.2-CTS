import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {

    public Internet internet = new InternetProvider();;
    public List<String> blacklist = new ArrayList<>();

    public ProxyInternet() {

        this.blacklist.add("Facebook");
        this.blacklist.add("TikTok");
    }

    @Override
    public String connectToURL(String url) {

        if(this.blacklist.contains(url)){

            return "Acces interzis";

        }
        else{

            return internet.connectToURL(url);
        }

    }








}
