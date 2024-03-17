# ArtifactServiceApi

All URIs are relative to *http://localhost:2746*

Method | HTTP request | Description
------------- | ------------- | -------------
[**artifactServiceGetArtifactFile**](ArtifactServiceApi.md#artifactServiceGetArtifactFile) | **GET** /artifact-files/{namespace}/{idDiscriminator}/{id}/{nodeId}/{artifactDiscriminator}/{artifactName} | Get an artifact.
[**artifactServiceGetInputArtifact**](ArtifactServiceApi.md#artifactServiceGetInputArtifact) | **GET** /input-artifacts/{namespace}/{name}/{nodeId}/{artifactName} | Get an input artifact.
[**artifactServiceGetInputArtifactByUID**](ArtifactServiceApi.md#artifactServiceGetInputArtifactByUID) | **GET** /input-artifacts-by-uid/{uid}/{nodeId}/{artifactName} | Get an input artifact by UID.
[**artifactServiceGetOutputArtifact**](ArtifactServiceApi.md#artifactServiceGetOutputArtifact) | **GET** /artifacts/{namespace}/{name}/{nodeId}/{artifactName} | Get an output artifact.
[**artifactServiceGetOutputArtifactByUID**](ArtifactServiceApi.md#artifactServiceGetOutputArtifactByUID) | **GET** /artifacts-by-uid/{uid}/{nodeId}/{artifactName} | Get an output artifact by UID.


<a name="artifactServiceGetArtifactFile"></a>
# **artifactServiceGetArtifactFile**
> byte[] artifactServiceGetArtifactFile(namespace, idDiscriminator, id, nodeId, artifactName, artifactDiscriminator)

Get an artifact.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ArtifactServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

ArtifactServiceApi apiInstance = new ArtifactServiceApi();
String namespace = "namespace_example"; // String | 
String idDiscriminator = "idDiscriminator_example"; // String | 
String id = "id_example"; // String | 
String nodeId = "nodeId_example"; // String | 
String artifactName = "artifactName_example"; // String | 
String artifactDiscriminator = "artifactDiscriminator_example"; // String | 
try {
    byte[] result = apiInstance.artifactServiceGetArtifactFile(namespace, idDiscriminator, id, nodeId, artifactName, artifactDiscriminator);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArtifactServiceApi#artifactServiceGetArtifactFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **namespace** | **String**|  |
 **idDiscriminator** | **String**|  | [enum: workflow, archived-workflows ]
 **id** | **String**|  |
 **nodeId** | **String**|  |
 **artifactName** | **String**|  |
 **artifactDiscriminator** | **String**|  | [enum: outputs]

### Return type

**byte[]**

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="artifactServiceGetInputArtifact"></a>
# **artifactServiceGetInputArtifact**
> byte[] artifactServiceGetInputArtifact(namespace, name, nodeId, artifactName)

Get an input artifact.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ArtifactServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

ArtifactServiceApi apiInstance = new ArtifactServiceApi();
String namespace = "namespace_example"; // String | 
String name = "name_example"; // String | 
String nodeId = "nodeId_example"; // String | 
String artifactName = "artifactName_example"; // String | 
try {
    byte[] result = apiInstance.artifactServiceGetInputArtifact(namespace, name, nodeId, artifactName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArtifactServiceApi#artifactServiceGetInputArtifact");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **namespace** | **String**|  |
 **name** | **String**|  |
 **nodeId** | **String**|  |
 **artifactName** | **String**|  |

### Return type

**byte[]**

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="artifactServiceGetInputArtifactByUID"></a>
# **artifactServiceGetInputArtifactByUID**
> byte[] artifactServiceGetInputArtifactByUID(uid, nodeId, artifactName)

Get an input artifact by UID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ArtifactServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

ArtifactServiceApi apiInstance = new ArtifactServiceApi();
String uid = "uid_example"; // String | 
String nodeId = "nodeId_example"; // String | 
String artifactName = "artifactName_example"; // String | 
try {
    byte[] result = apiInstance.artifactServiceGetInputArtifactByUID(uid, nodeId, artifactName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArtifactServiceApi#artifactServiceGetInputArtifactByUID");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uid** | **String**|  |
 **nodeId** | **String**|  |
 **artifactName** | **String**|  |

### Return type

**byte[]**

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="artifactServiceGetOutputArtifact"></a>
# **artifactServiceGetOutputArtifact**
> byte[] artifactServiceGetOutputArtifact(namespace, name, nodeId, artifactName)

Get an output artifact.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ArtifactServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

ArtifactServiceApi apiInstance = new ArtifactServiceApi();
String namespace = "namespace_example"; // String | 
String name = "name_example"; // String | 
String nodeId = "nodeId_example"; // String | 
String artifactName = "artifactName_example"; // String | 
try {
    byte[] result = apiInstance.artifactServiceGetOutputArtifact(namespace, name, nodeId, artifactName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArtifactServiceApi#artifactServiceGetOutputArtifact");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **namespace** | **String**|  |
 **name** | **String**|  |
 **nodeId** | **String**|  |
 **artifactName** | **String**|  |

### Return type

**byte[]**

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="artifactServiceGetOutputArtifactByUID"></a>
# **artifactServiceGetOutputArtifactByUID**
> byte[] artifactServiceGetOutputArtifactByUID(uid, nodeId, artifactName)

Get an output artifact by UID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ArtifactServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

ArtifactServiceApi apiInstance = new ArtifactServiceApi();
String uid = "uid_example"; // String | 
String nodeId = "nodeId_example"; // String | 
String artifactName = "artifactName_example"; // String | 
try {
    byte[] result = apiInstance.artifactServiceGetOutputArtifactByUID(uid, nodeId, artifactName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArtifactServiceApi#artifactServiceGetOutputArtifactByUID");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uid** | **String**|  |
 **nodeId** | **String**|  |
 **artifactName** | **String**|  |

### Return type

**byte[]**

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

