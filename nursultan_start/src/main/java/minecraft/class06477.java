/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00577
 *  minecraft.class00580
 *  minecraft.class00937
 *  minecraft.class01028
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
import minecraft.class03050;
import minecraft.class03054;
import minecraft.class06465;
import org.joml.Matrix3x2f;
import org.joml.Matrix3x2fc;

class class06477
implements class06465 {
    private final class00580 N;

    public class06477(class00580 class005802) {
        this.N = class005802;
    }

    @Override
    public boolean N(int n, float f, class01028 class010282) {
        this.N.N(class00937.field_62009, 0, n, class010282);
        return false;
    }

    @Override
    public void N(int n, int n2, int n3, int n4, float f, class03054 class030542) {
    }

    @Override
    public void N(int n, int n2, boolean bl, class03054 class030542, class03050 class030502) {
    }

    @Override
    public void N(int n, int n2, int n3, int n4, int n5) {
    }

    @Override
    public void N(Consumer<Matrix3x2f> consumer) {
        class00577 class005772 = this.N.N();
        Matrix3x2f matrix3x2f = new Matrix3x2f(class005772.N());
        consumer.accept(matrix3x2f);
        this.N.N(class005772.N((Matrix3x2fc)matrix3x2f));
    }
}

