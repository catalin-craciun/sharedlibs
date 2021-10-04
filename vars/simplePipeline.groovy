def call() {
    pipeline {
        agent any

        stages {
            stage('Audit Tools') {                  
                steps {
                    auditTools()
                }
            }
        }
    }
}
