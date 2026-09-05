/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  minecraft.class00392
 *  minecraft.class03047
 *  minecraft.class03086
 *  minecraft.class03926
 */
package minecraft;

import com.mojang.authlib.GameProfile;
import java.time.Instant;
import java.util.UUID;
import minecraft.class00392;
import minecraft.class03047;
import minecraft.class03086;
import minecraft.class03391;
import minecraft.class03412;
import minecraft.class03926;

public interface class03387
extends class03047 {
    default public class00392 y() {
        return this.N();
    }

    public boolean N(UUID var1);

    public class00392 N();

    public static class03391 N(class00392 class003922, Instant instant) {
        return new class03391(class003922, instant);
    }

    public static class03412 N(GameProfile gameProfile, class03926 class039262, class03086 class030862) {
        return new class03412(gameProfile, class039262, class030862);
    }
}

