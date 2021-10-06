def call() {
  script{
    docker.withRegistry('https://registry.hub.docker.com', 'dockerhub') {
      buildImagenpm().myapp.push("latest")
      buildImagenpm().myapp.push("${env.BUILD_ID}")
     }
  }
}
