/*
 * Decompiled with CFR 0.152.
 */
package net.irisshaders.iris.pbr.mipmap;

import java.util.function.IntUnaryOperator;
import net.irisshaders.iris.pbr.mipmap.ChannelMipmapGenerator$BlendFunction;

public class DiscreteBlendFunction
implements ChannelMipmapGenerator$BlendFunction {
    protected final IntUnaryOperator typeFunc;

    public DiscreteBlendFunction(IntUnaryOperator intUnaryOperator) {
        this.typeFunc = intUnaryOperator;
    }

    @Override
    public int blend(int n, int n2, int n3, int n4) {
        int n5 = this.typeFunc.applyAsInt(n);
        int n6 = this.typeFunc.applyAsInt(n2);
        int n7 = this.typeFunc.applyAsInt(n3);
        int n8 = this.typeFunc.applyAsInt(n4);
        int n9 = DiscreteBlendFunction.selectTargetType(n5, n6, n7, n8);
        int n10 = 0;
        int n11 = 0;
        if (n5 == n9) {
            n10 += n;
            ++n11;
        }
        if (n6 == n9) {
            n10 += n2;
            ++n11;
        }
        if (n7 == n9) {
            n10 += n3;
            ++n11;
        }
        if (n8 == n9) {
            n10 += n4;
            ++n11;
        }
        return n10 / n11;
    }

    public static int selectTargetType(int n, int n2, int n3, int n4) {
        if (n != n2 && n != n3) {
            if (n3 == n4) {
                return n3;
            }
            if (n != n4 && (n2 == n3 || n2 == n4)) {
                return n2;
            }
        }
        return n;
    }
}

