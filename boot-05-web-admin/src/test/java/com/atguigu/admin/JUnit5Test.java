package com.atguigu.admin;

import org.junit.jupiter.api.*;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.fail;

/**
 * JUnit5Test
 *
 * @author fj
 * @date 2022/10/3 21:08
 */
@DisplayName("JUnit5测试类")
public class JUnit5Test {
    @DisplayName("测试DisplayName注解")
    @Test
    void testDisplayName(){
        System.out.println("测试方法");
    }
    @RepeatedTest(5)//重复测试
    @Test
    void test2(){
        System.out.println("测试2");
    }

    int cal(int i,int j){
        return i+j;
    }

    @Test
    @DisplayName("简单断言测试")
    void testSimpleAssertion(){
        int cal = cal(2, 3);
        //相等
        Assertions.assertEquals(5,cal);
        //同一个对象
        Object o1 = new Object();
        Object o2 = new Object();
        Assertions.assertSame(o1,o2,"两个对象不一样");
    }



    //规定方法超时时间 超过时间抛出异常
    @Timeout(value = 500,unit = TimeUnit.MICROSECONDS)
    @Test//测试超时
    void testTimeOut() throws InterruptedException {
        Thread.sleep(500);
    }

    @Test
    @DisplayName("组合断言")
    void all(){

        Assertions.assertAll("test",
                ()-> Assertions.assertTrue(true&&true,"结果不为true"),
                ()-> Assertions.assertEquals(1,2,"结果不是预期的"));
    }
    @DisplayName("异常断言")
    @Test
    void testException(){

        Assertions.assertThrows(ArithmeticException.class,
                                ()-> {  int i =1/0;},
                                "业务逻辑正常运行");
    }

    /**
     * 测试前置条件
     */
    @DisplayName("测试前置条件")
    @Test
    void testAssumptions() {
        Assumptions.assumeTrue(true,"结果不是true");
        System.out.println(1);
    }
    @DisplayName("快速失败")
    @Test
    void testFail(){
        if (2==2){
            Assertions.fail("测试失败");
        }

    }

    @BeforeEach//在测试运行前 执行
    void testBeforeEach(){
        System.out.println("测试就要开始了");
    }

    @AfterEach//在测试运行后 执行
    void testAfterEach(){
        System.out.println("测试就要结束了");
    }

    @BeforeAll//在所有测试运行前 执行
    static void testBeforeAll(){
        System.out.println("所有测试就要开始了");
    }

    @AfterAll//在所有测试运行后 执行
    static void testAfterAll(){
        System.out.println("所有测试就要结束了");
    }
}
