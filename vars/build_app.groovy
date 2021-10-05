def call(){
    sh '''
        export DOCKERID=catalin088
        chmod 760 /var/run/docker.sock
        docker container run \
        --volume //var/run/docker.sock:/var/run/docker.sock \
        --detach \
        --publish 80:80 \
        --name linux_tweet_app \
        $DOCKERID/linux_tweet_app:2.0
    '''
}
