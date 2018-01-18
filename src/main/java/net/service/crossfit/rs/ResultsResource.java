
package net.service.crossfit.rs;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import net.service.crossfit.session.ResultsFacade;
import net.service.crossfit.entity.Results;

@Stateless
@Path("/results")
public class ResultsResource {
   
    
    @EJB
    ResultsFacade resultsFacade;
        
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @GET
    public List<Results> getResults() {
        return resultsFacade.findAll();
    }
    
    @Path("{id}")
    @Produces({MediaType.APPLICATION_JSON})
    @GET
    public Results getResultById(@PathParam("id") int id) {
        return resultsFacade.find(id);
    }
    
    @Path("count")
    @Produces({MediaType.APPLICATION_JSON})
    @GET
    public String getCount() {
        return String.valueOf(resultsFacade.count());
    }


    
    
}
