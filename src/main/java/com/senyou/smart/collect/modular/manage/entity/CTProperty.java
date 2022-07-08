package com.senyou.smart.collect.modular.manage.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("MTM.CTProperty")
public class CTProperty implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 结算对象详情主键
     */
    @TableField(value = "ID")
    private Integer id;

    /**
     * 所属结算对象主键
     */
    @TableField(value = "CTID")
    private Integer ctid;

    /**
     * 公司主键
     */
    @TableField(value = "BranchID")
    private Integer branchID;

    /**
     * 地址
     */
    @TableField(value = "Address")
    private String address;

    /**
     * 英文地址
     */
    @TableField(value = "AddressEN")
    private String addressEN;

    /**
     * 抬头主键
     */
    @TableField(value = "CompanyID")
    private String companyID;

    /**
     * 联络人
     */
    @TableField(value = "Contacts")
    private String contacts;

    /**
     * 联络人英文
     */
    @TableField(value = "ContactsEN")
    private String contactsEN;

    /**
     * 创建时间
     */
    @TableField(value = "CreateTime")
    private Date createTime;

    /**
     * 发票限额
     */
    @TableField(value = "CreditAmount")
    private Double creditAmount;

    /**
     * 客户UBS主键
     */
    @TableField(value = "CustomerUSBID")
    private String customerUSBID;

    /**
     * 所属行业类型
     */
    @TableField(value = "LogisticsTypeID")
    private Integer logisticsTypeID;

    /**
     * 全名
     */
    @TableField(value = "NameFull")
    private String nameFull;

    /**
     * 英文全名
     */
    @TableField(value = "NameFullEN")
    private String nameFullEN;

    /**
     * 简称
     */
    @TableField(value = "NameShort")
    private String nameShort;

    /**
     * 英文简称
     */
    @TableField(value = "NameShortEN")
    private String nameShortEN;

    /**
     * 客户财务编号
     */
    @TableField(value = "OracleID")
    private String oracleID;

    /**
     * 供应商财务编号
     */
    @TableField(value = "OracleIDSupplier")
    private String oracleIDSupplier;

    /**
     * 电话号码
     */
    @TableField(value = "Phone")
    private String phone;

    /**
     * 所属性质
     */
    @TableField(value = "PropertiesID")
    private Integer propertiesID;

    /**
     * 结算方式
     */
    @TableField(value = "Settlement")
    private Integer settlement;

    /**
     * 供应商UBS主键
     */
    @TableField(value = "SupplierUSBID")
    private String supplierUSBID;

    /**
     * 客户账期
     */
    @TableField(value = "TERMS")
    private Integer terms;

    /**
     * 税号
     */
    @TableField(value = "TaxNum")
    private String taxNum;

    /**
     * 发票显示名称
     */
    @TableField(value = "NameInvoice")
    private String nameInvoice;

    /**
     * 内部公司标识
     */
    @TableField(value = "IsOracleExternal")
    private Boolean isOracleExternal;

    /**
     * 邮箱
     */
    @TableField(value = "Email")
    private String email;

    /**
     * 更新时间
     */
    @TableField(value = "UpdateTime")
    private Date updateTime;

    /**
     * 客户等级主键
     */
    @TableField(value = "CustomerLevelID")
    private Integer customerLevelID;

    /**
     * 销售员主键
     */
    @TableField(value = "SalesManID")
    private Integer salesManID;

    /**
     * 传真
     */
    @TableField(value = "Fax")
    private String fax;

    /**
     * 冻结标识
     */
    @TableField(value = "Freezen")
    private Integer freezen;

    /**
     * 客商申请状态
     */
    @TableField(value = "CHDState")
    private Integer cHDState;

    /**
     * 最后编辑人主键
     */
    @TableField(value = "LastEditorID")
    private Integer lastEditorID;

    /**
     * 最后编辑时间
     */
    @TableField(value = "LastEditTime")
    private Date lastEditTime;

    /**
     * 客商反馈信息
     */
    @TableField(value = "CDHReturnInfo")
    private String cDHReturnInfo;

    /**
     * 更新序列号
     */
    @TableField(value = "UpdateIndex")
    private Integer updateIndex;

    /**
     * CSS申请状态
     */
    @TableField(value = "CSSState")
    private Integer cSSState;

    /**
     * CSS反馈信息
     */
    @TableField(value = "CSSReturnInfo")
    private String cSSReturnInfo;

    /**
     * 仅结算标识
     */
    @TableField(value = "IsOnlySettlement")
    private Boolean isOnlySettlement;

    /**
     * 客商编码
     */
    @TableField(value = "CustSupCode")
    private String custSupCode;

    /**
     * CRM认证状态
     */
    @TableField(value = "CRMStatus")
    private Integer cRMStatus;

    /**
     * SRM认证状态
     */
    @TableField(value = "SRMStatus")
    private Integer sRMStatus;

    /**
     * 创建人
     */
    @TableField(value = "CreatorID")
    private Integer creatorID;

    /**
     * 新客户标识
     */
    @TableField(value = "IsNewCustomerCTP")
    private Boolean isNewCustomerCTP;

    /**
     * 事业线
     */
    @TableField(value = "BusinessLine")
    private String businessLine;

    /**
     * 代收代付标识
     */
    @TableField(value = "IsReimbursement")
    private Boolean isReimbursement;

    /**
     * 客户审批状态
     */
    @TableField(value = "CustomerStatus")
    private Integer customerStatus;

    /**
     * 申请修改状态
     */
    @TableField(value = "ApplyReviseCustomer")
    private Integer applyReviseCustomer;

    /**
     * 客户基本信息
     */
    @TableField(value = "CustomerInfo")
    private String customerInfo;

    /**
     * 修改客户备注
     */
    @TableField(value = "ReviseCustomerRemark")
    private String reviseCustomerRemark;

    /**
     * 驳回备注
     */
    @TableField(value = "RejectRemark")
    private String rejectRemark;

    /**
     * 发送邮件标识
     */
    @TableField(value = "IsSendEmail")
    private Boolean isSendEmail;

    /**
     * 马来西亚供应商账期
     */
    @TableField(value = "VendorTerms")
    private Integer vendorTerms;

    /**
     * 新增客户备注
     */
    @TableField(value = "AddCustomerInfoRemark")
    private String addCustomerInfoRemark;

    /**
     * 老挝客户标识
     */
    @TableField(value = "IsVNCustomer")
    private Boolean isVNCustomer;

    /**
     * 备用客户财务代码1
     */
    @TableField(value = "OracleID1")
    private String oracleID1;

    /**
     * 备用供应商财务代码1
     */
    @TableField(value = "OracleIDSupplier1")
    private String oracleIDSupplier1;

    /**
     * 备用客户财务代码2
     */
    @TableField(value = "OracleID2")
    private String oracleID2;

    /**
     * 备用供应商财务代码2
     */
    @TableField(value = "OracleIDSupplier2")
    private String oracleIDSupplier2;

    /**
     * 客商返回原始报文
     */
    @TableField(value = "OriginalMessage")
    private String originalMessage;
}

