<#assign paramName = entity+'Param'>
<#assign resultName = entity+'Result'>
<#assign serviceName = (entity?uncap_first)+'Service'>
package ${package.Controller};

import cn.stylefeng.guns.cloud.libs.scanner.annotation.GetResource;
import cn.stylefeng.guns.cloud.libs.scanner.annotation.PostResource;
import cn.stylefeng.guns.cloud.libs.scanner.stereotype.ApiResource;
import cn.stylefeng.guns.cloud.model.page.PageResult;
import cn.stylefeng.guns.cloud.model.web.response.ResponseData;
import cn.stylefeng.guns.cloud.model.web.response.SuccessResponseData;
import ${paramPath}.${paramName};
import ${resultPath}.${resultName};
import ${package.Service}.${table.serviceName};
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

<#if superControllerClassPackage??>
import ${superControllerClassPackage};
</#if>

/**
 * <p>
 * ${table.comment!} 前端控制器
 * </p>
 *
 * @author ${author}
 * @date ${date}
 */
<#if restControllerStyle>
@RestController
<#else>
@Controller
</#if>
@ApiResource(name = "${table.comment!}管理", path = "/${table.entityPath}")
@Api(tags = "${table.comment!}信息")
<#if kotlin>
class ${table.controllerName}<#if superControllerClass??> : ${superControllerClass}()</#if>
<#else>
    <#if superControllerClass??>
public class ${table.controllerName} extends ${superControllerClass} {
    <#else>
public class ${table.controllerName} {
    </#if>
    @Resource
    private ${table.serviceName} ${serviceName};

    /**
     * 新增 ${table.comment!}
     *
     * @param param 新增参数
     * @return ResponseData
     */
    @ApiOperation("添加")
    @PostResource(name = "添加", path = "/add")
    public ResponseData add(@RequestBody ${paramName} param) {
        ${serviceName}.add(param);
        return new SuccessResponseData();
    }

    /**
     * 获取${table.comment!}列表
     *
     * @param param 查询参数
     * @return ResponseData
     */
    @ApiOperation("获取列表")
    @PostResource(name = "获取列表", path = "/queryListPage")
    public ResponseData queryListPage(@RequestBody ${paramName} param) {
        PageResult<${resultName}> pageBySpec = ${serviceName}.findPageBySpec(param);
        return new SuccessResponseData(pageBySpec);
    }

    /**
     * 获取${table.comment!}详情
     *
     * @param id ${table.comment!}id
     * @return ResponseData
     */
    @GetResource(name = "获取详情", path = "/detail")
    @ApiOperation("获取详情")
    public ResponseData detail(@RequestParam Long id) {
        return ResponseData.success(${serviceName}.detail(id));
    }

    /**
     * 修改${table.comment!}
     *
     * @param param 修改参数
     * @return ResponseData
     */
    @ApiOperation("修改")
    @PostResource(name = "修改", path = "/update")
    public ResponseData update(@RequestBody ${paramName} param) {
        ${serviceName}.update(param);
        return new SuccessResponseData();
    }

    /**
     * 删除${table.comment!}
     *
     * @param id ${table.comment!}id
     * @return ResponseData
     */
    @ApiOperation("删除")
    @PostResource(name = "删除", path = "/delete")
    public ResponseData delete(@RequestParam("id") Long id) {
        ${serviceName}.delete(id);
        return new SuccessResponseData();
    }

}
</#if>
