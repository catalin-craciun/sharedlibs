def call(){
  script{
    sh 'aws cloudformation create-stack --stack-name EC2Jenkins --template-url s3://test-bucket-10112021/deployEC2.yml'
  }
}

