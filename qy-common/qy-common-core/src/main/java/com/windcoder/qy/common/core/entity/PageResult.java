package com.windcoder.qy.common.core.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Schema(description = "分页查询结果")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageResult<T>  implements Serializable {
    /**
     * 分页数据
     */
    @Schema(description = "数据", requiredMode = Schema.RequiredMode.REQUIRED)
    private List<T> list;

    /**
     * 数据总量
     */
    @Schema(description = "总量", requiredMode = Schema.RequiredMode.REQUIRED)
    private Long total;

    public PageResult(Long total) {
        this.list = new ArrayList<>();
        this.total = total;
    }
    public static <T> PageResult<T> empty() {
        return new PageResult<>(0L);
    }

    public static <T> PageResult<T> empty(Long total) {
        return new PageResult<>(total);
    }


}
