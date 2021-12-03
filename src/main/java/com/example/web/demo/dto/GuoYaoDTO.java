package com.example.web.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 国药库存DTO
 */
@lombok.NoArgsConstructor
@lombok.Data
public class GuoYaoDTO {


    @JsonProperty("id")
    private String id;
    @JsonProperty("stockNo")
    private String stockNo;
    @JsonProperty("availableCount")
    private Integer availableCount;
    @JsonProperty("createTime")
    private Long createTime;
    @JsonProperty("batchNumberId")
    private String batchNumberId;
    @JsonProperty("batchNumber")
    private String batchNumber;
    @JsonProperty("orgId")
    private String orgId;
    @JsonProperty("orgName")
    private String orgName;
    @JsonProperty("orgCode")
    private String orgCode;
    @JsonProperty("areaCode")
    private String areaCode;
    @JsonProperty("factoryId")
    private String factoryId;
    @JsonProperty("factoryName")
    private String factoryName;
    @JsonProperty("orgGoodsId")
    private String orgGoodsId;
    @JsonProperty("platformGoodsName")
    private String platformGoodsName;
    @JsonProperty("goodsName")
    private String goodsName;
    @JsonProperty("undeterminedCount")
    private Integer undeterminedCount;
    @JsonProperty("unqualifiedBizCount")
    private Integer unqualifiedBizCount;
    @JsonProperty("unqualifiedCount")
    private Integer unqualifiedCount;
    @JsonProperty("qualifiedCount")
    private Integer qualifiedCount;
    @JsonProperty("transitCount")
    private Integer transitCount;
    @JsonProperty("inOrderTransitCount")
    private Integer inOrderTransitCount;
    @JsonProperty("expiryDate")
    private Long expiryDate;
    @JsonProperty("nearTermDays")
    private Object nearTermDays;
    @JsonProperty("warehouseId")
    private String warehouseId;
    @JsonProperty("qualifiedBizServings")
    private Integer qualifiedBizServings;
    @JsonProperty("qualifiedActualServings")
    private Integer qualifiedActualServings;
    @JsonProperty("showFlag")
    private Object showFlag;
    @JsonProperty("orgIdList")
    private List<?> orgIdList;
    @JsonProperty("remark")
    private Object remark;
    @JsonProperty("vaccineType")
    private String vaccineType;
    @JsonProperty("orgGoodsCode")
    private String orgGoodsCode;
    @JsonProperty("goodsGenericName")
    private String goodsGenericName;
    @JsonProperty("specification")
    private String specification;
    @JsonProperty("orgGoodsStatus")
    private Boolean orgGoodsStatus;
    @JsonProperty("warehouseName")
    private String warehouseName;
    @JsonProperty("warehouseAddress")
    private String warehouseAddress;
    @JsonProperty("dhsGoodsId")
    private String dhsGoodsId;
    @JsonProperty("printBizServingFlag")
    private Object printBizServingFlag;
}
