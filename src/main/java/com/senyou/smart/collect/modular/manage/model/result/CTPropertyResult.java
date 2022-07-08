package com.senyou.smart.collect.modular.manage.model.result;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * <p>
 * 结算对象详情
 * </p>
 *
 * @author huskar
 * @date 2022-06-22
 */
@Data
@ApiModel
public class CTPropertyResult implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 结算对象详情主键
     */
    @ApiModelProperty(value = "结算对象详情主键")
    private Integer id;

    /**
     * 所属结算对象主键
     */
    @ApiModelProperty(value = "所属结算对象主键")
    private Integer ctid;

    /**
     * 公司主键
     */
    @ApiModelProperty(value = "公司主键")
    private Integer branchID;

    /**
     * 地址
     */
    @ApiModelProperty(value = "地址")
    private String address;

    /**
     * 英文地址
     */
    @ApiModelProperty(value = "英文地址")
    private String addressEN;

    /**
     * 抬头主键
     */
    @ApiModelProperty(value = "抬头主键")
    private String companyID;

    /**
     * 联络人
     */
    @ApiModelProperty(value = "联络人")
    private String contacts;

    /**
     * 联络人英文
     */
    @ApiModelProperty(value = "联络人英文")
    private String contactsEN;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    /**
     * 发票限额
     */
    @ApiModelProperty(value = "发票限额")
    private Double creditAmount;

    /**
     * 客户UBS主键
     */
    @ApiModelProperty(value = "客户UBS主键")
    private String customerUSBID;

    /**
     * 所属行业类型
     */
    @ApiModelProperty(value = "所属行业类型")
    private Integer logisticsTypeID;

    /**
     * 全名
     */
    @ApiModelProperty(value = "全名")
    private String nameFull;

    /**
     * 英文全名
     */
    @ApiModelProperty(value = "英文全名")
    private String nameFullEN;

    /**
     * 简称
     */
    @ApiModelProperty(value = "简称")
    private String nameShort;

    /**
     * 英文简称
     */
    @ApiModelProperty(value = "英文简称")
    private String nameShortEN;

    /**
     * 客户财务编号
     */
    @ApiModelProperty(value = "客户财务编号")
    private String oracleID;

    /**
     * 供应商财务编号
     */
    @ApiModelProperty(value = "供应商财务编号")
    private String oracleIDSupplier;

    /**
     * 电话号码
     */
    @ApiModelProperty(value = "电话号码")
    private String phone;

    /**
     * 所属性质
     */
    @ApiModelProperty(value = "所属性质")
    private Integer propertiesID;

    /**
     * 结算方式
     */
    @ApiModelProperty(value = "结算方式")
    private Integer settlement;

    /**
     * 供应商UBS主键
     */
    @ApiModelProperty(value = "供应商UBS主键")
    private String supplierUSBID;

    /**
     * 客户账期
     */
    @ApiModelProperty(value = "客户账期")
    private Integer terms;

    /**
     * 税号
     */
    @ApiModelProperty(value = "税号")
    private String taxNum;

    /**
     * 发票显示名称
     */
    @ApiModelProperty(value = "发票显示名称")
    private String nameInvoice;

    /**
     * 内部公司标识
     */
    @ApiModelProperty(value = "内部公司标识")
    private Boolean isOracleExternal;

    /**
     * 邮箱
     */
    @ApiModelProperty(value = "邮箱")
    private String email;

    /**
     * 更新时间
     */
    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

    /**
     * 客户等级主键
     */
    @ApiModelProperty(value = "客户等级主键")
    private Integer customerLevelID;

    /**
     * 销售员主键
     */
    @ApiModelProperty(value = "销售员主键")
    private Integer salesManID;

    /**
     * 传真
     */
    @ApiModelProperty(value = "传真")
    private String fax;

    /**
     * 冻结标识
     */
    @ApiModelProperty(value = "冻结标识")
    private Integer freezen;

    /**
     * 客商申请状态
     */
    @ApiModelProperty(value = "客商申请状态")
    private Integer cHDState;

    /**
     * 最后编辑人主键
     */
    @ApiModelProperty(value = "最后编辑人主键")
    private Integer lastEditorID;

    /**
     * 最后编辑时间
     */
    @ApiModelProperty(value = "最后编辑时间")
    private Date lastEditTime;

    /**
     * 客商反馈信息
     */
    @ApiModelProperty(value = "客商反馈信息")
    private String cDHReturnInfo;

    /**
     * 更新序列号
     */
    @ApiModelProperty(value = "更新序列号")
    private Integer updateIndex;

    /**
     * CSS申请状态
     */
    @ApiModelProperty(value = "CSS申请状态")
    private Integer cSSState;

    /**
     * CSS反馈信息
     */
    @ApiModelProperty(value = "CSS反馈信息")
    private String cSSReturnInfo;

    /**
     * 仅结算标识
     */
    @ApiModelProperty(value = "仅结算标识")
    private Boolean isOnlySettlement;

    /**
     * 客商编码
     */
    @ApiModelProperty(value = "客商编码")
    private String custSupCode;

    /**
     * CRM认证状态
     */
    @ApiModelProperty(value = "CRM认证状态")
    private Integer cRMStatus;

    /**
     * SRM认证状态
     */
    @ApiModelProperty(value = "SRM认证状态")
    private Integer sRMStatus;

    /**
     * 创建人
     */
    @ApiModelProperty(value = "创建人")
    private Integer creatorID;

    /**
     * 新客户标识
     */
    @ApiModelProperty(value = "新客户标识")
    private Boolean isNewCustomerCTP;

    /**
     * 事业线
     */
    @ApiModelProperty(value = "事业线")
    private String businessLine;

    /**
     * 代收代付标识
     */
    @ApiModelProperty(value = "代收代付标识")
    private Boolean isReimbursement;

    /**
     * 客户审批状态
     */
    @ApiModelProperty(value = "客户审批状态")
    private Integer customerStatus;

    /**
     * 申请修改状态
     */
    @ApiModelProperty(value = "申请修改状态")
    private Integer applyReviseCustomer;

    /**
     * 客户基本信息
     */
    @ApiModelProperty(value = "客户基本信息")
    private String customerInfo;

    /**
     * 修改客户备注
     */
    @ApiModelProperty(value = "修改客户备注")
    private String reviseCustomerRemark;

    /**
     * 驳回备注
     */
    @ApiModelProperty(value = "驳回备注")
    private String rejectRemark;

    /**
     * 发送邮件标识
     */
    @ApiModelProperty(value = "发送邮件标识")
    private Boolean isSendEmail;

    /**
     * 马来西亚供应商账期
     */
    @ApiModelProperty(value = "马来西亚供应商账期")
    private Integer vendorTerms;

    /**
     * 新增客户备注
     */
    @ApiModelProperty(value = "新增客户备注")
    private String addCustomerInfoRemark;

    /**
     * 老挝客户标识
     */
    @ApiModelProperty(value = "老挝客户标识")
    private Boolean isVNCustomer;

    /**
     * 备用客户财务代码1
     */
    @ApiModelProperty(value = "备用客户财务代码1")
    private String oracleID1;

    /**
     * 备用供应商财务代码1
     */
    @ApiModelProperty(value = "备用供应商财务代码1")
    private String oracleIDSupplier1;

    /**
     * 备用客户财务代码2
     */
    @ApiModelProperty(value = "备用客户财务代码2")
    private String oracleID2;

    /**
     * 备用供应商财务代码2
     */
    @ApiModelProperty(value = "备用供应商财务代码2")
    private String oracleIDSupplier2;

    /**
     * 客商返回原始报文
     */
    @ApiModelProperty(value = "客商返回原始报文")
    private String originalMessage;

}

