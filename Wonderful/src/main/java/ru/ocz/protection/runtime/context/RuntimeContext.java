package ru.ocz.protection.runtime.context;

import java.nio.ByteBuffer;
import ru.ocz.protection.runtime.bridge.NativeBridge;
import ru.ocz.protection.runtime.buffer.BufferUtils;

public record RuntimeContext(ByteBuffer buffer) {
    private static final int S = 0x6400000;

    public static RuntimeContext create() {
        ByteBuffer b2 = NativeBridge.createAllocate(0x6400000);
        BufferUtils.setup(b2);
        NativeBridge.fillRequestBuffer(b2);
        return new RuntimeContext(b2);
    }
}