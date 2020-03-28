#!/usr/bin/env bash
#编译+部署order站点

#需要配置如下参数
# 项目路径, 在Execute Shell中配置项目路径, pwd 就可以获得该项目路径
# export PROJ_PATH=这个jenkins任务在部署机器上的路径

cd $PROJ_PATH/t
mvn clean install


# 启动代码
java -jar $PROJ_PATH/t/target/demoswagger-0.0.1-SNAPSHOT.jar



