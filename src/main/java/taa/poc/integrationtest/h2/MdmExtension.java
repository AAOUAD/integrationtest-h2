package taa.poc.integrationtest.h2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "S_DOC_QUOTE_X")
public class MdmExtension {

    @Id
    @Column(name = "ROW_ID")
    private String rowId;

    @Column(name = "PAR_ROW_ID")
    private String parRowId;

    @Column(name = "ATTRIB_04")
    private String reservationTarsId;

    @Column(name = "ATTRIB_09")
    private String isProfilerBooking;

    @Column(name = "ATTRIB_08")
    private String isGuestConfirmed;
}
