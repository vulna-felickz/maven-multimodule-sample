package net.evenh.multimodule.util;

import static com.google.common.base.Strings.repeat;

import java.util.function.Function;

public class Util {
  public static Function<String, String> repeatTwice = (String input) -> repeat(input + " ", 2);
  public static Function<String, String> lowercase = String::toLowerCase;
}
