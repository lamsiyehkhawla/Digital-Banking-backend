package ma.enset.ebankingbackend.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.enset.ebankingbackend.enums.AccouantStatus;

import java.util.Date;
import java.util.List;
@Data @NoArgsConstructor @AllArgsConstructor
public class BankAccouant {
    private  String id;
    private double balance;
    private Date createdAt;
    private AccouantStatus status;
    private Customer customer;
    private List<AccouantOperation> accouantOperations;
}
