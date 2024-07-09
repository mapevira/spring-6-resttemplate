package guru.springframework.spring6resttemplate.client;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BeerClientImplTest {

    @Autowired
    BeerClientImpl beerClient;

    @Test
    void listBeersWithoutBeerName() {
        beerClient.listBeers(null);
    }

    @Test
    void listBeers() {
        beerClient.listBeers("Mango Bobs");
    }
}