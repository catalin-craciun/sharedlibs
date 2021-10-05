def call(){
  script {
    myapp = []
    myapp = docker.build("catalin088/nodejs-test:${env.BUILD_ID}")
  }
}
