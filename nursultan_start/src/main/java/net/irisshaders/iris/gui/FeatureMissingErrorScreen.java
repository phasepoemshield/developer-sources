/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class00580
 *  minecraft.class00937
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class04654
 *  minecraft.class05096
 *  minecraft.class05220
 *  minecraft.class05362
 *  minecraft.class05482
 */
package net.irisshaders.iris.gui;

import minecraft.class00392;
import minecraft.class00580;
import minecraft.class00937;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class04654;
import minecraft.class05096;
import minecraft.class05220;
import minecraft.class05362;
import minecraft.class05482;

public class FeatureMissingErrorScreen
extends class05096 {
    private final class05096 parent;
    private final class00392 messageTemp;
    private class05482 message;

    public FeatureMissingErrorScreen(class05096 class050962, class00392 class003922, class00392 class003923) {
        super(class003922);
        this.parent = class050962;
        this.messageTemp = class003923;
    }

    public void method_25426() {
        super.method_25426();
        this.message = class05482.N((class01590)this.field_22793, (int)(this.field_22789 - 50), (class00392[])new class00392[]{this.messageTemp});
        this.method_37063((class04654)class05362.method_46430((class00392)class05220.U, class053622 -> this.field_22787.N(this.parent)).N(this.field_22789 / 2 - 100, 140, 200, 20).N());
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        this.method_25420(class010542, n, n2, f);
        class00580 class005802 = class010542.B();
        class010542.N(this.field_22793, this.field_22785, this.field_22789 / 2, 90, -1);
        this.message.N(class00937.field_62010, this.field_22789 / 2, 110, 9, class005802);
        super.method_25394(class010542, n, n2, f);
    }
}

