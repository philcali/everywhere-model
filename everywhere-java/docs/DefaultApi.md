# DefaultApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getItenerary**](DefaultApi.md#getItenerary) | **GET** /iteneraries/{iteneraryId} | 
[**listIteneraries**](DefaultApi.md#listIteneraries) | **GET** /iteneraries | 


<a name="getItenerary"></a>
# **getItenerary**
> InlineResponse2001 getItenerary(iteneraryId)



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
      InlineResponse2001 result = apiInstance.getItenerary(iteneraryId);
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

[**InlineResponse2001**](InlineResponse2001.md)

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

