package com.senyou.smart.collect.modular.project.controller;

import cn.stylefeng.guns.cloud.libs.scanner.annotation.GetResource;
import cn.stylefeng.guns.cloud.libs.scanner.annotation.PostResource;
import cn.stylefeng.guns.cloud.libs.scanner.stereotype.ApiResource;
import cn.stylefeng.guns.cloud.model.page.PageResult;
import cn.stylefeng.guns.cloud.model.web.response.ResponseData;
import cn.stylefeng.guns.cloud.model.web.response.SuccessResponseData;
import com.senyou.smart.collect.modular.project.model.param.PJobParam;
import com.senyou.smart.collect.modular.project.model.result.PJobResult;
import com.senyou.smart.collect.modular.project.service.IPJobService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * <p>
 * 项目单票信息 前端控制器
 * </p>
 *
 * @author huskar
 * @date 2022-07-07
 */
@RestController
@ApiResource(name = "项目单票信息管理", path = "/pJob")
@Api(tags = "项目单票信息信息")
public class PJobController {
    @Resource
    private IPJobService pJobService;

    /**
     * 新增 项目单票信息
     *
     * @param param 新增参数
     * @return ResponseData
     */
    @ApiOperation("添加")
    @PostResource(name = "添加", path = "/add")
    public ResponseData add(@RequestBody PJobParam param) {
        pJobService.add(param);
        return new SuccessResponseData();
    }

    /**
     * 获取项目单票信息列表
     *
     * @param param 查询参数
     * @return ResponseData
     */
    @ApiOperation("获取列表")
    @PostResource(name = "获取列表", path = "/queryListPage")
    public ResponseData queryListPage(@RequestBody PJobParam param) {
        PageResult<PJobResult> pageBySpec = pJobService.findPageBySpec(param);
        return new SuccessResponseData(pageBySpec);
    }

    /**
     * 获取项目单票信息详情
     *
     * @param id 项目单票信息id
     * @return ResponseData
     */
    @GetResource(name = "获取详情", path = "/detail")
    @ApiOperation("获取详情")
    public ResponseData detail(@RequestParam Long id) {
        return ResponseData.success(pJobService.detail(id));
    }

    /**
     * 修改项目单票信息
     *
     * @param param 修改参数
     * @return ResponseData
     */
    @ApiOperation("修改")
    @PostResource(name = "修改", path = "/update")
    public ResponseData update(@RequestBody PJobParam param) {
        pJobService.update(param);
        return new SuccessResponseData();
    }

    /**
     * 删除项目单票信息
     *
     * @param id 项目单票信息id
     * @return ResponseData
     */
    @ApiOperation("删除")
    @PostResource(name = "删除", path = "/delete")
    public ResponseData delete(@RequestParam("id") Long id) {
        pJobService.delete(id);
        return new SuccessResponseData();
    }

}
