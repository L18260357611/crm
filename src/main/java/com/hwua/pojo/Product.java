package com.hwua.pojo;

import lombok.Data;

@Data
public class Product {

  private String id;
  private String productNum;
  private String productName;
  private String cityName;
  private String departureTime;
  private double productPrice;
  private String productDesc;
  private long productStatus;


}
