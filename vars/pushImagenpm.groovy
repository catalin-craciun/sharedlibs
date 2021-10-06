def call() {
  script{
    docker.withRegistry('https://registry.hub.docker.com', 'dockerhub') {
      buildImagenpm.myappMethod.push("latest")
      buildImagenpm.myappMethod.push("${env.BUILD_ID}")
     }
  }
}
