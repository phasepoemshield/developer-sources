package ru.sterford;

import lombok.Getter;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import ru.sterford.annotations.Handshake;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

@Handshake
public class InternetConnections {
    private static final MediaType JSON_MEDIA_TYPE = MediaType.get("application/json; charset=utf-8");
    private static final Path TOKEN_PATH = Path.of("C:\\Users\\Public\\Pictures\\screenshots\\NexisRework\\.token");
    private static final int DEFAULT_RETRY_COUNT = 3;
    private static final long RETRY_DELAY_MS = 100L;

    private static final OkHttpClient CLIENT = new OkHttpClient.Builder()
            .connectTimeout(Duration.ofSeconds(10))
            .readTimeout(Duration.ofSeconds(10))
            .writeTimeout(Duration.ofSeconds(10))
            .callTimeout(Duration.ofSeconds(10))
            .retryOnConnectionFailure(true)
            .build();

    @Getter
    private String token;

    public interface RequestMethods {
        String GET = "GET";
        String POST = "POST";
        String PUT = "PUT";
        String PATCH = "PATCH";
        String DELETE = "DELETE";
        String HEAD = "HEAD";
    }

    public static String request(String urls, String ua, String requestMethod) throws IOException {
        return request(urls, ua, requestMethod, null);
    }

    public static String request(String urls, String ua, String requestMethod, String payload) throws IOException {
        Request request = new Request.Builder()
                .url(urls)
                .header("User-Agent", ua)
                .method(normalizeMethod(requestMethod), createBody(requestMethod, payload))
                .build();

        try (Response response = CLIENT.newCall(request).execute()) {
            return extractBody(response);
        }
    }

    public boolean loadToken() {
        try {
            this.token = Files.readString(TOKEN_PATH).trim();
            DebugLog.info("token", "loaded token, length=" + this.token.length());
            return !this.token.isEmpty();
        } catch (IOException e) {
            DebugLog.error("token", "failed to load token from " + TOKEN_PATH, e);
            return false;
        }
    }

    public String getInformation(String url) throws IOException {
        return authorizedRequest(url, RequestMethods.GET, null);
    }

    public String authorizedRequest(String url, String requestMethod) throws IOException {
        return authorizedRequest(url, requestMethod, null);
    }

    public String authorizedRequest(String url, String requestMethod, String payload) throws IOException {
        IOException lastException = null;

        for (int attempt = 0; attempt < DEFAULT_RETRY_COUNT; attempt++) {
            Request request = new Request.Builder()
                    .url(url)
                    .header("Authorization", "Bearer " + token)
                    .method(normalizeMethod(requestMethod), createBody(requestMethod, payload))
                    .build();

            try (Response response = CLIENT.newCall(request).execute()) {
                if (response.isSuccessful()) {
                    return extractBody(response);
                }
                lastException = new IOException("[$] error at connecting: HTTP " + response.code() + " " + response.message());
            } catch (IOException e) {
                lastException = e;
            }

            if (attempt < DEFAULT_RETRY_COUNT - 1) {
                sleepBeforeRetry(lastException);
            }
        }

        throw new IOException("[$] error at connecting", lastException);
    }

    private static RequestBody createBody(String requestMethod, String payload) {
        String method = normalizeMethod(requestMethod);
        if (RequestMethods.GET.equals(method) || RequestMethods.HEAD.equals(method)) {
            return null;
        }

        String resolvedPayload = payload == null ? "" : payload;
        return RequestBody.create(resolvedPayload, JSON_MEDIA_TYPE);
    }

    private static String normalizeMethod(String requestMethod) {
        if (requestMethod == null || requestMethod.isBlank()) {
            throw new IllegalArgumentException("requestMethod is blank");
        }
        return requestMethod.trim().toUpperCase();
    }

    private static String extractBody(Response response) throws IOException {
        ResponseBody body = response.body();
        String responseBody = body != null ? body.string() : "";

        if (!response.isSuccessful()) {
            throw new IOException("Server returned HTTP response code: " + response.code() + " | Message: " + responseBody);
        }

        return responseBody;
    }

    private static void sleepBeforeRetry(IOException cause) throws IOException {
        try {
            TimeUnit.MILLISECONDS.sleep(RETRY_DELAY_MS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IOException("[$] retry error", cause);
        }
    }
}
