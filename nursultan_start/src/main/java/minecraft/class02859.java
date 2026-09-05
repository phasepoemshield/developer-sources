/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Suppliers
 *  com.google.common.collect.BiMap
 *  com.google.common.collect.HashBiMap
 *  com.google.common.collect.ImmutableBiMap
 *  com.google.common.collect.ImmutableMap
 *  com.mojang.datafixers.util.Pair
 *  minecraft.class00500
 *  minecraft.class00860
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01164
 *  minecraft.class01194
 *  minecraft.class01990
 *  minecraft.class03556
 *  minecraft.class03568
 *  minecraft.class03610
 *  minecraft.class04770
 *  minecraft.class06501
 *  minecraft.class06573
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06638
 *  minecraft.class06912
 *  minecraft.class07049
 *  minecraft.class07082
 *  minecraft.class07209
 *  minecraft.class07267
 *  minecraft.class07299
 *  minecraft.class08036
 *  minecraft.class08092
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;
import minecraft.class00500;
import minecraft.class00860;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01164;
import minecraft.class01194;
import minecraft.class01990;
import minecraft.class03556;
import minecraft.class03568;
import minecraft.class03610;
import minecraft.class04770;
import minecraft.class06501;
import minecraft.class06573;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06638;
import minecraft.class06912;
import minecraft.class07049;
import minecraft.class07082;
import minecraft.class07209;
import minecraft.class07267;
import minecraft.class07299;
import minecraft.class08036;
import minecraft.class08092;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class02859
extends class06581
implements class03568 {
    public static final Supplier<BiMap<class00891, class00891>> N = Suppliers.memoize(() -> {
        ImmutableBiMap immutableBiMap = ImmutableBiMap.builder().put((Object)class00869.bx, (Object)class00869.jG).put((Object)class00869.bD, (Object)class00869.jd).put((Object)class00869.bh, (Object)class00869.jl).put((Object)class00869.br, (Object)class00869.jw).put((Object)class00869.jR, (Object)class00869.jO).put((Object)class00869.ji, (Object)class00869.jQ).put((Object)class00869.ju, (Object)class00869.jY).put((Object)class00869.jL, (Object)class00869.jk).put((Object)class00869.jt, (Object)class00869.je).put((Object)class00869.jn, (Object)class00869.jV).put((Object)class00869.jv, (Object)class00869.jK).put((Object)class00869.jj, (Object)class00869.jq).put((Object)class00869.jb, (Object)class00869.jo).put((Object)class00869.jT, (Object)class00869.jJ).put((Object)class00869.js, (Object)class00869.jI).put((Object)class00869.jP, (Object)class00869.jg).put((Object)class00869.jz, (Object)class00869.jm).put((Object)class00869.jZ, (Object)class00869.jW).put((Object)class00869.jB, (Object)class00869.jE).put((Object)class00869.jM, (Object)class00869.jU).put((Object)class00869.jH, (Object)class00869.jp).put((Object)class00869.jc, (Object)class00869.jF).put((Object)class00869.ja, (Object)class00869.jf).put((Object)class00869.jX, (Object)class00869.jA).put((Object)class00869.jC, (Object)class00869.jh).put((Object)class00869.jS, (Object)class00869.jr).put((Object)class00869.jD, (Object)class00869.vy).put((Object)class00869.jx, (Object)class00869.vN).putAll((Map)class00869.RO.y()).put((Object)class00869.vL, (Object)class00869.vM).put((Object)class00869.vu, (Object)class00869.vB).put((Object)class00869.vi, (Object)class00869.vZ).put((Object)class00869.vR, (Object)class00869.vz).put((Object)class00869.vU, (Object)class00869.vP).put((Object)class00869.vE, (Object)class00869.vs).put((Object)class00869.vW, (Object)class00869.vT).put((Object)class00869.vm, (Object)class00869.vb).put((Object)class00869.vj, (Object)class00869.vG).put((Object)class00869.vv, (Object)class00869.vl).put((Object)class00869.vn, (Object)class00869.vd).put((Object)class00869.vt, (Object)class00869.vw).put((Object)class00869.vk, (Object)class00869.vg).put((Object)class00869.vY, (Object)class00869.vI).put((Object)class00869.vQ, (Object)class00869.vJ).put((Object)class00869.vO, (Object)class00869.vo).put((Object)class00869.vq, (Object)class00869.vH).put((Object)class00869.vK, (Object)class00869.vc).put((Object)class00869.vV, (Object)class00869.vX).put((Object)class00869.ve, (Object)class00869.va).putAll((Map)class00869.su.y()).putAll((Map)class00869.RI.y()).build();
        ImmutableBiMap immutableBiMap2 = immutableBiMap;
        immutableBiMap2 = new CallbackInfoReturnable("", true, (Object)immutableBiMap2);
        class02859.N((CallbackInfoReturnable)immutableBiMap2);
        if (immutableBiMap2.isCancelled()) {
            return (BiMap)immutableBiMap2.getReturnValue();
        }
        return immutableBiMap;
    });
    public static final Supplier<BiMap<class00891, class00891>> y = Suppliers.memoize(() -> N.get().inverse());
    private static final String m = "waxed_copper_door";
    private static final String P = "waxed_copper_trapdoor";
    private static final String s = "waxed_copper_golem_statue";
    private static final String T = "waxed_copper_chest";
    private static final String b = "waxed_lightning_rod";
    private static final String j = "waxed_copper_bar";
    private static final String v = "waxed_copper_chain";
    private static final String n = "waxed_copper_lantern";
    private static final String t = "waxed_copper_block";
    public static final ImmutableMap<class00891, Pair<class01990, String>> L = ImmutableMap.builder().put((Object)class00869.vP, (Object)Pair.of((Object)class01990.field_40636, (Object)"waxed_copper_bulb")).put((Object)class00869.vT, (Object)Pair.of((Object)class01990.field_40636, (Object)"waxed_weathered_copper_bulb")).put((Object)class00869.vs, (Object)Pair.of((Object)class01990.field_40636, (Object)"waxed_exposed_copper_bulb")).put((Object)class00869.vb, (Object)Pair.of((Object)class01990.field_40636, (Object)"waxed_oxidized_copper_bulb")).put((Object)class00869.jp, (Object)Pair.of((Object)class01990.field_40636, (Object)"waxed_copper_door")).put((Object)class00869.jf, (Object)Pair.of((Object)class01990.field_40636, (Object)"waxed_copper_door")).put((Object)class00869.jF, (Object)Pair.of((Object)class01990.field_40636, (Object)"waxed_copper_door")).put((Object)class00869.jA, (Object)Pair.of((Object)class01990.field_40636, (Object)"waxed_copper_door")).put((Object)class00869.jh, (Object)Pair.of((Object)class01990.field_40636, (Object)"waxed_copper_trapdoor")).put((Object)class00869.vy, (Object)Pair.of((Object)class01990.field_40636, (Object)"waxed_copper_trapdoor")).put((Object)class00869.jr, (Object)Pair.of((Object)class01990.field_40636, (Object)"waxed_copper_trapdoor")).put((Object)class00869.vN, (Object)Pair.of((Object)class01990.field_40636, (Object)"waxed_copper_trapdoor")).put((Object)class00869.vg, (Object)Pair.of((Object)class01990.field_40634, (Object)"waxed_copper_golem_statue")).put((Object)class00869.vJ, (Object)Pair.of((Object)class01990.field_40634, (Object)"waxed_copper_golem_statue")).put((Object)class00869.vI, (Object)Pair.of((Object)class01990.field_40634, (Object)"waxed_copper_golem_statue")).put((Object)class00869.vo, (Object)Pair.of((Object)class01990.field_40634, (Object)"waxed_copper_golem_statue")).put((Object)class00869.vG, (Object)Pair.of((Object)class01990.field_40634, (Object)"waxed_copper_chest")).put((Object)class00869.vd, (Object)Pair.of((Object)class01990.field_40634, (Object)"waxed_copper_chest")).put((Object)class00869.vl, (Object)Pair.of((Object)class01990.field_40634, (Object)"waxed_copper_chest")).put((Object)class00869.vw, (Object)Pair.of((Object)class01990.field_40634, (Object)"waxed_copper_chest")).put((Object)class00869.vH, (Object)Pair.of((Object)class01990.field_40634, (Object)"waxed_lightning_rod")).put((Object)class00869.vX, (Object)Pair.of((Object)class01990.field_40634, (Object)"waxed_lightning_rod")).put((Object)class00869.vc, (Object)Pair.of((Object)class01990.field_40634, (Object)"waxed_lightning_rod")).put((Object)class00869.va, (Object)Pair.of((Object)class01990.field_40634, (Object)"waxed_lightning_rod")).put((Object)class00869.RO.B(), (Object)Pair.of((Object)class01990.field_40634, (Object)"waxed_copper_bar")).put((Object)class00869.RO.z(), (Object)Pair.of((Object)class01990.field_40634, (Object)"waxed_copper_bar")).put((Object)class00869.RO.Z(), (Object)Pair.of((Object)class01990.field_40634, (Object)"waxed_copper_bar")).put((Object)class00869.RO.U(), (Object)Pair.of((Object)class01990.field_40634, (Object)"waxed_copper_bar")).put((Object)class00869.RI.B(), (Object)Pair.of((Object)class01990.field_40634, (Object)"waxed_copper_chain")).put((Object)class00869.RI.z(), (Object)Pair.of((Object)class01990.field_40634, (Object)"waxed_copper_chain")).put((Object)class00869.RI.Z(), (Object)Pair.of((Object)class01990.field_40634, (Object)"waxed_copper_chain")).put((Object)class00869.RI.U(), (Object)Pair.of((Object)class01990.field_40634, (Object)"waxed_copper_chain")).put((Object)class00869.su.B(), (Object)Pair.of((Object)class01990.field_40634, (Object)"waxed_copper_lantern")).put((Object)class00869.su.z(), (Object)Pair.of((Object)class01990.field_40634, (Object)"waxed_copper_lantern")).put((Object)class00869.su.Z(), (Object)Pair.of((Object)class01990.field_40634, (Object)"waxed_copper_lantern")).put((Object)class00869.su.U(), (Object)Pair.of((Object)class01990.field_40634, (Object)"waxed_copper_lantern")).put((Object)class00869.jG, (Object)Pair.of((Object)class01990.field_40634, (Object)"waxed_copper_block")).put((Object)class00869.jl, (Object)Pair.of((Object)class01990.field_40634, (Object)"waxed_copper_block")).put((Object)class00869.jd, (Object)Pair.of((Object)class01990.field_40634, (Object)"waxed_copper_block")).put((Object)class00869.jw, (Object)Pair.of((Object)class01990.field_40634, (Object)"waxed_copper_block")).build();

    public class02859(class06573 class065732) {
        super(class065732);
    }

    private static void N(CallbackInfoReturnable callbackInfoReturnable) {
        callbackInfoReturnable.setReturnValue((Object)HashBiMap.create((Map)((Map)callbackInfoReturnable.getReturnValue())));
    }

    public class07082 N(class06501 class065012) {
        class07299 class072992 = class065012.method_8045();
        class07209 class072092 = class065012.method_8037();
        class00500 class005002 = class072992.method_8320(class072092);
        return class02859.N(class005002).map(class005003 -> {
            class04770 class047702;
            class08036 class080362 = class065012.method_8036();
            class06584 class065842 = class065012.method_8041();
            if (class080362 instanceof class04770) {
                class047702 = (class04770)class080362;
                class06912.X.N(class047702, class072092, class065842);
            }
            class065842.B(1);
            class072992.method_8652(class072092, class005003, 11);
            class072992.N((class03556)class01194.L, class072092, class01164.N((class07049)class080362, (class00500)class005003));
            class072992.method_8444((class07049)class080362, 3003, class072092, 0);
            if (class005002.i() instanceof class00860 && class005002.L((class08092)class00860.i) != class06638.field_12569) {
                class047702 = class00860.y((class07209)class072092, (class00500)class005002);
                class072992.N((class03556)class01194.L, (class07209)class047702, class01164.N((class07049)class080362, (class00500)class072992.method_8320((class07209)class047702)));
                class072992.method_8444((class07049)class080362, 3003, (class07209)class047702, 0);
            }
            return class07082.N;
        }).orElse((class07082)class07082.i);
    }

    public static Optional<class00500> N(class00500 class005002) {
        return Optional.ofNullable((class00891)N.get().get((Object)class005002.i())).map(class008912 -> class008912.s(class005002));
    }

    public boolean N(class07299 class072992, class07267 class072672, boolean bl, class08036 class080362) {
        if (class072672.y(true)) {
            class072992.method_8444(null, 3003, class072672.d(), 0);
            return true;
        }
        return false;
    }

    public boolean N(class03610 class036102, class08036 class080362) {
        return true;
    }
}

