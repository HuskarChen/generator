package com.senyou.smart.collect.modular.project.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * <p>
 * 项目单票信息
 * </p>
 *
 * @author huskar
 * @date 2022-07-07
 */
@Data
@TableName("Project.PJob")
public class PJob implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 工程单票主键
     */
    @TableField(value = "ID")
    private Integer id;

    /**
     * 实际到港日
     */
    @TableField(value = "ATA")
    private Date ata;

    /**
     * 实际离港日
     */
    @TableField(value = "ATD")
    private Date atd;

    /**
     * 业务编号
     */
    @TableField(value = "Code")
    private String code;

    /**
     * 创建日期
     */
    @TableField(value = "CreateDate")
    private Date createDate;

    /**
     * 创建人
     */
    @TableField(value = "CreatorID")
    private Integer creatorID;

    /**
     * 卸船完成日
     */
    @TableField(value = "DischargeDoneDate")
    private Date dischargeDoneDate;

    /**
     * 预计到港日
     */
    @TableField(value = "ETA")
    private Date eta;

    /**
     * 预计离港日
     */
    @TableField(value = "ETD")
    private Date etd;

    /**
     * 单票账期日
     */
    @TableField(value = "FinanceDate")
    private Date financeDate;

    /**
     * 最后编辑日期
     */
    @TableField(value = "LastEditDate")
    private Date lastEditDate;

    /**
     * 最后编辑人
     */
    @TableField(value = "LastEditorID")
    private Integer lastEditorID;

    /**
     * 统计日
     */
    @TableField(value = "LockDate")
    private Date lockDate;

    /**
     * 项目主键
     */
    @TableField(value = "ProjectID")
    private Integer projectID;

    /**
     * 报价编号ID
     */
    @TableField(value = "QuotationID")
    private Integer quotationID;

    /**
     * 货量统计段
     */
    @TableField(value = "StatisticalPortion")
    private Integer statisticalPortion;

    /**
     * 公司抬头
     */
    @TableField(value = "CompanyLetterheadID")
    private Integer companyLetterheadID;

    /**
     * 财务锁定日
     */
    @TableField(value = "BillLockDate")
    private Date billLockDate;

    /**
     * 财务锁定人
     */
    @TableField(value = "BillLockOperatorID")
    private Integer billLockOperatorID;

    /**
     * 单票锁定标记
     */
    @TableField(value = "BizIsLock")
    private Boolean bizIsLock;

    /**
     * 费用锁定标记
     */
    @TableField(value = "BillIsLock")
    private Boolean billIsLock;

    /**
     * 事业线
     */
    @TableField(value = "BusinessLineID")
    private Integer businessLineID;

    /**
     * 业务完成日
     */
    @TableField(value = "CompleteDate")
    private Date completeDate;

    /**
     * 结算类型单票标记
     */
    @TableField(value = "IsSettleJob")
    private Boolean isSettleJob;
}

