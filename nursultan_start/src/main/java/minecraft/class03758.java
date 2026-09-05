/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class00580
 *  minecraft.class00937
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class05220
 *  minecraft.class05482
 *  minecraft.class05699
 */
package minecraft;

import java.util.Objects;
import minecraft.class00392;
import minecraft.class00580;
import minecraft.class00937;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class03790;
import minecraft.class05220;
import minecraft.class05482;
import minecraft.class05699;

class class03758
extends class05699<class03758> {
    private final class00392 y;
    private final class00392 L;
    private final class05482 u;
    final /* synthetic */ class03790 N;

    class03758(class03790 class037902, class00392 class003922, class00392 class003923, class05482 class054822) {
        this.N = class037902;
        this.y = class003922;
        this.L = class003923;
        this.u = class054822;
    }

    public void method_25343(class01054 class010542, int n, int n2, boolean bl, float f) {
        class00580 class005802 = class010542.B();
        class010542.y((class01590)class03790.y((class03790)this.N).i_3, this.y, this.method_73380(), this.method_73382(), -1);
        int n3 = this.method_73380();
        int n4 = this.method_73382() + 12;
        Objects.requireNonNull(class03790.L(this.N));
        this.u.N(class00937.field_62009, n3, n4, 9, class005802);
    }

    public class00392 method_37006() {
        return class00392.N((String)"narrator.select", (Object[])new Object[]{class05220.N((class00392[])new class00392[]{this.y, this.L})});
    }
}

