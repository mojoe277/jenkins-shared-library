#!/usr/bin/env groovy

import com.app.Docker

def call(String imageName) {
    return new Docker(this).buildDockerImage(imageName)
}

