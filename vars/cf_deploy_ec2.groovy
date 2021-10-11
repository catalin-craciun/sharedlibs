def call() {
    pipeline {
        agent any

        stages {
            stage('Upload template to S3') {                  
                steps {
                    uploadTemplateToS3()
                }
            }
        stage('Deploy EC2') {                  
                steps {
                    deployEC2()
                }
            }
        }
    }
}
