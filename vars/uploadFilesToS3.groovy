def call(Map stageParams) {
    withAWS(region: stageParams.awsRegion, credentials:'cloud_user') {
        awsIdentity()
        s3Upload( 
            includePathPattern: "**/*",
            bucket: stageParams.s3Bucket,
            path: stageParams.s3Path
        )
    }
}
