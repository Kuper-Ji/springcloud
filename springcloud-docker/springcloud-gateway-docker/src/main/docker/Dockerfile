FROM registry/dev/base-openjdk17:1.0.0-SNAPSHOT
LABEL org.opencontainers.image.title=@docker.image.name@ \
      org.opencontainers.image.created=@buildDate@ \
      org.opencontainers.image.revision=@buildNumber@ \
      org.opencontainers.image.vendor='Kuper' \
      org.opencontainers.image.version=@project.version@ \

COPY springcloud-gateway.jar /opt/common/gateway/springcloud-gateway.jar
COPY logback.xml  /opt/common/gateway/config/
COPY logback-debug.xml  /opt/common/gateway/config/
COPY start.sh /opt/common/gateway/bin/start.sh

ENV DEBUG_MODE "false"
ENV JAVA_ARGS "-Xms512m -Xmx512m"
ENV JVM_PROPS "-Dlogging.config=file:///opt/common/gateway/config/logback.xml \
               -Djava.util.prefs.systemRoot=/opt/common/.java \
               -Djava.util.prefs.userRoot=/opt/common/.java/.userPrefs \
               -XX:ErrorFile=/var/log/jvm/com_common_gtg_hs_err_%p.log \
               -XX:+HeapDumpOnOutOfMemoryError \
               -XX:HeapDumpPath=/var/log/jvm/com_common_gtg_heapdump_%p.hprof"

# 设置启动日志目录
RUN mkdir -p /var/log/jvm && \
    chmod +x /opt/common/gateway/bin/start.sh && \
    echo '120067:x:120067:' >> /etc/group && \
    echo '120067:x:120067:120067:com AAT common LT - GTG:/opt/common:/bin/false' >> /etc/passwd && \
    echo "120067:!::0:::::" >>/etc/shadow && \
    chown -R 120067:0 /var/log/jvm /opt/common && \
    chmod -R g=u /var/log/jvm /opt/common

USER 120067
WORKDIR  /opt/common
ENTRYPOINT ["sh","/opt/common/gateway/bin/start.sh"]