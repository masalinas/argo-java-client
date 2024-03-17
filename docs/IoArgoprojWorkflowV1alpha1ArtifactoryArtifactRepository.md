
# IoArgoprojWorkflowV1alpha1ArtifactoryArtifactRepository

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**keyFormat** | **String** | KeyFormat defines the format of how to store keys and can reference workflow variables. |  [optional]
**passwordSecret** | [**IoK8sApiCoreV1SecretKeySelector**](IoK8sApiCoreV1SecretKeySelector.md) | PasswordSecret is the secret selector to the repository password |  [optional]
**repoURL** | **String** | RepoURL is the url for artifactory repo. |  [optional]
**usernameSecret** | [**IoK8sApiCoreV1SecretKeySelector**](IoK8sApiCoreV1SecretKeySelector.md) | UsernameSecret is the secret selector to the repository username |  [optional]



