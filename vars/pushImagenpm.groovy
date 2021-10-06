def call() {
    evaluate(new File("sharedlibs/vars/buildImagenpm.groovy"))
    buildimg = new buildImagenpm()
    docker.withRegistry('https://registry.hub.docker.com', 'dockerhub') {
      buildimg.myappMethod.push("latest")
      buildimg.myappMethod.push("${env.BUILD_ID}")
     }
}
