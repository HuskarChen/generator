package com.senyou.smart.collect.modular.manage.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.senyou.smart.collect.modular.manage.entity.CTProperty;
import com.senyou.smart.collect.modular.manage.model.param.CTPropertyParam;
import com.senyou.smart.collect.modular.manage.model.result.CTPropertyResult;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;
/**
 * <p>
 * 结算对象详情 Mapper 接口
 * </p>
 *
 * @author huskar
 * @date 2022-06-22
 */
@Mapper
public interface CTPropertyMapper extends BaseMapper<CTProperty> {

    Page<CTPropertyResult> customPageList(@Param("page") Page page, @Param("paramCondition") CTPropertyParam paramCondition);

}
