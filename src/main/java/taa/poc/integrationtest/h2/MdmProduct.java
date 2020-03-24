package taa.poc.integrationtest.h2;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
    @Table(name = "S_QUOTE_ITEM")
public class MdmProduct {

    @Id
    @Column(name = "ROW_ID")
    private String rowId;

    @Column(name = "SD_ID")
    private String sdId;

    @Column(name = "X_FLAGTYPE")
    private String productTypeCode;

    @Column(name = "X_TARSKEY_CD")
    private String tarskey;

    @Column(name = "X_TARIF_CD")
    private String pricingCode;

    @Column(name = "X_TARSKEY_TYPE_CD")
    private String tarskeyTypeCode;

    @Column(name = "X_MEAL_PLAN_CD")
    private String mealPlanCode;

    @Column(name = "X_MONTANT_TOTAL")
    private String totalAmount;

    @Column(name = "EXTD_QTY")
    private String quantityIn;

    @Column(name = "QTY_REQ")
    private String quantityReq;

    @Column(name = "X_DAYUSE_FL")
    private String isDayUse;

    @OneToOne
    @JoinColumn(name = "PROD_ID", referencedColumnName = "ROW_ID")
    private MdmRefProduct refProduct;

}
