package afinalPractice.inheritance.browser;

public class Webdriver {
    public void get(String url){
        System.out.println("Opening "+ url + " in default browser.");
    }
    public void close(){
        System.out.println("Closing the default browser");
    }
}
