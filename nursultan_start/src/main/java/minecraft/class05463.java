/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.minecraft.UserApiService
 *  minecraft.class03458
 *  minecraft.class05096
 *  minecraft.class06202
 *  minecraft.class07536
 */
package minecraft;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.UserApiService;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import minecraft.class03458;
import minecraft.class05096;
import minecraft.class05470;
import minecraft.class06202;
import minecraft.class07536;

public class class05463 {
    private final class06202 N;
    private final Set<UUID> y = Sets.newHashSet();
    private final UserApiService L;
    private final Map<String, UUID> u = Maps.newHashMap();
    private boolean i;
    private CompletableFuture<?> R = CompletableFuture.completedFuture(null);

    public boolean L(UUID uUID) {
        return this.u(uUID) || this.i(uUID);
    }

    public Set<UUID> L() {
        return this.y;
    }

    public class05463(class06202 class062022, UserApiService userApiService) {
        this.N = class062022;
        this.L = userApiService;
    }

    public boolean i(UUID uUID) {
        if (!this.i) {
            return false;
        }
        this.R.join();
        return this.L.isBlockedPlayer(uUID);
    }

    public boolean u(UUID uUID) {
        return this.y.contains(uUID);
    }

    public void y() {
        this.i = false;
    }

    public void y(UUID uUID) {
        this.y.remove(uUID);
    }

    public void N(class03458 class034582) {
        GameProfile gameProfile = class034582.N();
        this.u.put(gameProfile.name(), gameProfile.id());
        class05096 class050962 = (class05096)this.N.v_3;
        if (class050962 instanceof class05470) {
            ((class05470)class050962).N(class034582);
        }
    }

    public UUID N(String string) {
        return this.u.getOrDefault(string, class07536.R);
    }

    public void N(UUID uUID) {
        this.y.add(uUID);
    }

    public void N() {
        this.i = true;
        this.R = this.R.thenRunAsync(() -> ((UserApiService)this.L).refreshBlockList(), (Executor)class07536.Z());
    }

    public void R(UUID uUID) {
        class05096 class050962 = (class05096)this.N.v_3;
        if (class050962 instanceof class05470) {
            ((class05470)class050962).N(uUID);
        }
    }
}

