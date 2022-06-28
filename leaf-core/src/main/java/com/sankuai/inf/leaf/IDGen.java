package com.sankuai.inf.leaf;

import com.sankuai.inf.leaf.common.Result;

public interface IDGen {
    Result get(String key);
    boolean init();
    // NOTE(j3z): 6/28/22 没有新增biz id的接口
}
