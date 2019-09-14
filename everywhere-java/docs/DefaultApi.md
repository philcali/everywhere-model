# DefaultApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createItenerary**](DefaultApi.md#createItenerary) | **POST** /iteneraries | 
[**createIteneraryItem**](DefaultApi.md#createIteneraryItem) | **POST** /iteneraries/{iteneraryId}/items | 
[**deleteItenerary**](DefaultApi.md#deleteItenerary) | **DELETE** /iteneraries/{iteneraryId} | 
[**deleteIteneraryItem**](DefaultApi.md#deleteIteneraryItem) | **DELETE** /iteneraries/{iteneraryId}/items/{itemId} | 
[**getItenerary**](DefaultApi.md#getItenerary) | **GET** /iteneraries/{iteneraryId} | 
[**getIteneraryItem**](DefaultApi.md#getIteneraryItem) | **GET** /iteneraries/{iteneraryId}/items/{itemId} | 
[**listIteneraries**](DefaultApi.md#listIteneraries) | **GET** /iteneraries | 
[**listIteneraryItems**](DefaultApi.md#listIteneraryItems) | **GET** /iteneraries/{iteneraryId}/items | 
[**updateItenerary**](DefaultApi.md#updateItenerary) | **PUT** /iteneraries/{iteneraryId} | 
[**updateIteneraryItem**](DefaultApi.md#updateIteneraryItem) | **PUT** /iteneraries/{iteneraryId}/items/{itemId} | 


<a name="createItenerary"></a>
# **createItenerary**
> InlineResponse2001 createItenerary(inlineObject)



### Example
```java
// Import classes:
import pro.travelin.invoker.ApiClient;
import pro.travelin.invoker.ApiException;
import pro.travelin.invoker.Configuration;
import pro.travelin.invoker.models.*;
import pro.travelin.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    InlineObject inlineObject = new InlineObject(); // InlineObject | 
    try {
      InlineResponse2001 result = apiInstance.createItenerary(inlineObject);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#createItenerary");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inlineObject** | [**InlineObject**](InlineObject.md)|  | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | CreateItenerary 200 response |  -  |
**400** | InvalidInput 400 response |  -  |
**409** | ResourceInUse 409 response |  -  |

<a name="createIteneraryItem"></a>
# **createIteneraryItem**
> InlineResponse2005 createIteneraryItem(iteneraryId, inlineObject2)



### Example
```java
// Import classes:
import pro.travelin.invoker.ApiClient;
import pro.travelin.invoker.ApiException;
import pro.travelin.invoker.Configuration;
import pro.travelin.invoker.models.*;
import pro.travelin.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String iteneraryId = "iteneraryId_example"; // String | 
    InlineObject2 inlineObject2 = new InlineObject2(); // InlineObject2 | 
    try {
      InlineResponse2005 result = apiInstance.createIteneraryItem(iteneraryId, inlineObject2);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#createIteneraryItem");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **iteneraryId** | **String**|  |
 **inlineObject2** | [**InlineObject2**](InlineObject2.md)|  | [optional]

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | CreateIteneraryItem 200 response |  -  |
**400** | InvalidInput 400 response |  -  |
**409** | ResourceInUse 409 response |  -  |

<a name="deleteItenerary"></a>
# **deleteItenerary**
> deleteItenerary(iteneraryId)



### Example
```java
// Import classes:
import pro.travelin.invoker.ApiClient;
import pro.travelin.invoker.ApiException;
import pro.travelin.invoker.Configuration;
import pro.travelin.invoker.models.*;
import pro.travelin.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String iteneraryId = "iteneraryId_example"; // String | 
    try {
      apiInstance.deleteItenerary(iteneraryId);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#deleteItenerary");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **iteneraryId** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | DeleteItenerary response |  -  |

<a name="deleteIteneraryItem"></a>
# **deleteIteneraryItem**
> deleteIteneraryItem(iteneraryId, itemId)



### Example
```java
// Import classes:
import pro.travelin.invoker.ApiClient;
import pro.travelin.invoker.ApiException;
import pro.travelin.invoker.Configuration;
import pro.travelin.invoker.models.*;
import pro.travelin.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String iteneraryId = "iteneraryId_example"; // String | 
    String itemId = "itemId_example"; // String | 
    try {
      apiInstance.deleteIteneraryItem(iteneraryId, itemId);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#deleteIteneraryItem");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **iteneraryId** | **String**|  |
 **itemId** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | DeleteIteneraryItem response |  -  |

<a name="getItenerary"></a>
# **getItenerary**
> InlineResponse2002 getItenerary(iteneraryId)



### Example
```java
// Import classes:
import pro.travelin.invoker.ApiClient;
import pro.travelin.invoker.ApiException;
import pro.travelin.invoker.Configuration;
import pro.travelin.invoker.models.*;
import pro.travelin.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String iteneraryId = "iteneraryId_example"; // String | 
    try {
      InlineResponse2002 result = apiInstance.getItenerary(iteneraryId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getItenerary");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **iteneraryId** | **String**|  |

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | GetItenerary 200 response |  -  |
**404** | NoSuchResource 404 response |  -  |

<a name="getIteneraryItem"></a>
# **getIteneraryItem**
> InlineResponse2006 getIteneraryItem(itemId, iteneraryId)



### Example
```java
// Import classes:
import pro.travelin.invoker.ApiClient;
import pro.travelin.invoker.ApiException;
import pro.travelin.invoker.Configuration;
import pro.travelin.invoker.models.*;
import pro.travelin.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String itemId = "itemId_example"; // String | 
    String iteneraryId = "iteneraryId_example"; // String | 
    try {
      InlineResponse2006 result = apiInstance.getIteneraryItem(itemId, iteneraryId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getIteneraryItem");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemId** | **String**|  |
 **iteneraryId** | **String**|  |

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | GetIteneraryItem 200 response |  -  |
**404** | NoSuchResource 404 response |  -  |

<a name="listIteneraries"></a>
# **listIteneraries**
> InlineResponse200 listIteneraries(limit, nextToken)



### Example
```java
// Import classes:
import pro.travelin.invoker.ApiClient;
import pro.travelin.invoker.ApiException;
import pro.travelin.invoker.Configuration;
import pro.travelin.invoker.models.*;
import pro.travelin.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    BigDecimal limit = new BigDecimal(); // BigDecimal | 
    String nextToken = "nextToken_example"; // String | 
    try {
      InlineResponse200 result = apiInstance.listIteneraries(limit, nextToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#listIteneraries");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **BigDecimal**|  | [optional]
 **nextToken** | **String**|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | ListIteneraries 200 response |  -  |

<a name="listIteneraryItems"></a>
# **listIteneraryItems**
> InlineResponse2004 listIteneraryItems(iteneraryId, limit, nextToken)



### Example
```java
// Import classes:
import pro.travelin.invoker.ApiClient;
import pro.travelin.invoker.ApiException;
import pro.travelin.invoker.Configuration;
import pro.travelin.invoker.models.*;
import pro.travelin.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String iteneraryId = "iteneraryId_example"; // String | 
    BigDecimal limit = new BigDecimal(); // BigDecimal | 
    String nextToken = "nextToken_example"; // String | 
    try {
      InlineResponse2004 result = apiInstance.listIteneraryItems(iteneraryId, limit, nextToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#listIteneraryItems");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **iteneraryId** | **String**|  |
 **limit** | **BigDecimal**|  | [optional]
 **nextToken** | **String**|  | [optional]

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | ListIteneraryItems 200 response |  -  |

<a name="updateItenerary"></a>
# **updateItenerary**
> InlineResponse2003 updateItenerary(iteneraryId, inlineObject1)



### Example
```java
// Import classes:
import pro.travelin.invoker.ApiClient;
import pro.travelin.invoker.ApiException;
import pro.travelin.invoker.Configuration;
import pro.travelin.invoker.models.*;
import pro.travelin.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String iteneraryId = "iteneraryId_example"; // String | 
    InlineObject1 inlineObject1 = new InlineObject1(); // InlineObject1 | 
    try {
      InlineResponse2003 result = apiInstance.updateItenerary(iteneraryId, inlineObject1);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#updateItenerary");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **iteneraryId** | **String**|  |
 **inlineObject1** | [**InlineObject1**](InlineObject1.md)|  | [optional]

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | UpdateItenerary 200 response |  -  |
**400** | InvalidInput 400 response |  -  |
**404** | NoSuchResource 404 response |  -  |

<a name="updateIteneraryItem"></a>
# **updateIteneraryItem**
> InlineResponse2007 updateIteneraryItem(iteneraryId, itemId, inlineObject3)



### Example
```java
// Import classes:
import pro.travelin.invoker.ApiClient;
import pro.travelin.invoker.ApiException;
import pro.travelin.invoker.Configuration;
import pro.travelin.invoker.models.*;
import pro.travelin.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String iteneraryId = "iteneraryId_example"; // String | 
    String itemId = "itemId_example"; // String | 
    InlineObject3 inlineObject3 = new InlineObject3(); // InlineObject3 | 
    try {
      InlineResponse2007 result = apiInstance.updateIteneraryItem(iteneraryId, itemId, inlineObject3);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#updateIteneraryItem");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **iteneraryId** | **String**|  |
 **itemId** | **String**|  |
 **inlineObject3** | [**InlineObject3**](InlineObject3.md)|  | [optional]

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | UpdateIteneraryItem 200 response |  -  |
**400** | InvalidInput 400 response |  -  |
**404** | NoSuchResource 404 response |  -  |

