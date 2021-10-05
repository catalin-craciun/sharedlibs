def call(){
  script {
    def myapp = docker.build("catalin088/nodejs-test:${env.BUILD_ID}")
  }
}
