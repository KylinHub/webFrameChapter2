package org.smart4j.chapter2.controller;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by 28016 on 2017/11/19.
 * 删除客户
 */

@WebServlet("/customer_delete")
public class CustomerDeleteServlet extends javax.servlet.http.HttpServlet {

  /**
   * 进入 删除客户 界面
   * @param req
   * @param res
   * @throws javax.servlet.ServletException
   * @throws IOException
   */
  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse res)
      throws javax.servlet.ServletException, IOException {
    //TODO
  }

  /**
   * 处理 删除客户 请求
   * @param req
   * @param res
   * @throws javax.servlet.ServletException
   * @throws IOException
   */
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse res)
      throws javax.servlet.ServletException, IOException {
    //TODO
  }
}
