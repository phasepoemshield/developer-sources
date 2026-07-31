package ru.ocz.protection.runtime.transport;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public final class HttpTransport {
    private static final HttpClient C = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(15L)).build();

    public static byte[] post(String u2, byte[] d2) {
        try {
            HttpRequest r2 = HttpRequest.newBuilder().uri(new URI(u2)).timeout(Duration.ofSeconds(30L)).POST(HttpRequest.BodyPublishers.ofByteArray(d2)).build();
            return C.send(r2, HttpResponse.BodyHandlers.ofByteArray()).body();
        }
        catch (Exception e2) {
            throw new RuntimeException("http fail", e2);
        }
    }
}