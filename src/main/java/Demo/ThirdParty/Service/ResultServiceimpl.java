package Demo.ThirdParty.Service;

import Demo.ThirdParty.Entity.Result;
import Demo.ThirdParty.Entity.ResultReponse.ResultResponse;
import Demo.ThirdParty.Repository.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ResultServiceimpl implements ResultService {
    @Autowired
    private ResultRepository resultRepository;

    //@Autowired
    private RestTemplate restTemplate;
    public ResultServiceimpl() {
        this.restTemplate = new RestTemplate();
    }


    @Override
    public Object getDataResult() {
        String apiUrl = "https://randomuser.me/api/?results=5&inc=name,location,email,phone,cell,picture,registered,id,login,dob";
        ResultResponse response = restTemplate.getForObject(apiUrl,ResultResponse.class);
        if(response !=null && response.getResults()!=null){
            for(Result results : response.getResults()){
              resultRepository.save(results);
            }
        }
        return "saved data";
    }
}
