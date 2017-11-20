package org.smart4j.chapter2.controller;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by 28016 on 2017/11/19.
 * 客户列表
 */

@WebServlet("/customer")
public class CustomerServlet extends javax.servlet.http.HttpServlet {

  /**
   * 进入 客户列表 界面
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
   * 处理 客户列表 界面
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