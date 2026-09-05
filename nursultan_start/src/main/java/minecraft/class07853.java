/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  io.netty.buffer.ByteBuf
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02897
 *  minecraft.class04271
 */
package minecraft;

import com.mojang.authlib.GameProfile;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00381;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02897;
import minecraft.class04271;
import minecraft.class07844;

public final class class07853
extends Record
implements class00381<class07844> {
    private final GameProfile gameProfile;
    public static final class02362<ByteBuf, class07853> N = class02362.N((class02362)class02389.k, class07853::N, class07853::new);

    public class07853(GameProfile gameProfile) {
        this.gameProfile = gameProfile;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07853.class, "gameProfile", "gameProfile"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07853.class, "gameProfile", "gameProfile"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07853.class, "gameProfile", "gameProfile"}, this);
    }

    public void method_65081(class07844 class078442) {
        class078442.N(this);
    }

    public GameProfile N() {
        return this.gameProfile;
    }

    public boolean R() {
        return true;
    }

    public class02897<class07853> method_65080() {
        return class04271.y;
    }
}

