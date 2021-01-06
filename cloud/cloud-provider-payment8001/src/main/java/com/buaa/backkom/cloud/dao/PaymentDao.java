package com.buaa.backkom.cloud.dao;

import com.buaa.backkom.cloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: backkom
 * @Date: 2020/9/12 14:41
 */
@Mapper
public interface PaymentDao
{
    public int create(Payment payment);
    
    public Payment getPaymentById(@Param("id") Long id);
}
