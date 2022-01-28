package programpierwszy.RestApi;


import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

@Service
public class service {

    public String hello(){
        return "witam";
    }

}
