/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class02060
 *  minecraft.class02080
 *  minecraft.class02102
 *  minecraft.class03686
 *  minecraft.class05220
 *  minecraft.class05362
 */
package minecraft;

import minecraft.class00392;
import minecraft.class02060;
import minecraft.class02080;
import minecraft.class02102;
import minecraft.class03686;
import minecraft.class05096;
import minecraft.class05123;
import minecraft.class05220;
import minecraft.class05362;

class class05106
extends class05096 {
    private static final class00392 y = class00392.L((String)"menu.feedback.title");
    public final class05096 N;
    private final class03686 L = new class03686((class05096)this);

    protected class05106(class05096 class050962) {
        super(y);
        this.N = class050962;
    }

    @Override
    public void method_25426() {
        this.L.N(y, this.field_22793);
        class02060 class020602 = (class02060)this.L.L((class02102)new class02060());
        class020602.L().N(4, 4, 4, 0);
        class02080 class020802 = class020602.u(2);
        class05123.N(this, class020802);
        this.L.y((class02102)class05362.method_46430((class00392)class05220.U, class053622 -> this.method_25419()).N(200).N());
        this.L.method_48206(this::method_37063);
        this.method_48640();
    }

    @Override
    public void method_48640() {
        this.L.N();
    }

    @Override
    public void method_25419() {
        this.field_22787.N(this.N);
    }
}

