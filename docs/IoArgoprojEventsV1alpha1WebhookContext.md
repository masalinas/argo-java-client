
# IoArgoprojEventsV1alpha1WebhookContext

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authSecret** | [**IoK8sApiCoreV1SecretKeySelector**](IoK8sApiCoreV1SecretKeySelector.md) |  |  [optional]
**endpoint** | **String** |  |  [optional]
**maxPayloadSize** | **String** |  |  [optional]
**metadata** | **Map&lt;String, String&gt;** |  |  [optional]
**method** | **String** |  |  [optional]
**port** | **String** | Port on which HTTP server is listening for incoming events. |  [optional]
**serverCertSecret** | [**IoK8sApiCoreV1SecretKeySelector**](IoK8sApiCoreV1SecretKeySelector.md) | ServerCertPath refers the file that contains the cert. |  [optional]
**serverKeySecret** | [**IoK8sApiCoreV1SecretKeySelector**](IoK8sApiCoreV1SecretKeySelector.md) |  |  [optional]
**url** | **String** | URL is the url of the server. |  [optional]



