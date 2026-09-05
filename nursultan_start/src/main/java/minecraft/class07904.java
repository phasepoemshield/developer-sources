/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  minecraft.class00909
 *  minecraft.class01683
 *  minecraft.class03458
 *  minecraft.class06202
 */
package minecraft;

import com.mojang.authlib.GameProfile;
import java.util.Optional;
import java.util.UUID;
import minecraft.class00909;
import minecraft.class01683;
import minecraft.class03458;
import minecraft.class06202;

public class class07904
implements class00909 {
    private final class06202 N;
    private final class00909 y;

    public class07904(class06202 class062022, class00909 class009092) {
        this.N = class062022;
        this.y = class009092;
    }

    public Optional<GameProfile> N(String string) {
        class03458 class034582;
        class01683 class016832 = this.N.NE();
        if (class016832 != null && (class034582 = class016832.y(string)) != null) {
            return Optional.of(class034582.N());
        }
        return this.y.N(string);
    }

    public Optional<GameProfile> N(UUID uUID) {
        class03458 class034582;
        class01683 class016832 = this.N.NE();
        if (class016832 != null && (class034582 = class016832.N(uUID)) != null) {
            return Optional.of(class034582.N());
        }
        return this.y.N(uUID);
    }
}

