FROM alpine:latest
LABEL org.opencontainers.image.title=@docker.image.name@ \
      org.opencontainers.image.created=@buildDate@ \
      org.opencontainers.image.revision=@buildNumber@ \
      org.opencontainers.image.vendor='Kuper' \
      org.opencontainers.image.version=@project.version@ \
# 安装依赖

ENV JAVA_HOME=/usr/lib/jvm/java-1.8-openjdk
RUN apk add --no-cache openjdk8-jre-base curl iputils ncurses vim libcurl bash