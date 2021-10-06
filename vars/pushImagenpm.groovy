def call() {
 script {
  buildImagenpm()
  docker.withRegistry('https://registry.hub.docker.com', 'dockerhub') {
    myapp.push("latest")
    myapp.push("${env.BUILD_ID}")
     }
 }
}
