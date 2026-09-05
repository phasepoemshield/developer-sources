/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  java.lang.MatchException
 *  minecraft.class00412
 *  minecraft.class00959
 *  minecraft.class01894
 *  minecraft.class02246
 *  minecraft.class03529
 *  minecraft.class03556
 *  minecraft.class04206
 *  minecraft.class05883
 *  minecraft.class06563
 *  minecraft.class06638
 *  minecraft.class06851
 *  minecraft.class07311
 *  minecraft.class08571
 *  minecraft.class08626
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.impl.object.builder.client.SignTypeTextureHelper
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import minecraft.class00412;
import minecraft.class00959;
import minecraft.class01894;
import minecraft.class02246;
import minecraft.class03529;
import minecraft.class03556;
import minecraft.class04206;
import minecraft.class05883;
import minecraft.class05904;
import minecraft.class05913;
import minecraft.class05946;
import minecraft.class06563;
import minecraft.class06638;
import minecraft.class06851;
import minecraft.class07311;
import minecraft.class08571;
import minecraft.class08626;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.object.builder.client.SignTypeTextureHelper;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(value=EnvType.CLIENT)
public class class05911 {
    public static final class01894 N = class01894.y((String)"textures/atlas/shulker_boxes.png");
    public static final class01894 y = class01894.y((String)"textures/atlas/beds.png");
    public static final class01894 L = class01894.y((String)"textures/atlas/banner_patterns.png");
    public static final class01894 u = class01894.y((String)"textures/atlas/shield_patterns.png");
    public static final class01894 i = class01894.y((String)"textures/atlas/signs.png");
    public static final class01894 R = class01894.y((String)"textures/atlas/chest.png");
    public static final class01894 M = class01894.y((String)"textures/atlas/armor_trims.png");
    public static final class01894 B = class01894.y((String)"textures/atlas/decorated_pot.png");
    public static final class01894 Z = class01894.y((String)"textures/atlas/gui.png");
    public static final class01894 z = class01894.y((String)"textures/atlas/map_decorations.png");
    public static final class01894 U = class01894.y((String)"textures/atlas/paintings.png");
    public static final class01894 E = class01894.y((String)"textures/atlas/celestials.png");
    private static final class07311 NL = class06851.M((class01894)N);
    private static final class07311 Nu = class06851.u((class01894)y);
    private static final class07311 Ni = class06851.m((class01894)L);
    private static final class07311 NR = class06851.m((class01894)u);
    private static final class07311 NM = class06851.M((class01894)i);
    private static final class07311 NB = class06851.R((class01894)R);
    private static final class07311 NZ = class06851.N((class01894)M);
    private static final class07311 Nz = class06851.y((class01894)M);
    private static final class07311 NU = class06851.u((class01894)class08626.N);
    private static final class07311 NE = class06851.R((class01894)class08626.N);
    private static final class07311 NW = class06851.Z((class01894)class08626.N);
    private static final class07311 Nm = class06851.Z((class01894)class08626.y);
    public static final class08571 W = new class08571(class08626.y, "item");
    public static final class08571 m = new class08571(class08626.N, "block");
    public static final class08571 P = new class08571(class08626.N, "entity");
    public static final class08571 s = new class08571(L, "entity/banner");
    public static final class08571 T = new class08571(u, "entity/shield");
    public static final class08571 b = new class08571(R, "entity/chest");
    public static final class08571 j = new class08571(B, "entity/decorated_pot");
    public static final class08571 v = new class08571(y, "entity/bed");
    public static final class08571 n = new class08571(N, "entity/shulker");
    public static final class08571 t = new class08571(i, "entity/signs");
    public static final class08571 G = new class08571(i, "entity/signs/hanging");
    public static final class05913 l = n.N("shulker");
    public static final List<class05913> d = (List)Arrays.stream(class06563.values()).sorted(Comparator.comparingInt(class06563::N)).map(class05911::R).collect(ImmutableList.toImmutableList());
    public static final Map<class05904, class05913> w = class05904.N().collect(Collectors.toMap(Function.identity(), class05911::L));
    public static final Map<class05904, class05913> k = class05904.N().collect(Collectors.toMap(Function.identity(), class05911::u));
    public static final class05913 Y = s.N("base");
    public static final class05913 Q = T.N("base");
    private static final Map<class01894, class05913> NP = new HashMap<class01894, class05913>();
    private static final Map<class01894, class05913> Ns = new HashMap<class01894, class05913>();
    public static final Map<class05946<class02246>, class05913> O = class04206.NZ.z().collect(Collectors.toMap(class03529::B, class035292 -> j.N(((class02246)class035292.N()).N())));
    public static final class05913 g = j.N("decorated_pot_base");
    public static final class05913 I = j.N("decorated_pot_side");
    private static final class05913[] NT = (class05913[])Arrays.stream(class06563.values()).sorted(Comparator.comparingInt(class06563::N)).map(class05911::L).toArray(class05913[]::new);
    public static final class05913 J = b.N("trapped");
    public static final class05913 o = b.N("trapped_left");
    public static final class05913 q = b.N("trapped_right");
    public static final class05913 K = b.N("christmas");
    public static final class05913 V = b.N("christmas_left");
    public static final class05913 e = b.N("christmas_right");
    public static final class05913 H = b.N("normal");
    public static final class05913 c = b.N("normal_left");
    public static final class05913 X = b.N("normal_right");
    public static final class05913 a = b.N("ender");
    public static final class05913 p = b.N("copper");
    public static final class05913 F = b.N("copper_left");
    public static final class05913 A = b.N("copper_right");
    public static final class05913 f = b.N("copper_exposed");
    public static final class05913 C = b.N("copper_exposed_left");
    public static final class05913 S = b.N("copper_exposed_right");
    public static final class05913 x = b.N("copper_weathered");
    public static final class05913 D = b.N("copper_weathered_left");
    public static final class05913 h = b.N("copper_weathered_right");
    public static final class05913 r = b.N("copper_oxidized");
    public static final class05913 NN = b.N("copper_oxidized_left");
    public static final class05913 Ny = b.N("copper_oxidized_right");

