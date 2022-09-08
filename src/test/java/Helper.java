import org.openqa.selenium.chrome.ChromeDriver;

public class Helper {
    public static final String PETSOTREURL = "https://petstore.octoperf.com/";
    public static final String ENTERTHESTORE = "//*[@id=\"Content\"]/p[1]/a"; // by.xpath
    public static final String SIGNIN = "//*[@id=\"MenuContent\"]/a[2]"; // by.xpath
    public static final String REGISTERNOW = "//*[@id=\"Catalog\"]/a"; // by.xpath
    public static final String ANOTHERFORM = "https://petstore.octoperf.com/actions/Account.action?newAccountForm=";

    public static User account1 = new User("1",
            "123","123",
            "holly","go", "holly@gmail.com",
            "943568695","blv","rews","telaviv", "IL", "567", "IL",
            "english", "CATS", true,true);

    public static User account2 = new User("2","123","123",
            "jim","harper","jim@office.com","086553939",
            "costco","street","vegas","nevada","2345","USA",
            "english","CATS",true,false);


    public static ChromeDriver setupDriver(){
        System.setProperty("webdriver.chrome.driver","res\\chromedriver.exe");
        return new ChromeDriver();
    }
}
