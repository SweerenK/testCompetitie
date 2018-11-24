package nl.test.Competitie.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import nl.test.Competitie.domain.Score;
import nl.test.Competitie.persistence.ScoreService;

@Path("Score")
@Component
public class ScoreEndpoint {
	
	@Autowired
	private ScoreService scoreService;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response listGroep(){
		Iterable <Score> scores = scoreService.findAll();
		return Response.ok(scores).build();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public Response postScore(Score scores){
		Score result = scoreService.save(scores);
		return Response.accepted(result.getScoreId()).build();	
	}

}