
# IoArgoprojEventsV1alpha1HDFSEventSource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addresses** | **List&lt;String&gt;** |  |  [optional]
**checkInterval** | **String** |  |  [optional]
**filter** | [**IoArgoprojEventsV1alpha1EventSourceFilter**](IoArgoprojEventsV1alpha1EventSourceFilter.md) |  |  [optional]
**hdfsUser** | **String** | HDFSUser is the user to access HDFS file system. It is ignored if either ccache or keytab is used. |  [optional]
**krbCCacheSecret** | [**IoK8sApiCoreV1SecretKeySelector**](IoK8sApiCoreV1SecretKeySelector.md) | KrbCCacheSecret is the secret selector for Kerberos ccache Either ccache or keytab can be set to use Kerberos. |  [optional]
**krbConfigConfigMap** | [**IoK8sApiCoreV1ConfigMapKeySelector**](IoK8sApiCoreV1ConfigMapKeySelector.md) | KrbConfig is the configmap selector for Kerberos config as string It must be set if either ccache or keytab is used. |  [optional]
**krbKeytabSecret** | [**IoK8sApiCoreV1SecretKeySelector**](IoK8sApiCoreV1SecretKeySelector.md) | KrbKeytabSecret is the secret selector for Kerberos keytab Either ccache or keytab can be set to use Kerberos. |  [optional]
**krbRealm** | **String** | KrbRealm is the Kerberos realm used with Kerberos keytab It must be set if keytab is used. |  [optional]
**krbServicePrincipalName** | **String** | KrbServicePrincipalName is the principal name of Kerberos service It must be set if either ccache or keytab is used. |  [optional]
**krbUsername** | **String** | KrbUsername is the Kerberos username used with Kerberos keytab It must be set if keytab is used. |  [optional]
**metadata** | **Map&lt;String, String&gt;** |  |  [optional]
**type** | **String** |  |  [optional]
**watchPathConfig** | [**IoArgoprojEventsV1alpha1WatchPathConfig**](IoArgoprojEventsV1alpha1WatchPathConfig.md) |  |  [optional]



