package programpierwszy.RestApi;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class Controller {


    private final service service;



        /*
        @Autowired
        public void setService(programpierwszy.RestApi.service service) {
            this.service = service;
        }

    @Autowired
    public Controller(programpierwszy.RestApi.service service) {
        this.service = service;
    }

         */

    @GetMapping("/")
    public String witam() {
        return service.hello();
    }

}
