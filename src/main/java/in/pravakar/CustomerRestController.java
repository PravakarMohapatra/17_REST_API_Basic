package in.pravakar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerRestController {
	
	@GetMapping("/")
	public Customer getCustomer() {
		Customer c = new Customer();
		c.setId(1);
		c.setName("Robert");
		c.setEmail("robert@gmail.com");
		c.setPhno(7856924315l);
		return c;
	}
}
