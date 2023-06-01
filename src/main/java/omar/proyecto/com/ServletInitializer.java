package omar.proyecto.com;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Proyectoomarv3Application.class);
	}

}
