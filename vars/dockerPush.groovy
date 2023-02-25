#!/usr/bin/env groovy

import com.app.Docker

def call(string imageName) {
     return new Docker(this).dockerPush(imageName)   
} 