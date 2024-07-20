package ma.anasouss.pfjeespringangulardigitalbanking.dtos;

import lombok.Data;

import java.util.List;

@Data
public class AccountHistoryDTO {
    private List<OperationDTO> operationDTOList;
    private String id;
    private double balance;
    private int currentPage;
    private int pageSize;
    private int totalPages;
    private long totalElements;
}
