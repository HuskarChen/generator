package com.senyou.smart.collect.modular.manage.controller;

import cn.stylefeng.guns.cloud.libs.scanner.annotation.GetResource;
import cn.stylefeng.guns.cloud.libs.scanner.annotation.PostResource;
import cn.stylefeng.guns.cloud.libs.scanner.stereotype.ApiResource;
import cn.stylefeng.guns.cloud.model.page.PageResult;
import cn.stylefeng.guns.cloud.model.web.response.ResponseData;
import cn.stylefeng.guns.cloud.model.web.response.SuccessResponseData;
import com.senyou.smart.collect.modular.manage.model.param.CTPropertyParam;
import com.senyou.smart.collect.modular.manage.model.result.CTPropertyResult;
import com.senyou.smart.collect.modular.manage.service.ICTPropertyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * <p>
 * 结算对象详情 前端控制器
 * </p>
 *
 * @author huskar
 * @date 2022-06-22
 */
@RestController
@ApiResource(name = "结算对象详情管理", path = "/cTProperty")
@Api(tags = "结算对象详情信息")
public class CTPropertyController {
    @Resource
    private ICTPropertyService cTPropertyService;

    /**
     * 新增 结算对象详情
     *
     * @param param 新增参数
     * @return ResponseData
     */
    @ApiOperation("添加")
    @PostResource(name = "添加", path = "/add")
    public ResponseData add(@RequestBody CTPropertyParam param) {
        cTPropertyService.add(param);
        return new SuccessResponseData();
    }

    /**
     * 获取结算对象详情列表
     *
     * @param param 查询参数
     * @return ResponseData
     */
    @ApiOperation("获取列表")
    @PostResource(name = "获取列表", path = "/queryListPage")
    public ResponseData queryListPage(@RequestBody CTPropertyParam param) {
        PageResult<CTPropertyResult> pageBySpec = cTPropertyService.findPageBySpec(param);
        return new SuccessResponseData(pageBySpec);
    }

    /**
     * 获取结算对象详情详情
     *
     * @param id 结算对象详情id
     * @return ResponseData
     */
    @GetResource(name = "获取详情", path = "/detail")
    @ApiOperation("获取详情")
    public ResponseData detail(@RequestParam Long id) {
        return ResponseData.success(cTPropertyService.detail(id));
    }

    /**
     * 修改结算对象详情
     *
     * @param param 修改参数
     * @return ResponseData
     */
    @ApiOperation("修改")
    @PostResource(name = "修改", path = "/update")
    public ResponseData update(@RequestBody CTPropertyParam param) {
        cTPropertyService.update(param);
        return new SuccessResponseData();
    }

    /**
     * 删除结算对象详情
     *
     * @param id 结算对象详情id
     * @return ResponseData
     */
    @ApiOperation("删除")
    @PostResource(name = "删除", path = "/delete")
    public ResponseData delete(@RequestParam("id") Long id) {
        cTPropertyService.delete(id);
        return new SuccessResponseData();
    }

}
