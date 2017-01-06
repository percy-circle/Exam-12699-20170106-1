package mapper;

import po.Customer;

public interface CustomerMapper {
    int deleteByPrimaryKey(Short customerId);

    int insert(Customer record);

    int insertSelective(Customer record);

    int updateByPrimaryKey(Customer record);
    
    Customer findCustomerByFirstName(String firstName);
}