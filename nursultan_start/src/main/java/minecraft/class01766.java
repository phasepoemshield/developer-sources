/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09519
 *  Nursultan.class09521
 *  com.mojang.authlib.GameProfile
 *  minecraft.class00392
 *  minecraft.class00395
 *  minecraft.class00401
 *  minecraft.class05216
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class09519;
import Nursultan.class09521;
import com.mojang.authlib.GameProfile;
import minecraft.class00392;
import minecraft.class00395;
import minecraft.class00401;
import minecraft.class01795;
import minecraft.class05216;
import org.jspecify.annotations.Nullable;

public interface class01766 {
    public static final String Nu = "*";
    public static final class01766 Ni = new class01795();

    default public @Nullable class00392 method_5476() {
        return null;
    }

    public String method_5820();

    public static class01766 N(String string) {
        if (string.equals(Nu)) {
            return Ni;
        }
        class05216 class052162 = class00392.y((String)string);
        return new class09521(string, (class00392)class052162);
    }

    public static class01766 N(GameProfile gameProfile) {
        String string = gameProfile.name();
        return new class09519(string);
    }

    default public class00392 yZ() {
        class00392 class003922 = this.method_5476();
        if (class003922 != null) {
            return class003922.L().N(class004052 -> class004052.N((class00395)new class00401((class00392)class00392.y((String)this.method_5820()))));
        }
        return class00392.y((String)this.method_5820());
    }
}

