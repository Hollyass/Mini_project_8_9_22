import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Registrationform {

        private final String USERIDFIELD = "username"; //by.name
        private final String NEWPASSWORDFIELD= "password"; //by.name
        private final String REPEATPASSWORDFIELD = "repeatedPassword"; //by.name
        private final String FIRSTNAMEFIELD= "account.firstName"; // by.name
        private final String LASTNAMEFIELD= "account.lastName"; // by.name
        private final String EMAILFIELD= "account.email"; //by.name
        private final String PHONEFIELD = "account.phone"; // by.name
        private final String ADDRESSONEFIELD= "account.address1"; // by.name
        private final String ADDRESSTWOFIELD = "account.address2"; // by.name
        private final String CITYFIELD = "account.city"; // by.name
        private final String STATEFIELD = "account.state"; // by.name
        private final String ZIPFIELD = "account.zip"; // by.name
        private final String COUNTRYFIELD = "account.country"; // by.name

        private final String LANGUAGEFROPDOWN = "account.languagePreference"; //by.name
        private final String CATEGOTYDROPDOWN = "account.favouriteCategoryId"; //by.name
        private final String MYLISTCHECKBOX = "account.listOption"; // by.name
        private final String MYBANNERCHECKBOX = "account.listOption"; //by.name
        private final String REGISTERBUTTON = "newAccount";

        WebElement userIdField;
        WebElement newPasswordField;
        WebElement repeatPasswordField;
        WebElement fNameField;
        WebElement lnameField;
        WebElement emailField;
        WebElement phoneField;
        WebElement address1Field;
        WebElement address2Field;
        WebElement cityField;
        WebElement stateField;
        WebElement zipField;
        WebElement countryField;
        Select languageDropdown;
        Select categoryDropdown;
        WebElement myListCheckbox;
        WebElement myBannerCheckbox;
        WebElement registerButton;

        public Registrationform(WebDriver driver) {
            this.userIdField = driver.findElement(By.name(USERIDFIELD));
            this.newPasswordField = driver.findElement(By.name(NEWPASSWORDFIELD));
            this.repeatPasswordField = driver.findElement(By.name(REPEATPASSWORDFIELD));
            this.fNameField = driver.findElement(By.name(FIRSTNAMEFIELD));
            this.lnameField = driver.findElement(By.name(LASTNAMEFIELD));
            this.emailField = driver.findElement(By.name(EMAILFIELD));
            this.phoneField = driver.findElement(By.name(PHONEFIELD));
            this.address1Field = driver.findElement(By.name(ADDRESSONEFIELD));
            this.address2Field = driver.findElement(By.name(ADDRESSTWOFIELD));
            this.cityField = driver.findElement(By.name(CITYFIELD));
            this.stateField = driver.findElement(By.name(STATEFIELD));
            this.zipField = driver.findElement(By.name(ZIPFIELD));
            this.countryField = driver.findElement(By.name(COUNTRYFIELD));
            this.languageDropdown = new Select(driver.findElement(By.name(LANGUAGEFROPDOWN)));
            this.categoryDropdown = new Select(driver.findElement(By.name(CATEGOTYDROPDOWN)));
            this.myListCheckbox = driver.findElement(By.name(MYLISTCHECKBOX));
            this.myBannerCheckbox = driver.findElement(By.name(MYBANNERCHECKBOX));
            this.registerButton = driver.findElement(By.name(REGISTERBUTTON));
        }

        public void registration(User account){
            userIdField.sendKeys(account.userId);
            newPasswordField.sendKeys(account.newPassword);
            repeatPasswordField.sendKeys(account.repeatPassword);
            fNameField.sendKeys(account.fName);
            lnameField.sendKeys(account.lname);
            emailField.sendKeys(account.email);
            phoneField.sendKeys(account.phone);
            address1Field.sendKeys(account.address1);
            address2Field.sendKeys(account.address2);
            cityField.sendKeys(account.city);
            stateField.sendKeys(account.state);
            zipField.sendKeys(account.zip);
            countryField.sendKeys(account.state);
            languageDropdown.selectByValue(account.languageDropdown);
            categoryDropdown.selectByValue(account.categoryDropdown);
            if(account.myBannerCheckbox){
                myBannerCheckbox.click();
            }
            if (account.myListCheckbox){
                myListCheckbox.click();
            }
            registerButton.click();

        }



}