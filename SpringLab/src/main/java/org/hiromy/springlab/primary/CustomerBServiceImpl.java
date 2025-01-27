package org.hiromy.springlab.primary;

import org.springframework.stereotype.Service;

@Service
public class CustomerBServiceImpl implements CustomerService{
    @Override
    public String hello() {
        return "Hello from customer B";
    }
}
