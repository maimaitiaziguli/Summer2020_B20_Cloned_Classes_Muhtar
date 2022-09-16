package afinalPractice.inheritance.browser.sub;

public class WebDriver {
    public void get(String URL){
        System.out.println("Opening "+URL + " in default browser.");
    }
    public void close(){
        System.out.println("Closed the default browser.");
    }
}
