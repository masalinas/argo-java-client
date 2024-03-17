
# IoK8sApiCoreV1HTTPGetAction

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**host** | **String** | Host name to connect to, defaults to the pod IP. You probably want to set \&quot;Host\&quot; in httpHeaders instead. |  [optional]
**httpHeaders** | [**List&lt;IoK8sApiCoreV1HTTPHeader&gt;**](IoK8sApiCoreV1HTTPHeader.md) | Custom headers to set in the request. HTTP allows repeated headers. |  [optional]
**path** | **String** | Path to access on the HTTP server. |  [optional]
**port** | **String** | Name or number of the port to access on the container. Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME. | 
**scheme** | [**SchemeEnum**](#SchemeEnum) | Scheme to use for connecting to the host. Defaults to HTTP.  Possible enum values:  - &#x60;\&quot;HTTP\&quot;&#x60; means that the scheme used will be http://  - &#x60;\&quot;HTTPS\&quot;&#x60; means that the scheme used will be https:// |  [optional]


<a name="SchemeEnum"></a>
## Enum: SchemeEnum
Name | Value
---- | -----
HTTP | &quot;HTTP&quot;
HTTPS | &quot;HTTPS&quot;



