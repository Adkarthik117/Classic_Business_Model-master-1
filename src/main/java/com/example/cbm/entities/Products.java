package com.example.cbm.entities;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import javax.persistence.*;
import java.math.BigDecimal;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="products")
public class Products {
    @Id
    @GeneratedValue(generator = "randomStringGenerator")
    @GenericGenerator(name = "randomStringGenerator", strategy = "com.example.cbm.controllers.RandomStringGenerator")
    @Column(name = "productCode", length = 4)
    private String productCode;
    @Column
    private String productName;
    @ManyToOne
    @JoinColumn(name = "productLine")
    private ProductLines productLines;
    @Column
    private String productScale;
    @Column
    private String productVendor;
    @Lob
    @Column(columnDefinition = "LONGTEXT")
    @Type(type = "text")
    private String productDescription;
    @Column
    private Short quantityInStock;
    @Column
    private BigDecimal buyPrice;
    @Column
    private BigDecimal msrp;
}
