
# IoArgoprojWorkflowV1alpha1GitArtifact

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**branch** | **String** | Branch is the branch to fetch when &#x60;SingleBranch&#x60; is enabled |  [optional]
**depth** | **Integer** | Depth specifies clones/fetches should be shallow and include the given number of commits from the branch tip |  [optional]
**disableSubmodules** | **Boolean** | DisableSubmodules disables submodules during git clone |  [optional]
**fetch** | **List&lt;String&gt;** | Fetch specifies a number of refs that should be fetched before checkout |  [optional]
**insecureIgnoreHostKey** | **Boolean** | InsecureIgnoreHostKey disables SSH strict host key checking during git clone |  [optional]
**passwordSecret** | [**IoK8sApiCoreV1SecretKeySelector**](IoK8sApiCoreV1SecretKeySelector.md) | PasswordSecret is the secret selector to the repository password |  [optional]
**repo** | **String** | Repo is the git repository | 
**revision** | **String** | Revision is the git commit, tag, branch to checkout |  [optional]
**singleBranch** | **Boolean** | SingleBranch enables single branch clone, using the &#x60;branch&#x60; parameter |  [optional]
**sshPrivateKeySecret** | [**IoK8sApiCoreV1SecretKeySelector**](IoK8sApiCoreV1SecretKeySelector.md) | SSHPrivateKeySecret is the secret selector to the repository ssh private key |  [optional]
**usernameSecret** | [**IoK8sApiCoreV1SecretKeySelector**](IoK8sApiCoreV1SecretKeySelector.md) | UsernameSecret is the secret selector to the repository username |  [optional]



