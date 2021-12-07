package pages;

import constants.IConstants;
import lombok.extern.log4j.Log4j2;
import static com.codeborne.selenide.Selenide.open;

@Log4j2
public class BasePage implements IConstants {

    public void openUrl(String url) {
        log.info(String.format("Open URL: '%s'", url));
                open(BASE_URL + url);
    }
}
