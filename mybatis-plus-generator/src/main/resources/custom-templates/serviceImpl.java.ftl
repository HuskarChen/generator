<#assign paramName = entity+'Param'>
<#assign resultName = entity+'Result'>
package ${package.ServiceImpl};

import cn.hutool.core.bean.BeanUtil;
import cn.stylefeng.guns.cloud.model.page.PageResult;
import cn.stylefeng.guns.cloud.libs.mp.page.PageFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import ${package.Entity}.${entity};
import ${paramPath}.${paramName};
import ${resultPath}.${resultName};
import ${package.Service}.${table.serviceName};
import ${package.Mapper}.${table.mapperName};
import org.springframework.stereotype.Service;

/**
 * <p>
 * ${table.comment!} 服务实现类
 * </p>
 *
 * @author ${author}
 * @date ${date}
 */
@Service
public class ${table.serviceImplName} extends ServiceImpl<${table.mapperName}, ${entity}> implements ${table.serviceName} {

    @Override
    public void add(${paramName} param) {
        ${entity} entity = getEntityByParam(param);
        //保存
        this.save(entity);
    }

    @Override
    public PageResult<${resultName}> findPageBySpec(${paramName} param) {
        Page pageContext = getPageContext();
        IPage<${resultName}> page = this.baseMapper.customPageList(pageContext, param);
        return new PageResult<>(page);
    }

    @Override
    public ${resultName} detail(Long id) {
        ${resultName} result = getResultById(id);
        return result;
    }

    @Override
    public void update(${paramName} param) {
        ${entity} entity = this.getById(param.getId());
        ${entity} newEntity = getEntityByParam(param);
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

    private ${resultName} getResultById(Long id) {
        ${entity} entity = this.getById(id);
        ${resultName} result = getResultByEntity(entity);
        return result;
    }

    private ${entity} getEntityByParam(${paramName} param) {
        ${entity} entity = new ${entity}();
        BeanUtil.copyProperties(param, entity);
        return entity;
    }

    private ${resultName} getResultByEntity(${entity} entity) {
        ${resultName} result = new ${resultName}();
        BeanUtil.copyProperties(entity, result);
        return result;
    }
}
