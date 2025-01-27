package org.hiromy.springlab.primary;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class CustomerAServiceimpl implements CustomerService{
    @Override
    public String hello() {
        return "Hello from customer A";
    }
}
