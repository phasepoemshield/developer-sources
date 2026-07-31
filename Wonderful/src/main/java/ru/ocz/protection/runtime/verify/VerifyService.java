package ru.ocz.protection.runtime.verify;

import ru.ocz.protection.runtime.bridge.NativeBridge;

public final class VerifyService {
    private VerifyService() {
    }

    public static void performVerify(long k2, byte[] t2) {
        long mix = 0L;
        for (int i2 = 0; i2 < Math.min(8, t2.length); ++i2) {
            mix |= (long)(t2[i2] & 0xFF) << i2 * 8;
        }
        long n2 = NativeBridge.getVerifyToken() ^ k2 ^ mix;
        NativeBridge.verify(n2);
    }
}