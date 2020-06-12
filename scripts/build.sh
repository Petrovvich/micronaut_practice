#!/bin/bash

cd ../ \
&& ./gradlew build \
&& docker-compose -f docker-compose.yml up --build --remove-orphans
