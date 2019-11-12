package com.xkit.ssm.entity;

public class Easybuy_product {
    private Integer id;
    private String name;
    private String description;
    private Integer price;
    private Integer price2;
    private Integer stock;
    private Integer categoryLevel1Id;
    private Integer categoryLevel2Id;
    private Integer categoryLevel3Id;
    private String fileName;
    private Integer isDelete;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Integer getPrice() {
        return price;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }
    public Integer getStock() {
        return stock;
    }
    public void setStock(Integer stock) {
        this.stock = stock;
    }
    public Integer getCategoryLevel1Id() {
        return categoryLevel1Id;
    }
    public void setCategoryLevel1Id(Integer categoryLevel1Id) {
        this.categoryLevel1Id = categoryLevel1Id;
    }
    public Integer getCategoryLevel2Id() {
        return categoryLevel2Id;
    }
    public void setCategoryLevel2Id(Integer categoryLevel2Id) {
        this.categoryLevel2Id = categoryLevel2Id;
    }
    public Integer getCategoryLevel3Id() {
        return categoryLevel3Id;
    }
    public void setCategoryLevel3Id(Integer categoryLevel3Id) {
        this.categoryLevel3Id = categoryLevel3Id;
    }
    public String getFileName() {
        return fileName;
    }
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    public Integer getIsDelete() {
        return isDelete;
    }
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }
    public Integer getPrice2() {
        return price2;
    }
    public void setPrice2(Integer price2) {
        this.price2 = price2;
    }
}
