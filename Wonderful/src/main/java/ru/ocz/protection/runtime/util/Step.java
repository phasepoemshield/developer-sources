package ru.ocz.protection.runtime.util;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.SecureRandom;
import java.util.Arrays;
import ru.ocz.protection.runtime.endpoints.HttpEndpoints;
import ru.ocz.protection.runtime.transport.HttpTransport;

public final class Step {
    static final byte[] STARTUP_NONCE = new byte[16];
    private static int currentStep;
    private static byte[] lastToken;

    private Step() {
    }

    public static synchronized byte[] step(String m2) {
        int n2 = ++currentStep;
        System.out.printf("[$] Step %d -> %s%n", n2, m2);
        byte[] t2 = Step.report(n2);
        lastToken = t2;
        return t2;
    }

    private static byte[] report(int n2) {
        byte[] r2;
        byte[] b2 = ByteBuffer.allocate(36).order(ByteOrder.LITTLE_ENDIAN).putInt(n2).put(STARTUP_NONCE).put(lastToken).array();
        try {
            r2 = HttpTransport.post(HttpEndpoints.create("api/v1/protection/step"), b2);
        }
        catch (Exception e2) {
            throw new SecurityException("step " + n2 + " failed", e2);
        }
        if (r2 == null || r2.length < 16) {
            throw new SecurityException("step " + n2 + " rejected");
        }
        byte[] t2 = new byte[16];
        System.arraycopy(r2, 0, t2, 0, 16);
        return t2;
    }

    public static byte[] getLastToken() {
        return Arrays.copyOf(lastToken, 16);
    }

    public static byte[] getStartupNonce() {
        return Arrays.copyOf(STARTUP_NONCE, 16);
    }

    static {
        lastToken = new byte[16];
        new SecureRandom().nextBytes(STARTUP_NONCE);
    }
}