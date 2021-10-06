def call() {
  pipeline {
    agent any
    environment {
      DOCKER_CRED = 'dockerhub'
      DOCKER_ID = 'catalin088'
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
                buildImagenpm.myappMethod()
              }
            }
        }
        stage("Push image") {
            steps {
                pushImagenpm()
            }
            }
  }        
}
}
