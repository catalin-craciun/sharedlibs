def call(){
    sh '''
        git version
        python3 --version
        echo $HOSTNAME
        service docker status
    '''
}
