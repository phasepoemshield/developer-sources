/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class01281
 *  minecraft.class01835
 *  minecraft.class01894
 *  minecraft.class02055
 *  minecraft.class03012
 *  minecraft.class03028
 *  minecraft.class03229
 *  minecraft.class03556
 *  minecraft.class03866
 *  minecraft.class03882
 *  minecraft.class04116
 *  minecraft.class04227
 *  minecraft.class07529
 *  minecraft.class07813
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class01281;
import minecraft.class01835;
import minecraft.class01894;
import minecraft.class02055;
import minecraft.class03012;
import minecraft.class03028;
import minecraft.class03229;
import minecraft.class03556;
import minecraft.class03866;
import minecraft.class03882;
import minecraft.class04116;
import minecraft.class04227;
import minecraft.class05946;
import minecraft.class05967;
import minecraft.class07529;
import minecraft.class07813;

public final class class05943
extends Record {
    private final class05967 noiseSettings;
    private final class00500 defaultBlock;
    private final class00500 defaultFluid;
    private final class03866 noiseRouter;
    private final class03028 surfaceRule;
    private final List<class03229> spawnTarget;
    private final int seaLevel;
    private final boolean disableMobGeneration;
    private final boolean aquifersEnabled;
    private final boolean oreVeinsEnabled;
    private final boolean useLegacyRandomSource;
    public static final Codec<class05943> N = RecordCodecBuilder.create(instance -> instance.group((App)class05967.N.fieldOf("noise").forGetter(class05943::R), (App)class00500.N.fieldOf("default_block").forGetter(class05943::M), (App)class00500.N.fieldOf("default_fluid").forGetter(class05943::B), (App)class03866.N.fieldOf("noise_router").forGetter(class05943::Z), (App)class03028.y.fieldOf("surface_rule").forGetter(class05943::z), (App)class03229.N.listOf().fieldOf("spawn_target").forGetter(class05943::U), (App)Codec.INT.fieldOf("sea_level").forGetter(class05943::E), (App)Codec.BOOL.fieldOf("disable_mob_generation").forGetter(class05943::N), (App)Codec.BOOL.fieldOf("aquifers_enabled").forGetter(class05943::y), (App)Codec.BOOL.fieldOf("ore_veins_enabled").forGetter(class05943::L), (App)Codec.BOOL.fieldOf("legacy_random_source").forGetter(class05943::m)).apply(instance, class05943::new));
    public static final Codec<class03556<class05943>> y = class01281.N((class05946)class04227.yE, N);
    public static final class05946<class05943> L = class05946.N(class04227.yE, class01894.y((String)"overworld"));
    public static final class05946<class05943> u = class05946.N(class04227.yE, class01894.y((String)"large_biomes"));
    public static final class05946<class05943> i = class05946.N(class04227.yE, class01894.y((String)"amplified"));
    public static final class05946<class05943> R = class05946.N(class04227.yE, class01894.y((String)"nether"));
    public static final class05946<class05943> M = class05946.N(class04227.yE, class01894.y((String)"end"));
    public static final class05946<class05943> B = class05946.N(class04227.yE, class01894.y((String)"caves"));
    public static final class05946<class05943> Z = class05946.N(class04227.yE, class01894.y((String)"floating_islands"));

    private static class05943 L(class04116<?> class041162) {
        return new class05943(class05967.L, class00869.id.W(), class00869.V.W(), class03882.N((class02055)class041162.N(class04227.yy), (class02055)class041162.N(class04227.yW)), class03012.y(), List.of(), 32, false, false, false, true);
    }

    public boolean L() {
        return this.oreVeinsEnabled && !class07529.Ng;
    }

    public class00500 M() {
        return this.defaultBlock;
    }

    public class05943(class05967 class059672, class00500 class005002, class00500 class005003, class03866 class038662, class03028 class030282, List<class03229> list, int n, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        this.noiseSettings = class059672;
        this.defaultBlock = class005002;
        this.defaultFluid = class005003;
        this.noiseRouter = class038662;
        this.surfaceRule = class030282;
        this.spawnTarget = list;
        this.seaLevel = n;
        this.disableMobGeneration = bl;
        this.aquifersEnabled = bl2;
        this.oreVeinsEnabled = bl3;
        this.useLegacyRandomSource = bl4;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class05943.class, "noiseSettings;defaultBlock;defaultFluid;noiseRouter;surfaceRule;spawnTarget;seaLevel;disableMobGeneration;aquifersEnabled;oreVeinsEnabled;useLegacyRandomSource", "noiseSettings", "defaultBlock", "defaultFluid", "noiseRouter", "surfaceRule", "spawnTarget", "seaLevel", "disableMobGeneration", "aquifersEnabled", "oreVeinsEnabled", "useLegacyRandomSource"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class05943.class, "noiseSettings;defaultBlock;defaultFluid;noiseRouter;surfaceRule;spawnTarget;seaLevel;disableMobGeneration;aquifersEnabled;oreVeinsEnabled;useLegacyRandomSource", "noiseSettings", "defaultBlock", "defaultFluid", "noiseRouter", "surfaceRule", "spawnTarget", "seaLevel", "disableMobGeneration", "aquifersEnabled", "oreVeinsEnabled", "useLegacyRandomSource"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class05943.class, "noiseSettings;defaultBlock;defaultFluid;noiseRouter;surfaceRule;spawnTarget;seaLevel;disableMobGeneration;aquifersEnabled;oreVeinsEnabled;useLegacyRandomSource", "noiseSettings", "defaultBlock", "defaultFluid", "noiseRouter", "surfaceRule", "spawnTarget", "seaLevel", "disableMobGeneration", "aquifersEnabled", "oreVeinsEnabled", "useLegacyRandomSource"}, this);
    }

    public class00500 B() {
        return this.defaultFluid;
    }

    public class03866 Z() {
        return this.noiseRouter;
    }

    public static class05943 i() {
        return new class05943(class05967.y, class00869.y.W(), class00869.N.W(), class03882.N(), class03012.u(), List.of(), 63, true, false, false, false);
    }

    private static class05943 i(class04116<?> class041162) {
        return new class05943(class05967.R, class00869.y.W(), class00869.K.W(), class03882.L((class02055)class041162.N(class04227.yy), (class02055)class041162.N(class04227.yW)), class03012.N((boolean)false, (boolean)false, (boolean)false), List.of(), -64, false, false, false, true);
    }

    public boolean m() {
        return this.useLegacyRandomSource;
    }

    public List<class03229> U() {
        return this.spawnTarget;
    }

    public class03028 z() {
        return this.surfaceRule;
    }

    public class07813 u() {
        return this.useLegacyRandomSource ? class07813.field_35142 : class07813.field_35143;
    }

    private static class05943 u(class04116<?> class041162) {
        return new class05943(class05967.i, class00869.y.W(), class00869.K.W(), class03882.y((class02055)class041162.N(class04227.yy), (class02055)class041162.N(class04227.yW)), class03012.N((boolean)false, (boolean)true, (boolean)true), List.of(), 32, false, false, false, true);
    }

    public boolean y() {
        return this.aquifersEnabled && !class07529.Nw;
    }

    private static class05943 y(class04116<?> class041162) {
        return new class05943(class05967.u, class00869.MP.W(), class00869.N.W(), class03882.N((class02055)class041162.N(class04227.yy)), class03012.L(), List.of(), 0, true, false, false, true);
    }

    public int E() {
        return this.seaLevel;
    }

    private static class05943 N(class04116<?> class041162, boolean bl, boolean bl2) {
        return new class05943(class05967.y, class00869.y.W(), class00869.K.W(), class03882.N((class02055)class041162.N(class04227.yy), (class02055)class041162.N(class04227.yW), (boolean)bl2, (boolean)bl), class03012.N(), new class01835().N(), 63, false, true, true, false);
    }

    public static void N(class04116<class05943> class041162) {
        class041162.N(L, (Object)class05943.N(class041162, false, false));
        class041162.N(u, (Object)class05943.N(class041162, false, true));
        class041162.N(i, (Object)class05943.N(class041162, true, false));
        class041162.N(R, (Object)class05943.L(class041162));
        class041162.N(M, (Object)class05943.y(class041162));
        class041162.N(B, (Object)class05943.u(class041162));
        class041162.N(Z, (Object)class05943.i(class041162));
    }

    @Deprecated
    public boolean N() {
        return this.disableMobGeneration;
    }

    public boolean W() {
        return this.aquifersEnabled;
    }

    public class05967 R() {
        return this.noiseSettings;
    }
}

