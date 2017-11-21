package org.smart4j.chapter2.services;

import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.smart4j.chapter2.helper.DatabaseHelper;
import org.smart4j.chapter2.model.Customer;

/**
 * Created by 28016 on 2017/11/20.
 * 提供客户数据服务
 */
public class CustomerService {

  private static final Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);

  /**
   * 获取客户列表
   *
   * @param keyword
   * @return
   */
  public List<Customer> getCustomerList() {
    String sql = "SELECT * FROM customer";
    return DatabaseHelper.queryEntityList(Customer.class, sql);
  }

  /**
   * 获取客户
   *
   * @param id
   * @return
   */
  public Customer getCustomer(long id) {
    String sql = "SELECT * FROM customer WHERE id=?";
    return DatabaseHelper.queryEntity(Customer.class, sql, id);
  }

  /**
   * 创建客户
   *
   * @param fieldMap
   * @return
   */
  public boolean createCustomer(Map<String, Object> fieldMap) {
    return DatabaseHelper.insertEntity(Customer.class, fieldMap);
  }

  /**
   * 更新客户
   *
   * @param id
   * @param fieldMap
   * @return
   */
  public boolean updateCustomer(long id, Map<String, Object> fieldMap) {
    return DatabaseHelper.updateEntity(Customer.class, id, fieldMap);
  }

  /**
   * 删除客户
   *
   * @param id
   * @return
   */
  public boolean deleteCustomer(long id) {
    return DatabaseHelper.deleteEntity(Customer.class, id);
  }
}
