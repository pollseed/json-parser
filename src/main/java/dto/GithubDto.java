package dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GithubDto {

    @JsonProperty("id")
    private long githubId;

    @JsonProperty("name")
    private String repositoryName;

    @JsonProperty("owner")
    private OwnerDto ownerDto;

    @Override
    public String toString() {
        return "GithubResponseDto [githubId=" + githubId + ", repositoryName=" + repositoryName + ", owner=" + ownerDto
                + "]";
    }
}
