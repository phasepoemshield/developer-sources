/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  minecraft.class00389
 *  minecraft.class00394
 *  minecraft.class00483
 *  minecraft.class00484
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01164
 *  minecraft.class01194
 *  minecraft.class01210
 *  minecraft.class01362
 *  minecraft.class02733
 *  minecraft.class02752
 *  minecraft.class03556
 *  minecraft.class03589
 *  minecraft.class04641
 *  minecraft.class04782
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class06092
 *  minecraft.class06584
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class06760
 *  minecraft.class06942
 *  minecraft.class06993
 *  minecraft.class07111
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class08083
 *  minecraft.class08092
 *  minecraft.class08791
 *  net.caffeinemc.mods.lithium.common.util.DirectionConstants
 *  net.raphimc.vialegacy.api.LegacyProtocolVersion
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import minecraft.class00389;
import minecraft.class00394;
import minecraft.class00483;
import minecraft.class00484;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00510;
import minecraft.class00511;
import minecraft.class00517;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01164;
import minecraft.class01194;
import minecraft.class01210;
import minecraft.class01362;
import minecraft.class02733;
import minecraft.class02752;
import minecraft.class03556;
import minecraft.class03589;
import minecraft.class04641;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class06092;
import minecraft.class06584;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class06760;
import minecraft.class06942;
import minecraft.class06993;
import minecraft.class07111;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class08083;
import minecraft.class08092;
import minecraft.class08791;
import net.caffeinemc.mods.lithium.common.util.DirectionConstants;
import net.raphimc.vialegacy.api.LegacyProtocolVersion;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class00513
extends class06760 {
    public static final MapCodec<class00513> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.BOOL.fieldOf("sticky").forGetter(class005132 -> class005132.Z), (App)class00513.t()).apply(instance, class00513::new));
    public static final class06667 L = class06665.z;
    public static final int u = 0;
    public static final int i = 1;
    public static final int R = 2;
    public static final int M = 4;
    private static final Map<class07211, class00494> B = class00389.u((class00494)class00891.L((double)16.0, (double)4.0, (double)16.0));
    private final boolean Z;

    public class00513(boolean bl, class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)((class00500)this.Q.y()).y((class08092)y, (Comparable)class07211.field_11043)).y((class08092)L, (Comparable)Boolean.valueOf(false)));
        this.Z = bl;
    }

    public class00494 z(class00500 class005002) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.r1_1)) {
            if (((Boolean)class005002.L((class08092)L)).booleanValue()) {
                return B.get(class005002.L((class08092)y));
            }
            return class00389.y();
        }
        return super.z(class005002);
    }

    private class07211[] y() {
        return DirectionConstants.ALL;
    }

    protected boolean N(class00500 class005002, class08791 class087912) {
        return false;
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{y, L});
    }

    protected class00500 N(class00500 class005002, class06993 class069932) {
        return (class00500)class005002.y((class08092)y, (Comparable)class069932.N((class07211)class005002.L((class08092)y)));
    }

    protected class00500 N(class00500 class005002, class07111 class071112) {
        return class005002.N(class071112.N((class07211)class005002.L((class08092)y)));
    }

    public MapCodec<class00513> N() {
        return N;
    }

    private void N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.r1_1)) {
            callbackInfoReturnable.setReturnValue((Object)class00389.y());
        }
    }

    private void N(class07299 class072992, class07209 class072092, class00500 class005002) {
        class07211 class072112 = (class07211)class005002.L((class08092)y);
        boolean bl = this.N((class03589)class072992, class072092, class072112);
        if (bl && !((Boolean)class005002.L((class08092)L)).booleanValue()) {
            if (new class00484(class072992, class072092, class072112, true).N()) {
                class072992.method_8427(class072092, (class00891)this, 0, class072112.L());
            }
        } else if (!bl && ((Boolean)class005002.L((class08092)L)).booleanValue()) {
            class00510 class005102;
            class00394 class003942;
            class07209 class072093 = class072092.method_10079(class072112, 2);
            class00500 class005003 = class072992.method_8320(class072093);
            int n = 1;
            if (class005003.N(class00869.LN) && class005003.L((class08092)y) == class072112 && (class003942 = class072992.method_8321(class072093)) instanceof class00510 && (class005102 = (class00510)class003942).N() && (class005102.N(0.0f) < 0.5f || class072992.N() == class005102.z() || ((class04782)class072992).method_14177())) {
                n = 2;
            }
            class072992.method_8427(class072092, (class00891)this, n, class072112.L());
        }
    }

    public class00500 N(class06942 class069422) {
        return (class00500)((class00500)this.W().y((class08092)y, (Comparable)class069422.L().b())).y((class08092)L, (Comparable)Boolean.valueOf(false));
    }

    protected void N_23(class00500 class005002, class07299 class072992, class07209 class072092, class00500 class005003, boolean bl) {
        if (class005003.N(class005002.i())) {
            return;
        }
        if (!class072992.method_8608() && class072992.method_8321(class072092) == null) {
            this.N(class072992, class072092, class005002);
        }
    }

    protected void N(class00500 class005002, class07299 class072992, class07209 class072092, class00891 class008912, @Nullable class02733 class027332, boolean bl) {
        if (!class072992.method_8608()) {
            this.N(class072992, class072092, class005002);
        }
    }

    public void N(class07299 class072992, class07209 class072092, class00500 class005002, @Nullable class07438 class074382, class06584 class065842) {
        if (!class072992.method_8608()) {
            this.N(class072992, class072092, class005002);
        }
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class005002, class072902, class072092, class060922, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class00494)callbackInfoReturnable.getReturnValue();
        }
        if (((Boolean)class005002.L((class08092)L)).booleanValue()) {
            return B.get(class005002.L((class08092)y));
        }
        return class00389.y();
    }

    /*
     * WARNING - void declaration
     */
    private boolean N(class07299 class072992, class07209 class072092, class07211 class072112, boolean bl) {
        void var16_30;
        void var16_28;
        class00500 class005002;
        class00394 class003942;
        Object object2;
        int n2;
        class00500 class005003;
        class00500[] class00500Array22;
        class00484 class004842;
        class07209 class072093 = class072092.method_10093(class072112);
        if (!bl && class072992.method_8320(class072093).N(class00869.yK)) {
            class072992.method_8652(class072093, class00869.N.W(), 276);
        }
        if (!(class004842 = new class00484(class072992, class072092, class072112, bl)).N()) {
            return false;
        }
        HashMap hashMap = Maps.newHashMap();
        List var8 = class004842.L();
        ArrayList arrayList = Lists.newArrayList();
        for (class00500[] class00500Array22 : var8) {
            class005003 = class072992.method_8320((class07209)class00500Array22);
            arrayList.add(class005003);
            hashMap.put(class00500Array22, class005003);
        }
        List var10 = class004842.u();
        class00500Array22 = new class00500[var8.size() + var10.size()];
        class005003 = bl ? class072112 : class072112.b();
        int n3 = 0;
        for (n2 = var10.size() - 1; n2 >= 0; --n2) {
            object2 = (class07209)var10.get(n2);
            class00500 object3 = class072992.method_8320((class07209)object2);
            class003942 = object3.k() ? class072992.method_8321((class07209)object2) : null;
            class00513.N((class00500)object3, (class07284)class072992, (class07209)object2, (class00394)class003942);
            if (!object3.N(class01210.Nh) && class072992.method_8608()) {
                class072992.N(2001, (class07209)object2, class00513.W((class00500)object3));
            }
            class072992.method_8652((class07209)object2, class00869.N.W(), 18);
            class072992.N((class03556)class01194.R, (class07209)object2, class01164.N((class00500)object3));
            class00500Array22[n3++] = object3;
        }
        for (n2 = var8.size() - 1; n2 >= 0; --n2) {
            object2 = (class07209)var8.get(n2);
            class00500 class005004 = class072992.method_8320((class07209)object2);
            object2 = object2.method_10093((class07211)class005003);
            hashMap.remove(object2);
            class003942 = (class00500)class00869.LN.W().y((class08092)y, (Comparable)class072112);
            class072992.method_8652((class07209)object2, (class00500)class003942, 324);
            class072992.method_8438(class00511.N((class07209)object2, (class00500)class003942, (class00500)arrayList.get(n2), class072112, bl, false));
            class00500Array22[n3++] = class005004;
        }
        if (bl) {
            class08083 class080832 = this.Z ? class08083.field_12634 : class08083.field_12637;
            object2 = (class00500)((class00500)class00869.yK.W().y((class08092)class00483.y, (Comparable)class072112)).y((class08092)class00483.L, (Comparable)class080832);
            class00500 class005005 = (class00500)((class00500)class00869.LN.W().y(class00511.y, (Comparable)class072112)).y(class00511.L, (Comparable)(this.Z ? class08083.field_12634 : class08083.field_12637));
            hashMap.remove(class072093);
            class072992.method_8652(class072093, class005005, 324);
            class072992.method_8438(class00511.N(class072093, class005005, (class00500)object2, class072112, true, true));
        }
        class00500 class005004 = class00869.N.W();
        for (class07209 class072094 : hashMap.keySet()) {
            class072992.method_8652(class072094, class005004, 82);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            class003942 = (class07209)entry.getKey();
            class005002 = (class00500)entry.getValue();
            class005002.y((class07284)class072992, (class07209)class003942, 2);
            class005004.N((class07284)class072992, (class07209)class003942, 2);
            class005004.y((class07284)class072992, (class07209)class003942, 2);
        }
        object2 = class02752.N((class07299)class072992, (class07211)class004842.y(), null);
        n3 = 0;
        int n = var10.size() - 1;
        while (var16_28 >= 0) {
            class003942 = class00500Array22[n3++];
            class005002 = (class07209)var10.get((int)var16_28);
            if (class072992 instanceof class04782) {
                class04782 class047822 = (class04782)class072992;
                class003942.N(class047822, (class07209)class005002, false);
            }
            class003942.y((class07284)class072992, (class07209)class005002, 2);
            class072992.method_8452((class07209)class005002, class003942.i(), (class02733)object2);
            --var16_28;
        }
        int n4 = var8.size() - 1;
        while (var16_30 >= 0) {
            class072992.method_8452((class07209)var8.get((int)var16_30), class00500Array22[n3++].i(), (class02733)object2);
            --var16_30;
        }
        if (bl) {
            class072992.method_8452(class072093, class00869.yK, (class02733)object2);
        }
        return true;
    }

    public static boolean N(class00500 class005002, class07299 class072992, class07209 class072092, class07211 class072112, boolean bl, class07211 class072113) {
        if (class072092.method_10264() < class072992.method_31607() || class072092.method_10264() > class072992.method_31600() || !class072992.method_8621().N(class072092)) {
            return false;
        }
        if (class005002.P()) {
            return true;
        }
        if (class005002.N(class00869.LV) || class005002.N(class00869.TU) || class005002.N(class00869.TE) || class005002.N(class00869.nc)) {
            return false;
        }
        if (class072112 == class07211.field_11033 && class072092.method_10264() == class072992.method_31607()) {
            return false;
        }
        if (class072112 == class07211.field_11036 && class072092.method_10264() == class072992.method_31600()) {
            return false;
        }
        if (class005002.N(class00869.yq) || class005002.N(class00869.yd)) {
            if (((Boolean)class005002.L((class08092)L)).booleanValue()) {
                return false;
            }
        } else {
            if (class005002.i((class07290)class072992, class072092) == -1.0f) {
                return false;
            }
            switch (class005002.n()) {
                case field_15972: {
                    return false;
                }
                case field_15971: {
                    return bl;
                }
                case field_15970: {
                    return class072112 == class072113;
                }
            }
        }
        return !class005002.k();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected boolean N(class00500 class005002, class07299 class072992, class07209 class072092, int n, int n2) {
        class07211 class072112 = (class07211)class005002.L((class08092)y);
        class00500 class005003 = (class00500)class005002.y((class08092)L, (Comparable)Boolean.valueOf(true));
        if (!class072992.method_8608()) {
            boolean bl = this.N((class03589)class072992, class072092, class072112);
            if (bl && (n == 1 || n == 2)) {
                class072992.method_8652(class072092, class005003, 2);
                return false;
            }
            if (!bl && n == 0) {
                return false;
            }
        }
        if (n == 0) {
            if (!this.N(class072992, class072092, class072112, true)) return false;
            class072992.method_8652(class072092, class005003, 67);
            class072992.method_8396(null, class072092, class04909.GH, class04911.field_15245, 0.5f, class072992.field_9229.z() * 0.25f + 0.6f);
            class072992.N((class03556)class01194.N, class072092, class01164.N((class00500)class005003));
            return true;
        } else {
            if (n != 1 && n != 2) return true;
            class00394 class003942 = class072992.method_8321(class072092.method_10093(class072112));
            if (class003942 instanceof class00510) {
                ((class00510)class003942).B();
            }
            class00500 class005004 = (class00500)((class00500)class00869.LN.W().y(class00511.y, (Comparable)class072112)).y(class00511.L, (Comparable)(this.Z ? class08083.field_12634 : class08083.field_12637));
            class072992.method_8652(class072092, class005004, 276);
            class072992.method_8438(class00511.N(class072092, class005004, (class00500)this.W().y((class08092)y, (Comparable)class07211.N((int)(n2 & 7))), class072112, false, true));
            class072992.method_8408(class072092, class005004.i());
            class005004.N((class07284)class072992, class072092, 2);
            if (this.Z) {
                class00510 class005102;
                class00394 class003943;
                class07209 class072093 = class072092.method_10069(class072112.P() * 2, class072112.s() * 2, class072112.T() * 2);
                class00500 class005005 = class072992.method_8320(class072093);
                boolean bl = false;
                if (class005005.N(class00869.LN) && (class003943 = class072992.method_8321(class072093)) instanceof class00510 && (class005102 = (class00510)class003943).L() == class072112 && class005102.N()) {
                    class005102.B();
                    bl = true;
                }
                if (!bl) {
                    if (n == 1 && !class005005.P() && class00513.N(class005005, class072992, class072093, class072112.b(), false, class072112) && (class005005.n() == class04641.field_15974 || class005005.N(class00869.yq) || class005005.N(class00869.yd))) {
                        this.N(class072992, class072092, class072112, false);
                    } else {
                        class072992.method_8650(class072092.method_10093(class072112), false);
                    }
                }
            } else {
                class072992.method_8650(class072092.method_10093(class072112), false);
            }
            class072992.method_8396(null, class072092, class04909.Ge, class04911.field_15245, 0.5f, class072992.field_9229.z() * 0.15f + 0.6f);
            class072992.N((class03556)class01194.i, class072092, class01164.N((class00500)class005004));
        }
        return true;
    }

    private boolean N(class03589 class035892, class07209 class072092, class07211 class072112) {
        for (class07211 class072113 : this.y()) {
            if (class072113 == class072112 || !class035892.L(class072092.method_10093(class072113), class072113)) continue;
            return true;
        }
        if (class035892.L(class072092, class07211.field_11033)) {
            return true;
        }
        class07209 class072093 = class072092.method_10084();
        for (class07211 class072114 : this.y()) {
            if (class072114 == class07211.field_11033 || !class035892.L(class072093.method_10093(class072114), class072114)) continue;
            return true;
        }
        return false;
    }

    protected boolean a_(class00500 class005002) {
        return (Boolean)class005002.L((class08092)L);
    }
}

