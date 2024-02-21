package Demo.ThirdParty.Controller;

import Demo.ThirdParty.Entity.ResultReponse.CustomeEntityResponse;
import Demo.ThirdParty.Entity.ResultReponse.EntityResponse;
import Demo.ThirdParty.Service.ResultService;
import Demo.ThirdParty.Service.ResultServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api1")
public class ResultController {
    @Autowired
    private  ResultService resultService;

@PostMapping("/getData")
public ResponseEntity<?>getDataResult(){
    try{
        return new ResponseEntity(new EntityResponse(resultService.getDataResult(),-0), HttpStatus.OK);
    }catch (Exception e){
        return new ResponseEntity(new CustomeEntityResponse(e.getMessage(),-1),HttpStatus.OK);
    }
}

}