    public static class05913 L(class06563 class065632) {
        return v.N(class05911.y(class065632));
    }

    private static class05913 L(class05904 class059042) {
        return class05911.N(t, class059042.y());
    }

    public static class07311 L() {
        return Nu;
    }

    public static class07311 M() {
        return NB;
    }

    public static class07311 B() {
        return NU;
    }

    public static class07311 Z() {
        return NE;
    }

    public static class01894 i(class06563 class065632) {
        return class01894.y((String)("shulker_" + class065632.y()));
    }

    public static class07311 i() {
        return NM;
    }

    public static class07311 U() {
        return NW;
    }

    public static class07311 z() {
        return Nm;
    }

    private static class05913 u(class05904 class059042) {
        return class05911.y(G, class059042.y());
    }

    public static class07311 u() {
        return NL;
    }

    public static class05913 u(class06563 class065632) {
        return d.get(class065632.N());
    }

    public static class07311 y() {
        return NR;
    }

    public static class05913 y(class03556<class00412> class035562) {
        return Ns.computeIfAbsent(((class00412)class035562.N()).N(), arg_0 -> ((class08571)T).N(arg_0));
    }

    public static class05913 y(class05904 class059042) {
        return k.get((Object)class059042);
    }

    private static class05913 y(class08571 class085712, String string) {
        return class085712.N(class01894.N((String)string));
    }

    public static class01894 y(class06563 class065632) {
        return class01894.y((String)class065632.y());
    }

    private static class05913 N(class06638 class066382, class05913 class059132, class05913 class059133, class05913 class059134) {
        switch (class05883.y[class066382.ordinal()]) {
            case 1: {
                return class059133;
            }
            case 2: {
                return class059134;
            }
        }
        return class059132;
    }

    public static class07311 N(boolean bl) {
        return bl ? Nz : NZ;
    }

    private static class05913 N(class08571 class085712, String string) {
        return class085712.N(class01894.N((String)string));
    }

    private static void N(CallbackInfo callbackInfo) {
        SignTypeTextureHelper.shouldAddTextures = true;
    }

    public static class07311 N() {
        return Ni;
    }

    public static class05913 N(class06563 class065632) {
        return NT[class065632.N()];
    }

    public static class05913 N(class05904 class059042) {
        return w.get((Object)class059042);
    }

    public static class05913 N(class03556<class00412> class035562) {
        return NP.computeIfAbsent(((class00412)class035562.N()).N(), arg_0 -> ((class08571)s).N(arg_0));
    }

    public static class05913 N(class00959 class009592, class06638 class066382) {
        return switch (class05883.N[class009592.ordinal()]) {
            default -> throw new MatchException(null, null);
            case 1 -> a;
            case 2 -> class05911.N(class066382, K, V, e);
            case 3 -> class05911.N(class066382, J, o, q);
            case 4 -> class05911.N(class066382, p, F, A);
            case 5 -> class05911.N(class066382, f, C, S);
            case 6 -> class05911.N(class066382, x, D, h);
            case 7 -> class05911.N(class066382, r, NN, Ny);
            case 8 -> class05911.N(class066382, H, c, X);
        };
    }

    public static @Nullable class05913 N(@Nullable class05946<class02246> class059462) {
        if (class059462 == null) {
            return null;
        }
        return O.get(class059462);
    }

    public static class05913 R(class06563 class065632) {
        return n.N(class05911.i(class065632));
    }

    public static class07311 R() {
        return NM;
    }
}

