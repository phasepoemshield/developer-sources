/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.net.Proxy;
import org.jspecify.annotations.Nullable;

public class class05133 {
    private static @Nullable Proxy N;

    public static @Nullable Proxy N() {
        return N;
    }

    public static void N(Proxy proxy) {
        if (N == null) {
            N = proxy;
        }
    }
}

