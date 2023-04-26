/*
* Copyright (c) 2020, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package org.wso2.carbon.extension.identity.verification.api.rest.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;
import javax.validation.Valid;
import javax.xml.bind.annotation.*;

public class VerificationClaimRequest  {
  
    private String uri;
    private Boolean isVerified;
    private String idvProviderId;
    private Map<String, Object> claimMetadata = null;


    /**
    **/
    public VerificationClaimRequest uri(String uri) {

        this.uri = uri;
        return this;
    }
    
    @ApiModelProperty(example = "http://wso2.org/claims/dob", value = "")
    @JsonProperty("uri")
    @Valid
    public String getUri() {
        return uri;
    }
    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
    **/
    public VerificationClaimRequest isVerified(Boolean isVerified) {

        this.isVerified = isVerified;
        return this;
    }
    
    @ApiModelProperty(example = "true", value = "")
    @JsonProperty("isVerified")
    @Valid
    public Boolean getIsVerified() {
        return isVerified;
    }
    public void setIsVerified(Boolean isVerified) {
        this.isVerified = isVerified;
    }

    /**
    **/
    public VerificationClaimRequest idvProviderId(String idvProviderId) {

        this.idvProviderId = idvProviderId;
        return this;
    }
    
    @ApiModelProperty(example = "2159375-r567-8524-a456-5566424414527", value = "")
    @JsonProperty("idvProviderId")
    @Valid
    public String getIdvProviderId() {
        return idvProviderId;
    }
    public void setIdvProviderId(String idvProviderId) {
        this.idvProviderId = idvProviderId;
    }

    /**
    **/
    public VerificationClaimRequest claimMetadata(Map<String, Object> claimMetadata) {

        this.claimMetadata = claimMetadata;
        return this;
    }
    
    @ApiModelProperty(example = "{\"source\": \"evidentID\", \"trackingId\": \"123e4567-e89b-12d3-a456-556642440000\" }", value = "")
    @JsonProperty("claimMetadata")
    @Valid
    public Map<String, Object> getClaimMetadata() {
        return claimMetadata;
    }
    public void setClaimMetadata(Map<String, Object> claimMetadata) {
        this.claimMetadata = claimMetadata;
    }


    public VerificationClaimRequest putClaimMetadataItem(String key, Object claimMetadataItem) {
        if (this.claimMetadata == null) {
            this.claimMetadata = new HashMap<>();
        }
        this.claimMetadata.put(key, claimMetadataItem);
        return this;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {

        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VerificationClaimRequest verificationClaimRequest = (VerificationClaimRequest) o;
        return Objects.equals(this.uri, verificationClaimRequest.uri) &&
            Objects.equals(this.isVerified, verificationClaimRequest.isVerified) &&
            Objects.equals(this.idvProviderId, verificationClaimRequest.idvProviderId) &&
            Objects.equals(this.claimMetadata, verificationClaimRequest.claimMetadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uri, isVerified, idvProviderId, claimMetadata);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("class VerificationClaimRequest {\n");
        
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
        sb.append("    isVerified: ").append(toIndentedString(isVerified)).append("\n");
        sb.append("    idvProviderId: ").append(toIndentedString(idvProviderId)).append("\n");
        sb.append("    claimMetadata: ").append(toIndentedString(claimMetadata)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
    * Convert the given object to string with each line indented by 4 spaces
    * (except the first line).
    */
    private String toIndentedString(java.lang.Object o) {

        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n");
    }
}

