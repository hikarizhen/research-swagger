/*
 * KnowledgeBase API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 0.00.01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * FWKnowledgeInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2021-01-13T06:09:11.378Z")
public class FWKnowledgeInfo   {
  @JsonProperty("KnowledgeId")
  private String knowledgeId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("tag")
  private String tag = null;

  @JsonProperty("desc")
  private String desc = null;

  @JsonProperty("createDate")
  private String createDate = null;

  public FWKnowledgeInfo knowledgeId(String knowledgeId) {
    this.knowledgeId = knowledgeId;
    return this;
  }

  /**
   * Get knowledgeId
   * @return knowledgeId
   **/
  @JsonProperty("KnowledgeId")
  @ApiModelProperty(example = "1", value = "")
  public String getKnowledgeId() {
    return knowledgeId;
  }

  public void setKnowledgeId(String knowledgeId) {
    this.knowledgeId = knowledgeId;
  }

  public FWKnowledgeInfo name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @JsonProperty("name")
  @ApiModelProperty(example = "フレデリック・ショパン", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FWKnowledgeInfo tag(String tag) {
    this.tag = tag;
    return this;
  }

  /**
   * Get tag
   * @return tag
   **/
  @JsonProperty("tag")
  @ApiModelProperty(example = "Franciszek Chopin", value = "")
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public FWKnowledgeInfo desc(String desc) {
    this.desc = desc;
    return this;
  }

  /**
   * Get desc
   * @return desc
   **/
  @JsonProperty("desc")
  @ApiModelProperty(example = "ポーランドの前期ロマン派音楽を代表する作曲家。", value = "")
  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public FWKnowledgeInfo createDate(String createDate) {
    this.createDate = createDate;
    return this;
  }

  /**
   * Get createDate
   * @return createDate
   **/
  @JsonProperty("createDate")
  @ApiModelProperty(example = "2021/01/13 00:00:00.001", value = "")
  public String getCreateDate() {
    return createDate;
  }

  public void setCreateDate(String createDate) {
    this.createDate = createDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FWKnowledgeInfo fwKnowledgeInfo = (FWKnowledgeInfo) o;
    return Objects.equals(this.knowledgeId, fwKnowledgeInfo.knowledgeId) &&
        Objects.equals(this.name, fwKnowledgeInfo.name) &&
        Objects.equals(this.tag, fwKnowledgeInfo.tag) &&
        Objects.equals(this.desc, fwKnowledgeInfo.desc) &&
        Objects.equals(this.createDate, fwKnowledgeInfo.createDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(knowledgeId, name, tag, desc, createDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FWKnowledgeInfo {\n");
    
    sb.append("    knowledgeId: ").append(toIndentedString(knowledgeId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
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
    return o.toString().replace("\n", "\n    ");
  }
}

