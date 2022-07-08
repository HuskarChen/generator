<#assign tableName = table.name>
<#if table.schema??>
    <#assign tableName = table.schema + "." + table.name/>
</#if>
<#assign paramName = entity+'Param'>
<#assign resultName = entity+'Result'>
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="${package.Mapper}.${table.mapperName}">

    <!-- region 通用查询映射结果 -->
    <resultMap id="BaseResultMap" type="${resultPath}.${resultName}">
        <#-- ----------  BEGIN 字段循环遍历  ---------->
        <#list table.fields as field>
            <#if field.keyFlag>
            <#-- 主键 -->
        <id column="${field.name}" property="${field.propertyName}"/>
            <#else>
            <#-- -----   存在字段填充设置   ----->
        <result column="${field.name}" property="${field.propertyName}"/>
            </#if>
        </#list>
    </resultMap>
    <!-- endregion -->

    <!-- region 通用查询结果列 -->
    <sql id="Base_Column_List">
        <#-- ----------  BEGIN 字段循环遍历  ---------->
        <#list table.fields as field>${field.name} AS "${field.propertyName}"<#if field_has_next>, </#if></#list>
    </sql>
    <!-- endregion -->

    <!-- region 通用查询 -->
    <select id="customPageList" resultType="${resultPath}.${resultName}"
            parameterType="${paramPath}.${paramName}">
        select
        <include refid="Base_Column_List"/>
        from ${tableName}
        <where>
            <#-- ----------  BEGIN 字段循环遍历  ---------->
            <#list table.fields as field>
                <#if field.propertyType == 'String'>
            <if test="paramCondition.${field.propertyName} != null and paramCondition.${field.propertyName} != ''">
                and ${field.name} like concat('%',${r"#{"}paramCondition.${field.propertyName}${r"}"},'%')
            </if>
                <#elseif field.propertyType == 'Date'>
            <if test="paramCondition.${field.propertyName} != null and paramCondition.${field.propertyName} != ''">
                and ${field.name} = ${r"#{"}paramCondition.${field.propertyName}${r"}"}
            </if>
                <#else>
            <if test="paramCondition.${field.propertyName} != null and paramCondition.${field.propertyName} != 0">
                and ${field.name} = ${r"#{"}paramCondition.${field.propertyName}${r"}"}
            </if>
                </#if>
            </#list>
        </where>
    </select>
    <!-- endregion -->
</mapper>
