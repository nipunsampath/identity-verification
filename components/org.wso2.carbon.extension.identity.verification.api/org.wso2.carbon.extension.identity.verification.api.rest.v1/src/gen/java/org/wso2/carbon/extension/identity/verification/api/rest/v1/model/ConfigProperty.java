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
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;
import javax.validation.Valid;
import javax.xml.bind.annotation.*;

public class ConfigProperty  {
  
    private String key;
    private String value;
    private Boolean isSecret;

    /**
    **/
    public ConfigProperty key(String key) {

        this.key = key;
        return this;
    }
    
    @ApiModelProperty(example = "somePropertyKey", value = "")
    @JsonProperty("key")
    @Valid
    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }

    /**
    **/
    public ConfigProperty value(String value) {

        this.value = value;
        return this;
    }
    
    @ApiModelProperty(example = "somePropertyValue", value = "")
    @JsonProperty("value")
    @Valid
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }

    /**
    **/
    public ConfigProperty isSecret(Boolean isSecret) {

        this.isSecret = isSecret;
        return this;
    }
    
    @ApiModelProperty(example = "false", value = "")
    @JsonProperty("isSecret")
    @Valid
    public Boolean getIsSecret() {
        return isSecret;
    }
    public void setIsSecret(Boolean isSecret) {
        this.isSecret = isSecret;
    }



    @Override
    public boolean equals(java.lang.Object o) {

        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConfigProperty configProperty = (ConfigProperty) o;
        return Objects.equals(this.key, configProperty.key) &&
            Objects.equals(this.value, configProperty.value) &&
            Objects.equals(this.isSecret, configProperty.isSecret);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value, isSecret);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("class ConfigProperty {\n");
        
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    isSecret: ").append(toIndentedString(isSecret)).append("\n");
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

