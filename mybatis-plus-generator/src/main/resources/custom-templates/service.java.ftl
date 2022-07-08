<#assign paramName = entity+'Param'>
<#assign resultName = entity+'Result'>
package ${package.Service};

import cn.stylefeng.guns.cloud.model.page.PageResult;
import ${package.Entity}.${entity};
import ${paramPath}.${paramName};
import ${resultPath}.${resultName};
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * ${table.comment!} 服务类
 * </p>
 *
 * @author ${author}
 * @date ${date}
 */
public interface ${table.serviceName} extends IService<${entity}> {

    /**
     * 新增${table.comment!}
     *
     * @param param 新增参数
     */
    void add(${paramName} param);

    /**
     * 查询分页数据，Specification模式
     *
     * @param param 查询条件
     * @return PageResult<${resultName}>
     */
    PageResult<${resultName}> findPageBySpec(${paramName} param);

    /**
     * 详情${table.comment!}
     *
     * @param id ${table.comment!}id
     * @return ${resultName}
     */
    ${resultName} detail(Long id);

    /**
     * 修改${table.comment!}
     *
     * @param param 修改参数
     */
    void update(${paramName} param);

    /**
     * 删除${table.comment!}
     *
     * @param id ${table.comment!}id
     */
    void delete(Long id);
}
