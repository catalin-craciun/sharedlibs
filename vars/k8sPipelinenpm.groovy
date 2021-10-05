def call() {
  pipeline {
    agent any
    environment {
        DOCKER_CRED = 'dockerhub'
    }
    stages {
        stage("Checkout code") {
            steps {
                script{
                functionsnpm.checkCodenpm()
              }
            }
        }
        stage("Build image") {
            steps {
              script{
                functionsnpm.buildImagenpm()
              }
            }
        }
        stage("Push image") {
            steps {
              script{
                functionsnpm.pushImagenpm()
                }
            }
            }
  }        
}
}
