package black.mesa.serviceproducer.dao;


import lombok.*;
import lombok.experimental.Accessors;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Accessors(chain = true)
public class Customer {
    private Long id;

    private String lastName;

    private String firstName;

    private Date startDate;
}
