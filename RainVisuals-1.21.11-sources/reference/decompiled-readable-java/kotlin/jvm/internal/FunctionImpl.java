/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

import java.io.Serializable;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Function;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function12;
import kotlin.jvm.functions.Function13;
import kotlin.jvm.functions.Function14;
import kotlin.jvm.functions.Function15;
import kotlin.jvm.functions.Function16;
import kotlin.jvm.functions.Function17;
import kotlin.jvm.functions.Function18;
import kotlin.jvm.functions.Function19;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function20;
import kotlin.jvm.functions.Function21;
import kotlin.jvm.functions.Function22;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.functions.Function9;

@Deprecated(message="This class is no longer supported, do not use it.", level=DeprecationLevel.ERROR)
@java.lang.Deprecated
public abstract class FunctionImpl
implements Function,
Function22,
Function16,
Function0,
Function21,
Function12,
Function9,
Function8,
Function10,
Function14,
Function15,
Function19,
Function5,
Function1,
Function4,
Function3,
Function17,
Function11,
Function20,
Function2,
Function18,
Function7,
Function6,
Function13,
Serializable {
    public Object invoke(Object p1, Object p2) {
        this.checkArity(2);
        Object[] objectArray = new Object[2];
        objectArray[0] = p1;
        objectArray[1] = p2;
        return this.invokeVararg(objectArray);
    }

    /*
     * WARNING - void declaration
     */
    public Object invoke(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7) {
        void var7_7;
        this.checkArity(7);
        Object[] objectArray = new Object[7];
        objectArray[0] = p1;
        objectArray[1] = p2;
        objectArray[2] = p3;
        objectArray[3] = p4;
        objectArray[4] = p5;
        objectArray[5] = p6;
        objectArray[6] = var7_7;
        return this.invokeVararg(objectArray);
    }

    /*
     * WARNING - void declaration
     */
    public Object invoke(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8) {
        void var8_8;
        this.checkArity(8);
        Object[] objectArray = new Object[8];
        objectArray[0] = p1;
        objectArray[1] = p2;
        objectArray[2] = p3;
        objectArray[3] = p4;
        objectArray[4] = p5;
        objectArray[5] = p6;
        objectArray[6] = p7;
        objectArray[7] = var8_8;
        return this.invokeVararg(objectArray);
    }

    /*
     * WARNING - void declaration
     */
    public Object invoke(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9, Object p10, Object p11, Object p12, Object p13, Object p14, Object p15, Object p16, Object p17, Object p18) {
        void var18_18;
        this.checkArity(18);
        Object[] objectArray = new Object[18];
        objectArray[0] = p1;
        objectArray[1] = p2;
        objectArray[2] = p3;
        objectArray[3] = p4;
        objectArray[4] = p5;
        objectArray[5] = p6;
        objectArray[6] = p7;
        objectArray[7] = p8;
        objectArray[8] = p9;
        objectArray[9] = p10;
        objectArray[10] = p11;
        objectArray[11] = p12;
        objectArray[12] = p13;
        objectArray[13] = p14;
        objectArray[14] = p15;
        objectArray[15] = p16;
        objectArray[16] = p17;
        objectArray[17] = var18_18;
        return this.invokeVararg(objectArray);
    }

    /*
     * WARNING - void declaration
     */
    public Object invoke(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9, Object p10, Object p11) {
        void var11_11;
        this.checkArity(11);
        Object[] objectArray = new Object[11];
        objectArray[0] = p1;
        objectArray[1] = p2;
        objectArray[2] = p3;
        objectArray[3] = p4;
        objectArray[4] = p5;
        objectArray[5] = p6;
        objectArray[6] = p7;
        objectArray[7] = p8;
        objectArray[8] = p9;
        objectArray[9] = p10;
        objectArray[10] = var11_11;
        return this.invokeVararg(objectArray);
    }

    /*
     * WARNING - void declaration
     */
    public Object invoke(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9, Object p10, Object p11, Object p12, Object p13, Object p14, Object p15, Object p16, Object p17, Object p18, Object p19, Object p20, Object p21, Object p22) {
        void var22_22;
        this.checkArity(22);
        Object[] objectArray = new Object[22];
        objectArray[0] = p1;
        objectArray[1] = p2;
        objectArray[2] = p3;
        objectArray[3] = p4;
        objectArray[4] = p5;
        objectArray[5] = p6;
        objectArray[6] = p7;
        objectArray[7] = p8;
        objectArray[8] = p9;
        objectArray[9] = p10;
        objectArray[10] = p11;
        objectArray[11] = p12;
        objectArray[12] = p13;
        objectArray[13] = p14;
        objectArray[14] = p15;
        objectArray[15] = p16;
        objectArray[16] = p17;
        objectArray[17] = p18;
        objectArray[18] = p19;
        objectArray[19] = p20;
        objectArray[20] = p21;
        objectArray[21] = var22_22;
        return this.invokeVararg(objectArray);
    }

    /*
     * WARNING - void declaration
     */
    public Object invoke(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9) {
        void var9_9;
        this.checkArity(9);
        Object[] objectArray = new Object[9];
        objectArray[0] = p1;
        objectArray[1] = p2;
        objectArray[2] = p3;
        objectArray[3] = p4;
        objectArray[4] = p5;
        objectArray[5] = p6;
        objectArray[6] = p7;
        objectArray[7] = p8;
        objectArray[8] = var9_9;
        return this.invokeVararg(objectArray);
    }

    /*
     * WARNING - void declaration
     */
    public Object invoke(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9, Object p10, Object p11, Object p12, Object p13, Object p14, Object p15, Object p16, Object p17, Object p18, Object p19, Object p20) {
        void var20_20;
        this.checkArity(20);
        Object[] objectArray = new Object[20];
        objectArray[0] = p1;
        objectArray[1] = p2;
        objectArray[2] = p3;
        objectArray[3] = p4;
        objectArray[4] = p5;
        objectArray[5] = p6;
        objectArray[6] = p7;
        objectArray[7] = p8;
        objectArray[8] = p9;
        objectArray[9] = p10;
        objectArray[10] = p11;
        objectArray[11] = p12;
        objectArray[12] = p13;
        objectArray[13] = p14;
        objectArray[14] = p15;
        objectArray[15] = p16;
        objectArray[16] = p17;
        objectArray[17] = p18;
        objectArray[18] = p19;
        objectArray[19] = var20_20;
        return this.invokeVararg(objectArray);
    }

    public Object invoke(Object p1) {
        this.checkArity(1);
        Object[] objectArray = new Object[1];
        objectArray[0] = p1;
        return this.invokeVararg(objectArray);
    }

    public Object invoke() {
        this.checkArity(0);
        return this.invokeVararg(new Object[0]);
    }

    /*
     * WARNING - void declaration
     */
    public Object invoke(Object p1, Object p2, Object p3) {
        void var3_3;
        this.checkArity(3);
        Object[] objectArray = new Object[3];
        objectArray[0] = p1;
        objectArray[1] = p2;
        objectArray[2] = var3_3;
        return this.invokeVararg(objectArray);
    }

    /*
     * WARNING - void declaration
     */
    public Object invoke(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) {
        void var6_6;
        this.checkArity(6);
        Object[] objectArray = new Object[6];
        objectArray[0] = p1;
        objectArray[1] = p2;
        objectArray[2] = p3;
        objectArray[3] = p4;
        objectArray[4] = p5;
        objectArray[5] = var6_6;
        return this.invokeVararg(objectArray);
    }

    public Object invokeVararg(Object ... p) {
        throw new UnsupportedOperationException();
    }

    /*
     * WARNING - void declaration
     */
    public Object invoke(Object p1, Object p2, Object p3, Object p4, Object p5) {
        void var5_5;
        this.checkArity(5);
        Object[] objectArray = new Object[5];
        objectArray[0] = p1;
        objectArray[1] = p2;
        objectArray[2] = p3;
        objectArray[3] = p4;
        objectArray[4] = var5_5;
        return this.invokeVararg(objectArray);
    }

    public abstract int getArity();

    /*
     * WARNING - void declaration
     */
    public Object invoke(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9, Object p10, Object p11, Object p12, Object p13, Object p14, Object p15, Object p16, Object p17, Object p18, Object p19, Object p20, Object p21) {
        void var21_21;
        this.checkArity(21);
        Object[] objectArray = new Object[21];
        objectArray[0] = p1;
        objectArray[1] = p2;
        objectArray[2] = p3;
        objectArray[3] = p4;
        objectArray[4] = p5;
        objectArray[5] = p6;
        objectArray[6] = p7;
        objectArray[7] = p8;
        objectArray[8] = p9;
        objectArray[9] = p10;
        objectArray[10] = p11;
        objectArray[11] = p12;
        objectArray[12] = p13;
        objectArray[13] = p14;
        objectArray[14] = p15;
        objectArray[15] = p16;
        objectArray[16] = p17;
        objectArray[17] = p18;
        objectArray[18] = p19;
        objectArray[19] = p20;
        objectArray[20] = var21_21;
        return this.invokeVararg(objectArray);
    }

    /*
     * WARNING - void declaration
     */
    public Object invoke(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9, Object p10, Object p11, Object p12) {
        void var12_12;
        this.checkArity(12);
        Object[] objectArray = new Object[12];
        objectArray[0] = p1;
        objectArray[1] = p2;
        objectArray[2] = p3;
        objectArray[3] = p4;
        objectArray[4] = p5;
        objectArray[5] = p6;
        objectArray[6] = p7;
        objectArray[7] = p8;
        objectArray[8] = p9;
        objectArray[9] = p10;
        objectArray[10] = p11;
        objectArray[11] = var12_12;
        return this.invokeVararg(objectArray);
    }

    /*
     * WARNING - void declaration
     */
    public Object invoke(Object p1, Object p2, Object p3, Object p4) {
        void var4_4;
        this.checkArity(4);
        Object[] objectArray = new Object[4];
        objectArray[0] = p1;
        objectArray[1] = p2;
        objectArray[2] = p3;
        objectArray[3] = var4_4;
        return this.invokeVararg(objectArray);
    }

    private void throwWrongArity(int expected) {
        throw new IllegalStateException("Wrong function arity, expected: " + expected + ", actual: " + this.getArity());
    }

    /*
     * WARNING - void declaration
     */
    public Object invoke(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9, Object p10, Object p11, Object p12, Object p13, Object p14, Object p15, Object p16, Object p17, Object p18, Object p19) {
        void var19_19;
        this.checkArity(19);
        Object[] objectArray = new Object[19];
        objectArray[0] = p1;
        objectArray[1] = p2;
        objectArray[2] = p3;
        objectArray[3] = p4;
        objectArray[4] = p5;
        objectArray[5] = p6;
        objectArray[6] = p7;
        objectArray[7] = p8;
        objectArray[8] = p9;
        objectArray[9] = p10;
        objectArray[10] = p11;
        objectArray[11] = p12;
        objectArray[12] = p13;
        objectArray[13] = p14;
        objectArray[14] = p15;
        objectArray[15] = p16;
        objectArray[16] = p17;
        objectArray[17] = p18;
        objectArray[18] = var19_19;
        return this.invokeVararg(objectArray);
    }

    /*
     * WARNING - void declaration
     */
    public Object invoke(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9, Object p10, Object p11, Object p12, Object p13, Object p14) {
        void var14_14;
        this.checkArity(14);
        Object[] objectArray = new Object[14];
        objectArray[0] = p1;
        objectArray[1] = p2;
        objectArray[2] = p3;
        objectArray[3] = p4;
        objectArray[4] = p5;
        objectArray[5] = p6;
        objectArray[6] = p7;
        objectArray[7] = p8;
        objectArray[8] = p9;
        objectArray[9] = p10;
        objectArray[10] = p11;
        objectArray[11] = p12;
        objectArray[12] = p13;
        objectArray[13] = var14_14;
        return this.invokeVararg(objectArray);
    }

    private void checkArity(int expected) {
        if (this.getArity() != expected) {
            this.throwWrongArity(expected);
        }
    }

    /*
     * WARNING - void declaration
     */
    public Object invoke(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9, Object p10, Object p11, Object p12, Object p13) {
        void var13_13;
        this.checkArity(13);
        Object[] objectArray = new Object[13];
        objectArray[0] = p1;
        objectArray[1] = p2;
        objectArray[2] = p3;
        objectArray[3] = p4;
        objectArray[4] = p5;
        objectArray[5] = p6;
        objectArray[6] = p7;
        objectArray[7] = p8;
        objectArray[8] = p9;
        objectArray[9] = p10;
        objectArray[10] = p11;
        objectArray[11] = p12;
        objectArray[12] = var13_13;
        return this.invokeVararg(objectArray);
    }

    /*
     * WARNING - void declaration
     */
    public Object invoke(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9, Object p10) {
        void var10_10;
        this.checkArity(10);
        Object[] objectArray = new Object[10];
        objectArray[0] = p1;
        objectArray[1] = p2;
        objectArray[2] = p3;
        objectArray[3] = p4;
        objectArray[4] = p5;
        objectArray[5] = p6;
        objectArray[6] = p7;
        objectArray[7] = p8;
        objectArray[8] = p9;
        objectArray[9] = var10_10;
        return this.invokeVararg(objectArray);
    }

    /*
     * WARNING - void declaration
     */
    public Object invoke(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9, Object p10, Object p11, Object p12, Object p13, Object p14, Object p15, Object p16, Object p17) {
        void var17_17;
        this.checkArity(17);
        Object[] objectArray = new Object[17];
        objectArray[0] = p1;
        objectArray[1] = p2;
        objectArray[2] = p3;
        objectArray[3] = p4;
        objectArray[4] = p5;
        objectArray[5] = p6;
        objectArray[6] = p7;
        objectArray[7] = p8;
        objectArray[8] = p9;
        objectArray[9] = p10;
        objectArray[10] = p11;
        objectArray[11] = p12;
        objectArray[12] = p13;
        objectArray[13] = p14;
        objectArray[14] = p15;
        objectArray[15] = p16;
        objectArray[16] = var17_17;
        return this.invokeVararg(objectArray);
    }

    /*
     * WARNING - void declaration
     */
    public Object invoke(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9, Object p10, Object p11, Object p12, Object p13, Object p14, Object p15) {
        void var15_15;
        this.checkArity(15);
        Object[] objectArray = new Object[15];
        objectArray[0] = p1;
        objectArray[1] = p2;
        objectArray[2] = p3;
        objectArray[3] = p4;
        objectArray[4] = p5;
        objectArray[5] = p6;
        objectArray[6] = p7;
        objectArray[7] = p8;
        objectArray[8] = p9;
        objectArray[9] = p10;
        objectArray[10] = p11;
        objectArray[11] = p12;
        objectArray[12] = p13;
        objectArray[13] = p14;
        objectArray[14] = var15_15;
        return this.invokeVararg(objectArray);
    }

    /*
     * WARNING - void declaration
     */
    public Object invoke(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9, Object p10, Object p11, Object p12, Object p13, Object p14, Object p15, Object p16) {
        void var16_16;
        this.checkArity(16);
        Object[] objectArray = new Object[16];
        objectArray[0] = p1;
        objectArray[1] = p2;
        objectArray[2] = p3;
        objectArray[3] = p4;
        objectArray[4] = p5;
        objectArray[5] = p6;
        objectArray[6] = p7;
        objectArray[7] = p8;
        objectArray[8] = p9;
        objectArray[9] = p10;
        objectArray[10] = p11;
        objectArray[11] = p12;
        objectArray[12] = p13;
        objectArray[13] = p14;
        objectArray[14] = p15;
        objectArray[15] = var16_16;
        return this.invokeVararg(objectArray);
    }
}

