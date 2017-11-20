package org.smart4j.chapter2.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.smart4j.chapter2.model.Customer;
import org.smart4j.chapter2.util.PropsUtil;

/**
 * Created by 28016 on 2017/11/20.
 * 提供客户数据服务
 */
public class CustomerService {

  private static final Logger LOGGER= LoggerFactory.getLogger(CustomerService.class);

  private static final String DRIVER;
  private static final String URL;
  private static final String USERNAME;
  private static final String PASSWORD;

  static {
    Properties conf = PropsUtil.loadProps("config.properties");
    DRIVER = conf.getProperty("jdbc.driver");
    URL = conf.getProperty("jdbc.url");
    USERNAME = conf.getProperty("jdbc.username");
    PASSWORD = conf.getProperty("jdbc.password");

    try {
      Class.forName(DRIVER);
    } catch (ClassNotFoundException e) {
      LOGGER.error("can not load jdbc driver", e);
    }
  }

  /**
   * 获取客户列表
   * @param keyword
   * @return
   */
  public List<Customer> getCustomerList(String keyword) {
    Connection conn = null;
    try {
      List<Customer> customerList = new ArrayList<Customer>();
      String sql = "SELECT * FROM customer";
      conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
      PreparedStatement stmt = conn.prepareStatement(sql);
      ResultSet rs = stmt.executeQuery();
      while (rs.next()) {
        Customer customer = new Customer();
        customer.setId(rs.getLong("id"));
        customer.setName(rs.getString("name"));
        customer.setContact(rs.getString("contrat"));
        customer.setTelephone(rs.getString("telephone"));
        customer.setEmail(rs.getString("email"));
        customer.setRemark(rs.getString("remark"));
        customerList.add(customer);
      }
      return customerList;
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      if (conn != null) {
        try {
          conn.close();
        } catch (SQLException e) {
          LOGGER.error("close connection failure", e);
        }
      }
    }
    //TODO
    return null;
  }

  /**
   * 获取客户
   * @param id
   * @return
   */
  public Customer getCustomer(long id) {
    //TODO
    return null;
  }

  /**
   * 创建客户
   * @param fieldMap
   * @return
   */
  public boolean createCustomer(Map<String, Object> fieldMap) {
    //TODO
    return false;
  }

  /**
   * 更新客户
   * @param id
   * @param fieldMap
   * @return
   */
  public boolean updateCustomer(long id, Map<String, Object> fieldMap) {
    //TODO
    return false;
  }

  /**
   * 删除客户
   * @param id
   * @return
   */
  public boolean deleteCustomer(long id) {
    //TODO
    return false;
  }
}
