/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.EntityESP
 *  Nursultan.class11045
 *  Nursultan.class11051
 *  Nursultan.class11535
 *  Nursultan.class11785
 *  Nursultan.class11786
 *  Nursultan.class11791
 *  Nursultan.class11793
 *  Nursultan.class11814
 *  Nursultan.class11824
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.MapCodec
 *  minecraft.class02484
 *  minecraft.class02837
 *  minecraft.class05216
 *  minecraft.class06541
 *  minecraft.class06584
 *  minecraft.class07049
 *  minecraft.class07070
 *  minecraft.class07438
 *  minecraft.class07713
 *  minecraft.class08036
 */
package Nursultan;

import Nursultan.EntityESP;
import Nursultan.class11045;
import Nursultan.class11051;
import Nursultan.class11535;
import Nursultan.class11785;
import Nursultan.class11786;
import Nursultan.class11791;
import Nursultan.class11793;
import Nursultan.class11814;
import Nursultan.class11824;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.Predicate;
import minecraft.class02484;
import minecraft.class02837;
import minecraft.class05216;
import minecraft.class06541;
import minecraft.class06584;
import minecraft.class07049;
import minecraft.class07070;
import minecraft.class07438;
import minecraft.class07713;
import minecraft.class08036;

public class class11273
extends class11045<class08036> {
    public static Object y_0;
    public static Object y_1;
    public static Object y_2;

    public class11273(EntityESP entityESP, String string, boolean bl) {
        super(entityESP, string, bl);
    }

    static {
        class11273.N();
        class11273.i();
        y_0 = Codec.STRING.optionalFieldOf("don-item");
        y_1 = Codec.STRING.optionalFieldOf("minecraft:don-item");
        y_2 = class02837.L.optionalFieldOf("PublicBukkitValues");
    }

    private String B(String string) {
        if (string.startsWith("sphere-")) {
            String string2 = string.substring(string.indexOf(45) + 1).toUpperCase();
            return String.valueOf(class06541.field_1080) + " [" + String.valueOf(class06541.field_1061) + string2 + String.valueOf(class06541.field_1080) + "]" + String.valueOf(class06541.field_1070);
        }
        return "";
    }

    private static void i() {
        y_0 = null;
        y_1 = null;
        y_2 = null;
    }

    public class05216 L(class08036 class080362) {
        class11814 class118142;
        class05216 class052162 = super.L((class07438)class080362);
        if (((class11535)((EntityESP)((class11051)this).N_0).L_3).U()) {
            class118142 = class07070.values();
            int n = ((class07070[])class118142).length;
            for (int i = 0; i < n; ++i) {
                class11814 class118143 = class118142[i];
                String string = this.N(class080362.method_61420((class07070)class118143));
                if (string.isEmpty()) continue;
                class052162.i(string);
            }
        }
        if (class080362 instanceof class11814 && ((Boolean)((class11824)(class118142 = (class11814)class080362).dataManager()).y().N()).booleanValue()) {
            class052162.i(this.R());
        }
        return class052162;
    }

    public boolean test(class07049 class070492) {
        return class11791.B().and(class11791.N().or(class070493 -> class070492 instanceof class11814 && (Boolean)((class11824)((class11814)class070492).dataManager()).y().N() != false)).and(class11791.E().negate()).and(class11791.z().negate()).and(class11791.y().negate()).and((Predicate<class07049>)((class11786)((EntityESP)((class11051)this).N_0).M_3)).and((Predicate<class07049>)((class11785)((EntityESP)((class11051)this).N_0).M_2)).and((Predicate<class07049>)((class11793)((EntityESP)((class11051)this).N_0).i_0)).test(class070492);
    }

    private String N(class06584 class065842) {
        Optional optional;
        class02837 class028372 = (class02837)class065842.y().method_58694(class02484.y);
        if (class028372 == null) {
            return "";
        }
        Optional optional2 = (Optional)((MapCodec)y_0).codec().parse((DynamicOps)class07713.N, (Object)class028372.y()).getOrThrow();
        if (optional2.isPresent()) {
            return this.B((String)optional2.get());
        }
        Optional optional3 = (Optional)((MapCodec)y_2).codec().parse((DynamicOps)class07713.N, (Object)class028372.y()).getOrThrow();
        if (optional3.isPresent() && (optional = (Optional)((MapCodec)y_1).codec().parse((DynamicOps)class07713.N, (Object)((class02837)optional3.get()).y()).getOrThrow()).isPresent()) {
            return this.B((String)optional.get());
        }
        return "";
    }

    public int u(class08036 class080362) {
        return class080362.method_5767() || class080362.method_21751() ? -1434451968 : super.u((class07049)class080362);
    }

    private static void N() {
    }

    private String R() {
        return String.valueOf(class06541.field_1080) + " [" + String.valueOf(class06541.field_1061) + "DORMANT" + String.valueOf(class06541.field_1080) + "]" + String.valueOf(class06541.field_1070);
    }
}

