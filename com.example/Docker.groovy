#!/usr/bin/env groovy
package com.example

class Docker implments Serializable {

    def script 

    Docker(script) {
        this.script = script
    }

    def buildDockerImage(string imageName) {
        script.echo "building the docker image..."
        script.sh "docker build -t $imageName ."
    }

    def dockerLogin() {
         script.withCredentials([usernamePassword(credentialsId: 'docker-hub-repo', passwordVariable: 'PASS', usernameVariable: 'USER')])
        script.sh "echo $PASS | docker login -u $USER --password-stdin"
    }

    def dockerPush(String imageName) {
        script.sh "docker push $imageName"
    }

}