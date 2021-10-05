def call(){
  myapp = sh(script: 'docker.build("catalin088/nodejs-test:${env.BUILD_ID}")', returnStdout: true)
}
