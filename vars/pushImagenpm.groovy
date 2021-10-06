def call() {
  script{
    docker.withRegistry('https://registry.hub.docker.com', 'dockerhub') {
      buildImagenpm.myappmethod.push("latest")
      buildImagenpm.myappmethod.push("${env.BUILD_ID}")
     }
  }
}
