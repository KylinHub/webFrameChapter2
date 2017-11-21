package org.smart4j.chapter2.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by 28016 on 2017/11/19.
 * 创建客户
 */

@WebServlet("/customer_create")
public class CustomerCreateServlet extends HttpServlet {

  /**
   * 进入 创建客户 界面
   *
   * @param req
   * @param res
   * @throws javax.servlet.ServletException
   * @throws IOException
   */
  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse res)
      throws ServletException, IOException {
    //TODO
  }

  /**
   * 处理 创建客户 请求
   *
   * @param req
   * @param res
   * @throws javax.servlet.ServletException
   * @throws IOException
   */
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse res)
      throws ServletException, IOException {
    //TODO
  }
}
