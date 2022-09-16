package afinalPractice.inheritance.browser.sub;

public class Test {
    public static void main(String[] args) {

        WebDriver driver = new WebDriver();
       driver.get("www.apple.com");
       driver.close();

       ChromeBrowser driver1 = new ChromeBrowser();
       driver1.get("www.google.com");
       driver1.close();

       FireFoxBrowser driver2 = new FireFoxBrowser();
       driver2.get("www.keiser.com");
       driver2.close();



    }

}
