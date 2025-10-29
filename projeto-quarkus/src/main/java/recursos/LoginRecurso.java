package recursos;

import jakarta.transaction.Transactional;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;



@Path("/login")
public class LoginRecurso {

    @POST
    @Transactional
    public void criarLogin(LoginDTO dto) {
        Login login = new Login();
        login.setUsername(dto.getUsername());
        login.setPassword(dto.getPassword());
    
    }    

}
