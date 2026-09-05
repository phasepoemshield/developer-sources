/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class03008
 *  minecraft.class03556
 *  minecraft.class03876
 *  minecraft.class03877
 *  minecraft.class03881
 *  minecraft.class03906
 *  minecraft.class04084
 *  minecraft.class05041
 *  minecraft.class05056
 *  minecraft.class05946
 *  minecraft.class06066
 *  minecraft.class06069
 *  minecraft.class06075
 */
package Nursultan;

import java.util.HashMap;
import java.util.Map;
import minecraft.class01894;
import minecraft.class03008;
import minecraft.class03556;
import minecraft.class03876;
import minecraft.class03877;
import minecraft.class03881;
import minecraft.class03906;
import minecraft.class04084;
import minecraft.class05041;
import minecraft.class05056;
import minecraft.class05946;
import minecraft.class06066;
import minecraft.class06069;
import minecraft.class06075;

public class class10304
implements class03881 {
    private final Map<class03877, class03877> u = new HashMap<class03877, class03877>();
    final /* synthetic */ long N;
    final /* synthetic */ boolean y;
    final /* synthetic */ class04084 L;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public class10304(class04084 class040842, long l, boolean bl) {
        this.L = class040842;
        this.N = l;
        this.y = bl;
    }

    public class03877 apply(class03877 class038772) {
        return this.u.computeIfAbsent(class038772, this::N);
    }

    private class06069 N(long l) {
        return new class06075(this.N + l);
    }

    private class03877 N(class03877 class038772) {
        if (class038772 instanceof class06066) {
            class06066 class060662 = (class06066)class038772;
            class06069 class060692 = this.y ? this.N(0L) : this.L.N.N(class01894.y((String)"terrain"));
            return class060662.N(class060692);
        }
        if (class038772 instanceof class03906) {
            return new class03906(this.N);
        }
        return class038772;
    }

    public class03876 N(class03876 class038762) {
        class03556 var2 = class038762.y();
        if (this.y) {
            if (var2.N(class03008.N)) {
                class05041 class050412 = class05041.N((class06069)this.N(0L), (class05056)new class05056(-7, 1.0, new double[]{1.0}));
                return new class03876(var2, class050412);
            }
            if (var2.N(class03008.y)) {
                class05041 class050413 = class05041.N((class06069)this.N(1L), (class05056)new class05056(-7, 1.0, new double[]{1.0}));
                return new class03876(var2, class050413);
            }
            if (var2.N(class03008.z)) {
                class05041 class050414 = class05041.y((class06069)this.L.N.N(class03008.z.N()), (class05056)new class05056(0, 0.0, new double[0]));
                return new class03876(var2, class050414);
            }
        }
        class05041 class050415 = this.L.N((class05946)var2.i().orElseThrow());
        return new class03876(var2, class050415);
    }
}

