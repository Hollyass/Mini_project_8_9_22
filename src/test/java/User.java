import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class User {

    String userId;
    String newPassword;
    String repeatPassword;
    String fName;
    String lname;
    String email;
    String phone;
    String address1;
    String address2;
    String city;
    String state;
    String zip;
    String country;
    String languageDropdown;
    String categoryDropdown;
    boolean myListCheckbox;
    boolean myBannerCheckbox;

    public User(String userId, String newPassword, String repeatPassword, String fName, String lname, String email, String phone, String address1, String address2, String city, String state, String zip, String country, String languageDropdown, String categoryDropdown, boolean myListCheckbox, boolean myBannerCheckbox) {
        this.userId = userId;
        this.newPassword = newPassword;
        this.repeatPassword = repeatPassword;
        this.fName = fName;
        this.lname = lname;
        this.email = email;
        this.phone = phone;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
        this.languageDropdown = languageDropdown;
        this.categoryDropdown = categoryDropdown;
        this.myListCheckbox = myListCheckbox;
        this.myBannerCheckbox = myBannerCheckbox;
    }
}
