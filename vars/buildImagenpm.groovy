def myappMethod(){
    myapp = docker.build("${DOCKER_ID}/nodejs-test:${env.BUILD_ID}")
}
