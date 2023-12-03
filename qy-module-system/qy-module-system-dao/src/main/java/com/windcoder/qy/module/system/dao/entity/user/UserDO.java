package com.windcoder.qy.module.system.dao.entity.user;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.windcoder.qy.common.mybatis.core.type.JsonLongSetTypeHandler;
import com.windcoder.qy.common.tenant.base.TenantBaseDO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@TableName("`qy_system_user`")
@Schema(description = "用户信息")
public class UserDO extends TenantBaseDO {
    /**
     * 用户ID
     */
    @TableId
    private Long id;
    /**
     * 用户帐号
     */
    @Schema(description = "用户账号", requiredMode = Schema.RequiredMode.REQUIRED, example = "qiyu")
    private String username;
    /**
     * 加密后的密码
     *
     * 使用 BCryptPasswordEncoder 加密器，所以无需自己处理 salt 盐
     */
    private String password;
    /**
     * 用户昵称
     */
    @Schema(description = "用户昵称", requiredMode = Schema.RequiredMode.REQUIRED, example = "酸奶")
    private String nickname;
    /**
     * 备注
     */
    @Schema(description = "备注", example = "我是一个用户备注")
    private String remark;
    /**
     * 用户邮箱
     */
    @Schema(description = "用户邮箱", example = "qiyu@windcoder.com")
    private String email;
    /**
     * 手机号码
     */
    @Schema(description = "手机号码", example = "12345678911")
    private String mobile;
    /**
     * 用户头像
     */
    @Schema(description = "用户头像", example = "https://www.windcoder.com/xxx.png")
    private String avatar;
    /**
     * 用户性别
     */
    @Schema(description = "用户性别", example = "1")
    private Integer sex;
    /**
     * 部门ID
     */
    @Schema(description = "部门ID", example = "1")
    private Long deptId;
    /**
     * 岗位编号数组
     */
    @Schema(description = "岗位编号数组", example = "1")
    @TableField(typeHandler = JsonLongSetTypeHandler.class)
    private Set<Long> postIds;
    /**
     * 帐号状态
     *
     * 枚举
     */
    @Schema(description = "帐号状态", example = "1")
    private Integer status;
    /**
     * 最后登录IP
     */
    @Schema(description = "最后登录IP", example = "1.1.1.1")
    private String loginIp;
    /**
     * 最后登录时间
     */
    @Schema(description = "最后登录时间")
    private LocalDateTime loginDate;



}
