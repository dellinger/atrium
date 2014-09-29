import me.dme.atrium.controller.ProductController;
import me.dme.atrium.domain.Product;
import me.dme.atrium.service.ProductService;
import me.dme.atrium.utility.ProductBuilder;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

/**
 * Created by david on 9/28/14.
 */
public class ProductControllerTest {

    MockMvc mockMvc;

    @InjectMocks
    ProductController controller;

    @Mock
    ProductService productService;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);

        mockMvc = standaloneSetup(controller).build();



    }

    @Test
    public void testGetAllProducts() throws Exception {
        List<Product> products = new ArrayList<>();
        products.add(new ProductBuilder().build());
        when(productService.getAllProducts()).thenReturn(products);

        mockMvc.perform(get("/"))
                .andDo(print())
                .andExpect(status().isOk());

        Mockito.verify(productService,times(1)).getAllProducts();
        Mockito.verifyNoMoreInteractions(productService);

    }


}

