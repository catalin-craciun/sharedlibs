def call() {
    pipeline {
        agent docker {
                image '...'
              }
        }
        stages {
            stage('Verify') {                  
                steps {
                    auditTools()
                }
            }
        }
    }
}
