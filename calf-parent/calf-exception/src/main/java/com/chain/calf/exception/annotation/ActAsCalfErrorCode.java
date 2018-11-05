package com.chain.calf.exception.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Spring启动时扫码项目中 @ActAsCalfErrorCode，添加到 CalfErrorCodeGather 中
 *
 * @Author bangquan.qian
 * @Date 2018/11/5 7:01 PM
 */
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface ActAsCalfErrorCode {


}
