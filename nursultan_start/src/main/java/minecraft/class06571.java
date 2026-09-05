/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.settings.impl.DebugSettings
 *  minecraft.class00500
 *  minecraft.class01194
 *  minecraft.class03556
 *  minecraft.class04770
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class05440
 *  minecraft.class05467
 *  minecraft.class05847
 *  minecraft.class05989
 *  minecraft.class06501
 *  minecraft.class06665
 *  minecraft.class06912
 *  minecraft.class07049
 *  minecraft.class07082
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class08036
 *  minecraft.class08092
 */
package minecraft;

import com.viaversion.viafabricplus.settings.impl.DebugSettings;
import minecraft.class00500;
import minecraft.class01194;
import minecraft.class03556;
import minecraft.class04770;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class05440;
import minecraft.class05467;
import minecraft.class05847;
import minecraft.class05989;
import minecraft.class06501;
import minecraft.class06573;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06665;
import minecraft.class06912;
import minecraft.class07049;
import minecraft.class07082;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class08036;
import minecraft.class08092;

public class class06571
extends class06581 {
    public class06571(class06573 class065732) {
        super(class065732);
    }

    @Override
    public class07082 N(class06501 class065012) {
        class07209 class072092;
        class08036 class080362 = class065012.method_8036();
        class07299 class072992 = class065012.method_8045();
        class00500 class005002 = class072992.method_8320(class072092 = class065012.method_8037());
        if (class05847.T((class00500)class005002) || class05440.v((class00500)class005002) || class05467.v((class00500)class005002)) {
            class07299 class072993 = class072992;
            class08036 class080363 = class080362;
            class07209 class072093 = class072092;
            class04891 class048912 = class04909.Uc;
            class04911 class049112 = class04911.field_15245;
            float f = 1.0f;
            float f2 = class072992.method_8409().z() * 0.4f + 0.8f;
            if (this.N(class072993, (class07049)class080363, class072093, class048912, class049112, f, f2)) {
                class072993.method_8396((class07049)class080363, class072093, class048912, class049112, f, f2);
            }
            class072992.method_8652(class072092, (class00500)class005002.y((class08092)class06665.n, (Comparable)Boolean.valueOf(true)), 11);
            class072992.N((class07049)class080362, (class03556)class01194.L, class072092);
            if (class080362 != null) {
                class065012.method_8041().N(1, (class07438)class080362, class065012.method_20287().N());
            }
            return class07082.N;
        }
        class07209 class072094 = class072092.method_10093(class065012.method_8038());
        if (class05989.N((class07299)class072992, (class07209)class072094, (class07211)class065012.method_8042())) {
            class07299 class072994 = class072992;
            class08036 class080364 = class080362;
            class07209 class072095 = class072094;
            class04891 class048913 = class04909.Uc;
            class04911 class049113 = class04911.field_15245;
            float f = 1.0f;
            float f3 = class072992.method_8409().z() * 0.4f + 0.8f;
            if (this.N(class072994, (class07049)class080364, class072095, class048913, class049113, f, f3)) {
                class072994.method_8396((class07049)class080364, class072095, class048913, class049113, f, f3);
            }
            class00500 class005003 = class05989.y((class07290)class072992, (class07209)class072094);
            class072992.method_8652(class072094, class005003, 11);
            class072992.N((class07049)class080362, (class03556)class01194.Z, class072092);
            class06584 class065842 = class065012.method_8041();
            if (class080362 instanceof class04770) {
                class06912.w.N((class04770)class080362, class072094, class065842);
                class065842.N(1, (class07438)class080362, class065012.method_20287().N());
            }
            return class07082.N;
        }
        return class07082.u;
    }

    private boolean N(class07299 class072992, class07049 class070492, class07209 class072092, class04891 class048912, class04911 class049112, float f, float f2) {
        return !DebugSettings.INSTANCE.serversidePlaceSounds.isEnabled();
    }
}

