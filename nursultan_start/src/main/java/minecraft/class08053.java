/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class02452
 *  minecraft.class08066
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class01894;
import minecraft.class02452;
import minecraft.class08048;
import minecraft.class08066;
import org.jspecify.annotations.Nullable;

public interface class08053 {
    default public class02452<class08066> y(class01894 class018942) {
        class02452<class08066> var2 = this.N(class018942);
        if (var2 == null) {
            throw new IllegalArgumentException("Missing target with id " + String.valueOf(class018942));
        }
        return var2;
    }

    public void y(class01894 var1, class02452<class08066> var2);

    public static class08053 N(class01894 class018942, class02452<class08066> class024522) {
        return new class08048(class024522, class018942);
    }

    public @Nullable class02452<class08066> N(class01894 var1);
}

