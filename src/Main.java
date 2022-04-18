public class Main {



    public static void main(String[] args){

        Internet ip = new InternetProvider();

        System.out.println(ip.connectToURL("Facebook"));
        System.out.println(ip.connectToURL("Google"));


        System.out.println("----");


        Internet pi = new ProxyInternet();

        System.out.println(pi.connectToURL("Facebook"));
        System.out.println(pi.connectToURL("Google"));













    }
}
