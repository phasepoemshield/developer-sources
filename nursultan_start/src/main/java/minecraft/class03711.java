/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  minecraft.class01894
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class04247
 *  minecraft.class07151
 */
package minecraft;

import java.util.List;
import minecraft.class01894;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class04247;
import minecraft.class07151;

public final class class03711
extends Record {
    private final class01894 L;
    private final class07151 u;
    public static final class02362<class04247, class03711> N = class02362.N((class02362)class01894.y, class03711::N, (class02362)class07151.y, class03711::y, class03711::new);
    public static final class02362<class04247, List<class03711>> y = N.N_33(class02389.N());

    public class03711(class01894 class018942, class07151 class071512) {
        this.L = class018942;
        this.u = class071512;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof class03711)) return false;
        class03711 class037112 = (class03711)((Object)object);
        if (!this.L.equals((Object)class037112.L)) return false;
        return true;
    }

    public String toString() {
        return this.L.toString();
    }

    public int hashCode() {
        return this.L.hashCode();
    }

    public class07151 y() {
        return this.u;
    }

    public class01894 N() {
        return this.L;
    }
}

