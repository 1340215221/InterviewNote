package com.rh.code.lombok;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;
import lombok.Setter;

public class GetterAddAnn {

    @Getter(onMethod = @__({@JsonGetter("n")}))
    @Setter
    private String name;

    public static void main(String[] args) throws Exception{
        GetterAddAnn bean = new GetterAddAnn();
        bean.setName("rh");
        ObjectMapper mapper = new ObjectMapper();
        System.out.println(mapper.writeValueAsString(bean)); // {"n":"rh"}
    }

}
