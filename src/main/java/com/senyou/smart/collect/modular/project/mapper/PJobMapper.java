package com.senyou.smart.collect.modular.project.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.senyou.smart.collect.modular.project.entity.PJob;
import com.senyou.smart.collect.modular.project.model.param.PJobParam;
import com.senyou.smart.collect.modular.project.model.result.PJobResult;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;
/**
 * <p>
 * 项目单票信息 Mapper 接口
 * </p>
 *
 * @author huskar
 * @date 2022-07-07
 */
@Mapper
public interface PJobMapper extends BaseMapper<PJob> {

    Page<PJobResult> customPageList(@Param("page") Page page, @Param("paramCondition") PJobParam paramCondition);

}
