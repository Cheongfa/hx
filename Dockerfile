FROM busybox:latest
MAINTAINER changfayu
COPY hx-1.war /
CMD "tail" "-f" "/dev/null"
