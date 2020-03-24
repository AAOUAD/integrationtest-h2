package taa.poc.integrationtest.h2;

import org.springframework.http.HttpStatus;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/synchronization/contacts")
public class SynchronizationApi {


    @PostMapping(value = "/{pmid}/stay-booking")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void syncStayBooking(@PathVariable("pmid") String pmid) {
        if(StringUtils.isEmpty(pmid)){
            throw new RuntimeException("PMID Could not be null or empty ");
        }
        System.out.println("Synchronized");
    }

}
