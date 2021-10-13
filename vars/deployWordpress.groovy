def call(Map stageParams = [awsRegion: "us-east-1"]){
  withAWS(region: stageParams.awsRegion, credentials:"${AWS_CRED}") {
        //awsIdentity()
        cfnCreateChangeSet(
          stack:'Wordpress', 
          changeSet:'my-change-set', 
          url:'https://testbucket-catalinc-13102021.s3.amazonaws.com/deployWordpress.yml'
        )
        cfnExecuteChangeSet(
          stack:'Worspress', 
          changeSet:'my-change-set'
        )
  }
}
