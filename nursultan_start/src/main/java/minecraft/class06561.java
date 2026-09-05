/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.util.Pair
 *  com.viaversion.viafabricplus.settings.impl.DebugSettings
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01164
 *  minecraft.class01194
 *  minecraft.class02749
 *  minecraft.class03556
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class06501
 *  minecraft.class07049
 *  minecraft.class07082
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class07438
 *  minecraft.class08036
 *  net.fabricmc.fabric.mixin.content.registry.HoeItemAccessor
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import com.viaversion.viafabricplus.settings.impl.DebugSettings;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01164;
import minecraft.class01194;
import minecraft.class02749;
import minecraft.class03556;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class06501;
import minecraft.class06570;
import minecraft.class06573;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07049;
import minecraft.class07082;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class07438;
import minecraft.class08036;
import net.fabricmc.fabric.mixin.content.registry.HoeItemAccessor;

public class class06561
extends class06581
implements HoeItemAccessor {
    protected static final Map<class00891, Pair<Predicate<class06501>, Consumer<class06501>>> N = Maps.newHashMap((Map)ImmutableMap.of((Object)class00869.Z, (Object)Pair.of(class06561::y, class06561.N(class00869.Lr.W())), (Object)class00869.Ek, (Object)Pair.of(class06561::y, class06561.N(class00869.Lr.W())), (Object)class00869.z, (Object)Pair.of(class06561::y, class06561.N(class00869.Lr.W())), (Object)class00869.U, (Object)Pair.of(class06561::y, class06561.N(class00869.z.W())), (Object)class00869.nM, (Object)Pair.of(class065012 -> true, class06561.N(class00869.z.W(), class06570.iM))));

    public class06561(class02749 class027492, float f, float f2, class06573 class065732) {
        super(class065732.L(class027492, f, f2));
    }

    public static boolean y(class06501 class065012) {
        return class065012.method_8038() != class07211.field_11033 && class065012.method_8045().method_8320(class065012.method_8037().method_10084()).P();
    }

    public static /* synthetic */ Map N() {
        return N;
    }

    private boolean N(class07299 class072992, class07049 class070492, class07209 class072092, class04891 class048912, class04911 class049112, float f, float f2) {
        return !DebugSettings.INSTANCE.serversidePlaceSounds.isEnabled();
    }

    @Override
    public class07082 N(class06501 class065012) {
        class07209 class072092;
        class07299 class072992 = class065012.method_8045();
        Pair<Predicate<class06501>, Consumer<class06501>> var4 = N.get(class072992.method_8320(class072092 = class065012.method_8037()).i());
        if (var4 == null) {
            return class07082.i;
        }
        Predicate var5 = (Predicate)var4.getFirst();
        Consumer var6 = (Consumer)var4.getSecond();
        if (var5.test(class065012)) {
            float f;
            float f2;
            class04911 class049112;
            class04891 class048912;
            class07209 class072093;
            class07299 class072993 = class072992;
            class08036 class080362 = class065012.method_8036();
            class08036 class080363 = class080362;
            if (this.N(class072993, (class07049)class080363, class072093 = class072092, class048912 = class04909.PE, class049112 = class04911.field_15245, f2 = 1.0f, f = 1.0f)) {
                class072993.method_8396((class07049)class080363, class072093, class048912, class049112, f2, f);
            }
            if (!class072992.method_8608()) {
                var6.accept(class065012);
                if (class080362 != null) {
                    class065012.method_8041().N(1, (class07438)class080362, class065012.method_20287().N());
                }
            }
            return class07082.N;
        }
        return class07082.i;
    }

    public static Consumer<class06501> N(class00500 class005002) {
        return class065012 -> {
            class065012.method_8045().method_8652(class065012.method_8037(), class005002, 11);
            class065012.method_8045().N((class03556)class01194.L, class065012.method_8037(), class01164.N((class07049)class065012.method_8036(), (class00500)class005002));
        };
    }

    public static Consumer<class06501> N(class00500 class005002, class07310 class073102) {
        return class065012 -> {
            class065012.method_8045().method_8652(class065012.method_8037(), class005002, 11);
            class065012.method_8045().N((class03556)class01194.L, class065012.method_8037(), class01164.N((class07049)class065012.method_8036(), (class00500)class005002));
            class00891.N((class07299)class065012.method_8045(), (class07209)class065012.method_8037(), (class07211)class065012.method_8038(), (class06584)new class06584(class073102));
        };
    }
}

