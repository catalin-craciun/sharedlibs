def buildImagenpm(){
  
    myapp = docker.build("catalin088/nodejs-test:${env.BUILD_ID}")
}

def pushImagenpm() {
 script {
   docker.withRegistry('https://registry.hub.docker.com', 'dockerhub') {
    myapp.push("latest")
    myapp.push("${env.BUILD_ID}")
     }
 }
}
