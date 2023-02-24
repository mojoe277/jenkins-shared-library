#!/usr/bin/env groovy

def buildImage() {
    echo "building the docker image..."
    withCredentials([usernamePassword(credentialsId: 'docker-hub-repo', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        sh 'docker build -t mojoe277/nodejs-app:njs-2.0 .'
        sh "echo $PASS | docker login -u $USER --password-stdin"
        sh 'docker push mojoe277/nodejs-app:njs-2.0'
    }
} 