package Runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = { "src/test/resources/features/AuthToken.feature",
                "src/test/resources/features/CreateBooking.feature",
                "src/test/resources/features/DeleteBooking.feature",
                "src/test/resources/features/GetBookin.feature",
                "src/test/resources/features/GetBookinID.feature",
                "src/test/resources/features/healtCheck.feature",
                "src/test/resources/features/PartiaUpdateBooking.feature",
                "src/test/resources/features/UpdateBooking.feature"

        },
        glue = {"steps" }

)
public class CucumberRunner {
}
