def call(){
    sh '''
        git version
        service docker status
        python3 --version
        echo $HOSTNAME
    '''
}
