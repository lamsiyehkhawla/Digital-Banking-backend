package ma.enset.ebankingbackend.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.enset.ebankingbackend.enums.OperationType;

import java.util.Date;
@Data @NoArgsConstructor
@AllArgsConstructor
public class AccountOperation {
    private Long id;
    private Date operationdate;
    private double amount;
    private OperationType type;
    private BankAccount bankaccount;
}
