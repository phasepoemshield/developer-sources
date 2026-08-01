package ru.ocz.protection.runtime.endpoints;

public final class HttpEndpoints {
    private static final String H = "https://loader.wonderfulclient.ru/";
    public static final String STEP_ENDPOINT = "api/v1/protection/step";
    public static final String HANDSHAKE_ENDPOINT = "api/v1/protection/handshake";

    public static String create(String e2) {
        return H + e2;
    }
}