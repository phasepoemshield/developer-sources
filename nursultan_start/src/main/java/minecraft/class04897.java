/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01883
 *  minecraft.class01894
 *  minecraft.class05220
 *  minecraft.class05361
 *  minecraft.class05362
 *  minecraft.class08394
 */
package minecraft;

import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01883;
import minecraft.class01894;
import minecraft.class05220;
import minecraft.class05361;
import minecraft.class05362;
import minecraft.class08394;

public class class04897
extends class05362 {
    public final class01883 field_45356;

    public class04897(int n, int n2, int n3, int n4, class01883 class018832, class05361 class053612, class00392 class003922) {
        super(n, n2, n3, n4, class003922, class053612, field_40754);
        this.field_45356 = class018832;
    }

    public class04897(int n, int n2, class01883 class018832, class05361 class053612, class00392 class003922) {
        this(0, 0, n, n2, class018832, class053612, class003922);
    }

    public class04897(int n, int n2, int n3, int n4, class01883 class018832, class05361 class053612) {
        this(n, n2, n3, n4, class018832, class053612, class05220.N);
    }

    public void method_75752(class01054 class010542, int n, int n2, float f) {
        class01894 class018942 = this.field_45356.N(this.method_37303(), this.method_25367());
        class010542.N(class08394.Na, class018942, this.method_46426(), this.method_46427(), this.field_22758, this.field_22759);
    }
}

