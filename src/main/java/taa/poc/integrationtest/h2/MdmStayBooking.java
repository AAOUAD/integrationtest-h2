package taa.poc.integrationtest.h2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.List;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "S_DOC_QUOTE")
public class MdmStayBooking {

    @Id
    @Column(name = "ROW_ID")
    private String rowId;

    @Column(name = "PAR_SD_ID")
    private String parSdId;

    @Column(name = "X_RESA_SITE_MARCHAND")
    private String merchantId;
    @Column(name = "X_RESA_SOURCE")
    private String sourceId;
    @Column(name = "X_CA_CURE_NUM")
    private String caCure;
    @Column(name = "X_CA_CURE_EUR_NUM")
    private String caCureEur;
    @Column(name = "X_CA_FB_NUM")
    private String caFb;
    @Column(name = "X_CA_FB_EUR_NUM")
    private String caFbEur;
    @Column(name = "X_CA_OTHER_NUM")
    private String caOther;
    @Column(name = "X_CA_OTHER_EUR_NUM")
    private String caOtherEur;
    @Column(name = "X_CA_ROOM_NUM")
    private String caRoom;
    @Column(name = "X_CA_ROOM_EUR_NUM")
    private String caRoomEur;
    @Column(name = "X_CA_SEMIN_NUM")
    private String caSeminar;
    @Column(name = "X_CA_SEMIN_EUR_NUM")
    private String caSeminarEur;
    @Column(name = "X_CA_TOTAL_NUM")
    private String caTotal;
    @Column(name = "X_CA_TOTAL_EUR_NUM")
    private String caTotalEur;
    @Column(name = "X_CANCEL_CD")
    private String cancellationCode;
    @Column(name = "X_CANCEL_NUM")
    private String cancellationNumber;
    @Column(name = "X_CANCEL_TYPE")
    private String cancellationType;
    @Column(name = "X_CLIENT_TYPE")
    private String clientTypeCode;
    // FIXME integrationId
    // TODO ask Pierre
    @Column(name = "X_DOSSIER_NUM")
    private String dossierNumber;
    @Column(name = "X_ACTL_ORIGINE")
    private String originMainCroFin;
    @Column(name = "X_ACTL_SS_ORIGINE")
    private String originSubCroFin;
    // TODO ask Pierre
    @Column(name = "X_GARANTIE_TYPE")
    private String garantieTypeCode;
    @Column(name = "X_INIT_ORIGINE")
    private String originMainCroIni;

    @Column(name = "QUOTE_NUM")
    private String reservationNumberIni;
    @Column(name = "X_INIT_SS_ORIGINE")
    private String originSubCroIni;
    @Column(name = "X_ISVISIBLE_FLG")
    private String isVisible;
    @Column(name = "X_LOISIR_INDICATEUR")
    private String leisureIndicator;
    @Column(name = "X_ADULT_NUM")
    private String nbAdults;
    @Column(name = "X_CHILD_NUM")
    private String nbChildren;
    @Column(name = "X_ROOMNIGHT_NUM")
    private String nbRoomNights;
    @Column(name = "X_NIGHT_NUM")
    private String nbNights;
    @Column(name = "X_COMPTE_SC_NUM")
    private String accountScNumber;
    @Column(name = "X_ORIGIN_DATA")
    private String originData;
    @Column(name = "X_ATTRIB_03")
    private String prepay;
    // TODO referential hotel
    @Column(name = "X_HOTEL_MARQUE_CD")
    private String brandCode;
    @Column(name = "X_HOTEL_CHAINE_CD")
    private String chainCode;

    // TODO ask Pierre
    @Column(name = "X_RESERVATAIRE_NUM")
    private String bookerNum;
    @Column(name = "X_RESERVATAIRE_TYPE")
    private String bookerType;

