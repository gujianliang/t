#!/bin/sh

#-e命令失败即刻停止执行脚本；-x用于显示出命令与其执行结果（默认shell脚本中只显示执行结果）
set -ex

# 默认环境变量
#JAVA_OPTS="-Xms1048m -Xmx1048m -Djava.security.egd=file:/dev/./urandom"

#使用urandom作为随机数的生产成本原
JAVA_OPTS="-Djava.security.egd=file:/dev/./urandom"

# 载入自定义环境变量
source "/app/env/default.env"

JAR_FILE=`find /app/ -name \*.jar`

exec java $JAVA_OPTS -jar $JAR_FILE
