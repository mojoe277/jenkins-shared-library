#!/usr/bin/env groovy

 import com.example.Docker.groovy

 def call(string imageName) {
     return new Docker(this).dockerPush(imageName)   
} 