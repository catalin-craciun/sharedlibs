def call(Map stageParams) {
    withAWS(region: stageParams.awsRegion, credentials:'AWS_Lambda') {
        awsIdentity()
        s3Upload( 
            workingDir: "build",
            includePathPattern: "**/*",
            bucket: stageParams.s3Bucket,
            path: stageParams.s3Path
        )
    }
}
