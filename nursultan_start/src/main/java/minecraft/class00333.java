/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01894
 *  minecraft.class02774
 *  minecraft.class03343
 *  minecraft.class05904
 *  minecraft.class06333
 *  minecraft.class06563
 *  minecraft.class07030
 *  minecraft.class07032
 *  minecraft.class08106
 *  minecraft.class08343
 *  minecraft.class08390
 *  minecraft.class08767
 *  minecraft.class08973
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.impl.client.rendering.SpecialBlockRendererRegistryImpl
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.HashMap;
import java.util.Map;
import minecraft.class00331;
import minecraft.class00335;
import minecraft.class00339;
import minecraft.class00344;
import minecraft.class00346;
import minecraft.class00355;
import minecraft.class00357;
import minecraft.class00358;
import minecraft.class00360;
import minecraft.class00364;
import minecraft.class00368;
import minecraft.class00369;
import minecraft.class00376;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01894;
import minecraft.class02774;
import minecraft.class03343;
import minecraft.class05904;
import minecraft.class06333;
import minecraft.class06563;
import minecraft.class07030;
import minecraft.class07032;
import minecraft.class08106;
import minecraft.class08343;
import minecraft.class08390;
import minecraft.class08767;
import minecraft.class08973;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.client.rendering.SpecialBlockRendererRegistryImpl;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(value=EnvType.CLIENT)
public class class00333 {
    public static final class06333<class01894, MapCodec<? extends class00335>> N = new class06333();
    public static final Codec<class00335> y = N.N(class01894.N).dispatch(class00335::N, mapCodec -> mapCodec);
    private static Map<class00891, class00335> L = ImmutableMap.builder().put((Object)class00869.Bt, (Object)new class00355((class07030)class07032.field_11512)).put((Object)class00869.Bw, (Object)new class00355((class07030)class07032.field_11508)).put((Object)class00869.BO, (Object)new class00355((class07030)class07032.field_11507)).put((Object)class00869.BI, (Object)new class00355((class07030)class07032.field_11511)).put((Object)class00869.Bo, (Object)new class00355((class07030)class07032.field_41313)).put((Object)class00869.BY, (Object)new class08767()).put((Object)class00869.Bl, (Object)new class00355((class07030)class07032.field_11513)).put((Object)class00869.BG, (Object)new class00355((class07030)class07032.field_11512)).put((Object)class00869.Bk, (Object)new class00355((class07030)class07032.field_11508)).put((Object)class00869.Bg, (Object)new class00355((class07030)class07032.field_11507)).put((Object)class00869.BJ, (Object)new class00355((class07030)class07032.field_11511)).put((Object)class00869.Bq, (Object)new class00355((class07030)class07032.field_41313)).put((Object)class00869.BQ, (Object)new class08767()).put((Object)class00869.Bd, (Object)new class00355((class07030)class07032.field_11513)).put((Object)class00869.zY, (Object)new class00364(class06563.field_7952)).put((Object)class00869.zQ, (Object)new class00364(class06563.field_7946)).put((Object)class00869.zO, (Object)new class00364(class06563.field_7958)).put((Object)class00869.zg, (Object)new class00364(class06563.field_7951)).put((Object)class00869.zI, (Object)new class00364(class06563.field_7947)).put((Object)class00869.zJ, (Object)new class00364(class06563.field_7961)).put((Object)class00869.zo, (Object)new class00364(class06563.field_7954)).put((Object)class00869.zq, (Object)new class00364(class06563.field_7944)).put((Object)class00869.zK, (Object)new class00364(class06563.field_7967)).put((Object)class00869.zV, (Object)new class00364(class06563.field_7955)).put((Object)class00869.ze, (Object)new class00364(class06563.field_7945)).put((Object)class00869.zH, (Object)new class00364(class06563.field_7966)).put((Object)class00869.zc, (Object)new class00364(class06563.field_7957)).put((Object)class00869.zX, (Object)new class00364(class06563.field_7942)).put((Object)class00869.za, (Object)new class00364(class06563.field_7964)).put((Object)class00869.zp, (Object)new class00364(class06563.field_7963)).put((Object)class00869.zF, (Object)new class00364(class06563.field_7952)).put((Object)class00869.zA, (Object)new class00364(class06563.field_7946)).put((Object)class00869.zf, (Object)new class00364(class06563.field_7958)).put((Object)class00869.zC, (Object)new class00364(class06563.field_7951)).put((Object)class00869.zS, (Object)new class00364(class06563.field_7947)).put((Object)class00869.zx, (Object)new class00364(class06563.field_7961)).put((Object)class00869.zD, (Object)new class00364(class06563.field_7954)).put((Object)class00869.zh, (Object)new class00364(class06563.field_7944)).put((Object)class00869.zr, (Object)new class00364(class06563.field_7967)).put((Object)class00869.UN, (Object)new class00364(class06563.field_7955)).put((Object)class00869.Uy, (Object)new class00364(class06563.field_7945)).put((Object)class00869.UL, (Object)new class00364(class06563.field_7966)).put((Object)class00869.Uu, (Object)new class00364(class06563.field_7957)).put((Object)class00869.Ui, (Object)new class00364(class06563.field_7942)).put((Object)class00869.UR, (Object)new class00364(class06563.field_7964)).put((Object)class00869.UM, (Object)new class00364(class06563.field_7963)).put((Object)class00869.yM, (Object)new class00346(class06563.field_7952)).put((Object)class00869.yB, (Object)new class00346(class06563.field_7946)).put((Object)class00869.yZ, (Object)new class00346(class06563.field_7958)).put((Object)class00869.yz, (Object)new class00346(class06563.field_7951)).put((Object)class00869.yU, (Object)new class00346(class06563.field_7947)).put((Object)class00869.yE, (Object)new class00346(class06563.field_7961)).put((Object)class00869.yW, (Object)new class00346(class06563.field_7954)).put((Object)class00869.ym, (Object)new class00346(class06563.field_7944)).put((Object)class00869.yP, (Object)new class00346(class06563.field_7967)).put((Object)class00869.ys, (Object)new class00346(class06563.field_7955)).put((Object)class00869.yT, (Object)new class00346(class06563.field_7945)).put((Object)class00869.yb, (Object)new class00346(class06563.field_7966)).put((Object)class00869.yj, (Object)new class00346(class06563.field_7957)).put((Object)class00869.yv, (Object)new class00346(class06563.field_7942)).put((Object)class00869.yn, (Object)new class00346(class06563.field_7964)).put((Object)class00869.yt, (Object)new class00346(class06563.field_7963)).put((Object)class00869.Ee, (Object)new class00357()).put((Object)class00869.EH, (Object)new class00357(class06563.field_7952)).put((Object)class00869.Ec, (Object)new class00357(class06563.field_7946)).put((Object)class00869.EX, (Object)new class00357(class06563.field_7958)).put((Object)class00869.Ea, (Object)new class00357(class06563.field_7951)).put((Object)class00869.Ep, (Object)new class00357(class06563.field_7947)).put((Object)class00869.EF, (Object)new class00357(class06563.field_7961)).put((Object)class00869.EA, (Object)new class00357(class06563.field_7954)).put((Object)class00869.Ef, (Object)new class00357(class06563.field_7944)).put((Object)class00869.EC, (Object)new class00357(class06563.field_7967)).put((Object)class00869.ES, (Object)new class00357(class06563.field_7955)).put((Object)class00869.Ex, (Object)new class00357(class06563.field_7945)).put((Object)class00869.ED, (Object)new class00357(class06563.field_7966)).put((Object)class00869.Eh, (Object)new class00357(class06563.field_7957)).put((Object)class00869.Er, (Object)new class00357(class06563.field_7942)).put((Object)class00869.WN, (Object)new class00357(class06563.field_7964)).put((Object)class00869.Wy, (Object)new class00357(class06563.field_7963)).put((Object)class00869.uy, (Object)new class08343(class05904.y)).put((Object)class00869.uL, (Object)new class08343(class05904.L)).put((Object)class00869.uu, (Object)new class08343(class05904.u)).put((Object)class00869.ui, (Object)new class08343(class05904.i)).put((Object)class00869.uR, (Object)new class08343(class05904.R)).put((Object)class00869.uM, (Object)new class08343(class05904.M)).put((Object)class00869.uB, (Object)new class08343(class05904.B)).put((Object)class00869.uZ, (Object)new class08343(class05904.Z)).put((Object)class00869.uz, (Object)new class08343(class05904.E)).put((Object)class00869.uU, (Object)new class08343(class05904.W)).put((Object)class00869.sC, (Object)new class08343(class05904.z)).put((Object)class00869.sS, (Object)new class08343(class05904.U)).put((Object)class00869.us, (Object)new class08343(class05904.y)).put((Object)class00869.uT, (Object)new class08343(class05904.L)).put((Object)class00869.ub, (Object)new class08343(class05904.u)).put((Object)class00869.uj, (Object)new class08343(class05904.i)).put((Object)class00869.uv, (Object)new class08343(class05904.R)).put((Object)class00869.un, (Object)new class08343(class05904.M)).put((Object)class00869.ut, (Object)new class08343(class05904.B)).put((Object)class00869.uG, (Object)new class08343(class05904.Z)).put((Object)class00869.ul, (Object)new class08343(class05904.E)).put((Object)class00869.ud, (Object)new class08343(class05904.W)).put((Object)class00869.sx, (Object)new class08343(class05904.z)).put((Object)class00869.sD, (Object)new class08343(class05904.U)).put((Object)class00869.uw, (Object)new class08390(class05904.y)).put((Object)class00869.uk, (Object)new class08390(class05904.L)).put((Object)class00869.uY, (Object)new class08390(class05904.u)).put((Object)class00869.uQ, (Object)new class08390(class05904.i)).put((Object)class00869.uO, (Object)new class08390(class05904.R)).put((Object)class00869.ug, (Object)new class08390(class05904.M)).put((Object)class00869.uI, (Object)new class08390(class05904.B)).put((Object)class00869.uJ, (Object)new class08390(class05904.Z)).put((Object)class00869.uK, (Object)new class08390(class05904.E)).put((Object)class00869.uV, (Object)new class08390(class05904.W)).put((Object)class00869.uo, (Object)new class08390(class05904.z)).put((Object)class00869.uq, (Object)new class08390(class05904.U)).put((Object)class00869.ue, (Object)new class08390(class05904.y)).put((Object)class00869.uH, (Object)new class08390(class05904.L)).put((Object)class00869.uc, (Object)new class08390(class05904.u)).put((Object)class00869.uX, (Object)new class08390(class05904.i)).put((Object)class00869.ua, (Object)new class08390(class05904.R)).put((Object)class00869.up, (Object)new class08390(class05904.M)).put((Object)class00869.uF, (Object)new class08390(class05904.B)).put((Object)class00869.uA, (Object)new class08390(class05904.Z)).put((Object)class00869.uf, (Object)new class08390(class05904.E)).put((Object)class00869.ux, (Object)new class08390(class05904.W)).put((Object)class00869.uC, (Object)new class08390(class05904.z)).put((Object)class00869.uS, (Object)new class08390(class05904.U)).put((Object)class00869.mC, (Object)new class00339()).put((Object)class00869.LA, (Object)new class00360(class00344.y)).put((Object)class00869.BH, (Object)new class00360(class00344.L)).put((Object)class00869.Mt, (Object)new class00360(class00344.u)).put((Object)class00869.vj, (Object)new class00360(class00344.i)).put((Object)class00869.vv, (Object)new class00360(class00344.R)).put((Object)class00869.vn, (Object)new class00360(class00344.M)).put((Object)class00869.vt, (Object)new class00360(class00344.B)).put((Object)class00869.vG, (Object)new class00360(class00344.i)).put((Object)class00869.vl, (Object)new class00360(class00344.R)).put((Object)class00869.vd, (Object)new class00360(class00344.M)).put((Object)class00869.vw, (Object)new class00360(class00344.B)).put((Object)class00869.vk, (Object)new class08106(class02774.field_28704, class08973.field_61414)).put((Object)class00869.vY, (Object)new class08106(class02774.field_28705, class08973.field_61414)).put((Object)class00869.vQ, (Object)new class08106(class02774.field_28706, class08973.field_61414)).put((Object)class00869.vO, (Object)new class08106(class02774.field_28707, class08973.field_61414)).put((Object)class00869.vg, (Object)new class08106(class02774.field_28704, class08973.field_61414)).put((Object)class00869.vI, (Object)new class08106(class02774.field_28705, class08973.field_61414)).put((Object)class00869.vJ, (Object)new class08106(class02774.field_28706, class08973.field_61414)).put((Object)class00869.vo, (Object)new class08106(class02774.field_28707, class08973.field_61414)).put((Object)class00869.nX, (Object)new class00369()).build();
    private static final class00360 u = new class00360(class00344.N);

