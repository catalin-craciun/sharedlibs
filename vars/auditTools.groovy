def call(){
    sh '''
        git version
        docker version
        python3 --version
        echo $HOSTNAME
    '''
}
