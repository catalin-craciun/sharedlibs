def myappMethod(){
    myapp = docker.build("catalin088/nodejs-test:${env.BUILD_ID}")
}
