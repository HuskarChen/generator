package com.baomidou.mybatisplus.generator.samples;

import com.baomidou.mybatisplus.core.exceptions.MybatisPlusException;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * <p>
 * 快速生成
 * </p>
 *
 * @author lanjerry
 * @since 2021-09-16
 */
public class MSSQLGeneratorTest {

    /**
     * 数据源配置
     */
    private static final DataSourceConfig DATA_SOURCE_CONFIG = new DataSourceConfig
        .Builder("jdbc:sqlserver://172.30.145.11:1433;databasename=Smart_Test_20220214", "xgwluser", "Admin_123456")
//        .Builder("jdbc:mysql://172.30.145.9:3306/smart_finance?autoReconnect=true&useUnicode=true&characterEncoding=utf8&zeroDateTimeBehavior=convertToNull&useSSL=false&serverTimezone=GMT%2B8", "root", "Senyou_123456")
//        .Builder("jdbc:mysql://127.0.0.1:3306/smart_bi?autoReconnect=true&useUnicode=true&characterEncoding=utf8&zeroDateTimeBehavior=convertToNull&useSSL=false&serverTimezone=GMT%2B8", "root", "root")
        .schema(scanner("模式名"))
        .build();

    /**
     * <p>
     * 读取控制台内容
     * </p>
     */
    public static String scanner(String tip) {
        Scanner scanner = new Scanner(System.in);
        //设置Scnner的next匹配方式为换行符（原本默认空格和换行）
        scanner.useDelimiter("\n");
        StringBuilder help = new StringBuilder();
        help.append("请输入" + tip + "：");
        System.out.println(help.toString());
        if (scanner.hasNext()) {
            String ipt = scanner.next();
            if (StringUtils.isNotBlank(ipt)) {
                //如果包含空格，对空格进行处理
                return ipt.replaceAll("\\s+", "");
            }
        }
        throw new MybatisPlusException("请输入正确的" + tip + "！");
    }

    /**
     * 数据库表配置
     */
    private static StrategyConfig strategyConfig(String moduleName) {
        StrategyConfig sc = new StrategyConfig
            .Builder()
            .addInclude(scanner("表名，多个以英文逗号分割").split(","))
            .addTablePrefix(moduleName + "_")
            .build();
        sc.entityBuilder().columnNaming(NamingStrategy.underline_to_camel).enableLombok().enableTableFieldAnnotation().enableFileOverride();
        sc.controllerBuilder().enableRestStyle().enableHyphenStyle().enableFileOverride();
        sc.serviceBuilder().enableFileOverride();
        sc.mapperBuilder().enableFileOverride();
        return sc;
    }

    /**
     * 全局配置
     */
    private static GlobalConfig globalConfig() {
        String projectPath = System.getProperty("user.dir");
        return new GlobalConfig
            .Builder()
            .outputDir(projectPath + "/src/main/java")
            .author("huskar")
            .disableOpenDir()
            .dateType(DateType.ONLY_DATE)
            .build();
    }

    /**
     * 包 相关配置
     */
    private static PackageConfig packageConfig(String modular) {
        return new PackageConfig
            .Builder()
            .parent("com.senyou.smart.collect.modular." + modular)
            .controller("controller")
            .entity("entity")
            .mapper("mapper")
            .xml("mapper.mapping")
            .service("service")
            .serviceImpl("service.impl")
            .build();
    }

    /**
     * 模板路径配置项
     */
    private static TemplateConfig templateConfig() {
        return new TemplateConfig
            .Builder()
            .entity("custom-templates/entity.java")
            .controller("custom-templates/controller.java")
            .service("custom-templates/service.java")
            .serviceImpl("custom-templates/serviceImpl.java")
            .mapper("custom-templates/mapper.java")
            .xml("custom-templates/mapper.xml")
            .build();
    }

    /**
     * 注入配置
     */
    private static InjectionConfig injectionConfig(String parent) {
        //自定义属性
        Map<String, Object> map = new HashMap<>();
        map.put("paramPath", parent + ".model.param");
        map.put("resultPath", parent + ".model.result");

        return new InjectionConfig
            .Builder()
            .customMap(map)
            .build();
    }

    /**
     * 执行 run
     */
    public static void main(String[] args) {
        String modular = scanner("modular下的名称");
        AutoGenerator generator = new AutoGenerator(DATA_SOURCE_CONFIG);
        generator.packageInfo(packageConfig(modular));
        generator.strategy(strategyConfig(generator.getPackageInfo().getModuleName()));
        generator.global(globalConfig());
        generator.template(templateConfig());
        generator.injection(injectionConfig(generator.getPackageInfo().getParent()));
        generator.execute(new FreemarkerTemplateEngine());
    }
}
