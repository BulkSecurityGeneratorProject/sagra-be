package it.alecata.sagra.web.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse2003
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-07-25T09:45:13.933Z")

public class InlineResponse2003   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("idSerata")
  private Long idSerata = null;

  @JsonProperty("idTavoloReale")
  private Long idTavoloReale = null;

  @JsonProperty("codice")
  private String codice = null;

  @JsonProperty("descrizione")
  private String descrizione = null;

  @JsonProperty("numCoperti")
  private Integer numCoperti = null;

  /**
   * Gets or Sets stato
   */
  public enum StatoEnum {
    ACCOMODATO("ACCOMODATO"),
    
    IN_ORDINAZIONE("IN_ORDINAZIONE"),
    
    ORDINATO("ORDINATO"),
    
    LIBERATO("LIBERATO");

    private String value;

    StatoEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatoEnum fromValue(String text) {
      for (StatoEnum b : StatoEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("stato")
  private StatoEnum stato = null;

  @JsonProperty("accomodatoOrario")
  private DateTime accomodatoOrario = null;

  @JsonProperty("accomodatoPersona")
  private String accomodatoPersona = null;

  @JsonProperty("inOrdinazioneOrario")
  private DateTime inOrdinazioneOrario = null;

  @JsonProperty("inOrdinazionePersona")
  private String inOrdinazionePersona = null;

  @JsonProperty("ordinazioneOrario")
  private DateTime ordinazioneOrario = null;

  @JsonProperty("ordinazionePersona")
  private String ordinazionePersona = null;

  @JsonProperty("liberatoOrario")
  private DateTime liberatoOrario = null;

  @JsonProperty("liberatoPersona")
  private String liberatoPersona = null;

  @JsonProperty("asporto")
  private Boolean asporto = false;

  public InlineResponse2003 id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public InlineResponse2003 idSerata(Long idSerata) {
    this.idSerata = idSerata;
    return this;
  }

   /**
   * Get idSerata
   * @return idSerata
  **/
  @ApiModelProperty(value = "")


  public Long getIdSerata() {
    return idSerata;
  }

  public void setIdSerata(Long idSerata) {
    this.idSerata = idSerata;
  }

  public InlineResponse2003 idTavoloReale(Long idTavoloReale) {
    this.idTavoloReale = idTavoloReale;
    return this;
  }

   /**
   * Get idTavoloReale
   * @return idTavoloReale
  **/
  @ApiModelProperty(value = "")


  public Long getIdTavoloReale() {
    return idTavoloReale;
  }

  public void setIdTavoloReale(Long idTavoloReale) {
    this.idTavoloReale = idTavoloReale;
  }

  public InlineResponse2003 codice(String codice) {
    this.codice = codice;
    return this;
  }

   /**
   * Get codice
   * @return codice
  **/
  @ApiModelProperty(value = "")


  public String getCodice() {
    return codice;
  }

  public void setCodice(String codice) {
    this.codice = codice;
  }

  public InlineResponse2003 descrizione(String descrizione) {
    this.descrizione = descrizione;
    return this;
  }

   /**
   * Get descrizione
   * @return descrizione
  **/
  @ApiModelProperty(value = "")


  public String getDescrizione() {
    return descrizione;
  }

  public void setDescrizione(String descrizione) {
    this.descrizione = descrizione;
  }

  public InlineResponse2003 numCoperti(Integer numCoperti) {
    this.numCoperti = numCoperti;
    return this;
  }

   /**
   * Get numCoperti
   * @return numCoperti
  **/
  @ApiModelProperty(value = "")


  public Integer getNumCoperti() {
    return numCoperti;
  }

  public void setNumCoperti(Integer numCoperti) {
    this.numCoperti = numCoperti;
  }

  public InlineResponse2003 stato(StatoEnum stato) {
    this.stato = stato;
    return this;
  }

   /**
   * Get stato
   * @return stato
  **/
  @ApiModelProperty(value = "")


  public StatoEnum getStato() {
    return stato;
  }

  public void setStato(StatoEnum stato) {
    this.stato = stato;
  }

  public InlineResponse2003 accomodatoOrario(DateTime accomodatoOrario) {
    this.accomodatoOrario = accomodatoOrario;
    return this;
  }

   /**
   * Get accomodatoOrario
   * @return accomodatoOrario
  **/
  @ApiModelProperty(value = "")

  @Valid

  public DateTime getAccomodatoOrario() {
    return accomodatoOrario;
  }

  public void setAccomodatoOrario(DateTime accomodatoOrario) {
    this.accomodatoOrario = accomodatoOrario;
  }

  public InlineResponse2003 accomodatoPersona(String accomodatoPersona) {
    this.accomodatoPersona = accomodatoPersona;
    return this;
  }

   /**
   * Get accomodatoPersona
   * @return accomodatoPersona
  **/
  @ApiModelProperty(value = "")


  public String getAccomodatoPersona() {
    return accomodatoPersona;
  }

  public void setAccomodatoPersona(String accomodatoPersona) {
    this.accomodatoPersona = accomodatoPersona;
  }

  public InlineResponse2003 inOrdinazioneOrario(DateTime inOrdinazioneOrario) {
    this.inOrdinazioneOrario = inOrdinazioneOrario;
    return this;
  }

   /**
   * Get inOrdinazioneOrario
   * @return inOrdinazioneOrario
  **/
  @ApiModelProperty(value = "")

  @Valid

  public DateTime getInOrdinazioneOrario() {
    return inOrdinazioneOrario;
  }

  public void setInOrdinazioneOrario(DateTime inOrdinazioneOrario) {
    this.inOrdinazioneOrario = inOrdinazioneOrario;
  }

  public InlineResponse2003 inOrdinazionePersona(String inOrdinazionePersona) {
    this.inOrdinazionePersona = inOrdinazionePersona;
    return this;
  }

   /**
   * Get inOrdinazionePersona
   * @return inOrdinazionePersona
  **/
  @ApiModelProperty(value = "")


  public String getInOrdinazionePersona() {
    return inOrdinazionePersona;
  }

  public void setInOrdinazionePersona(String inOrdinazionePersona) {
    this.inOrdinazionePersona = inOrdinazionePersona;
  }

  public InlineResponse2003 ordinazioneOrario(DateTime ordinazioneOrario) {
    this.ordinazioneOrario = ordinazioneOrario;
    return this;
  }

   /**
   * Get ordinazioneOrario
   * @return ordinazioneOrario
  **/
  @ApiModelProperty(value = "")

  @Valid

  public DateTime getOrdinazioneOrario() {
    return ordinazioneOrario;
  }

  public void setOrdinazioneOrario(DateTime ordinazioneOrario) {
    this.ordinazioneOrario = ordinazioneOrario;
  }

  public InlineResponse2003 ordinazionePersona(String ordinazionePersona) {
    this.ordinazionePersona = ordinazionePersona;
    return this;
  }

   /**
   * Get ordinazionePersona
   * @return ordinazionePersona
  **/
  @ApiModelProperty(value = "")


  public String getOrdinazionePersona() {
    return ordinazionePersona;
  }

  public void setOrdinazionePersona(String ordinazionePersona) {
    this.ordinazionePersona = ordinazionePersona;
  }

  public InlineResponse2003 liberatoOrario(DateTime liberatoOrario) {
    this.liberatoOrario = liberatoOrario;
    return this;
  }

   /**
   * Get liberatoOrario
   * @return liberatoOrario
  **/
  @ApiModelProperty(value = "")

  @Valid

  public DateTime getLiberatoOrario() {
    return liberatoOrario;
  }

  public void setLiberatoOrario(DateTime liberatoOrario) {
    this.liberatoOrario = liberatoOrario;
  }

  public InlineResponse2003 liberatoPersona(String liberatoPersona) {
    this.liberatoPersona = liberatoPersona;
    return this;
  }

   /**
   * Get liberatoPersona
   * @return liberatoPersona
  **/
  @ApiModelProperty(value = "")


  public String getLiberatoPersona() {
    return liberatoPersona;
  }

  public void setLiberatoPersona(String liberatoPersona) {
    this.liberatoPersona = liberatoPersona;
  }

  public InlineResponse2003 asporto(Boolean asporto) {
    this.asporto = asporto;
    return this;
  }

   /**
   * Get asporto
   * @return asporto
  **/
  @ApiModelProperty(value = "")


  public Boolean getAsporto() {
    return asporto;
  }

  public void setAsporto(Boolean asporto) {
    this.asporto = asporto;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2003 inlineResponse2003 = (InlineResponse2003) o;
    return Objects.equals(this.id, inlineResponse2003.id) &&
        Objects.equals(this.idSerata, inlineResponse2003.idSerata) &&
        Objects.equals(this.idTavoloReale, inlineResponse2003.idTavoloReale) &&
        Objects.equals(this.codice, inlineResponse2003.codice) &&
        Objects.equals(this.descrizione, inlineResponse2003.descrizione) &&
        Objects.equals(this.numCoperti, inlineResponse2003.numCoperti) &&
        Objects.equals(this.stato, inlineResponse2003.stato) &&
        Objects.equals(this.accomodatoOrario, inlineResponse2003.accomodatoOrario) &&
        Objects.equals(this.accomodatoPersona, inlineResponse2003.accomodatoPersona) &&
        Objects.equals(this.inOrdinazioneOrario, inlineResponse2003.inOrdinazioneOrario) &&
        Objects.equals(this.inOrdinazionePersona, inlineResponse2003.inOrdinazionePersona) &&
        Objects.equals(this.ordinazioneOrario, inlineResponse2003.ordinazioneOrario) &&
        Objects.equals(this.ordinazionePersona, inlineResponse2003.ordinazionePersona) &&
        Objects.equals(this.liberatoOrario, inlineResponse2003.liberatoOrario) &&
        Objects.equals(this.liberatoPersona, inlineResponse2003.liberatoPersona) &&
        Objects.equals(this.asporto, inlineResponse2003.asporto);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idSerata, idTavoloReale, codice, descrizione, numCoperti, stato, accomodatoOrario, accomodatoPersona, inOrdinazioneOrario, inOrdinazionePersona, ordinazioneOrario, ordinazionePersona, liberatoOrario, liberatoPersona, asporto);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2003 {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idSerata: ").append(toIndentedString(idSerata)).append("\n");
    sb.append("    idTavoloReale: ").append(toIndentedString(idTavoloReale)).append("\n");
    sb.append("    codice: ").append(toIndentedString(codice)).append("\n");
    sb.append("    descrizione: ").append(toIndentedString(descrizione)).append("\n");
    sb.append("    numCoperti: ").append(toIndentedString(numCoperti)).append("\n");
    sb.append("    stato: ").append(toIndentedString(stato)).append("\n");
    sb.append("    accomodatoOrario: ").append(toIndentedString(accomodatoOrario)).append("\n");
    sb.append("    accomodatoPersona: ").append(toIndentedString(accomodatoPersona)).append("\n");
    sb.append("    inOrdinazioneOrario: ").append(toIndentedString(inOrdinazioneOrario)).append("\n");
    sb.append("    inOrdinazionePersona: ").append(toIndentedString(inOrdinazionePersona)).append("\n");
    sb.append("    ordinazioneOrario: ").append(toIndentedString(ordinazioneOrario)).append("\n");
    sb.append("    ordinazionePersona: ").append(toIndentedString(ordinazionePersona)).append("\n");
    sb.append("    liberatoOrario: ").append(toIndentedString(liberatoOrario)).append("\n");
    sb.append("    liberatoPersona: ").append(toIndentedString(liberatoPersona)).append("\n");
    sb.append("    asporto: ").append(toIndentedString(asporto)).append("\n");
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

