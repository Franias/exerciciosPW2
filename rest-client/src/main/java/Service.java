import javax.ws.rs.Path;

@Path("/jwt/{user}/{password}")
public class Service {
    @GET
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)

    public String generate(@PathParam("user") String user,
                            @PathParam("password") String password ){
                                //aqui é o ponto que vc verifica se
                                //o usuario existe
        System.out.println(user);
        System.out.println(password);
        return Jwt.issuer("http://localhost:8080")
                .upn("chavePodeSerQualquerInfoComoEmail")
                .groups(new HashSet<>(Arrays.asList("User", "Admin"))) // nao tem role de admin, ele vai gerar um erro de 403
                .claim(Claims.full_name, "Francielli Pinheiro Dias")
                .sign();
    }
    
}
