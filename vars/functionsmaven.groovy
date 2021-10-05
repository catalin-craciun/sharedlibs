def buildmaven(){
  sh 'mvn package'
}

def buildImagemaven(){
  script{
          echo "Build image with tag: ${env.BUILD_ID}"
          myapp = docker.build("catalin088/ledger-service:${env.BUILD_ID}", "--build-arg VERSION='${env.BUILD_ID}' .")
        }
}

def pushImagemaven() {
 script {
   docker.withRegistry('https://registry.hub.docker.com', 'dockerhub') {
     myapp.push("latest")
     myapp.push("${env.BUILD_ID}")
     }
 }
}
