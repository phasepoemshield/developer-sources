/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01065
 *  minecraft.class01590
 *  minecraft.class01894
 *  minecraft.class02566
 *  minecraft.class03428
 *  minecraft.class03457
 *  minecraft.class04230
 *  minecraft.class05936
 *  minecraft.class06202
 *  minecraft.class06308
 *  minecraft.class06478
 *  minecraft.class06611
 *  minecraft.class08394
 */
package minecraft;

import java.util.Objects;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01065;
import minecraft.class01590;
import minecraft.class01894;
import minecraft.class02566;
import minecraft.class03428;
import minecraft.class03457;
import minecraft.class04230;
import minecraft.class05686;
import minecraft.class05717;
import minecraft.class05936;
import minecraft.class06202;
import minecraft.class06308;
import minecraft.class06478;
import minecraft.class06611;
import minecraft.class08394;

public class class05725
extends class06308 {
    private static final class01894 N = class01894.y((String)"widget/checkbox_selected_highlighted");
    private static final class01894 y = class01894.y((String)"widget/checkbox_selected");
    private static final class01894 L = class01894.y((String)"widget/checkbox_highlighted");
    private static final class01894 u = class01894.y((String)"widget/checkbox");
    private static final int i = 4;
    private static final int R = 8;
    private boolean M;
    private final class05717 B;
    private final class04230 Z;

    class05725(int n, int n2, int n3, class00392 class003922, class01590 class015902, boolean bl, class05717 class057172) {
        super(n, n2, 0, 0, class003922);
        this.Z = new class04230(class003922, class015902);
        this.Z.y(2);
        this.field_22758 = this.N(n3, class015902);
        this.field_22759 = this.y(class015902);
        this.M = bl;
        this.B = class057172;
    }

    public static class05686 y(class00392 class003922, class01590 class015902) {
        return new class05686(class003922, class015902);
    }

    private int y(class01590 class015902) {
        return Math.max(class05725.N(class015902), this.Z.method_25364());
    }

    public boolean y() {
        return this.M;
    }

    public int N(int n, class01590 class015902) {
        this.field_22758 = this.N(n, this.method_25369(), class015902);
        this.Z.N(this.field_22758);
        return this.field_22758;
    }

    public static int N(class01590 class015902) {
        Objects.requireNonNull(class015902);
        return 17;
    }

    static int N(class00392 class003922, class01590 class015902) {
        return class05725.N(class015902) + 4 + class015902.N((class05936)class003922);
    }

    private int N(int n, class00392 class003922, class01590 class015902) {
        return Math.min(class05725.N(class003922, class015902), n);
    }

    public void method_25306(class06611 class066112) {
        this.M = !this.M;
        this.B.onValueChange(this, this.M);
    }

    public void method_75752(class01054 class010542, int n, int n2, float f) {
        class01590 class015902 = (class01590)class06202.Nq().i_3;
        class01894 class018942 = this.M ? (this.method_25370() ? N : y) : (this.method_25370() ? L : u);
        int n3 = class05725.N(class015902);
        class010542.N(class08394.Na, class018942, this.method_46426(), this.method_46427(), n3, n3, class02566.y((float)this.field_22765));
        int n4 = this.method_46426() + n3 + 4;
        int n5 = this.method_46427() + n3 / 2 - this.Z.method_25364() / 2;
        this.Z.y(n4, n5);
        this.Z.N(class010542.N((class06478)this, class01065.N((boolean)this.method_49606())));
    }

    public void method_47399(class03428 class034282) {
        class034282.N(class03457.field_33788, (class00392)this.method_25360());
        if (this.field_22763) {
            if (this.method_25370()) {
                class034282.N(class03457.field_33791, (class00392)class00392.L((String)(this.M ? "narration.checkbox.usage.focused.uncheck" : "narration.checkbox.usage.focused.check")));
            } else {
                class034282.N(class03457.field_33791, (class00392)class00392.L((String)(this.M ? "narration.checkbox.usage.hovered.uncheck" : "narration.checkbox.usage.hovered.check")));
            }
        }
    }
}

