/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Pair;

import org.openapitools.client.model.User;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.function.Consumer;

import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.List;
import java.util.Map;



public class UserApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;

  public UserApi() {
    this(new ApiClient());
  }

  public UserApi(ApiClient apiClient) {
    memberVarHttpClient = apiClient.getHttpClient();
    memberVarObjectMapper = apiClient.getObjectMapper();
    memberVarBaseUri = apiClient.getBaseUri();
    memberVarInterceptor = apiClient.getRequestInterceptor();
    memberVarReadTimeout = apiClient.getReadTimeout();
  }

  /**
   * Create user
   * This can only be done by the logged in user.
   * @param body Created user object (required)
   * @throws ApiException if fails to make API call
   */
  public void createUser (User body) throws ApiException {
    // verify the required parameter 'body' is set
    if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling createUser");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/user";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(body);
      localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
      localVarRequestBuilder.build(),
      HttpResponse.BodyHandlers.ofInputStream());
      if (localVarResponse.statusCode()/ 100 != 2) {
          throw new ApiException(localVarResponse.statusCode(),
              "createUser call received non-success response",
              localVarResponse.headers(),
              localVarResponse.body() == null ? null : new String(localVarResponse.body().readAllBytes()));
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }
  /**
   * Creates list of users with given input array
   * 
   * @param body List of user object (required)
   * @throws ApiException if fails to make API call
   */
  public void createUsersWithArrayInput (List<User> body) throws ApiException {
    // verify the required parameter 'body' is set
    if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling createUsersWithArrayInput");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/user/createWithArray";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(body);
      localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
      localVarRequestBuilder.build(),
      HttpResponse.BodyHandlers.ofInputStream());
      if (localVarResponse.statusCode()/ 100 != 2) {
          throw new ApiException(localVarResponse.statusCode(),
              "createUsersWithArrayInput call received non-success response",
              localVarResponse.headers(),
              localVarResponse.body() == null ? null : new String(localVarResponse.body().readAllBytes()));
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }
  /**
   * Creates list of users with given input array
   * 
   * @param body List of user object (required)
   * @throws ApiException if fails to make API call
   */
  public void createUsersWithListInput (List<User> body) throws ApiException {
    // verify the required parameter 'body' is set
    if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling createUsersWithListInput");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/user/createWithList";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(body);
      localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
      localVarRequestBuilder.build(),
      HttpResponse.BodyHandlers.ofInputStream());
      if (localVarResponse.statusCode()/ 100 != 2) {
          throw new ApiException(localVarResponse.statusCode(),
              "createUsersWithListInput call received non-success response",
              localVarResponse.headers(),
              localVarResponse.body() == null ? null : new String(localVarResponse.body().readAllBytes()));
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }
  /**
   * Delete user
   * This can only be done by the logged in user.
   * @param username The name that needs to be deleted (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteUser (String username) throws ApiException {
    // verify the required parameter 'username' is set
    if (username == null) {
        throw new ApiException(400, "Missing the required parameter 'username' when calling deleteUser");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/user/{username}"
        .replace("{username}", ApiClient.urlEncode(username.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

    try {
      localVarRequestBuilder.method("DELETE", HttpRequest.BodyPublishers.noBody());
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
      localVarRequestBuilder.build(),
      HttpResponse.BodyHandlers.ofInputStream());
      if (localVarResponse.statusCode()/ 100 != 2) {
          throw new ApiException(localVarResponse.statusCode(),
              "deleteUser call received non-success response",
              localVarResponse.headers(),
              localVarResponse.body() == null ? null : new String(localVarResponse.body().readAllBytes()));
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }
  /**
   * Get user by user name
   * 
   * @param username The name that needs to be fetched. Use user1 for testing. (required)
   * @return User
   * @throws ApiException if fails to make API call
   */
  public User getUserByName (String username) throws ApiException {
    // verify the required parameter 'username' is set
    if (username == null) {
        throw new ApiException(400, "Missing the required parameter 'username' when calling getUserByName");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/user/{username}"
        .replace("{username}", ApiClient.urlEncode(username.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

    try {
      localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
      localVarRequestBuilder.build(),
      HttpResponse.BodyHandlers.ofInputStream());
      if (localVarResponse.statusCode()/ 100 != 2) {
          throw new ApiException(localVarResponse.statusCode(),
              "getUserByName call received non-success response",
              localVarResponse.headers(),
              localVarResponse.body() == null ? null : new String(localVarResponse.body().readAllBytes()));
      }
      return memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<User>() {});
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }
  /**
   * Logs user into the system
   * 
   * @param username The user name for login (required)
   * @param password The password for login in clear text (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String loginUser (String username, String password) throws ApiException {
    // verify the required parameter 'username' is set
    if (username == null) {
        throw new ApiException(400, "Missing the required parameter 'username' when calling loginUser");
    }
    // verify the required parameter 'password' is set
    if (password == null) {
        throw new ApiException(400, "Missing the required parameter 'password' when calling loginUser");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/user/login";

    List<Pair> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(ApiClient.parameterToPairs("username", username));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("password", password));

    if (!localVarQueryParams.isEmpty()) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Accept", "application/json");

    try {
      localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
      localVarRequestBuilder.build(),
      HttpResponse.BodyHandlers.ofInputStream());
      if (localVarResponse.statusCode()/ 100 != 2) {
          throw new ApiException(localVarResponse.statusCode(),
              "loginUser call received non-success response",
              localVarResponse.headers(),
              localVarResponse.body() == null ? null : new String(localVarResponse.body().readAllBytes()));
      }
      return memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<String>() {});
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }
  /**
   * Logs out current logged in user session
   * 
   * @throws ApiException if fails to make API call
   */
  public void logoutUser () throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/user/logout";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

    try {
      localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
      localVarRequestBuilder.build(),
      HttpResponse.BodyHandlers.ofInputStream());
      if (localVarResponse.statusCode()/ 100 != 2) {
          throw new ApiException(localVarResponse.statusCode(),
              "logoutUser call received non-success response",
              localVarResponse.headers(),
              localVarResponse.body() == null ? null : new String(localVarResponse.body().readAllBytes()));
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }
  /**
   * Updated user
   * This can only be done by the logged in user.
   * @param username name that need to be deleted (required)
   * @param body Updated user object (required)
   * @throws ApiException if fails to make API call
   */
  public void updateUser (String username, User body) throws ApiException {
    // verify the required parameter 'username' is set
    if (username == null) {
        throw new ApiException(400, "Missing the required parameter 'username' when calling updateUser");
    }
    // verify the required parameter 'body' is set
    if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling updateUser");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/user/{username}"
        .replace("{username}", ApiClient.urlEncode(username.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(body);
      localVarRequestBuilder.method("PUT", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
      localVarRequestBuilder.build(),
      HttpResponse.BodyHandlers.ofInputStream());
      if (localVarResponse.statusCode()/ 100 != 2) {
          throw new ApiException(localVarResponse.statusCode(),
              "updateUser call received non-success response",
              localVarResponse.headers(),
              localVarResponse.body() == null ? null : new String(localVarResponse.body().readAllBytes()));
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }
}
