
pipeline {
  agent any

  tools {
    maven 'mvn-version'
  }

  stages {
    stage('Build') {
      steps {
        script{
          functionsmaven.buildmaven()
        }
      }
    }
    
    stage("Build image") {
            steps {
                script {
                  functionsmaven.buildImagemaven()
                }
            }
        }
    

    stage("Push image") {
        steps {
                script {
                  functionsmaven.pushImagemaven()
                }
        }
    }
  }
}
