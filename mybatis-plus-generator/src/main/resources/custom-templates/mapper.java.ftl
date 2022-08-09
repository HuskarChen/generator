<#assign paramName = entity+'Param'>
<#assign resultName = entity+'Result'>
package ${package.Mapper};

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import ${package.Entity}.${entity};
import ${paramPath}.${paramName};
import ${resultPath}.${resultName};
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;
/**
 * <p>
 * ${table.comment!} Mapper 接口
 * </p>
 *
 * @author ${author}
 * @date ${date}
 */
@Mapper
public interface ${table.mapperName} extends BaseMapper<${entity}> {

    Page<${resultName}> customPageList(@Param("page") Page page, @Param("paramCondition") ${paramName} paramCondition);

}
