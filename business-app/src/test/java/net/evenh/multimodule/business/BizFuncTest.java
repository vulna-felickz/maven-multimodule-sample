package net.evenh.multimodule.business;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class BizFuncTest {
  @Test
  public void it_should_repeat_twice() {
    assertEquals("Allo Allo ", BizFunc.greet("Allo"));
  }
}
