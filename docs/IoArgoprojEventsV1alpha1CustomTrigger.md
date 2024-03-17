
# IoArgoprojEventsV1alpha1CustomTrigger

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**certSecret** | [**IoK8sApiCoreV1SecretKeySelector**](IoK8sApiCoreV1SecretKeySelector.md) | CertSecret refers to the secret that contains cert for secure connection between sensor and custom trigger gRPC server. |  [optional]
**parameters** | [**List&lt;IoArgoprojEventsV1alpha1TriggerParameter&gt;**](IoArgoprojEventsV1alpha1TriggerParameter.md) | Parameters is the list of parameters that is applied to resolved custom trigger trigger object. |  [optional]
**payload** | [**List&lt;IoArgoprojEventsV1alpha1TriggerParameter&gt;**](IoArgoprojEventsV1alpha1TriggerParameter.md) | Payload is the list of key-value extracted from an event payload to construct the request payload. |  [optional]
**secure** | **Boolean** |  |  [optional]
**serverNameOverride** | **String** | ServerNameOverride for the secure connection between sensor and custom trigger gRPC server. |  [optional]
**serverURL** | **String** |  |  [optional]
**spec** | **Map&lt;String, String&gt;** | Spec is the custom trigger resource specification that custom trigger gRPC server knows how to interpret. |  [optional]



