def call() {
    pipeline {
        agent any
        environment {
            AWS_CRED = 'cloud_user'
        }
        stages {
            stage('Upload template to S3') {                  
                steps {
                    uploadTemplateToS3()
                }
            }
            stage('Deploy Wordpress Stack') {                  
                steps {
                    deployWordpress()
                }
            }
        }
    }
}
