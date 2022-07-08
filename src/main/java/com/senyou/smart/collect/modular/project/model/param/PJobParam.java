package com.senyou.smart.collect.modular.project.model.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
@ApiModel
public class PJobParam implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 工程单票主键
     */
    @ApiModelProperty(value = "工程单票主键")
    private Integer id;

    /**
     * 实际到港日
     */
    @ApiModelProperty(value = "实际到港日")
    private Date ata;

    /**
     * 实际离港日
     */
    @ApiModelProperty(value = "实际离港日")
    private Date atd;

    /**
     * 业务编号
     */
    @ApiModelProperty(value = "业务编号")
    private String code;

    /**
     * 创建日期
     */
    @ApiModelProperty(value = "创建日期")
    private Date createDate;

    /**
     * 创建人
     */
    @ApiModelProperty(value = "创建人")
    private Integer creatorID;

    /**
     * 卸船完成日
     */
    @ApiModelProperty(value = "卸船完成日")
    private Date dischargeDoneDate;

    /**
     * 预计到港日
     */
    @ApiModelProperty(value = "预计到港日")
    private Date eta;

    /**
     * 预计离港日
     */
    @ApiModelProperty(value = "预计离港日")
    private Date etd;

    /**
     * 单票账期日
     */
    @ApiModelProperty(value = "单票账期日")
    private Date financeDate;

    /**
     * 最后编辑日期
     */
    @ApiModelProperty(value = "最后编辑日期")
    private Date lastEditDate;

    /**
     * 最后编辑人
     */
    @ApiModelProperty(value = "最后编辑人")
    private Integer lastEditorID;

    /**
     * 统计日
     */
    @ApiModelProperty(value = "统计日")
    private Date lockDate;

    /**
     * 项目主键
     */
    @ApiModelProperty(value = "项目主键")
    private Integer projectID;

    /**
     * 报价编号ID
     */
    @ApiModelProperty(value = "报价编号ID")
    private Integer quotationID;

    /**
     * 货量统计段
     */
    @ApiModelProperty(value = "货量统计段")
    private Integer statisticalPortion;

    /**
     * 公司抬头
     */
    @ApiModelProperty(value = "公司抬头")
    private Integer companyLetterheadID;

    /**
     * 财务锁定日
     */
    @ApiModelProperty(value = "财务锁定日")
    private Date billLockDate;

    /**
     * 财务锁定人
     */
    @ApiModelProperty(value = "财务锁定人")
    private Integer billLockOperatorID;

    /**
     * 单票锁定标记
     */
    @ApiModelProperty(value = "单票锁定标记")
    private Boolean bizIsLock;

    /**
     * 费用锁定标记
     */
    @ApiModelProperty(value = "费用锁定标记")
    private Boolean billIsLock;

    /**
     * 事业线
     */
    @ApiModelProperty(value = "事业线")
    private Integer businessLineID;

    /**
     * 业务完成日
     */
    @ApiModelProperty(value = "业务完成日")
    private Date completeDate;

    /**
     * 结算类型单票标记
     */
    @ApiModelProperty(value = "结算类型单票标记")
    private Boolean isSettleJob;

}

