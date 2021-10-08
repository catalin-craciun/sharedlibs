def call() {
  pipeline {
    agent any
    environment {
      DOCKER_CRED = 'dockerhub'
      DOCKER_ID = 'catalin088'
      AWS_CRED = 'cloud_user'
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
      stage('Upload to S3'){
        steps{
          script{
            uploadFilesToS3()
          }      
        }
      }
  }        
}
}
