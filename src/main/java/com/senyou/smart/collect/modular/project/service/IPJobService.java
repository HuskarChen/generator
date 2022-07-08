package com.senyou.smart.collect.modular.project.service;

import cn.stylefeng.guns.cloud.model.page.PageResult;
import com.senyou.smart.collect.modular.project.entity.PJob;
import com.senyou.smart.collect.modular.project.model.param.PJobParam;
import com.senyou.smart.collect.modular.project.model.result.PJobResult;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 项目单票信息 服务类
 * </p>
 *
 * @author huskar
 * @date 2022-07-07
 */
public interface IPJobService extends IService<PJob> {

    /**
     * 新增项目单票信息
     *
     * @param param 新增参数
     */
    void add(PJobParam param);

    /**
     * 查询分页数据，Specification模式
     *
     * @param param 查询条件
     * @return PageResult<PJobResult>
     */
    PageResult<PJobResult> findPageBySpec(PJobParam param);

    /**
     * 详情项目单票信息
     *
     * @param id 项目单票信息id
     * @return PJobResult
     */
    PJobResult detail(Long id);

    /**
     * 修改项目单票信息
     *
     * @param param 修改参数
     */
    void update(PJobParam param);

    /**
     * 删除项目单票信息
     *
     * @param id 项目单票信息id
     */
    void delete(Long id);
}
