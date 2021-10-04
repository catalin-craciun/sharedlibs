def call(){
    sh '''
        git version
        docker version
        dotnet --list-sdks
        dotnet --list-runtimes
    '''
}
