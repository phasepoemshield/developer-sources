package ru.ocz.protection.runtime;

import java.nio.ByteBuffer;
import ru.ocz.protection.runtime.bridge.NativeBridge;
import ru.ocz.protection.runtime.context.RuntimeContext;
import ru.ocz.protection.runtime.endpoints.HttpEndpoints;
import ru.ocz.protection.runtime.handshake.HandshakeService;
import ru.ocz.protection.runtime.transport.HttpTransport;
import ru.ocz.protection.runtime.util.Step;
import ru.ocz.protection.runtime.verify.VerifyService;

public final class Protection {
    private static volatile boolean initialized;

    public static native void initialize(ByteBuffer var0);

    public static native ByteBuffer createAllocate(int var0);

    public static native void fillRequestBuffer(ByteBuffer var0);

    public static native void verify(long var0);

    public static native long getVerifyToken();

    public static native void initCustomVm(ByteBuffer var0, byte[] var1);

    public static native long generateRuntimeKey(long var0, byte[] var2);

    public static synchronized void interceptMain() {
        if (initialized) {
            return;
        }
        RuntimeContext c2 = RuntimeContext.create();
        Step.step("buffer allocated");
        HandshakeService.perform(c2);
        Step.step("handshake completed");
        NativeBridge.initialize(c2.buffer());
        byte[] vm = Step.step("native initialized");
        NativeBridge.initCustomVm(c2.buffer(), vm);
        long key = NativeBridge.generateRuntimeKey(System.nanoTime() ^ Thread.currentThread().getId(), vm);
        byte[] vt = Step.step("vm initialized");
        VerifyService.performVerify(key, vt);
        Step.step("verify completed");
        initialized = true;
    }

    public static byte[] makeByteArrayHttpRequest(String u2, byte[] d2) {
        return HttpTransport.post(u2, d2);
    }

    public static String createHttpLocation(String e2) {
        return HttpEndpoints.create(e2);
    }
}