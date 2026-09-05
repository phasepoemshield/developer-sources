/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.authlib.GameProfile
 *  minecraft.class05477
 *  minecraft.class06068
 *  minecraft.class07536
 *  minecraft.class08214
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.authlib.GameProfile;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import minecraft.class02593;
import minecraft.class05477;
import minecraft.class06068;
import minecraft.class07536;
import minecraft.class08214;

public class class02591
implements class05477 {
    protected final GameProfile L;
    protected final Executor u;
    final /* synthetic */ class02593 i;

    protected class02591(class02593 class025932, GameProfile gameProfile) {
        this.i = class025932;
        this.L = gameProfile;
        class08214 class082142 = new class08214((Executor)class025932.M, "chat stream for " + gameProfile.name());
        this.u = arg_0 -> ((class08214)class082142).N(arg_0);
    }

    public CompletableFuture<List<class06068>> N(List<String> list) {
        return class07536.u((List)((List)list.stream().map(string -> this.i.N(this.L, (String)string, this.i.R, this.u)).collect(ImmutableList.toImmutableList()))).exceptionally(throwable -> ImmutableList.of());
    }

    public CompletableFuture<class06068> N(String string) {
        return this.i.N(this.L, string, this.i.R, this.u);
    }
}

