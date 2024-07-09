package guru.springframework.spring6resttemplate.client;

import guru.springframework.spring6resttemplate.model.BeerDTO;
import org.springframework.data.domain.Page;

/**
 * Created by jt, Spring Framework Guru.
 *
 * @author architecture - raulp
 * @version 08/07/2024 - 13:31
 * @since jdk 1.21
 */
public interface BeerClient {

    Page<BeerDTO> listBeers();

}
