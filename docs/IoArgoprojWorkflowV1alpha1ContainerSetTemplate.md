
# IoArgoprojWorkflowV1alpha1ContainerSetTemplate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**containers** | [**List&lt;IoArgoprojWorkflowV1alpha1ContainerNode&gt;**](IoArgoprojWorkflowV1alpha1ContainerNode.md) |  | 
**retryStrategy** | [**IoArgoprojWorkflowV1alpha1ContainerSetRetryStrategy**](IoArgoprojWorkflowV1alpha1ContainerSetRetryStrategy.md) | RetryStrategy describes how to retry a container nodes in the container set if it fails. Nbr of retries(default 0) and sleep duration between retries(default 0s, instant retry) can be set. |  [optional]
**volumeMounts** | [**List&lt;IoK8sApiCoreV1VolumeMount&gt;**](IoK8sApiCoreV1VolumeMount.md) |  |  [optional]



