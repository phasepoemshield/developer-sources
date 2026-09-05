/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01894
 *  minecraft.class01960
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class07752
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.impl.object.builder.client.SignTypeTextureHelper
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import java.util.stream.Stream;
import minecraft.class01894;
import minecraft.class01960;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class05911;
import minecraft.class07752;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.object.builder.client.SignTypeTextureHelper;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(value=EnvType.CLIENT)
public final class class05904
extends Record {
    private final String name;
    private final class01960 setType;
    private final class07752 soundType;
    private final class07752 hangingSignSoundType;
    private final class04891 fenceGateClose;
    private final class04891 fenceGateOpen;
    private static final Map<String, class05904> v = new Object2ObjectArrayMap();
    public static final Codec<class05904> N = Codec.stringResolver(class05904::y, v::get);
    public static final class05904 y = class05904.N(new class05904("oak", class01960.M));
    public static final class05904 L = class05904.N(new class05904("spruce", class01960.B));
    public static final class05904 u = class05904.N(new class05904("birch", class01960.Z));
    public static final class05904 i = class05904.N(new class05904("acacia", class01960.z));
    public static final class05904 R = class05904.N(new class05904("cherry", class01960.U, class07752.ND, class07752.yN, class04909.Rm, class04909.RP));
    public static final class05904 M = class05904.N(new class05904("jungle", class01960.E));
    public static final class05904 B = class05904.N(new class05904("dark_oak", class01960.W));
    public static final class05904 Z = class05904.N(new class05904("pale_oak", class01960.m));
    public static final class05904 z = class05904.N(new class05904("crimson", class01960.P, class07752.Nx, class07752.Nf, class04909.vd, class04909.vw));
    public static final class05904 U = class05904.N(new class05904("warped", class01960.s, class07752.Nx, class07752.Nf, class04909.vd, class04909.vw));
    public static final class05904 E = class05904.N(new class05904("mangrove", class01960.T));
    public static final class05904 W = class05904.N(new class05904("bamboo", class01960.b, class07752.NS, class07752.NC, class04909.yq, class04909.yK));

    public class01960 L() {
        return this.setType;
    }

    public class04891 M() {
        return this.fenceGateOpen;
    }

    public class05904(String string, class01960 class019602) {
        this(string, class019602, class07752.y, class07752.NA, class04909.Ut, class04909.UG);
    }

    public class05904(String string, class01960 class019602, class07752 class077522, class07752 class077523, class04891 class048912, class04891 class048913) {
        this.name = string;
        this.setType = class019602;
        this.soundType = class077522;
        this.hangingSignSoundType = class077523;
        this.fenceGateClose = class048912;
        this.fenceGateOpen = class048913;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class05904.class, "name;setType;soundType;hangingSignSoundType;fenceGateClose;fenceGateOpen", "name", "setType", "soundType", "hangingSignSoundType", "fenceGateClose", "fenceGateOpen"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class05904.class, "name;setType;soundType;hangingSignSoundType;fenceGateClose;fenceGateOpen", "name", "setType", "soundType", "hangingSignSoundType", "fenceGateClose", "fenceGateOpen"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class05904.class, "name;setType;soundType;hangingSignSoundType;fenceGateClose;fenceGateOpen", "name", "setType", "soundType", "hangingSignSoundType", "fenceGateClose", "fenceGateOpen"}, this);
    }

    public class07752 i() {
        return this.hangingSignSoundType;
    }

    public class07752 u() {
        return this.soundType;
    }

    public String y() {
        return this.name;
    }

    private static void N(class05904 class059042, CallbackInfoReturnable callbackInfoReturnable) {
        if (SignTypeTextureHelper.shouldAddTextures) {
            class01894 class018942 = class01894.N((String)class059042.y());
            class05911.w.put(class059042, class05911.t.N(class018942));
            class05911.k.put(class059042, class05911.G.N(class018942));
        }
    }

    public static class05904 N(class05904 class059042) {
        v.put(class059042.y(), class059042);
        class05904.N(class059042, null);
        return class059042;
    }

    public static Stream<class05904> N() {
        return v.values().stream();
    }

    public class04891 R() {
        return this.fenceGateClose;
    }
}

