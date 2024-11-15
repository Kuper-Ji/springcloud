#!/bin/bash
if [ "$DEBUG_MODE" = "true" ]; then
    JVM_PROPS="$JVM_PROPS -Dlogging.config=file:///opt/common/app/config/logback-debug.xml"
fi
exec java -server $JAVA_ARGS $JVM_PROPS -jar /opt/common/app/springcloud-app.jar