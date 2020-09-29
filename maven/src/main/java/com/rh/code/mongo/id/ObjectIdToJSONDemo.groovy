package com.rh.code.mongo.id

import com.alibaba.fastjson.util.TypeUtils
import com.rh.code.mongo.util.Document
import com.rh.code.mongo.util.ObjectId
import com.rh.code.mongo.util.Process

/**
 * mongodb objectId在转换json时出现的问题
 */
class ObjectIdToJSONDemo {

    /**
     * 在mongo文档从json转换为javaBean时, objectId会转换成当前文档的json字符串
     */
    void toJSON() {
        Document document = new Document(_id: 'Ne2c78c27b66c4fbca4ba2099b6c22259',
                obj: new Document(_id: new ObjectId('5d4eb7847df182000ea2371e'),
                        name: 'Ne2c78c27b66c4fbca4ba2099b6c22259',
                )
        )

        Process process = TypeUtils.castToJavaBean(document.get('obj'), Process.class)

        assert process.getId() == '{"_id": "5d4eb7847df182000ea2371e", "name": "Ne2c78c27b66c4fbca4ba2099b6c22259"}'
    }

}
