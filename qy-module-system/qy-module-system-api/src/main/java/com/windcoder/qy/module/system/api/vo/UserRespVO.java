package com.windcoder.qy.module.system.api.vo;

import com.windcoder.qy.common.core.validation.Mobile;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Set;

@Schema(description = "管理后台 - 用户信息 Response 返回对象")
@Data
public class UserRespVO {
    @Schema(description = "用户编号", example = "1")
    private Long id;

    @Schema(description = "用户账号", requiredMode = Schema.RequiredMode.REQUIRED, example = "qiyu")
    private String username;

    @Schema(description = "用户昵称", requiredMode = Schema.RequiredMode.REQUIRED, example = "酸奶")
    @Size(max = 30, message = "用户昵称长度不能超过30个字符")
    private String nickname;

    @Schema(description = "部门ID", example = "1")
    private Long deptId;
    @Schema(description = "部门名称", example = "xx 部")
    private String deptName;

    @Schema(description = "岗位编号数组", example = "1")
    private Set<Long> postIds;

    @Schema(description = "备注", example = "我是一个备注")
    private String remark;

    @Schema(description = "用户性别，参见 SexEnum 枚举类", example = "1")
    private Integer sex;

    @Schema(description = "用户邮箱", example = "qiyu@windcoder.com")
    private String email;

    @Schema(description = "手机号码", example = "12345678911")
    private String mobile;

    @Schema(description = "用户头像", example = "https://www.windcoder.com/xxx.png")
    private String avatar;

    @Schema(description = "状态，参见 CommonStatusEnum 枚举类", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
    private Integer status;


    @Schema(description = "最后登录 IP", requiredMode = Schema.RequiredMode.REQUIRED, example = "192.168.1.1")
    private String loginIp;

    @Schema(description = "最后登录时间", requiredMode = Schema.RequiredMode.REQUIRED, example = "时间戳格式")
    private LocalDateTime loginDate;

    @Schema(description = "创建时间", requiredMode = Schema.RequiredMode.REQUIRED, example = "时间戳格式")
    private LocalDateTime createTime;










}
