package com.rh.code.mock

import com.alibaba.fastjson.JSONObject
import com.rh.code.mock.util.TestContext
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpMethod
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.ResultHandler
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers
import org.springframework.test.web.servlet.setup.MockMvcBuilders

/**
 * 模拟http测试
 */
class MockHttpTest extends GroovyTestCase {

    @Autowired
    private MockController mockController

    def test_base = new TestContext() {
        def mvc = MockMvcBuilders.standaloneSetup(mockController).build()

        def method = HttpMethod.POST
        def url = '/rest/mock/findMockMethod'
        def type = MediaType.APPLICATION_JSON
        def requestBody = JSONObject.toJSONString(new Order(name: '1000',
                displayName: 'rh'
        ))

        def request = MockMvcRequestBuilders.request(method, url)
                .contentType(type)
                .content(requestBody)
    }

    void test_base() {
        def test_method = {
            (mvc as MockMvc).perform(request)
                    .andExpect(MockMvcResultMatchers.status().isOk())
                    .andExpect(MockMvcResultMatchers.jsonPath('$.data.id').value('1000'))
                    .andExpect(MockMvcResultMatchers.jsonPath('$.data.name').value('rh'))
                    .andDo(ResultHandler.print())
                    .andReturn()
        }

        test_method.delegate = test_base

        test_method()
    }

}
