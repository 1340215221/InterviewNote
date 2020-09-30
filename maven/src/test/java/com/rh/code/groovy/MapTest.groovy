package com.rh.code.groovy

class MapTest extends GroovyTestCase {

    /**
     * groovy自带的map两种遍历方式
     */
    void test_test01() {
        Map map = ["id":1, "name":"rh"]

        map.each { it ->
            assert it.key == 'id' || it.key == 'name'
            assert it.value == 1 || it.value == 'rh'
        }

        map.each { key,value ->
                assert key == 'id' || key == 'name'
                assert value == 1 || value == 'rh'
        }
    }

    /**
     * map取值
     */
    void test_test02() {
        Map map = ["id":1, "name":"rh"]
        assert map["id"] == 1
        assert map["name"] == 'rh'
    }

    /**
     * map添加元素
     */
    void test_test03() {
        Map map = [:]
        map["id"] = 1

        assert map.id == 1
    }

    /**
     * 将map赋值到对象属性中
     */
    void test_json2Map() {
        def homen = new Homen([name: "rh", age: 1, list: ["a", "b"]])
        assert homen.name == 'rh'
        assert homen.age == 1
        assert homen.list[0] == 'a'
        assert homen.list[1] == 'b'
    }

    /**
     * 给对象中的嵌套对象属性赋值
     */
    void test_buildBean() {
        def homen = new Homen([name: 'rh', age: 1, list: ['a', 'b'], map: [a: 1, b: 2], code: [name: 'rh']])
        assert homen.list[0] == 'a'
        assert homen.list[1] == 'b'
        assert homen.map.a == 1
        assert homen.map.b == 2
        assert homen.code.name == 'rh'
    }

    /**
     * 简化写法, 通过map构建对象
     */
    void test_buildBeanByMap() {
        def homen = new Homen(name: 'rh', age: 1)
        assert homen.name == 'rh'
        assert homen.age == 1
    }
}
