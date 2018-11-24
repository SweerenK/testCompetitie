package nl.test.Competitie.config;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;
import nl.test.Competitie.api.*;

@Component
@ApplicationPath("/api")
public class JerseyConfig extends ResourceConfig{
	public JerseyConfig(){
		register(SpelerEndpoint.class);
		register(ScoreEndpoint.class);
		register(KlasseEndpoint.class);
	}
}