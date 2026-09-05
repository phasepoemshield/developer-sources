/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01202
 *  minecraft.class05724
 *  minecraft.class06202
 */
package minecraft;

import minecraft.class01202;
import minecraft.class05112;
import minecraft.class05130;
import minecraft.class05724;
import minecraft.class06202;

class class05115
extends class05724<class05130> {
    final /* synthetic */ class05112 N;

    public class05115(class05112 class051122, class06202 class062022) {
        this.N = class051122;
        super(class062022, class051122.field_22789, class051122.y.u(), class051122.y.L(), 36);
        if (class051122.N.R != null) {
            class051122.N.R.forEach((string, string2) -> this.method_25321((class01202)new class05130(this.N, (String)string, (String)string2)));
        }
    }
}

