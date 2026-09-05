/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL$TypeReference
 *  com.mojang.logging.LogUtils
 *  minecraft.class00327
 *  minecraft.class00379
 *  minecraft.class00382
 *  minecraft.class00510
 *  minecraft.class00751
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01894
 *  minecraft.class01958
 *  minecraft.class01965
 *  minecraft.class02261
 *  minecraft.class03145
 *  minecraft.class03529
 *  minecraft.class03592
 *  minecraft.class03773
 *  minecraft.class03786
 *  minecraft.class04078
 *  minecraft.class04093
 *  minecraft.class04206
 *  minecraft.class04512
 *  minecraft.class04620
 *  minecraft.class04858
 *  minecraft.class05634
 *  minecraft.class05875
 *  minecraft.class06098
 *  minecraft.class06112
 *  minecraft.class06119
 *  minecraft.class06120
 *  minecraft.class06130
 *  minecraft.class06371
 *  minecraft.class06962
 *  minecraft.class07209
 *  minecraft.class07234
 *  minecraft.class07235
 *  minecraft.class07237
 *  minecraft.class07241
 *  minecraft.class07243
 *  minecraft.class07247
 *  minecraft.class07249
 *  minecraft.class07253
 *  minecraft.class07264
 *  minecraft.class07267
 *  minecraft.class07278
 *  minecraft.class07279
 *  minecraft.class07281
 *  minecraft.class07290
 *  minecraft.class07536
 *  minecraft.class08594
 *  minecraft.class08610
 *  minecraft.class08951
 *  minecraft.class08965
 *  net.caffeinemc.mods.sodium.api.blockentity.BlockEntityRenderPredicate
 *  net.caffeinemc.mods.sodium.client.render.chunk.ExtendedBlockEntityType
 *  net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityType
 *  net.fabricmc.fabric.mixin.lookup.BlockEntityTypeAccessor
 *  org.apache.commons.lang3.ArrayUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.logging.LogUtils;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import minecraft.class00327;
