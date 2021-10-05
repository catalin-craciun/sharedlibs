def call(app) {
 script {
   docker.withRegistry('https://registry.hub.docker.com', 'dockerhub') {
    ${app}.push("latest")
    ${app}.push("${env.BUILD_ID}")
   } 
 }
}
