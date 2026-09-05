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
import minecraft.class08053;
import minecraft.class08066;
import org.jspecify.annotations.Nullable;

class class08048
implements class08053 {
    private class02452<class08066> L;
    final /* synthetic */ class02452 N;
    final /* synthetic */ class01894 y;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    class08048(class02452 class024522, class01894 class018942) {
        this.N = class024522;
        this.y = class018942;
        this.L = this.N;
    }

    @Override
    public void y(class01894 class018942, class02452<class08066> class024522) {
        if (!class018942.equals((Object)this.y)) {
            throw new IllegalArgumentException("No target with id " + String.valueOf(class018942));
        }
        this.L = class024522;
    }

    @Override
    public @Nullable class02452<class08066> N(class01894 class018942) {
        return class018942.equals((Object)this.y) ? this.L : null;
    }
}

