#!/bin/sh
docker build . -t mpv
echo
echo
echo "To run the docker container execute:"
echo "    $ docker run --network host mpv"
