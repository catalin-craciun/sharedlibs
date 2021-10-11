def call(){
  script{
    sh 'aws configure set region us-east-1'
    sh 'aws cloudformation create-stack --stack-name EC2Jenkins --template-url https://test-bucket-10112021.s3.amazonaws.com/deployEC2.yml'
  }
}

