
# IoArgoprojWorkflowV1alpha1S3ArtifactRepository

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessKeySecret** | [**IoK8sApiCoreV1SecretKeySelector**](IoK8sApiCoreV1SecretKeySelector.md) | AccessKeySecret is the secret selector to the bucket&#39;s access key |  [optional]
**bucket** | **String** | Bucket is the name of the bucket |  [optional]
**caSecret** | [**IoK8sApiCoreV1SecretKeySelector**](IoK8sApiCoreV1SecretKeySelector.md) | CASecret specifies the secret that contains the CA, used to verify the TLS connection |  [optional]
**createBucketIfNotPresent** | [**IoArgoprojWorkflowV1alpha1CreateS3BucketOptions**](IoArgoprojWorkflowV1alpha1CreateS3BucketOptions.md) | CreateBucketIfNotPresent tells the driver to attempt to create the S3 bucket for output artifacts, if it doesn&#39;t exist. Setting Enabled Encryption will apply either SSE-S3 to the bucket if KmsKeyId is not set or SSE-KMS if it is. |  [optional]
**encryptionOptions** | [**IoArgoprojWorkflowV1alpha1S3EncryptionOptions**](IoArgoprojWorkflowV1alpha1S3EncryptionOptions.md) |  |  [optional]
**endpoint** | **String** | Endpoint is the hostname of the bucket endpoint |  [optional]
**insecure** | **Boolean** | Insecure will connect to the service with TLS |  [optional]
**keyFormat** | **String** | KeyFormat defines the format of how to store keys and can reference workflow variables. |  [optional]
**keyPrefix** | **String** | KeyPrefix is prefix used as part of the bucket key in which the controller will store artifacts. DEPRECATED. Use KeyFormat instead |  [optional]
**region** | **String** | Region contains the optional bucket region |  [optional]
**roleARN** | **String** | RoleARN is the Amazon Resource Name (ARN) of the role to assume. |  [optional]
**secretKeySecret** | [**IoK8sApiCoreV1SecretKeySelector**](IoK8sApiCoreV1SecretKeySelector.md) | SecretKeySecret is the secret selector to the bucket&#39;s secret key |  [optional]
**useSDKCreds** | **Boolean** | UseSDKCreds tells the driver to figure out credentials based on sdk defaults. |  [optional]



