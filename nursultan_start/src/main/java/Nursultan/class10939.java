/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 *  org.lwjgl.stb.STBIWriteCallback
 */
package Nursultan;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import org.jspecify.annotations.Nullable;
import org.lwjgl.stb.STBIWriteCallback;

public class class10939
extends STBIWriteCallback {
    private final WritableByteChannel N;
    private @Nullable IOException y;

    public void invoke(long l, long l2, int n) {
        ByteBuffer byteBuffer = class10939.getData((long)l2, (int)n);
        try {
            this.N.write(byteBuffer);
        }
        catch (IOException iOException) {
            this.y = iOException;
        }
    }

    public class10939(WritableByteChannel writableByteChannel) {
        this.N = writableByteChannel;
    }

    public void N() throws IOException {
        if (this.y != null) {
            throw this.y;
        }
    }
}

