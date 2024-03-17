# InfoServiceApi

All URIs are relative to *http://localhost:2746*

Method | HTTP request | Description
------------- | ------------- | -------------
[**infoServiceCollectEvent**](InfoServiceApi.md#infoServiceCollectEvent) | **POST** /api/v1/tracking/event | 
[**infoServiceGetInfo**](InfoServiceApi.md#infoServiceGetInfo) | **GET** /api/v1/info | 
[**infoServiceGetUserInfo**](InfoServiceApi.md#infoServiceGetUserInfo) | **GET** /api/v1/userinfo | 
[**infoServiceGetVersion**](InfoServiceApi.md#infoServiceGetVersion) | **GET** /api/v1/version | 


<a name="infoServiceCollectEvent"></a>
# **infoServiceCollectEvent**
> IoArgoprojWorkflowV1alpha1CollectEventResponse infoServiceCollectEvent(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.InfoServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

InfoServiceApi apiInstance = new InfoServiceApi();
IoArgoprojWorkflowV1alpha1CollectEventRequest body = new IoArgoprojWorkflowV1alpha1CollectEventRequest(); // IoArgoprojWorkflowV1alpha1CollectEventRequest | 
try {
    IoArgoprojWorkflowV1alpha1CollectEventResponse result = apiInstance.infoServiceCollectEvent(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InfoServiceApi#infoServiceCollectEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IoArgoprojWorkflowV1alpha1CollectEventRequest**](IoArgoprojWorkflowV1alpha1CollectEventRequest.md)|  |

### Return type

[**IoArgoprojWorkflowV1alpha1CollectEventResponse**](IoArgoprojWorkflowV1alpha1CollectEventResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="infoServiceGetInfo"></a>
# **infoServiceGetInfo**
> IoArgoprojWorkflowV1alpha1InfoResponse infoServiceGetInfo()



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.InfoServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

InfoServiceApi apiInstance = new InfoServiceApi();
try {
    IoArgoprojWorkflowV1alpha1InfoResponse result = apiInstance.infoServiceGetInfo();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InfoServiceApi#infoServiceGetInfo");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**IoArgoprojWorkflowV1alpha1InfoResponse**](IoArgoprojWorkflowV1alpha1InfoResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="infoServiceGetUserInfo"></a>
# **infoServiceGetUserInfo**
> IoArgoprojWorkflowV1alpha1GetUserInfoResponse infoServiceGetUserInfo()



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.InfoServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

InfoServiceApi apiInstance = new InfoServiceApi();
try {
    IoArgoprojWorkflowV1alpha1GetUserInfoResponse result = apiInstance.infoServiceGetUserInfo();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InfoServiceApi#infoServiceGetUserInfo");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**IoArgoprojWorkflowV1alpha1GetUserInfoResponse**](IoArgoprojWorkflowV1alpha1GetUserInfoResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="infoServiceGetVersion"></a>
# **infoServiceGetVersion**
> IoArgoprojWorkflowV1alpha1Version infoServiceGetVersion()



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.InfoServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

InfoServiceApi apiInstance = new InfoServiceApi();
try {
    IoArgoprojWorkflowV1alpha1Version result = apiInstance.infoServiceGetVersion();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InfoServiceApi#infoServiceGetVersion");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**IoArgoprojWorkflowV1alpha1Version**](IoArgoprojWorkflowV1alpha1Version.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

