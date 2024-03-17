
# IoArgoprojWorkflowV1alpha1OSSArtifactRepository

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessKeySecret** | [**IoK8sApiCoreV1SecretKeySelector**](IoK8sApiCoreV1SecretKeySelector.md) | AccessKeySecret is the secret selector to the bucket&#39;s access key |  [optional]
**bucket** | **String** | Bucket is the name of the bucket |  [optional]
**createBucketIfNotPresent** | **Boolean** | CreateBucketIfNotPresent tells the driver to attempt to create the OSS bucket for output artifacts, if it doesn&#39;t exist |  [optional]
**endpoint** | **String** | Endpoint is the hostname of the bucket endpoint |  [optional]
**keyFormat** | **String** | KeyFormat defines the format of how to store keys and can reference workflow variables. |  [optional]
**lifecycleRule** | [**IoArgoprojWorkflowV1alpha1OSSLifecycleRule**](IoArgoprojWorkflowV1alpha1OSSLifecycleRule.md) | LifecycleRule specifies how to manage bucket&#39;s lifecycle |  [optional]
**secretKeySecret** | [**IoK8sApiCoreV1SecretKeySelector**](IoK8sApiCoreV1SecretKeySelector.md) | SecretKeySecret is the secret selector to the bucket&#39;s secret key |  [optional]
**securityToken** | **String** | SecurityToken is the user&#39;s temporary security token. For more details, check out: https://www.alibabacloud.com/help/doc-detail/100624.htm |  [optional]
**useSDKCreds** | **Boolean** | UseSDKCreds tells the driver to figure out credentials based on sdk defaults. |  [optional]



