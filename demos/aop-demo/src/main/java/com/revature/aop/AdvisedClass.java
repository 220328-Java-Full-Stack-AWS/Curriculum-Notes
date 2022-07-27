package com.revature.aop;

import org.springframework.stereotype.Component;

@Component
public class AdvisedClass {

    public void testBeforeJoinPoint() {
        System.out.println("Test Before Method");
    }

    public boolean testAfterThrowingJoinPoint() {
        System.out.println("Test After Throwing Method");
        return true;
    }

    public String testAfterJoinPoint(String string) {
        System.out.println("Test After Join Point, invoke around join point.");
        return testAroundJoinPoint(string);
    }

    public String testAroundJoinPoint(String string) {
        System.out.println("Around join point, string: " + string);
        return string;
    }


}
