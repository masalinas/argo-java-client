
# IoArgoprojWorkflowV1alpha1Backoff

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**duration** | **String** | Duration is the amount to back off. Default unit is seconds, but could also be a duration (e.g. \&quot;2m\&quot;, \&quot;1h\&quot;) |  [optional]
**factor** | **String** | Factor is a factor to multiply the base duration after each failed retry |  [optional]
**maxDuration** | **String** | MaxDuration is the maximum amount of time allowed for a workflow in the backoff strategy |  [optional]



