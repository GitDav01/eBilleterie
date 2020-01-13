package com.projetEbilleterie.ebilleterie.exposition.provider;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.projetEbilleterie.ebilleterie.domain.provider.Category;
import com.projetEbilleterie.ebilleterie.domain.exception.ErrorCodes;
//import com.projetEbilleterie.ebilleterie.exposition.rate.RateDTO;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;

public class ProviderDTO {

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    Long id;
    @NotNull(message = ErrorCodes.PROVIDER_MUST_HAVE_A_CATEGORY)
    @JsonProperty
    Category category;
    @NotBlank(message = ErrorCodes.PROVIDER_MUST_HAVE_A_REFERENCE)
    @JsonProperty
    String reference;
    @JsonProperty
    String description;
    @JsonProperty
    String law;
    @JsonProperty
    boolean nominative;
    @JsonProperty
    String validityDate;
    @JsonProperty
    List<OrderDTO> orders;
    @JsonProperty
    String image;
    @JsonProperty
    String provider;

    //Constructors
    public ProviderDTO() {
    }

    public ProviderDTO(Long id, @NotNull(message = ErrorCodes.PROVIDER_MUST_HAVE_A_CATEGORY) Category category,
                       @NotBlank(message = ErrorCodes.PROVIDER_MUST_HAVE_A_REFERENCE) String reference, String description,
                       String law, boolean nominative, String validityDate, List<OrderDTO> orders,
                       String image, String provider) {
        this.id = id;
        this.category = category;
        this.reference = reference;
        this.description = description;
        this.law = law;
        this.nominative = nominative;
        this.validityDate = validityDate;
        this.orders = orders;
        this.image = image;
        this.provider = provider;
    }

    //Getter
    public Long getId() {
        return id;
    }

    public Category getCategory() {
        return category;
    }

    public String getReference() {
        return reference;
    }

    public String getDescription() {
        return description;
    }

    public String getLaw() {
        return law;
    }

    public boolean isNominative() {
        return nominative;
    }

    public String getValidityDate() {
        return validityDate;
    }

    public List<OrderDTO> provider() {
        return orders;
    }

    public String getImage() {
        return image;
    }

    public String getProvider() {
        return provider;
    }

    // Objets enfants
    //----------------
    //  orders
    public static class OrderDTO {

        //    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
        //   String id;
        @JsonProperty
        String name;
        @JsonProperty
        Long quantity;
        @JsonProperty
        LocalDateTime timestamp;

        //Constructors
        public OrderDTO() {
        }

        public OrderDTO(String name, Long quantity, LocalDateTime timestamp) {
            this.name = name;
            this.quantity = quantity;
            this.timestamp = timestamp;
        }


        //Getter

        public String getName() {
            return name;
        }

        public Long getQuantity() {
            return quantity;
        }

        public LocalDateTime getTimestamp() {
            return timestamp;
        }
    }
}
