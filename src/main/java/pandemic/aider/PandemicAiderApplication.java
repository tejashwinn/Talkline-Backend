package pandemic.aider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import pandemic.aider.server.service.ServerSidePostService;
import pandemic.aider.server.service.ServerSideUserServer;

@SpringBootApplication
@RestController
public class PandemicAiderApplication {
	
	public static void main(String[] args) {
		
		SpringApplication.run(PandemicAiderApplication.class, args);
		ServerSideUserServer.runUserService();
		ServerSidePostService.runServerPost();
	}
	
}