    private static void N(CallbackInfo callbackInfo) {
        if (!(L instanceof HashMap)) {
            L = new HashMap<class00891, class00335>(L);
        }
        SpecialBlockRendererRegistryImpl.setup(L::put);
    }

    public static Map<class00891, class00368<?>> N(class00331 class003312) {
        HashMap<class00891, class00335> hashMap = new HashMap<class00891, class00335>(L);
        if (class03343.N()) {
            hashMap.put(class00869.LA, u);
            hashMap.put(class00869.BH, u);
        }
        ImmutableMap.Builder builder = ImmutableMap.builder();
        hashMap.forEach((class008912, class003352) -> {
            class00368<?> var4 = class003352.N(class003312);
            if (var4 != null) {
                builder.put(class008912, var4);
            }
        });
        return builder.build();
    }

    public static void N() {
        N.N((Object)class01894.y((String)"bed"), class00346.N);
        N.N((Object)class01894.y((String)"banner"), class00364.N);
        N.N((Object)class01894.y((String)"conduit"), class00339.N);
        N.N((Object)class01894.y((String)"chest"), class00360.N);
        N.N((Object)class01894.y((String)"copper_golem_statue"), (Object)class08106.N);
        N.N((Object)class01894.y((String)"head"), class00355.N);
        N.N((Object)class01894.y((String)"player_head"), (Object)class08767.N);
        N.N((Object)class01894.y((String)"shulker_box"), class00357.N);
        N.N((Object)class01894.y((String)"shield"), class00358.y);
        N.N((Object)class01894.y((String)"trident"), class00376.N);
        N.N((Object)class01894.y((String)"decorated_pot"), class00369.N);
        N.N((Object)class01894.y((String)"standing_sign"), (Object)class08343.N);
        N.N((Object)class01894.y((String)"hanging_sign"), (Object)class08390.N);
    }
}

