package afinalPractice.inheritance.browser;

public class ChromeBrowser extends Webdriver{
   public void get(String url){
       System.out.println("Opening  "+url + " in chrome browser. ");
   }
   public void close(){
       System.out.println("Closing the chrome browser.");
   }
}
