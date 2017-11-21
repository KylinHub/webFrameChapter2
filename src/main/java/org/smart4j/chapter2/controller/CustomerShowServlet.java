package org.smart4j.chapter2.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by 28016 on 2017/11/19.
 * 客户详情
 */

@WebServlet("/customer_show")
public class CustomerShowServlet extends HttpServlet {

  /**
   * 进入 客户详情 界面
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
   * 处理 客户详情 请求
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
