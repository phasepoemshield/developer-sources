/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.properties.PropertyMap
 *  io.netty.buffer.ByteBuf
 *  minecraft.class00392
 *  minecraft.class00667
 *  minecraft.class02048
 *  minecraft.class02389
 *  minecraft.class02874
 *  minecraft.class02895
 *  minecraft.class03748
 *  minecraft.class07282
 */
package minecraft;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.PropertyMap;
import io.netty.buffer.ByteBuf;
import java.util.Objects;
import minecraft.class00392;
import minecraft.class00667;
import minecraft.class02048;
import minecraft.class02389;
import minecraft.class02874;
import minecraft.class02895;
import minecraft.class03748;
import minecraft.class06673;
import minecraft.class06678;
import minecraft.class07282;

public final class class06680
extends Enum<class06680> {
    public static final /* enum */ class06680 field_29136 = new class06680((class066412, class042472) -> {
        String string = (String)class02389.w.decode((Object)class042472);
        PropertyMap propertyMap = (PropertyMap)class02389.d.decode((Object)class042472);
        class066412.y = new GameProfile(class066412.N, string, propertyMap);
    }, (class042472, class066692) -> {
        GameProfile gameProfile = Objects.requireNonNull(class066692.y());
        class02389.w.encode((Object)class042472, (Object)gameProfile.name());
        class02389.d.encode((Object)class042472, (Object)gameProfile.properties());
    });
    public static final /* enum */ class06680 field_40699 = new class06680((class066412, class042472) -> {
        class066412.Z = (class02048)class042472.L(class02048::N);
    }, (class042472, class066692) -> class042472.N((Object)class066692.Z(), class02048::N));
    public static final /* enum */ class06680 field_29137 = new class06680((class066412, class042472) -> {
        class066412.i = class07282.N((int)class042472.E());
    }, (class042472, class066692) -> class042472.L(class066692.i().N()));
    public static final /* enum */ class06680 field_40700 = new class06680((class066412, class042472) -> {
        class066412.L = class042472.readBoolean();
    }, (class042472, class066692) -> class042472.writeBoolean(class066692.L()));
    public static final /* enum */ class06680 field_29138 = new class06680((class066412, class042472) -> {
        class066412.u = class042472.E();
    }, (class042472, class066692) -> class042472.L(class066692.u()));
    public static final /* enum */ class06680 field_29139 = new class06680((class066412, class042472) -> {
        class066412.R = (class00392)class00667.N((ByteBuf)class042472, (class02895)class03748.u);
    }, (class042472, class066692) -> class00667.N((ByteBuf)class042472, (Object)class066692.R(), (class02874)class03748.u));
    public static final /* enum */ class06680 field_52324 = new class06680((class066412, class042472) -> {
        class066412.B = class042472.E();
    }, (class042472, class066692) -> class042472.L(class066692.B()));
    public static final /* enum */ class06680 field_54981 = new class06680((class066412, class042472) -> {
        class066412.M = class042472.readBoolean();
    }, (class042472, class066692) -> class042472.writeBoolean(class066692.M()));
    final class06673 field_40701;
    final class06678 field_40702;
    private static final /* synthetic */ class06680[] field_29141;

    private class06680(class06673 class066732, class06678 class066782) {
        this.field_40701 = class066732;
        this.field_40702 = class066782;
    }

    static {
        field_29141 = class06680.N();
    }

    public static class06680[] values() {
        return (class06680[])field_29141.clone();
    }

    public static class06680 valueOf(String string) {
        return Enum.valueOf(class06680.class, string);
    }

    private static /* synthetic */ class06680[] N() {
        return new class06680[]{field_29136, field_40699, field_29137, field_40700, field_29138, field_29139, field_52324, field_54981};
    }
}

