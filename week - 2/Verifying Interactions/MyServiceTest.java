import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

// External API interface
interface ExternalApi {
    String getData();
}

// Service that depends on the external API
class MyService {
    private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public String fetchData() {
        return api.getData();  // This interaction will be verified
    }
}

public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {
        // Step 1: Create a mock
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // Step 2: Use the mock in service
        MyService service = new MyService(mockApi);
        service.fetchData();  // Calls the mocked getData()

        // Step 3: Verify interaction
        verify(mockApi).getData();  // Verifies that getData() was called
    }
}
