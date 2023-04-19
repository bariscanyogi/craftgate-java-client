package io.craftgate.response.dto;

import io.craftgate.model.FileStatus;
import io.craftgate.model.MerchantType;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class PayoutRow {

    private String name;
    private String iban;
    private Long payoutId;
    private Long merchantId;
    private String merchantType;
    private BigDecimal payoutAmount;
    private LocalDateTime payoutDate;
}
