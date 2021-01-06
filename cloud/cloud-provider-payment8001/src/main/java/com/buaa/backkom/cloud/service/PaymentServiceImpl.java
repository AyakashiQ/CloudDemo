package com.buaa.backkom.cloud.service;

import com.buaa.backkom.cloud.dao.PaymentDao;
import com.buaa.backkom.cloud.entities.Payment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: backkom
 * @Date: 2020/9/12 15:19
 */
@Service
public class PaymentServiceImpl implements PaymentService
{
    @Resource
    private PaymentDao paymentDao;
    
    @Override
    public int create (Payment payment)
    {
        return paymentDao.create(payment);
    }
    
    @Override
    public Payment getPaymentById (Long id)
    {
        return paymentDao.getPaymentById(id);
    }
}
