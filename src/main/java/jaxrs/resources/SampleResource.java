package jaxrs.resources;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/test")
@Singleton
public class SampleResource {
	
	/*
	 * cannot be used with @Singleton anymore
	 * @PathParam("pathParam") private String pathParam;
	 * 
	 * @QueryParam("userId") private String userId;
	 */
	
	private int count;
	
	@GET
	@Path("{pathParam}")
	@Produces(MediaType.TEXT_PLAIN)
	public String demo(@QueryParam("userId") String userId, @PathParam("pathParam") String pathParam) {
		count = count+1;
		//return "It works " + this.count + " times";
		return "Path param is " + pathParam + " and query param userId is " + userId;
	}

}
