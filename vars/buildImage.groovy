def call(){
  myapp = sh("docker.build("catalin088/nodejs-test:${env.BUILD_ID}")")
}
