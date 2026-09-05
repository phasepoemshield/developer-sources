/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01089
 *  minecraft.class01894
 *  minecraft.class08280
 */
package minecraft;

import java.io.IOException;
import java.io.InputStream;
import minecraft.class01089;
import minecraft.class01894;
import minecraft.class08280;

public class class04662 {
    @Deprecated
    public static int[] N(class01089 class010892, class01894 class018942) throws IOException {
        try (InputStream inputStream = class010892.u(class018942);){
            int[] nArray;
            block12: {
                class08280 class082802 = class08280.N((InputStream)inputStream);
                try {
                    nArray = class082802.R();
                    if (class082802 == null) break block12;
                }
                catch (Throwable throwable) {
                    if (class082802 != null) {
                        try {
                            class082802.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                class082802.close();
            }
            return nArray;
        }
    }
}

