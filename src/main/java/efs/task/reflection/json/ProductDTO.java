package efs.task.reflection.json;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import java.math.BigDecimal;
import java.util.Date;

/**
 * TODO: Użyj tu odpowiednich adnotacji z biblioteki Jackson
 */
@JsonPropertyOrder({"ProductID", "ProductName", "ProductPrice","DateOfProduction","DateOfExpiry"})
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductDTO {
    @JsonProperty("ProductID")
    @JsonInclude(Include.NON_EMPTY)
    private Long id;

    @JsonProperty("ProductName")
    @JsonInclude(Include.NON_EMPTY)
    private String name;

    @JsonProperty("ProductPrice")
    @JsonInclude(Include.NON_EMPTY)
    private BigDecimal price;

    @JsonProperty("DateOfExpiry")
    @JsonInclude(Include.NON_NULL)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date expiryDate;

    @JsonProperty("DateOfProduction")
    @JsonFormat(pattern = "yyyy-MM-dd@HH:mm:ss")
    @JsonInclude(Include.NON_NULL)
    private Date productionDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "ProductDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", productionDate=" + productionDate +
                ", expiryDate=" + expiryDate +
                '}';
    }
}
