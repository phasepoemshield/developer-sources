/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00577
 *  minecraft.class00580
 *  minecraft.class00937
 *  minecraft.class01028
 *  minecraft.class01054
 *  minecraft.class01065
 *  minecraft.class02566
 *  minecraft.class03050
 *  minecraft.class03054
 *  org.joml.Matrix3x2f
 *  org.joml.Matrix3x2fc
 */
package minecraft;

import java.util.function.Consumer;
import minecraft.class00577;
import minecraft.class00580;
import minecraft.class00937;
import minecraft.class01028;
import minecraft.class01054;
import minecraft.class01065;
import minecraft.class02566;
import minecraft.class03050;
import minecraft.class03054;
import minecraft.class06465;
import org.joml.Matrix3x2f;
import org.joml.Matrix3x2fc;

class class06475
implements class06465 {
    private final class01054 N;
    private final class00580 y;
    private class00577 L;

    public class06475(class01054 class010542) {
        this.N = class010542;
        this.y = class010542.N(class01065.field_63850, null);
        this.L = this.y.N();
    }

    @Override
    public boolean N(int n, float f, class01028 class010282) {
        this.y.N(class00937.field_62009, 0, n, this.L.y(f), class010282);
        return false;
    }

    @Override
    public void N(int n, int n2, int n3, int n4, float f, class03054 class030542) {
        int n5 = class02566.N((float)f, (int)class030542.i());
        this.N.N(n, n2, n3, n4, n5);
    }

    @Override
    public void N(int n, int n2, boolean bl, class03054 class030542, class03050 class030502) {
    }

    @Override
    public void N(int n, int n2, int n3, int n4, int n5) {
        this.N.N(n, n2, n3, n4, n5);
    }

    @Override
    public void N(Consumer<Matrix3x2f> consumer) {
        consumer.accept((Matrix3x2f)this.N.i());
        this.L = this.L.N((Matrix3x2fc)new Matrix3x2f((Matrix3x2fc)this.N.i()));
    }
}

