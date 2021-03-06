package org.smart4j.chapter2.controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.smart4j.chapter2.model.Customer;
import org.smart4j.chapter2.services.CustomerService;

/**
 * Created by 28016 on 2017/11/19.
 * 进入 客户列表 界面
 */

@WebServlet("/customer")
public class CustomerServlet extends HttpServlet {

  private CustomerService customerService;

  @Override
  public void init() throws ServletException {
    customerService = new CustomerService();
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse res)
      throws ServletException, IOException {
    List<Customer> customerList = customerService.getCustomerList();
    req.setAttribute("customerList", customerList);
    req.getRequestDispatcher("/WEB-INF/view/customer.jsp").forward(req, res);
  }
}