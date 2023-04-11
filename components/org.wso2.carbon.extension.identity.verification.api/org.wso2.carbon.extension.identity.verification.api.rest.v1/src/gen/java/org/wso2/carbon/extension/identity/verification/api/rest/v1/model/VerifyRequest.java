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
import java.util.ArrayList;
import java.util.List;
import org.wso2.carbon.extension.identity.verification.api.rest.v1.model.Claim;
import org.wso2.carbon.extension.identity.verification.api.rest.v1.model.ProviderProperty;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;
import javax.validation.Valid;
import javax.xml.bind.annotation.*;

public class VerifyRequest  {
  
    private String identityVerificationProvider;
    private List<Claim> claims = null;

    private List<ProviderProperty> properties = new ArrayList<>();


    /**
    **/
    public VerifyRequest identityVerificationProvider(String identityVerificationProvider) {

        this.identityVerificationProvider = identityVerificationProvider;
        return this;
    }
    
    @ApiModelProperty(example = "ONFIDO", required = true, value = "")
    @JsonProperty("identityVerificationProvider")
    @Valid
    @NotNull(message = "Property identityVerificationProvider cannot be null.")

    public String getIdentityVerificationProvider() {
        return identityVerificationProvider;
    }
    public void setIdentityVerificationProvider(String identityVerificationProvider) {
        this.identityVerificationProvider = identityVerificationProvider;
    }

    /**
    **/
    public VerifyRequest claims(List<Claim> claims) {

        this.claims = claims;
        return this;
    }
    
    @ApiModelProperty(value = "")
    @JsonProperty("claims")
    @Valid
    public List<Claim> getClaims() {
        return claims;
    }
    public void setClaims(List<Claim> claims) {
        this.claims = claims;
    }

    public VerifyRequest addClaimsItem(Claim claimsItem) {
        if (this.claims == null) {
            this.claims = new ArrayList<>();
        }
        this.claims.add(claimsItem);
        return this;
    }

        /**
    **/
    public VerifyRequest properties(List<ProviderProperty> properties) {

        this.properties = properties;
        return this;
    }
    
    @ApiModelProperty(required = true, value = "")
    @JsonProperty("properties")
    @Valid
    @NotNull(message = "Property properties cannot be null.")

    public List<ProviderProperty> getProperties() {
        return properties;
    }
    public void setProperties(List<ProviderProperty> properties) {
        this.properties = properties;
    }

    public VerifyRequest addPropertiesItem(ProviderProperty propertiesItem) {
        this.properties.add(propertiesItem);
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
        VerifyRequest verifyRequest = (VerifyRequest) o;
        return Objects.equals(this.identityVerificationProvider, verifyRequest.identityVerificationProvider) &&
            Objects.equals(this.claims, verifyRequest.claims) &&
            Objects.equals(this.properties, verifyRequest.properties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identityVerificationProvider, claims, properties);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("class VerifyRequest {\n");
        
        sb.append("    identityVerificationProvider: ").append(toIndentedString(identityVerificationProvider)).append("\n");
        sb.append("    claims: ").append(toIndentedString(claims)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

