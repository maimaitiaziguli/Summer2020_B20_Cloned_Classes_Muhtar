package afinalPractice.inheritance.browser;

public class BrowserObjects {
    public static void main(String[] args) {


    ChromeBrowser chrome = new ChromeBrowser();
    chrome.get("www.apple.com");
    chrome.close();
}
}