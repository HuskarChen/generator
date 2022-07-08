package com.senyou.smart.collect.modular.project.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.stylefeng.guns.cloud.model.page.PageResult;
import cn.stylefeng.guns.cloud.libs.mp.page.PageFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.senyou.smart.collect.modular.project.entity.PJob;
import com.senyou.smart.collect.modular.project.model.param.PJobParam;
import com.senyou.smart.collect.modular.project.model.result.PJobResult;
import com.senyou.smart.collect.modular.project.service.IPJobService;
import com.senyou.smart.collect.modular.project.mapper.PJobMapper;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 项目单票信息 服务实现类
 * </p>
 *
 * @author huskar
 * @date 2022-07-07
 */
@Service
public class PJobServiceImpl extends ServiceImpl<PJobMapper, PJob> implements IPJobService {

    @Override
    public void add(PJobParam param) {
        PJob entity = getEntityByParam(param);
        //保存
        this.save(entity);
    }

    @Override
    public PageResult<PJobResult> findPageBySpec(PJobParam param) {
        Page pageContext = getPageContext();
        IPage<PJobResult> page = this.baseMapper.customPageList(pageContext, param);
        return new PageResult<>(page);
    }

    @Override
    public PJobResult detail(Long id) {
        PJobResult result = getResultById(id);
        return result;
    }

    @Override
    public void update(PJobParam param) {
        PJob entity = this.getById(param.getId());
        PJob newEntity = getEntityByParam(param);
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

    private PJobResult getResultById(Long id) {
        PJob entity = this.getById(id);
        PJobResult result = getResultByEntity(entity);
        return result;
    }

    private PJob getEntityByParam(PJobParam param) {
        PJob entity = new PJob();
        BeanUtil.copyProperties(param, entity);
        return entity;
    }

    private PJobResult getResultByEntity(PJob entity) {
        PJobResult result = new PJobResult();
        BeanUtil.copyProperties(entity, result);
        return result;
    }
}
