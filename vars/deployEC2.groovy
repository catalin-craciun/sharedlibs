def call(Map stageParams = [awsRegion: "us-east-1"]){
  withAWS(region: stageParams.awsRegion, credentials:"${AWS_CRED}") {
        awsIdentity()
        cfnCreateChangeSet(
          stack:'EC2Jenkins', 
          changeSet:'my-change-set', 
          url:'https://s3.amazonaws.com/my-templates-bucket/template.yaml'
        ) 
  }
}
