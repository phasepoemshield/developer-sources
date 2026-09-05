/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 *  minecraft.class01962
 *  minecraft.class02027
 *  minecraft.class02048
 *  minecraft.class04770
 *  minecraft.class07282
 *  minecraft.class08030
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.authlib.GameProfile;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.UUID;
import minecraft.class00392;
import minecraft.class01962;
import minecraft.class02027;
import minecraft.class02048;
import minecraft.class04770;
import minecraft.class07282;
import minecraft.class08030;
import org.jspecify.annotations.Nullable;

public final class class06669
extends Record {
    private final UUID profileId;
    private final @Nullable GameProfile profile;
    private final boolean listed;
    private final int latency;
    private final class07282 gameMode;
    private final @Nullable class00392 displayName;
    final boolean showHat;
    final int listOrder;
    final @Nullable class02048 chatSession;

    public boolean L() {
        return this.listed;
    }

    public boolean M() {
        return this.showHat;
    }

    class06669(class04770 class047702) {
        this(class047702.method_5667(), class047702.method_7334(), true, class047702.field_13987.method_52405(), class047702.method_68876(), class047702.method_14206(), class047702.method_74091(class08030.field_7563), class047702.method_61272(), (class02048)class01962.N((Object)class047702.method_45163(), class02027::N));
    }

    public class06669(UUID uUID, @Nullable GameProfile gameProfile, boolean bl, int n, class07282 class072822, @Nullable class00392 class003922, boolean bl2, int n2, @Nullable class02048 class020482) {
        this.profileId = uUID;
        this.profile = gameProfile;
        this.listed = bl;
        this.latency = n;
        this.gameMode = class072822;
        this.displayName = class003922;
        this.showHat = bl2;
        this.listOrder = n2;
        this.chatSession = class020482;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06669.class, "profileId;profile;listed;latency;gameMode;displayName;showHat;listOrder;chatSession", "profileId", "profile", "listed", "latency", "gameMode", "displayName", "showHat", "listOrder", "chatSession"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06669.class, "profileId;profile;listed;latency;gameMode;displayName;showHat;listOrder;chatSession", "profileId", "profile", "listed", "latency", "gameMode", "displayName", "showHat", "listOrder", "chatSession"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06669.class, "profileId;profile;listed;latency;gameMode;displayName;showHat;listOrder;chatSession", "profileId", "profile", "listed", "latency", "gameMode", "displayName", "showHat", "listOrder", "chatSession"}, this);
    }

    public int B() {
        return this.listOrder;
    }

    public @Nullable class02048 Z() {
        return this.chatSession;
    }

    public class07282 i() {
        return this.gameMode;
    }

    public int u() {
        return this.latency;
    }

    public @Nullable GameProfile y() {
        return this.profile;
    }

    public UUID N() {
        return this.profileId;
    }

    public @Nullable class00392 R() {
        return this.displayName;
    }
}

