/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10406
 *  com.mojang.authlib.GameProfile
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00667
 *  minecraft.class03962
 *  minecraft.class04454
 *  minecraft.class04470
 */
package minecraft;

import Nursultan.class10406;
import com.mojang.authlib.GameProfile;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.UUID;
import minecraft.class00667;
import minecraft.class02027;
import minecraft.class03962;
import minecraft.class04454;
import minecraft.class04470;

public final class class02048
extends Record {
    private final UUID sessionId;
    private final class04454 profilePublicKey;

    public class02048(UUID uUID, class04454 class044542) {
        this.sessionId = uUID;
        this.profilePublicKey = class044542;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02048.class, "sessionId;profilePublicKey", "sessionId", "profilePublicKey"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02048.class, "sessionId;profilePublicKey", "sessionId", "profilePublicKey"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02048.class, "sessionId;profilePublicKey", "sessionId", "profilePublicKey"}, this);
    }

    public class04454 y() {
        return this.profilePublicKey;
    }

    public class02027 N(GameProfile gameProfile, class03962 class039622) throws class10406 {
        return new class02027(this.sessionId, class04470.N((class03962)class039622, (UUID)gameProfile.id(), (class04454)this.profilePublicKey));
    }

    public UUID N() {
        return this.sessionId;
    }

    public static class02048 N(class00667 class006672) {
        return new class02048(class006672.m(), new class04454(class006672));
    }

    public static void N(class00667 class006672, class02048 class020482) {
        class006672.N(class020482.sessionId);
        class020482.profilePublicKey.N(class006672);
    }
}

