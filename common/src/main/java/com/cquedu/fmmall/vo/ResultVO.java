package com.cquedu.fmmall.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "响应的vo对象",description = "封装接口返回给前端的数据")      //说明返回对象的作用

public class ResultVO {

    //响应给前端的状态码
    @ApiModelProperty(value = "响应状态码",dataType ="int")
    private int code;

    //响应给前端的提示信息
    @ApiModelProperty("响应提示信息")
    private String msg;

    @ApiModelProperty("响应数据")
    //响应给前端的数据
    private Object data;

}
