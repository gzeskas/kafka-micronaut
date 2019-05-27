FROM oracle/graalvm-ce:1.0.0-rc15 as graalvm
COPY . /home/app/mpv
WORKDIR /home/app/mpv
RUN native-image --no-server -cp build/libs/mpv-*.jar

FROM frolvlad/alpine-glibc
EXPOSE 8080
COPY --from=graalvm /home/app/mpv .
ENTRYPOINT ["./mpv"]
