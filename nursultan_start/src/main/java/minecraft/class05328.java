/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00329
 *  minecraft.class01054
 *  minecraft.class01894
 *  minecraft.class03428
 *  minecraft.class05220
 *  minecraft.class05299
 *  minecraft.class05303
 *  minecraft.class06478
 *  minecraft.class06584
 *  minecraft.class08394
 */
package minecraft;

import java.util.List;
import minecraft.class00329;
import minecraft.class01054;
import minecraft.class01894;
import minecraft.class03428;
import minecraft.class05220;
import minecraft.class05299;
import minecraft.class05303;
import minecraft.class06478;
import minecraft.class06584;
import minecraft.class08394;

abstract class class05328
extends class06478 {
    final class00329 N;
    private final boolean L;
    private final List<class05303> u;
    final /* synthetic */ class05299 y;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public class05328(class05299 class052992, int n, int n2, class00329 class003292, boolean bl, List list) {
        this.y = class052992;
        super(n, n2, 24, 24, class05220.N);
        this.u = list;
        this.N = class003292;
        this.L = bl;
    }

    protected abstract class01894 N(boolean var1);

    protected static class05303 N(int n, int n2, List<class06584> list) {
        return new class05303(3 + n * 7, 3 + n2 * 7, list);
    }

    public void method_47399(class03428 class034282) {
        this.method_37021(class034282);
    }

    public void method_48579(class01054 class010542, int n, int n2, float f) {
        class010542.N(class08394.Na, this.N(this.L), this.method_46426(), this.method_46427(), this.field_22758, this.field_22759);
        float f2 = this.method_46426() + 2;
        float f3 = this.method_46427() + 2;
        for (class05303 class053032 : this.u) {
            class010542.i().pushMatrix();
            class010542.i().translate(f2 + (float)class053032.N(), f3 + (float)class053032.y());
            class010542.i().scale(0.375f, 0.375f);
            class010542.i().translate(-8.0f, -8.0f);
            class010542.N(class053032.N(this.y.y.currentIndex()), 0, 0);
            class010542.i().popMatrix();
        }
    }
}

