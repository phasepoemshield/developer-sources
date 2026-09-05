/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheLoader
 *  com.mojang.authlib.GameProfile
 *  minecraft.class08957
 */
package minecraft;

import com.google.common.cache.CacheLoader;
import com.mojang.authlib.GameProfile;
import java.util.Optional;
import minecraft.class00932;
import minecraft.class08957;

class class00925
extends CacheLoader<String, Optional<GameProfile>> {
    final /* synthetic */ class08957 N;
    final /* synthetic */ class00932 y;

    class00925(class00932 class009322, class08957 class089572) {
        this.y = class009322;
        this.N = class089572;
    }

    public Optional<GameProfile> load(String string) {
        return this.N.N(string).flatMap(class087742 -> (Optional)this.y.N.getUnchecked((Object)class087742.N()));
    }
}

