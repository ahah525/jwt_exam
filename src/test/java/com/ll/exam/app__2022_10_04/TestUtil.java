package com.ll.exam.app__2022_10_04;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestUtil {

    // 해당 객체(obj)에서 메서드 이름에 해당하는 메서드 호출하기(복사해서 사용하기)
    public static <T> T callMethod(Object obj, String methodName) {
        Method method = null;
        try {
            method = obj.getClass().getDeclaredMethod(methodName);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }

        method.setAccessible(true);

        try {
            return (T) method.invoke(obj);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
