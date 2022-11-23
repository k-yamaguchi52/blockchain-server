package com.goalist.blockchainserver.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetWalletResponse {

    private String publicKey;
    private String privateKey;
    private String blockchainAddress;
}
