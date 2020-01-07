package com.projetEbilleterie.ebilleterie.exposition.eticket2;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.projetEbilleterie.ebilleterie.domain.eticket2.Category;
import com.projetEbilleterie.ebilleterie.domain.exception.ErrorCodes;
import com.projetEbilleterie.ebilleterie.exposition.rate.RateDTO;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

public class Eticket2DTO {

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    Long id;
    @NotNull(message = ErrorCodes.ETICKET_MUST_HAVE_A_CATEGORY)
    @JsonProperty Category category;
    @NotBlank(message = ErrorCodes.ETICKET_MUST_HAVE_A_REFERENCE)
    @JsonProperty  String reference;
    @JsonProperty  String description;
    @JsonProperty  String  law;
    @JsonProperty  boolean nominative;
    @JsonProperty  String validityDate ;
    @JsonProperty  List<RateDTO> rates;
    @JsonProperty  String  image;
    @JsonProperty  String  provider;

    //Constructors
    public  Eticket2DTO(){}

    public Eticket2DTO(Long id, @NotNull(message = ErrorCodes.ETICKET_MUST_HAVE_A_CATEGORY) Category category,
                       @NotBlank(message = ErrorCodes.ETICKET_MUST_HAVE_A_REFERENCE) String reference, String description,
                       String law, boolean nominative, String validityDate, List<RateDTO> rates,
                       String image, String provider) {
        this.id = id;
        this.category = category;
        this.reference = reference;
        this.description = description;
        this.law = law;
        this.nominative = nominative;
        this.validityDate = validityDate;
        this.rates = rates;
        this.image = image;
        this.provider = provider;
       }

    //Getter
    public Long getId() { return id;}
    public Category getCategory() {return category;}
    public String getReference() {return reference;}
    public String getDescription() { return description;}
    public String getLaw() { return law; }
    public boolean isNominative() { return nominative;}
    public String getValidityDate() {return validityDate;}
    public List<RateDTO> getRates() {return rates;}
    public String getImage() { return image; }
    public String getProvider() { return provider;}
  }
