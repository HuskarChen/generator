package ${resultPath};

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
<#list table.importPackages as pkg>
    <#if pkg ? contains("com.baomidou.mybatisplus.annotation") == false>
import ${pkg};
    </#if>
</#list>
<#if entityLombokModel>
import lombok.Data;
</#if>

/**
 * <p>
 * ${table.comment!}
 * </p>
 *
 * @author ${author}
 * @date ${date}
 */
@Data
@ApiModel
public class ${entity}Result implements Serializable {

    private static final long serialVersionUID = 1L;

<#-- ----------  BEGIN 字段循环遍历  ---------->
<#list table.fields as field>
    /**
     * ${field.comment}
     */
    @ApiModelProperty(value = "${field.comment}")
    private ${field.propertyType} ${field.propertyName};

</#list>
<#------------  END 字段循环遍历  ---------->
}

