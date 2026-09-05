/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Multimap
 *  minecraft.class01894
 *  minecraft.class02008
 *  minecraft.class02601
 *  minecraft.class05913
 *  minecraft.class08388
 *  minecraft.class08512
 *  minecraft.class08626
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.renderer.v1.model.SpriteFinder
 *  net.fabricmc.fabric.impl.renderer.MissingSpriteFinderImpl
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Multimap;
import minecraft.class00183;
import minecraft.class01894;
import minecraft.class02008;
import minecraft.class02601;
import minecraft.class05913;
import minecraft.class08388;
import minecraft.class08512;
import minecraft.class08626;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.model.SpriteFinder;
import net.fabricmc.fabric.impl.renderer.MissingSpriteFinderImpl;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
class class00175
implements class02601 {
    private final class08388 i;
    private final class08388 R;
    final /* synthetic */ class02008 N;
    final /* synthetic */ class02008 y;
    final /* synthetic */ Multimap L;
    final /* synthetic */ Multimap u;
    private volatile @Nullable MissingSpriteFinderImpl M;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    class00175(class02008 class020082, class02008 class020083, Multimap multimap, Multimap multimap2) {
        this.N = class020082;
        this.y = class020083;
        this.L = multimap;
        this.u = multimap2;
        this.i = this.N.u();
        this.R = this.y.u();
    }

    public class08388 N(String string, class08512 class085122) {
        this.u.put((Object)class085122.L(), (Object)string);
        return this.i;
    }

    public class08388 N(class05913 class059132, class08512 class085122) {
        class08388 class083882;
        class01894 class018942 = class059132.N();
        boolean bl = class018942.equals((Object)class00183.N);
        boolean bl2 = class018942.equals((Object)class08626.y);
        boolean bl3 = class018942.equals((Object)class08626.N);
        if ((bl || bl2) && (class083882 = this.y.N(class059132.y())) != null) {
            return class083882;
        }
        if ((bl || bl3) && (class083882 = this.N.N(class059132.y())) != null) {
            return class083882;
        }
        this.L.put((Object)class085122.L(), (Object)class059132);
        return bl2 ? this.R : this.i;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public SpriteFinder spriteFinder(class01894 class018942) {
        if (class018942.equals((Object)class08626.N)) {
            return this.N.spriteFinder();
        }
        if (class018942.equals((Object)class08626.y)) {
            return this.y.spriteFinder();
        }
        MissingSpriteFinderImpl missingSpriteFinderImpl = this.M;
        if (missingSpriteFinderImpl == null) {
            class00175 class001752 = this;
            synchronized (class001752) {
                missingSpriteFinderImpl = this.M;
                if (missingSpriteFinderImpl == null) {
                    this.M = missingSpriteFinderImpl = new MissingSpriteFinderImpl(this.i);
                }
            }
        }
        return missingSpriteFinderImpl;
    }
}

