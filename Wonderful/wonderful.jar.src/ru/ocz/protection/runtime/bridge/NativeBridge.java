package ru.ocz.protection.runtime.bridge;

import java.nio.ByteBuffer;
import ru.ocz.protection.runtime.Protection;
import ru.ocz.protection.runtime.loader.NativeLibraryLoader;

public final class NativeBridge {
    public static void initialize(ByteBuffer b2) {
        Protection.initialize(b2);
    }

    public static ByteBuffer createAllocate(int s2) {
        return Protection.createAllocate(s2);
    }

    public static void fillRequestBuffer(ByteBuffer b2) {
        Protection.fillRequestBuffer(b2);
    }

    public static void initCustomVm(ByteBuffer b2, byte[] t2) {
        Protection.initCustomVm(b2, t2);
    }

    public static long generateRuntimeKey(long s2, byte[] t2) {
        return Protection.generateRuntimeKey(s2, t2);
    }

    public static void verify(long n2) {
        Protection.verify(n2);
    }

    public static long getVerifyToken() {
        return Protection.getVerifyToken();
    }

    static {
        NativeLibraryLoader.load();
    }
}