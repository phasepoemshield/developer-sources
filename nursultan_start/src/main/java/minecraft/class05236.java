/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  minecraft.class01017
 *  minecraft.class01224
 *  minecraft.class02610
 *  minecraft.class03298
 *  minecraft.class03519
 *  minecraft.class04844
 *  minecraft.class04878
 *  minecraft.class04890
 *  minecraft.class05163
 *  minecraft.class05324
 *  minecraft.class05974
 *  minecraft.class06069
 *  minecraft.class06993
 *  minecraft.class07001
 *  minecraft.class07209
 *  minecraft.class07321
 *  minecraft.class07709
 *  minecraft.class07713
 *  minecraft.class07741
 *  minecraft.class08088
 */
package minecraft;

import com.google.common.collect.Lists;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Locale;
import minecraft.class01017;
import minecraft.class01224;
import minecraft.class02610;
import minecraft.class03298;
import minecraft.class03519;
import minecraft.class04844;
import minecraft.class04878;
import minecraft.class04890;
import minecraft.class05163;
import minecraft.class05248;
import minecraft.class05324;
import minecraft.class05974;
import minecraft.class06069;
import minecraft.class06993;
import minecraft.class07001;
import minecraft.class07209;
import minecraft.class07321;
import minecraft.class07709;
import minecraft.class07713;
import minecraft.class07741;
import minecraft.class08088;

public class class05236
extends class04890 {
    protected final class05248 N;
    protected class07209 y;
    private final int u;
    protected final class06993 L;
    private final List<class04844> i = Lists.newArrayList();
    private final class01224 R;
    private final class02610 M;

    public class05236(class01224 class012242, class05248 class052482, class07209 class072092, int n, class06993 class069932, class05163 class051632, class02610 class026102) {
        super(class04878.Nu, 0, class051632);
        this.R = class012242;
        this.N = class052482;
        this.y = class072092;
        this.u = n;
        this.L = class069932;
        this.M = class026102;
    }

    public class05236(class03298 class032982, class07001 class070012) {
        super(class04878.Nu, class070012);
        this.R = class032982.L();
        this.y = new class07209(class070012.y("PosX", 0), class070012.y("PosY", 0), class070012.y("PosZ", 0));
        this.u = class070012.y("ground_level_delta", 0);
        class03519 class035192 = class032982.y().N((DynamicOps)class07713.N);
        this.N = (class05248)class070012.N("pool_element", class05248.i, (DynamicOps)class035192).orElseThrow(() -> new IllegalStateException("Invalid pool element found"));
        this.L = (class06993)class070012.N_15("rotation", class06993.field_56670).orElseThrow();
        this.k = this.N.N(this.R, this.y, this.L);
        class07741 class077412 = class070012.s("junctions");
        this.i.clear();
        class077412.forEach(arg_0 -> this.N((DynamicOps)class035192, arg_0));
        this.M = class070012.N_15("liquid_settings", class02610.field_52239).orElse(class01017.y);
    }

    public String toString() {
        return String.format(Locale.ROOT, "<%s | %s | %s | %s>", ((Object)((Object)this)).getClass().getSimpleName(), this.y, this.L, this.N);
    }

    public class07209 Z() {
        return this.y;
    }

    public List<class04844> U() {
        return this.i;
    }

    public int z() {
        return this.u;
    }

    public class05248 y() {
        return this.N;
    }

    public void N(class04844 class048442) {
        this.i.add(class048442);
    }

    public void N(class05974 class059742, class05324 class053242, class08088 class080882, class06069 class060692, class05163 class051632, class07209 class072092, boolean bl) {
        this.N.N(this.R, class059742, class053242, class080882, this.y, class072092, this.L, class051632, class060692, this.M, bl);
    }

    private /* synthetic */ void N(DynamicOps dynamicOps, class07709 class077092) {
        this.i.add(class04844.N((Dynamic)new Dynamic(dynamicOps, (Object)class077092)));
    }

    public void N(class05974 class059742, class05324 class053242, class08088 class080882, class06069 class060692, class05163 class051632, class07321 class073212, class07209 class072092) {
        this.N(class059742, class053242, class080882, class060692, class051632, class072092, false);
    }

    public void N(int n, int n2, int n3) {
        super.N(n, n2, n3);
        this.y = this.y.method_10069(n, n2, n3);
    }

    protected void N(class03298 class032982, class07001 class070012) {
        class070012.N("PosX", this.y.method_10263());
        class070012.N("PosY", this.y.method_10264());
        class070012.N("PosZ", this.y.method_10260());
        class070012.N("ground_level_delta", this.u);
        class03519 class035192 = class032982.y().N((DynamicOps)class07713.N);
        class070012.N("pool_element", class05248.i, (DynamicOps)class035192, (Object)this.N);
        class070012.N("rotation", class06993.field_56670, (Object)this.L);
        class07741 class077412 = new class07741();
        for (class04844 class048442 : this.i) {
            class077412.add((Object)((class07709)class048442.N((DynamicOps)class035192).getValue()));
        }
        class070012.N("junctions", (class07709)class077412);
        if (this.M != class01017.y) {
            class070012.N("liquid_settings", class02610.field_52239, (DynamicOps)class035192, (Object)this.M);
        }
    }

    public class06993 R() {
        return this.L;
    }
}

