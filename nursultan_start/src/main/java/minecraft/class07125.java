/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01996
 *  minecraft.class07094
 */
package minecraft;

import minecraft.class01996;
import minecraft.class07094;
import minecraft.class07124;
import minecraft.class07135;

public class class07125 {
    private final boolean field_40828;
    private final String field_40829;
    private final class01996 field_40830;
    final /* synthetic */ class07094 field_40827;

    public class07125(class07094 class070942, boolean bl, String string, class01996 class019962) {
        this.field_40827 = class070942;
        this.field_40828 = bl;
        this.field_40829 = string;
        this.field_40830 = class019962;
    }

    public <T extends class07135> T method_46566(class07124<T> class071242) {
        T t = class071242.create(this.field_40830);
        String string = this.field_40829 + "/" + t.method_10321();
        if (!this.field_40827.field_40826.add(string)) {
            throw new IllegalStateException("Duplicate provider: " + string);
        }
        if (this.field_40828) {
            this.field_40827.field_38909.put(string, t);
        }
        return t;
    }
}

