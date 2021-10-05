def call(){
  script {
    println env.BUILD_ID
    myapp = docker.build("catalin088/nodejs-test:${env.BUILD_ID}")
    println myapp
  }
}
