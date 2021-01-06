package com.buaa.backkom.cloud.service;

import com.buaa.backkom.cloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: backkom
 * @Date: 2020/9/12 15:18
 */
public interface PaymentService
{
    public int create(Payment payment);
    
    public Payment getPaymentById(@Param("id") Long id);
}
