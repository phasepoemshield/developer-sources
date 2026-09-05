/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class08053
 *  minecraft.class08066
 *  minecraft.class08086
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Set;
import minecraft.class01894;
import minecraft.class02452;
import minecraft.class08053;
import minecraft.class08066;
import minecraft.class08086;
import org.jspecify.annotations.Nullable;

public class class02437
implements class08053 {
    public static final class01894 N = class08086.N;
    public static final class01894 y = class01894.y((String)"translucent");
    public static final class01894 L = class01894.y((String)"item_entity");
    public static final class01894 u = class01894.y((String)"particles");
    public static final class01894 i = class01894.y((String)"weather");
    public static final class01894 R = class01894.y((String)"clouds");
    public static final class01894 M = class01894.y((String)"entity_outline");
    public static final Set<class01894> B = Set.of(N);
    public static final Set<class01894> Z = Set.of(N, M);
    public static final Set<class01894> z = Set.of(N, y, L, u, i, R);
    public class02452<class08066> U = class02452.N();
    public @Nullable class02452<class08066> E;
    public @Nullable class02452<class08066> W;
    public @Nullable class02452<class08066> m;
    public @Nullable class02452<class08066> P;
    public @Nullable class02452<class08066> s;
    public @Nullable class02452<class08066> T;

    public void y(class01894 class018942, class02452<class08066> class024522) {
        if (class018942.equals((Object)N)) {
            this.U = class024522;
        } else if (class018942.equals((Object)y)) {
            this.E = class024522;
        } else if (class018942.equals((Object)L)) {
            this.W = class024522;
        } else if (class018942.equals((Object)u)) {
            this.m = class024522;
        } else if (class018942.equals((Object)i)) {
            this.P = class024522;
        } else if (class018942.equals((Object)R)) {
            this.s = class024522;
        } else if (class018942.equals((Object)M)) {
            this.T = class024522;
        } else {
            throw new IllegalArgumentException("No target with id " + String.valueOf(class018942));
        }
    }

    public void N() {
        this.U = class02452.N();
        this.E = null;
        this.W = null;
        this.m = null;
        this.P = null;
        this.s = null;
        this.T = null;
    }

    public @Nullable class02452<class08066> N(class01894 class018942) {
        if (class018942.equals((Object)N)) {
            return this.U;
        }
        if (class018942.equals((Object)y)) {
            return this.E;
        }
        if (class018942.equals((Object)L)) {
            return this.W;
        }
        if (class018942.equals((Object)u)) {
            return this.m;
        }
        if (class018942.equals((Object)i)) {
            return this.P;
        }
        if (class018942.equals((Object)R)) {
            return this.s;
        }
        if (class018942.equals((Object)M)) {
            return this.T;
        }
        return null;
    }
}

