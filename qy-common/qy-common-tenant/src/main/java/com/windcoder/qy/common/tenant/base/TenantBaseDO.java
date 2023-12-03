package com.windcoder.qy.common.tenant.base;

import com.windcoder.qy.common.mybatis.core.entity.BaseDO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class TenantBaseDO extends BaseDO {
    /**
     * 多租户编号ID
     */
    @Schema(description = "多租户编号ID")
    private Long tenantId;
}
