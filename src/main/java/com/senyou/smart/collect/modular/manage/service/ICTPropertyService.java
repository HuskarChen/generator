package com.senyou.smart.collect.modular.manage.service;

import cn.stylefeng.guns.cloud.model.page.PageResult;
import com.senyou.smart.collect.modular.manage.entity.CTProperty;
import com.senyou.smart.collect.modular.manage.model.param.CTPropertyParam;
import com.senyou.smart.collect.modular.manage.model.result.CTPropertyResult;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 结算对象详情 服务类
 * </p>
 *
 * @author huskar
 * @date 2022-06-22
 */
public interface ICTPropertyService extends IService<CTProperty> {

    /**
     * 新增结算对象详情
     *
     * @param param 新增参数
     */
    void add(CTPropertyParam param);

    /**
     * 查询分页数据，Specification模式
     *
     * @param param 查询条件
     * @return PageResult<CTPropertyResult>
     */
    PageResult<CTPropertyResult> findPageBySpec(CTPropertyParam param);

    /**
     * 详情结算对象详情
     *
     * @param id 结算对象详情id
     * @return CTPropertyResult
     */
    CTPropertyResult detail(Long id);

    /**
     * 修改结算对象详情
     *
     * @param param 修改参数
     */
    void update(CTPropertyParam param);

    /**
     * 删除结算对象详情
     *
     * @param id 结算对象详情id
     */
    void delete(Long id);
}
