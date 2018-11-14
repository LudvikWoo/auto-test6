package com.guoyasoft.autotest6.user;


import org.testng.annotations.Test;

public class UserTest {

  @Test
  public void signUp(){
    System.out.println("----------注册-----------");
  }
  @Test
  public void login(){
    System.out.println("----------登录-----------");
  }
  @Test
  public void changePwd(){
    System.out.println("----------改密码-----------");
  }
  @Test
  public void lock(){
    System.out.println("----------冻结用户-----------");
  }

  @Test
  public void unlock(){
    System.out.println("----------解锁用户-----------");
  }
}
