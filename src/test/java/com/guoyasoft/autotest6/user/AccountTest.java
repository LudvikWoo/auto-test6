package com.guoyasoft.autotest6.user;

import org.testng.annotations.Test;

public class AccountTest {

  @Test
  public void getAccInfo(){
    System.out.println("---------查询账户-----------");
  }
  @Test
  public void charge(){
    System.out.println("---------账户充值-----------");
  }
  @Test
  public void withdraw(){
    System.out.println("---------账户提现-----------");
  }
}
