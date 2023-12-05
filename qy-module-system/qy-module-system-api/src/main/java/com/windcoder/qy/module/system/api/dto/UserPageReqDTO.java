package com.windcoder.qy.module.system.api.dto;

import com.windcoder.qy.common.core.entity.PageParam;
import com.windcoder.qy.common.core.utils.DateUtil;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

public class UserPageReqDTO extends PageParam {

    @Schema(description = "用户账号", requiredMode = Schema.RequiredMode.REQUIRED, example = "qiyu")
    private String username;

    @Schema(description = "部门ID", example = "1")
    private Long deptId;

    @Schema(description = "创建时间", example = "[2023-11-01 00:00:00, 2023-11-01 23:59:59]")
    @DateTimeFormat(pattern = DateUtil.FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private LocalDateTime[] createTime;
    @Schema(description = "手机号码，模糊匹配", example = "122345")
    private String mobile;

    @Schema(description = "展示状态，参见 CommonStatusEnum 枚举类", example = "1")
    private Integer status;
}
