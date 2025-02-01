package com.example.demo.factory;

/*
   @auther：liff
   @date：2025/2/1 - 23:20
   @desc:实现支付渠道工厂
 */
public class ChannelFactory {
     public static PaymentChannel createPaymentChannel(String type) {
          if ("UNIONPAY".equals(type)){
               return new UnionPayChannel();
          } else if ("WEChATPAY".equals(type)){
               return new WeChatPayChannel();
          }
          throw new IllegalArgumentException("❌ 无效的支付通道类型: " + type);
     }
}