import minecraft.class00379;
import minecraft.class00382;
import minecraft.class00387;
import minecraft.class00393;
import minecraft.class00394;
import minecraft.class00396;
import minecraft.class00400;
import minecraft.class00402;
import minecraft.class00415;
import minecraft.class00419;
import minecraft.class00476;
import minecraft.class00491;
import minecraft.class00500;
import minecraft.class00510;
import minecraft.class00751;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01894;
import minecraft.class01958;
import minecraft.class01965;
import minecraft.class02261;
import minecraft.class03145;
import minecraft.class03529;
import minecraft.class03592;
import minecraft.class03773;
import minecraft.class03786;
import minecraft.class04078;
import minecraft.class04093;
import minecraft.class04206;
import minecraft.class04512;
import minecraft.class04620;
import minecraft.class04858;
import minecraft.class05634;
import minecraft.class05875;
import minecraft.class06098;
import minecraft.class06112;
import minecraft.class06119;
import minecraft.class06120;
import minecraft.class06130;
import minecraft.class06371;
import minecraft.class06962;
import minecraft.class07209;
import minecraft.class07234;
import minecraft.class07235;
import minecraft.class07237;
import minecraft.class07241;
import minecraft.class07243;
import minecraft.class07247;
import minecraft.class07249;
import minecraft.class07253;
import minecraft.class07264;
import minecraft.class07267;
import minecraft.class07278;
import minecraft.class07279;
import minecraft.class07281;
import minecraft.class07290;
import minecraft.class07536;
import minecraft.class08594;
import minecraft.class08610;
import minecraft.class08951;
import minecraft.class08965;
import net.caffeinemc.mods.sodium.api.blockentity.BlockEntityRenderPredicate;
import net.caffeinemc.mods.sodium.client.render.chunk.ExtendedBlockEntityType;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityType;
import net.fabricmc.fabric.mixin.lookup.BlockEntityTypeAccessor;
import org.apache.commons.lang3.ArrayUtils;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class00404<T extends class00394>
implements ExtendedBlockEntityType,
FabricBlockEntityType,
BlockEntityTypeAccessor {
    private static final Logger field_11893 = LogUtils.getLogger();
    public static final class00404<class05634> field_11903 = class00404.method_11030("furnace", class05634::new, class00869.uN);
    public static final class00404<class00379> field_11914 = class00404.method_11030("chest", class00379::new, class00869.LA, class00869.vj, class00869.vv, class00869.vn, class00869.vt, class00869.vG, class00869.vl, class00869.vd, class00869.vw);
    public static final class00404<class00476> field_11891 = class00404.method_11030("trapped_chest", class00476::new, class00869.BH);
    public static final class00404<class07281> field_11901 = class00404.method_11030("ender_chest", class07281::new, class00869.Mt);
    public static final class00404<class07249> field_11907 = class00404.method_11030("jukebox", class07249::new, class00869.iG);
    public static final class00404<class07243> field_11887 = class00404.method_11030("dispenser", class07243::new, class00869.yy);
    public static final class00404<class07247> field_11899 = class00404.method_11030("dropper", class07247::new, class00869.Br);
    public static final class00404<class07267> field_11911 = class00404.method_11030("sign", class07267::new, class00869.uy, class00869.uL, class00869.uu, class00869.ui, class00869.uR, class00869.uM, class00869.uB, class00869.uZ, class00869.us, class00869.uT, class00869.ub, class00869.uj, class00869.uv, class00869.un, class00869.ut, class00869.uG, class00869.sC, class00869.sx, class00869.sS, class00869.sD, class00869.uz, class00869.ul, class00869.uU, class00869.ud);
    public static final class00404<class03786> field_40330 = class00404.method_11030("hanging_sign", class03786::new, class00869.uw, class00869.uk, class00869.uY, class00869.uQ, class00869.uO, class00869.ug, class00869.uI, class00869.uJ, class00869.uo, class00869.uq, class00869.uK, class00869.uV, class00869.ue, class00869.uH, class00869.uc, class00869.uX, class00869.ua, class00869.up, class00869.uF, class00869.uA, class00869.uC, class00869.uS, class00869.uf, class00869.ux);
    public static final class00404<class07235> field_11889 = class00404.method_11030("mob_spawner", class07235::new, class00869.La);
    public static final class00404<class00327> field_54774 = class00404.method_11030("creaking_heart", class00327::new, class00869.Lp);
    public static final class00404<class00510> field_11897 = class00404.method_11030("piston", class00510::new, class00869.LN);
    public static final class00404<class00415> field_11894 = class00404.method_11030("brewing_stand", class00415::new, class00869.MB);
    public static final class00404<class07264> field_11912 = class00404.method_11030("enchanting_table", class07264::new, class00869.MM);
    public static final class00404<class07279> field_11898 = class00404.method_11030("end_portal", class07279::new, class00869.MW);
    public static final class00404<class00419> field_11890 = class00404.method_11030("beacon", class00419::new, class00869.MO);
    public static final class00404<class07237> field_11913 = class00404.method_11030("skull", class07237::new, class00869.Bt, class00869.BG, class00869.BO, class00869.Bg, class00869.BI, class00869.BJ, class00869.Bw, class00869.Bk, class00869.Bl, class00869.Bd, class00869.BY, class00869.BQ, class00869.Bo, class00869.Bq);
    public static final class00404<class07241> field_11900 = class00404.method_11030("daylight_detector", class07241::new, class00869.Bp);
    public static final class00404<class07234> field_11888 = class00404.method_11030("hopper", class07234::new, class00869.Bf);
    public static final class00404<class00382> field_11908 = class00404.method_11030("comparator", class00382::new, class00869.Ba);
    public static final class00404<class00393> field_11905 = class00404.method_11030("banner", class00393::new, class00869.zY, class00869.zQ, class00869.zO, class00869.zg, class00869.zI, class00869.zJ, class00869.zo, class00869.zq, class00869.zK, class00869.zV, class00869.ze, class00869.zH, class00869.zc, class00869.zX, class00869.za, class00869.zp, class00869.zF, class00869.zA, class00869.zf, class00869.zC, class00869.zS, class00869.zx, class00869.zD, class00869.zh, class00869.zr, class00869.UN, class00869.Uy, class00869.UL, class00869.Uu, class00869.Ui, class00869.UR, class00869.UM);
    public static final class00404<class07253> field_11895 = class00404.method_11030("structure_block", class07253::new, class00869.sh);
    public static final class00404<class00491> field_11906 = class00404.method_11030("end_gateway", class00491::new, class00869.EY);
    public static final class00404<class00402> field_11904 = class00404.method_11030("command_block", class00402::new, class00869.MQ, class00869.EO, class00869.EQ);
    public static final class00404<class07278> field_11896 = class00404.method_11030("shulker_box", class07278::new, class00869.Ee, class00869.Wy, class00869.ED, class00869.Eh, class00869.ES, class00869.Ef, class00869.Er, class00869.Ea, class00869.EC, class00869.EF, class00869.EX, class00869.Ec, class00869.EA, class00869.Ex, class00869.WN, class00869.EH, class00869.Ep);
    public static final class00404<class00387> field_11910 = class00404.method_11030("bed", class00387::new, class00869.yn, class00869.yt, class00869.yb, class00869.yj, class00869.ys, class00869.ym, class00869.yv, class00869.yz, class00869.yP, class00869.yE, class00869.yZ, class00869.yB, class00869.yW, class00869.yT, class00869.yM, class00869.yU);
    public static final class00404<class00396> field_11902 = class00404.method_11030("conduit", class00396::new, class00869.mC);
    public static final class00404<class06130> field_16411 = class00404.method_11030("barrel", class06130::new, class00869.PF);
    public static final class00404<class06098> field_16414 = class00404.method_11030("smoker", class06098::new, class00869.PA);
    public static final class00404<class06120> field_16415 = class00404.method_11030("blast_furnace", class06120::new, class00869.Pf);
    public static final class00404<class06119> field_16412 = class00404.method_11030("lectern", class06119::new, class00869.PD);
    public static final class00404<class06112> field_16413 = class00404.method_11030("bell", class06112::new, class00869.sN);
    public static final class00404<class04858> field_16549 = class00404.method_11030("jigsaw", class04858::new, class00869.sr);
    public static final class00404<class05875> field_17380 = class00404.method_11030("campfire", class05875::new, class00869.si, class00869.sR);
    public static final class00404<class04620> field_20431 = class00404.method_11030("beehive", class04620::new, class00869.Ti, class00869.TR);
    public static final class00404<class06371> field_28117 = class00404.method_11030("sculk_sensor", class06371::new, class00869.bp);
    public static final class00404<class03592> field_43258 = class00404.method_11030("calibrated_sculk_sensor", class03592::new, class00869.bF);
    public static final class00404<class04078> field_37647 = class00404.method_11030("sculk_catalyst", class04078::new, class00869.bC);
    public static final class00404<class04093> field_37648 = class00404.method_11030("sculk_shrieker", class04093::new, class00869.bS);
    public static final class00404<class03773> field_40329 = class00404.method_11030("chiseled_bookshelf", class03773::new, class00869.LG);
    public static final class00404<class08951> field_61437 = class00404.method_11030("shelf", class08951::new, class00869.Ll, class00869.Ld, class00869.Lw, class00869.Lk, class00869.LY, class00869.LQ, class00869.LO, class00869.Lg, class00869.LI, class00869.LJ, class00869.Lo, class00869.Lq);
    public static final class00404<class01965> field_42780 = class00404.method_11030("brushable_block", class01965::new, class00869.H, class00869.a);
    public static final class00404<class01958> field_42781 = class00404.method_11030("decorated_pot", class01958::new, class00869.nX);
    public static final class00404<class03145> field_46808 = class00404.method_11030("crafter", class03145::new, class00869.na);
    public static final class00404<class04512> field_47352 = class00404.method_11030("trial_spawner", class04512::new, class00869.np);
    public static final class00404<class02261> field_48859 = class00404.method_11030("vault", class02261::new, class00869.nF);
    public static final class00404<class08594> field_55992 = class00404.method_11030("test_block", class08594::new, class00869.TN);
    public static final class00404<class08610> field_55993 = class00404.method_11030("test_instance_block", class08610::new, class00869.Ty);
    public static final class00404<class08965> field_61438 = class00404.method_11030("copper_golem_statue", class08965::new, class00869.vk, class00869.vY, class00869.vQ, class00869.vO, class00869.vg, class00869.vI, class00869.vJ, class00869.vo);
    private static final Set<class00404<?>> field_55084 = Set.of(field_11904, field_16412, field_11911, field_40330, field_11889, field_47352);
    private final class00400<? extends T> field_11892;
    private Set<class00891> field_19315;
    private final class03529<class00404<?>> field_45786;
    private BlockEntityRenderPredicate[] sodium$renderPredicates = new BlockEntityRenderPredicate[0];

    public class00404(class00400<? extends T> class004002, Set<class00891> set) {
        this.field_45786 = class04206.U.R((Object)this);
        this.field_11892 = class004002;
        this.field_19315 = set;
        this.m_handler$zka000$fabric_object_builder_api_v1$mutableBlocks_1(class004002, set, null);
    }

    public BlockEntityRenderPredicate[] sodium$getRenderPredicates() {
        return this.sodium$renderPredicates;
    }

    public void sodium$addRenderPredicate(BlockEntityRenderPredicate blockEntityRenderPredicate) {
        this.sodium$renderPredicates = (BlockEntityRenderPredicate[])ArrayUtils.add((Object[])this.sodium$renderPredicates, (Object)blockEntityRenderPredicate);
    }

    public /* synthetic */ Set getBlocks() {
        return this.field_19315;
    }

    public boolean method_65166() {
        return field_55084.contains(this);
    }

    public @Nullable T method_24182(class07290 class072902, class07209 class072092) {
        class00394 class003942 = class072902.method_8321(class072092);
        if (class003942 == null || class003942.O() != this) {
            return null;
        }
        return (T)class003942;
    }

    private static <T extends class00394> class00404<T> method_11030(String string, class00400<? extends T> class004002, class00891 ... class00891Array) {
        if (class00891Array.length == 0) {
            field_11893.warn("Block entity type {} requires at least one valid block to be defined!", (Object)string);
        }
        class07536.N((DSL.TypeReference)class06962.G, (String)string);
        return (class00404)class00751.N((class00751)class04206.U, (String)string, new class00404<T>(class004002, Set.of(class00891Array)));
    }

    public static @Nullable class01894 method_11033(class00404<?> class004042) {
        return class04206.U.y(class004042);
    }

    public T method_11032(class07209 class072092, class00500 class005002) {
        return this.field_11892.create(class072092, class005002);
    }

    public boolean method_20526(class00500 class005002) {
        return this.field_19315.contains(class005002.i());
    }

    @Deprecated
    public class03529<class00404<?>> method_53254() {
        return this.field_45786;
    }

    public void addSupportedBlock(class00891 class008912) {
        Objects.requireNonNull(class008912, "block");
        this.field_19315.add(class008912);
    }

    private void m_handler$zka000$fabric_object_builder_api_v1$mutableBlocks_1(class00400 class004002, Set set, CallbackInfo callbackInfo) {
        if (!(this.field_19315 instanceof HashSet)) {
            this.field_19315 = new HashSet<class00891>(this.field_19315);
        }
    }

    public boolean sodium$removeRenderPredicate(BlockEntityRenderPredicate blockEntityRenderPredicate) {
        int n = ArrayUtils.indexOf((Object[])this.sodium$renderPredicates, (Object)blockEntityRenderPredicate);
        if (n == -1) {
            return false;
        }
        this.sodium$renderPredicates = (BlockEntityRenderPredicate[])ArrayUtils.remove((Object[])this.sodium$renderPredicates, (int)n);
        return true;
    }
}

