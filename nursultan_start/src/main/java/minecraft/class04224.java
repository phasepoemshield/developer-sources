/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01079
 *  minecraft.class01894
 *  minecraft.class08280
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import minecraft.class01079;
import minecraft.class01894;
import minecraft.class08280;
import org.jspecify.annotations.Nullable;

public class class04224 {
    private final class01894 N;
    private final class01079 y;
    private final AtomicReference<@Nullable class08280> L = new AtomicReference();
    private final AtomicInteger u;

    public class04224(class01894 class018942, class01079 class010792, int n) {
        this.N = class018942;
        this.y = class010792;
        this.u = new AtomicInteger(n);
    }

    public void y() {
        class08280 class082802;
        if (this.u.decrementAndGet() <= 0 && (class082802 = (class08280)this.L.getAndSet(null)) != null) {
            class082802.close();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public class08280 N() throws IOException {
        class08280 class082802 = this.L.get();
        if (class082802 == null) {
            class04224 class042242 = this;
            synchronized (class042242) {
                class082802 = this.L.get();
                if (class082802 == null) {
                    try (InputStream inputStream = this.y.method_14482();){
                        class082802 = class08280.N((InputStream)inputStream);
                        this.L.set(class082802);
                    }
                    catch (IOException iOException) {
                        throw new IOException("Failed to load image " + String.valueOf(this.N), iOException);
                    }
                }
            }
        }
        return class082802;
    }
}

