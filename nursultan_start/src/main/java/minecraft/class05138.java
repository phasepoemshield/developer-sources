/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class02102
 *  minecraft.class03686
 *  minecraft.class04230
 *  minecraft.class04654
 *  minecraft.class05220
 *  minecraft.class05362
 *  minecraft.class05407
 *  minecraft.class06478
 *  minecraft.class07529
 */
package minecraft;

import minecraft.class00392;
import minecraft.class02102;
import minecraft.class03686;
import minecraft.class04230;
import minecraft.class04654;
import minecraft.class05096;
import minecraft.class05220;
import minecraft.class05362;
import minecraft.class05407;
import minecraft.class06478;
import minecraft.class07529;

public class class05138
extends class05407 {
    private static final class00392 N = class00392.L((String)"mco.client.incompatible.title").y(-65536);
    private static final class00392 y = class00392.y((String)class07529.y().comp_4025()).y(-65536);
    private static final class00392 L = class00392.N((String)"mco.client.unsupported.snapshot.version", (Object[])new Object[]{y});
    private static final class00392 u = class00392.N((String)"mco.client.outdated.stable.version", (Object[])new Object[]{y});
    private final class05096 i;
    private final class03686 R = new class03686((class05096)((Object)this));

    public class05138(class05096 class050962) {
        super(N);
        this.i = class050962;
    }

    private class00392 N() {
        if (class07529.y().comp_4031()) {
            return u;
        }
        return L;
    }

    public void method_25426() {
        this.R.N(N, this.field_22793);
        this.R.L((class02102)new class04230(this.N(), this.field_22793).N(true));
        this.R.y((class02102)class05362.method_46430((class00392)class05220.U, class053622 -> this.method_25419()).N(200).N());
        this.R.method_48206(class046542 -> {
            class06478 cfr_ignored_0 = (class06478)this.method_37063((class04654)class046542);
        });
        this.method_48640();
    }

    public void method_48640() {
        this.R.N();
    }

    public void method_25419() {
        this.field_22787.N(this.i);
    }
}

