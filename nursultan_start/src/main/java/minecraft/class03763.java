/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00390
 *  minecraft.class00392
 *  minecraft.class00405
 *  minecraft.class01055
 *  minecraft.class01202
 *  minecraft.class01590
 *  minecraft.class05216
 *  minecraft.class05482
 *  minecraft.class05724
 *  minecraft.class06202
 */
package minecraft;

import java.util.Collection;
import java.util.Objects;
import minecraft.class00390;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class01055;
import minecraft.class01202;
import minecraft.class01590;
import minecraft.class03758;
import minecraft.class03790;
import minecraft.class03794;
import minecraft.class05216;
import minecraft.class05482;
import minecraft.class05724;
import minecraft.class06202;

class class03763
extends class05724<class03758> {
    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public class03763(class03790 class037902, class06202 class062022, Collection collection) {
        int n = class037902.field_22789;
        int n2 = class037902.N.u();
        int n3 = class037902.N.L();
        Objects.requireNonNull((class01590)class062022.i_3);
        super(class062022, n, n2, n3, 33);
        for (class01055 class010552 : collection) {
            String string = class03794.N(class03794.M, class010552.i());
            if (string.isEmpty()) continue;
            class00392 class003922 = class00390.N((class00392)class010552.y(), (class00405)class00405.N.N(Boolean.valueOf(true)));
            class05216 class052162 = class00392.N((String)"selectWorld.experimental.details.entry", (Object[])new Object[]{string});
            this.method_25321((class01202)new class03758(class037902, class003922, (class00392)class052162, class05482.N((class01590)class03790.N(class037902), (class00392)class052162, (int)this.method_25322())));
        }
    }

    public int method_25322() {
        return this.field_22758 * 3 / 4;
    }
}

