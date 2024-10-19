package lk.edu.novelnook.novelnook.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerDto {
    private String customerId;
    private String customerName;
    private String customerAddress;
    private String customerPhone;
}
