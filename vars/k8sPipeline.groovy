def call() {
  pipeline {
    agent any
    environment {
        DOCKER_CRED = 'dockerhub'
    }
    stages {
        stage("Checkout code") {
            steps {
                checkout scm
            }
        }
        stage("Build image") {
            steps {
                myapp = buildImage()
            }
        }
        stage("Push image") {
            steps {
                pushImage(myapp)
                }
            }
  }        
}
}
