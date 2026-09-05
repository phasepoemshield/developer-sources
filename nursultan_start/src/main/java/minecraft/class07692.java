/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class01894
 *  minecraft.class03800
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.util.Optional;
import minecraft.class01894;
import minecraft.class03800;
import minecraft.class07684;
import minecraft.class07701;

public class class07692 {
    public static final Codec<class07692> N = class01894.N.xmap(class07692::new, class07692::N);
    private final class01894 y;
    private boolean L;
    private Optional<class07684<class07701>> u = Optional.empty();

    public class07692(class01894 class018942) {
        this.y = class018942;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof class07692)) return false;
        class07692 class076922 = (class07692)object;
        if (!this.N().equals((Object)class076922.N())) return false;
        return true;
    }

    public Optional<class07684<class07701>> N(class03800 class038002) {
        if (!this.L) {
            this.u = class038002.N(this.y);
            this.L = true;
        }
        return this.u;
    }

    public class01894 N() {
        return this.y;
    }
}

