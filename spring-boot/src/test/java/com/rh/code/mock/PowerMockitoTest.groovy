package com.rh.code.mock

import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TestName
import org.junit.runner.RunWith
import org.mockito.Spy
import org.powermock.api.mockito.PowerMockito
import org.powermock.core.classloader.annotations.PrepareForTest
import org.powermock.modules.junit4.PowerMockRunner

import java.lang.reflect.Method

@RunWith(PowerMockRunner)
@PrepareForTest([ParentClass])
class PowerMockitoTest {

    @Rule
    public TestName testName = new TestName();
    @Spy
    private ParentClass parentClass = new ParentClass();

    @Before
    void before() {
        if (!testName.getMethodName().equals('mock私有方法')) {
            return;
        }

        PowerMockito.doReturn(null).when(parentClass).method1()
        println 'before'
    }

    @Test
    void 'mock私有方法'() {
        parentClass.execute()
        println '============ end ============'
    }

    @Spy
    private ChildrenClass childrenClass = new ChildrenClass()

    @Before
    void before1() {
        if (!testName.getMethodName().equals('压制父类方法')) {
            return;
        }

        Method method = PowerMockito.method(ParentClass, "method1");
        // 抑制父类的这个方法执行
        PowerMockito.suppress(method);
        println 'before1'
    }

    @Test
    void '压制父类方法'() {
        childrenClass.execute()
        println "========= end ============"
    }

}
