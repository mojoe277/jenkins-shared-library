#!/usr/bin/env groovy

import com.example.Docker.groovy

def call(String imageName) {
    return new Docker(this).buildDockerImage(imageName)
}

