
# IoArgoprojEventsV1alpha1SlackTrigger

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**channel** | **String** |  |  [optional]
**message** | **String** |  |  [optional]
**parameters** | [**List&lt;IoArgoprojEventsV1alpha1TriggerParameter&gt;**](IoArgoprojEventsV1alpha1TriggerParameter.md) |  |  [optional]
**slackToken** | [**IoK8sApiCoreV1SecretKeySelector**](IoK8sApiCoreV1SecretKeySelector.md) | SlackToken refers to the Kubernetes secret that holds the slack token required to send messages. |  [optional]