    @Column(name = "X_COMPTE_SC_TYPE")
    private String accountScType;
    @Column(name = "CURCY_CD")
    private String hotelCurrencyCode;
    // TODO Weired
    @Column(name = "X_MEM_NUM")
    private String loyaltyCardNumber;
    @Column(name = "NAME")
    private String reservationNumber;
    // TODO only stay
    //@Column(name = "PAR_SD_ID")
//    private String parentBookingRowIdSiebel;
    @Column(name = "DISPLAY_TYPE_CD")
    private String quoteDisplayType;
    @Column(name = "X_FINAL_QUOTE_NUM")
    private String reservationNumberFin;
    @Column(name = "QUOTE_SUB_TYPE_CD")
    private String quoteSubType;
    @Column(name = "QUOTE_TYPE")
    private String quoteType;
    @Column(name = "STAT_CD")
    private String reservationStatus;
    @Column(name = "X_CA_CURE_HT_NUM")
    private String caCureHt;
    @Column(name = "X_CA_CURE_HT_EUR_NUM")
    private String caCureHtEur;
    @Column(name = "X_CA_FB_HT_NUM")
    private String caFbHt;
    @Column(name = "X_CA_FB_HT_EUR_NUM")
    private String caFbHtEur;
    @Column(name = "X_CA_OTHER_HT_NUM")
    private String caOtherHt;
    @Column(name = "X_CA_OTHER_HT_EUR_NUM")
    private String caOtherHtEur;
    @Column(name = "X_CA_ROOM_HT_NUM")
    private String caRoomHt;
    @Column(name = "X_CA_ROOM_HT_EUR_NUM")
    private String caRoomHtEur;
    @Column(name = "X_CA_SEMINAR_HT_NUM")
    private String caSeminarHt;
    @Column(name = "X_CA_SEMINAR_HT_EUR_NUM")
    private String caSeminarHtEur;
    @Column(name = "X_CA_TOTAL_HT_NUM")
    private String caTotalHt;
    @Column(name = "X_CA_TOTAL_HT_EUR_NUM")
    private String caTotalHtEur;
    @Column(name = "X_MEM_NUM_2")
    private String subscriptionCardNumber;
    @Column(name = "X_CODE_ELIGIBILITE")
    private String eligibilityCode;
    @Column(name = "X_ELIGIBILITE_WELCOME")
    private String eligibilityWelcome;
    @Column(name = "X_BENEFICIAIRE_NOM")
    private String beneficiaryName;
    @Column(name = "X_BENEFICIAIRE_PRENOM")
    private String beneficiaryFirstname;
    @Column(name = "X_BENEFICIAIRE_CIVILITE")
    private String beneficiaryCivility;
    @Column(name = "X_BENEFICIAIRE_EMAIL")
    private String beneficiaryEmail;
    @Column(name = "X_DEVICE_MODEL")
    private String deviceModel;
    @Column(name = "X_APPLICATION_NAME")
    private String applicationName;
    // TODO see other mapping
//    @Column(name = "")
//    private String reservationTarsId;
    // TODO other tables S_DOC_QUOTE_X
//    @Column(name = "")
//    private String isGuestConfirmed;
    // TODO other tables S_DOC_QUOTE_X
//    @Column(name = "")
//    private String is_profilerBooking;

    // Dates
    @Column(name = "X_CANCEL_DT")
    private String cancellationDate;
    @Column(name = "ACTL_AMT_DT")
    private String reservationDateIni;
    @Column(name = "HIST_AMT_DT")
    private String reservationDateFin;
    @Column(name = "EFF_END_DT")
    private String departureDate;
    @Column(name = "EFF_START_DT")
    private String arrivalDate;
    @Column(name = "X_FAST_CHECK_IN_MIN")
    private String fastCheckinMinDate;
    @Column(name = "X_FAST_CHECK_IN_MAX")
    private String fastCheckinMaxDate;
    @Column(name = "X_ADD_LAST_UPD")
    private String prepayLastUpdateDate;
    @Column(name = "X_CHECK_IN_MAX")
    private String checkinMaxDate;

    @Column(name = "X_HOTEL_CD")
    private String hotelCode;

    @Column(name = "INTEGRATION_ID")
    private String integrationId;

    @ManyToOne
    @JoinColumn(name = "CON_PER_ID")
    private MdmContact contact;

    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany
    @JoinColumn(name = "SD_ID")
    private List<MdmProduct> products;

    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany
    @JoinColumn(name = "PAR_ROW_ID")
    private List<MdmReport> reports;

    @OneToOne
    @JoinColumn(name = "ROW_ID", referencedColumnName = "PAR_ROW_ID")
    private MdmExtension extension;


}
