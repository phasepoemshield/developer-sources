/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10479
 *  minecraft.class06304
 */
package minecraft;

import Nursultan.class10479;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import javax.sound.sampled.AudioFormat;
import minecraft.class04989;
import minecraft.class06304;

public class class04965
implements class06304 {
    private final class04989 N;
    private class06304 y;
    private final BufferedInputStream L;

    public class04965(class04989 class049892, InputStream inputStream) throws IOException {
        this.N = class049892;
        this.L = new BufferedInputStream(inputStream);
        this.L.mark(Integer.MAX_VALUE);
        this.y = class049892.create((InputStream)new class10479((InputStream)this.L));
    }

    public void close() throws IOException {
        this.y.close();
        this.L.close();
    }

    public AudioFormat N() {
        return this.y.N();
    }

    public ByteBuffer N(int n) throws IOException {
        ByteBuffer byteBuffer = this.y.N(n);
        if (!byteBuffer.hasRemaining()) {
            this.y.close();
            this.L.reset();
            this.y = this.N.create((InputStream)new class10479((InputStream)this.L));
            byteBuffer = this.y.N(n);
        }
        return byteBuffer;
    }
}

