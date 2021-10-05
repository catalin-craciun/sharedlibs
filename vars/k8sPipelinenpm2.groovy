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
                checkoutCodenpm()
              }
            }
        }
        stage("Build image") {
            steps {
              script{
                buildImagenpm()
              }
            }
        }
        stage("Push image") {
            steps {
              script{
                pushImagenpm()
                }
            }
            }
  }        
}
}
