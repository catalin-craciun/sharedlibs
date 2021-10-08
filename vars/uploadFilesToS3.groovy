def call(Map stageParams = [Region: "us-east-1", s3Bucket: "test-bucket-10082021", s3Path: "/"]) {
    withAWS(region: stageParams.awsRegion, credentials:'cloud_user') {
        awsIdentity()
        s3Upload( 
            includePathPattern: "**/*",
            bucket: stageParams.s3Bucket,
            path: stageParams.s3Path
        )
    }
}
