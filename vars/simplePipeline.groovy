def call() {
    pipeline {
        agent docker {
                image '...'
              }
        }
        stages {
            stage('Verify') {                  
                steps {
                    echo "Module: ${MODULE}"
                    sh 'git version'
                }
            }
        }
    }
}
