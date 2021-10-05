def call() {
 script {
   docker.withRegistry('https://registry.hub.docker.com', 'dockerhub') {
    println myapp
    //myapp.push("latest")
    //myapp.push("${env.BUILD_ID}")
   } 
 }
}
