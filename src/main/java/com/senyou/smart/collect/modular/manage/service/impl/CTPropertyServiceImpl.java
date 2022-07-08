package com.senyou.smart.collect.modular.manage.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.stylefeng.guns.cloud.model.page.PageResult;
import cn.stylefeng.guns.cloud.libs.mp.page.PageFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.senyou.smart.collect.modular.manage.entity.CTProperty;
import com.senyou.smart.collect.modular.manage.model.param.CTPropertyParam;
import com.senyou.smart.collect.modular.manage.model.result.CTPropertyResult;
import com.senyou.smart.collect.modular.manage.service.ICTPropertyService;
import com.senyou.smart.collect.modular.manage.mapper.CTPropertyMapper;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 结算对象详情 服务实现类
 * </p>
 *
 * @author huskar
 * @date 2022-06-22
 */
@Service
public class CTPropertyServiceImpl extends ServiceImpl<CTPropertyMapper, CTProperty> implements ICTPropertyService {

    @Override
    public void add(CTPropertyParam param) {
        CTProperty entity = getEntityByParam(param);
        //保存
        this.save(entity);
    }

    @Override
    public PageResult<CTPropertyResult> findPageBySpec(CTPropertyParam param) {
        Page pageContext = getPageContext();
        IPage<CTPropertyResult> page = this.baseMapper.customPageList(pageContext, param);
        return new PageResult<>(page);
    }

    @Override
    public CTPropertyResult detail(Long id) {
        CTPropertyResult result = getResultById(id);
        return result;
    }

    @Override
    public void update(CTPropertyParam param) {
        CTProperty entity = this.getById(param.getId());
        CTProperty newEntity = getEntityByParam(param);
        BeanUtil.copyProperties(newEntity, entity);
        //修改信息
        this.updateById(entity);
    }

    @Override
    public void delete(Long id) {
        this.removeById(id);
    }

    private Page getPageContext() {
        return PageFactory.defaultPage();
    }

    private CTPropertyResult getResultById(Long id) {
        CTProperty entity = this.getById(id);
        CTPropertyResult result = getResultByEntity(entity);
        return result;
    }

    private CTProperty getEntityByParam(CTPropertyParam param) {
        CTProperty entity = new CTProperty();
        BeanUtil.copyProperties(param, entity);
        return entity;
    }

    private CTPropertyResult getResultByEntity(CTProperty entity) {
        CTPropertyResult result = new CTPropertyResult();
        BeanUtil.copyProperties(entity, result);
        return result;
    }
}
