import java.util.Random;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.inject.Inject;
import javax.ws.rs.POST;

// Jax-rs
@Path("/hola")
public class nuevoController {
    
    @Inject
    private GestorArticulos g;
    
    @GET
    @Path("/")
    public Response hola() {
        System.out.println("Recibida un peticion a /hola");
        return Response.ok("Hola mundo").build();
    }        
    
    @GET
    @Path("/v")
    public Response vector() {
        Random r = new Random();
        int v[] = r.ints(100,1000).limit(20).toArray();
        return Response.ok(v).build();
    }        
    
    @GET
    //@Produces(MediaType.APPLICATION_JSON)  @Consumes
    @Path("/art")
    public Response articulo() {
        
        //Response.status(Response.Status.NOT_FOUND);
        Articulo a = new Articulo(1,"Pan",100,20);
        return Response.ok(a).build();
        
    }   
    
    @GET
    @Path("/miget/{parametro}")
    public Response miget(@PathParam("parametro") int parametro) {
         //Response.status(Response.Status.NOT_FOUND);
        
        return Response.ok("El numero es: "+parametro).build();
        
    }   
    
    @Inject private Articulo a;
    @POST
    @Path("/")
    public Response insertarArticulo()
    {
        a.getNombre();//existe y es una istancia por peticion
        return Response.ok(id).build();
    }
}