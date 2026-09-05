/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheLoader
 *  com.mojang.authlib.GameProfile
 *  minecraft.class00189
 *  minecraft.class02689
 *  minecraft.class07949
 */
package minecraft;

import com.google.common.cache.CacheLoader;
import com.mojang.authlib.GameProfile;
import minecraft.class00189;
import minecraft.class02689;
import minecraft.class07923;
import minecraft.class07949;

class class07907
extends CacheLoader<class02689, class07923> {
    final /* synthetic */ class07949 N;

    class07907(class07949 class079492) {
        this.N = class079492;
    }

    public class07923 load(class02689 class026892) {
        GameProfile gameProfile = class026892.y();
        return new class07923(this.N, gameProfile, class00189.N((GameProfile)gameProfile), class026892.L());
    }
}

