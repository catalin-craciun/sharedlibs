def call() {
    pipeline {
        agent any

        stages {
            stage('Audit Tools') {                  
                steps {
                    auditTools()
                }
            }
            stage('Build') {                  
                steps {
                    build_app()
                }
            }
        }
    }
}
