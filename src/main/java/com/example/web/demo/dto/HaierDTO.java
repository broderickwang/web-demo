package com.example.web.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 海尔库存DTO
 */
@NoArgsConstructor
@Data
public class HaierDTO {
    @JsonProperty("batchNo")
    private String batchNo;
    @JsonProperty("vaccinCode")
    private Integer vaccinCode;
    @JsonProperty("manufacturerCode")
    private Integer manufacturerCode;
    @JsonProperty("vaccineName")
    private String vaccineName;
    @JsonProperty("manufacturerName")
    private String manufacturerName;
    @JsonProperty("storeNum")
    private Integer storeNum;
    @JsonProperty("unitNum")
    private Integer unitNum;
    @JsonProperty("chargeType")
    private Integer chargeType;
    @JsonProperty("productDate")
    private String productDate;
    @JsonProperty("validityDate")
    private String validityDate;
    @JsonProperty("dose")
    private String dose;
    @JsonProperty("lastUseCount")
    private Integer lastUseCount;
    @JsonProperty("specType")
    private String specType;
}
