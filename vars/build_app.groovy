def call(){
    sh '''
        export DOCKERID=ctalin088
        docker container run \
        --detach \
        --publish 80:80 \
        --name linux_tweet_app \
        $DOCKERID/linux_tweet_app:2.0
    '''
}
