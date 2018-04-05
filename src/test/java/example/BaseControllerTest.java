package example;

import example.controllers.BaseController;
import example.services.BaseService;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BaseControllerTest {

    @Before
    public void setup() {

    }

    @Test
    public void shouldReturnListOfProjects_whenPinged() throws Exception {
        BaseService baseService = new BaseService();
        assertEquals(baseService.getAllProjects().size(), 1);
    }
}