def call(){
  script {
    myapp = docker.build("jaganthoutam/nodejs-test:${env.BUILD_ID}")
  }
  return myapp;
}
