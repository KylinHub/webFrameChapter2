package org.smart4j.chapter2.util;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by 28016 on 2017/11/20.
 * 字符串工具类
 */
public final class StringUtil {

  /**
   * 判断字符串是否为空
   * @param str
   * @return
   */
  public static boolean isEmpty(String str) {
    if (str != null) {
      str = str.trim();
    }
    return StringUtils.isEmpty(str);
  }

  public static boolean isNotEmpty(String str) {
    return !isEmpty(str);
  }
}