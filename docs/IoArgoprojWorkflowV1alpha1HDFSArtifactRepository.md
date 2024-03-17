
# IoArgoprojWorkflowV1alpha1HDFSArtifactRepository

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addresses** | **List&lt;String&gt;** | Addresses is accessible addresses of HDFS name nodes |  [optional]
**force** | **Boolean** | Force copies a file forcibly even if it exists |  [optional]
**hdfsUser** | **String** | HDFSUser is the user to access HDFS file system. It is ignored if either ccache or keytab is used. |  [optional]
**krbCCacheSecret** | [**IoK8sApiCoreV1SecretKeySelector**](IoK8sApiCoreV1SecretKeySelector.md) | KrbCCacheSecret is the secret selector for Kerberos ccache Either ccache or keytab can be set to use Kerberos. |  [optional]
**krbConfigConfigMap** | [**IoK8sApiCoreV1ConfigMapKeySelector**](IoK8sApiCoreV1ConfigMapKeySelector.md) | KrbConfig is the configmap selector for Kerberos config as string It must be set if either ccache or keytab is used. |  [optional]
**krbKeytabSecret** | [**IoK8sApiCoreV1SecretKeySelector**](IoK8sApiCoreV1SecretKeySelector.md) | KrbKeytabSecret is the secret selector for Kerberos keytab Either ccache or keytab can be set to use Kerberos. |  [optional]
**krbRealm** | **String** | KrbRealm is the Kerberos realm used with Kerberos keytab It must be set if keytab is used. |  [optional]
**krbServicePrincipalName** | **String** | KrbServicePrincipalName is the principal name of Kerberos service It must be set if either ccache or keytab is used. |  [optional]
**krbUsername** | **String** | KrbUsername is the Kerberos username used with Kerberos keytab It must be set if keytab is used. |  [optional]
**pathFormat** | **String** | PathFormat is defines the format of path to store a file. Can reference workflow variables |  [optional]



