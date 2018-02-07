package net.evenh.multimodule.business;

import static net.evenh.multimodule.util.Util.repeatTwice;

public class BizFunc {
  public static String greet(String name) {
    return repeatTwice.apply(name);
  }
}
