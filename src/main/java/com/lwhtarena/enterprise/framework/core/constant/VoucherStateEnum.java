package com.lwhtarena.enterprise.framework.core.constant;

/**
 * @author lwh
 * @folder com.lwhtarena.enterprise.framework.core.constant
 * @date 2016/11/29.
 * @版权 Copyright (c) 2016 lwhtarena.com. All Rights Reserved.
 */

@MetaData("单据/凭证状态")
public enum VoucherStateEnum {
    @MetaData(value = "草稿")
    DRAFT,

    @MetaData(value = "提交")
    POST,

    @MetaData(value = "红冲")
    REDW;
}
