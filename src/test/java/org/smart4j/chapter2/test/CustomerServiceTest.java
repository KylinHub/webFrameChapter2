package org.smart4j.chapter2.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.smart4j.chapter2.helper.DatabaseHelper;
import org.smart4j.chapter2.model.Customer;
import org.smart4j.chapter2.services.CustomerService;

/**
 * Created by 28016 on 2017/11/20.
 * CustomerService 单元测试
 */
public class CustomerServiceTest {

  private final CustomerService customerService;

  public CustomerServiceTest() {
    customerService = new CustomerService();
  }

  @Before
  public void init() throws IOException {
    // 初始化数据库
    DatabaseHelper.executeSqlFile("sql/customer_init.sql");
  }

  @Test
  public void getCustomerListTest() throws Exception {
    String keyword = "";
    List<Customer> customerList = customerService.getCustomerList();
    Assert.assertEquals(2, customerList.size());
  }

  @Test
  public void getCustomerTest() throws Exception {
    long id = 1;
    Customer customer = customerService.getCustomer(id);
    Assert.assertNotNull(customer);
  }

  @Test
  public void createCustomerTest() throws Exception {
    Map<String, Object> fieldMap = new HashMap<String, Object>();
    fieldMap.put("name", "customer100");
    fieldMap.put("contact", "John");
    fieldMap.put("telephone", "13734567890");
    boolean result = customerService.createCustomer(fieldMap);
    Assert.assertTrue(result);
  }

  @Test
  public void updateCustomerTest() throws Exception {
    long id = 1;
    Map<String, Object> fieldMap = new HashMap<String, Object>();
    fieldMap.put("contact", "Eric");
    boolean result = customerService.updateCustomer(id, fieldMap);
    Assert.assertTrue(result);
  }

  @Test
  public void deleteCustomerTest() throws Exception {
    long id = 1;
    boolean result = customerService.deleteCustomer(id);
    Assert.assertTrue(result);
  }
}
