package Demo.ThirdParty.Entity.ResultReponse;

import Demo.ThirdParty.Entity.Result;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResultResponse {
private Result[] results;

//@JsonIgnore
    @JsonCreator
    public ResultResponse(@JsonProperty("results")Result[]results){
    this.results=results;
}
}
