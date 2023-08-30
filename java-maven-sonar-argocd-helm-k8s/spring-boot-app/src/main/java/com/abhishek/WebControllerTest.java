import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.ui.Model;

import static org.mockito.Mockito.*;

public class WebControllerTest {

    @Mock
    private Model mockModel;

    @Test
    public void testGetHomePage() {
        WebController webController = new WebController();

        String result = webController.getHomePage(mockModel);

        // Here, you can add assertions to verify the behavior of the method
        // For example, you might verify that the title attribute is added to the model
        verify(mockModel).addAttribute(eq("title"), anyString());

        // You might also verify the returned value, if applicable
        // assertEquals("index", result);
    }
}
