def call() {
    pipeline {
        agent docker {
                image '...'
              }
        }
        stages {
            stage('Audit Tools') {                  
                steps {
                    auditTools()
                }
            }
        }
    }
}
