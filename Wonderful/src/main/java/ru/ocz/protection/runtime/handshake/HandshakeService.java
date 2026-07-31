package ru.ocz.protection.runtime.handshake;

import java.nio.ByteBuffer;
import ru.ocz.protection.runtime.buffer.BufferUtils;
import ru.ocz.protection.runtime.context.RuntimeContext;
import ru.ocz.protection.runtime.endpoints.HttpEndpoints;
import ru.ocz.protection.runtime.transport.HttpTransport;

public final class HandshakeService {
    private static final String E = "api/v1/protection/handshake";

    public static void perform(RuntimeContext c2) {
        ByteBuffer b2 = c2.buffer();
        byte[] r2 = HttpTransport.post(HttpEndpoints.create(E), BufferUtils.toByteArray(b2));
        BufferUtils.replace(b2, r2);
    }
}