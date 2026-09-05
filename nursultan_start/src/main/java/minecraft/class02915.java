/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.floats.FloatConsumer
 *  minecraft.class06314
 */
package minecraft;

import it.unimi.dsi.fastutil.floats.FloatConsumer;
import java.io.IOException;
import java.nio.ByteBuffer;
import minecraft.class02917;
import minecraft.class06314;

public interface class02915
extends class02917 {
    public static final int N = 8192;

    @Override
    default public ByteBuffer y() throws IOException {
        class06314 class063142 = new class06314(16384);
        while (this.N((FloatConsumer)class063142)) {
        }
        return class063142.N();
    }

    default public ByteBuffer N(int n) throws IOException {
        class06314 class063142 = new class06314(n + 8192);
        while (this.N((FloatConsumer)class063142) && class063142.y() < n) {
        }
        return class063142.N();
    }

    public boolean N(FloatConsumer var1) throws IOException;
}

