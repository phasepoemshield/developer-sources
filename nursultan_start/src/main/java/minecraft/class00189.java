/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  minecraft.class01631
 *  minecraft.class01894
 *  minecraft.class04208
 *  minecraft.class06953
 *  minecraft.class06955
 */
package minecraft;

import com.mojang.authlib.GameProfile;
import java.util.UUID;
import minecraft.class01631;
import minecraft.class01894;
import minecraft.class04208;
import minecraft.class06953;
import minecraft.class06955;

public class class00189 {
    public static final class01631[] N = new class01631[]{class00189.N("entity/player/slim/alex", class04208.field_41122), class00189.N("entity/player/slim/ari", class04208.field_41122), class00189.N("entity/player/slim/efe", class04208.field_41122), class00189.N("entity/player/slim/kai", class04208.field_41122), class00189.N("entity/player/slim/makena", class04208.field_41122), class00189.N("entity/player/slim/noor", class04208.field_41122), class00189.N("entity/player/slim/steve", class04208.field_41122), class00189.N("entity/player/slim/sunny", class04208.field_41122), class00189.N("entity/player/slim/zuri", class04208.field_41122), class00189.N("entity/player/wide/alex", class04208.field_41123), class00189.N("entity/player/wide/ari", class04208.field_41123), class00189.N("entity/player/wide/efe", class04208.field_41123), class00189.N("entity/player/wide/kai", class04208.field_41123), class00189.N("entity/player/wide/makena", class04208.field_41123), class00189.N("entity/player/wide/noor", class04208.field_41123), class00189.N("entity/player/wide/steve", class04208.field_41123), class00189.N("entity/player/wide/sunny", class04208.field_41123), class00189.N("entity/player/wide/zuri", class04208.field_41123)};

    public static class01631 y() {
        return N[6];
    }

    public static class01631 N(UUID uUID) {
        return N[Math.floorMod(uUID.hashCode(), N.length)];
    }

    private static class01631 N(String string, class04208 class042082) {
        return new class01631((class06955)new class06953(class01894.y((String)string)), null, null, class042082, true);
    }

    public static class01631 N(GameProfile gameProfile) {
        return class00189.N(gameProfile.id());
    }

    public static class01894 N() {
        return class00189.y().N().y();
    }
}

