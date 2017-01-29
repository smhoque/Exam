package Home;

import Base.CommonApi;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by riponctg on 1/6/2017.
 */
public class ItemSearch extends CommonApi {
    @Test
    public void testhome() {
        System.out.println(driver.getCurrentUrl());
        //clickByXpath(".//*[@id='nav-xshop']/a[2]");
        driver.findElement(By.xpath(".//*[@id='nav-xshop']/a[2]")).click();
    }
}
