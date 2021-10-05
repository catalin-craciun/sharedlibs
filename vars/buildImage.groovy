def call(){
  script {
    myapp = docker.build("catalin088/nodejs-test:${env.BUILD_ID}")
  }
  return myapp;
}
