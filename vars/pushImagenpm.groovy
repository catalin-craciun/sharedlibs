def call() {
    
    evaluate(new File("/home/sharedlibs/vars/buildImagenpm.groovy"))
    def buildimg = new buildImagenpm()
    docker.withRegistry('https://registry.hub.docker.com', "${DOCKER_CRED}") {
      buildimg.myappMethod().push("latest")
      buildimg.myappMethod().push("${env.BUILD_ID}")
     }
}
