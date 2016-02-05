package dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OwnerDto {

    @JsonProperty("id")
    private long ownerId;

    @JsonProperty("login")
    private String ownerName;

    @Override
    public String toString() {
        return "OwnerDto [ownerId=" + ownerId + ", ownerName=" + ownerName + "]";
    }
}
