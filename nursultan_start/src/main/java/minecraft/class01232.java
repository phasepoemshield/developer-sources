/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01223
 *  minecraft.class05216
 *  minecraft.class05220
 *  minecraft.class05361
 *  minecraft.class05362
 *  minecraft.class08394
 */
package minecraft;

import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01223;
import minecraft.class05216;
import minecraft.class05220;
import minecraft.class05361;
import minecraft.class05362;
import minecraft.class08394;

public class class01232
extends class05362 {
    private boolean N;

    public class01232(int n, int n2, class05361 class053612) {
        super(n, n2, 20, 20, (class00392)class00392.L((String)"narrator.button.difficulty_lock"), class053612, field_40754);
    }

    public boolean y() {
        return this.N;
    }

    public void N(boolean bl) {
        this.N = bl;
    }

    public void method_75752(class01054 class010542, int n, int n2, float f) {
        class01223 class012232 = !this.field_22763 ? (this.N ? class01223.field_2139 : class01223.field_2140) : (this.method_25367() ? (this.N ? class01223.field_2138 : class01223.field_2133) : (this.N ? class01223.field_2137 : class01223.field_2132));
        class010542.N(class08394.Na, class012232.field_45362, this.method_46426(), this.method_46427(), this.field_22758, this.field_22759);
    }

    protected class05216 method_25360() {
        return class05220.N((class00392[])new class00392[]{super.method_25360(), this.y() ? class00392.L((String)"narrator.button.difficulty_lock.locked") : class00392.L((String)"narrator.button.difficulty_lock.unlocked")});
    }
}

