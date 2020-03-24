package taa.poc.integrationtest.h2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "S_CONTACT")
public class MdmContact {

    @Id
    @Column(name = "ROW_ID")
    private String rowId;

    @Column(name = "PERSON_UID")
    private String personUID;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "contact")
    private List<MdmStayBooking> stayBookings;

}
