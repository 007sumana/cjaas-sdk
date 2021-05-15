/*
 * Customer Journey as a Service (CJaaS)
 * Something amazing, something special - the Customer Journey as a Service (CJaaS) is a core data layer to enable Journeys across products built upon serverless multi-cloud architecture, to be available as a SaaS service for applications inside and outside of Cisco. [**Cisco Experimental - Not For Production Use**]
 *
 * OpenAPI spec version: 0.5.0
 * Contact: cjaas-earlyaccess@cisco.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * AccountSettings
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-02-10T15:46:40.647328-07:00[America/Denver]")
public class AccountSettings {
  @SerializedName("dataRetentionDays")
  private Integer dataRetentionDays = null;

  @SerializedName("destinationSubscriptions")
  private List<String> destinationSubscriptions = null;

  @SerializedName("webexTokenIssuer")
  private String webexTokenIssuer = null;

  @SerializedName("webexTokenIssuerSecret")
  private String webexTokenIssuerSecret = null;

  public AccountSettings dataRetentionDays(Integer dataRetentionDays) {
    this.dataRetentionDays = dataRetentionDays;
    return this;
  }

   /**
   * Get dataRetentionDays
   * @return dataRetentionDays
  **/
  @Schema(description = "")
  public Integer getDataRetentionDays() {
    return dataRetentionDays;
  }

  public void setDataRetentionDays(Integer dataRetentionDays) {
    this.dataRetentionDays = dataRetentionDays;
  }

  public AccountSettings destinationSubscriptions(List<String> destinationSubscriptions) {
    this.destinationSubscriptions = destinationSubscriptions;
    return this;
  }

  public AccountSettings addDestinationSubscriptionsItem(String destinationSubscriptionsItem) {
    if (this.destinationSubscriptions == null) {
      this.destinationSubscriptions = new ArrayList<String>();
    }
    this.destinationSubscriptions.add(destinationSubscriptionsItem);
    return this;
  }

   /**
   * Get destinationSubscriptions
   * @return destinationSubscriptions
  **/
  @Schema(description = "")
  public List<String> getDestinationSubscriptions() {
    return destinationSubscriptions;
  }

  public void setDestinationSubscriptions(List<String> destinationSubscriptions) {
    this.destinationSubscriptions = destinationSubscriptions;
  }

  public AccountSettings webexTokenIssuer(String webexTokenIssuer) {
    this.webexTokenIssuer = webexTokenIssuer;
    return this;
  }

   /**
   * Get webexTokenIssuer
   * @return webexTokenIssuer
  **/
  @Schema(description = "")
  public String getWebexTokenIssuer() {
    return webexTokenIssuer;
  }

  public void setWebexTokenIssuer(String webexTokenIssuer) {
    this.webexTokenIssuer = webexTokenIssuer;
  }

  public AccountSettings webexTokenIssuerSecret(String webexTokenIssuerSecret) {
    this.webexTokenIssuerSecret = webexTokenIssuerSecret;
    return this;
  }

   /**
   * Get webexTokenIssuerSecret
   * @return webexTokenIssuerSecret
  **/
  @Schema(description = "")
  public String getWebexTokenIssuerSecret() {
    return webexTokenIssuerSecret;
  }

  public void setWebexTokenIssuerSecret(String webexTokenIssuerSecret) {
    this.webexTokenIssuerSecret = webexTokenIssuerSecret;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountSettings accountSettings = (AccountSettings) o;
    return Objects.equals(this.dataRetentionDays, accountSettings.dataRetentionDays) &&
        Objects.equals(this.destinationSubscriptions, accountSettings.destinationSubscriptions) &&
        Objects.equals(this.webexTokenIssuer, accountSettings.webexTokenIssuer) &&
        Objects.equals(this.webexTokenIssuerSecret, accountSettings.webexTokenIssuerSecret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataRetentionDays, destinationSubscriptions, webexTokenIssuer, webexTokenIssuerSecret);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountSettings {\n");
    
    sb.append("    dataRetentionDays: ").append(toIndentedString(dataRetentionDays)).append("\n");
    sb.append("    destinationSubscriptions: ").append(toIndentedString(destinationSubscriptions)).append("\n");
    sb.append("    webexTokenIssuer: ").append(toIndentedString(webexTokenIssuer)).append("\n");
    sb.append("    webexTokenIssuerSecret: ").append(toIndentedString(webexTokenIssuerSecret)).append("\n");
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