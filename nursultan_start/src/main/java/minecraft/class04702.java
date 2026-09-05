/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00390
 *  minecraft.class00392
 *  minecraft.class00405
 *  minecraft.class00580
 *  minecraft.class00937
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class04737
 *  minecraft.class05096
 *  minecraft.class05097
 *  minecraft.class05220
 *  minecraft.class05362
 *  minecraft.class05407
 *  minecraft.class05482
 */
package minecraft;

import java.util.Objects;
import minecraft.class00390;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class00580;
import minecraft.class00937;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class04654;
import minecraft.class04737;
import minecraft.class05096;
import minecraft.class05097;
import minecraft.class05220;
import minecraft.class05362;
import minecraft.class05407;
import minecraft.class05482;

public class class04702
extends class05407 {
    private static final class00392 N = class00392.L((String)"mco.errorMessage.generic");
    private final class05096 y;
    private final class00392 L;
    private class05482 u = class05482.N;

    private class04702(class04737 class047372, class05096 class050962) {
        super(class047372.N());
        this.y = class050962;
        this.L = class00390.N((class00392)class047372.y(), (class00405)class00405.N.N(-2142128));
    }

    public class04702(class00392 class003922, class00392 class003923, class05096 class050962) {
        this(new class04737(class003922, class003923), class050962);
    }

    public class04702(class00392 class003922, class05096 class050962) {
        this(new class04737(N, class003922), class050962);
    }

    public class04702(class05097 class050972, class05096 class050962) {
        this(class04737.N((class05097)class050972), class050962);
    }

    public void method_25426() {
        this.method_37063((class04654)class05362.method_46430((class00392)class05220.B, class053622 -> this.method_25419()).N(this.field_22789 / 2 - 100, this.field_22790 - 52, 200, 20).N());
        this.u = class05482.N((class01590)this.field_22793, (class00392)this.L, (int)(this.field_22789 * 3 / 4));
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        super.method_25394(class010542, n, n2, f);
        class010542.N(this.field_22793, this.field_22785, this.field_22789 / 2, 80, -1);
        class00580 class005802 = class010542.B();
        int n3 = this.field_22789 / 2;
        Objects.requireNonNull((class01590)this.field_22787.i_3);
        this.u.N(class00937.field_62010, n3, 100, 9, class005802);
    }

    public void method_25419() {
        this.field_22787.N(this.y);
    }

    public class00392 method_25435() {
        return class05220.N((class00392[])new class00392[]{super.method_25435(), this.L});
    }
}

