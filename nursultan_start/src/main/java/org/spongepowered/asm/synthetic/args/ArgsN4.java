/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02233
 *  minecraft.class05363
 *  org.spongepowered.asm.mixin.injection.invoke.arg.Args
 *  org.spongepowered.asm.mixin.injection.invoke.arg.ArgumentCountException
 *  org.spongepowered.asm.mixin.injection.invoke.arg.ArgumentIndexOutOfBoundsException
 */
package org.spongepowered.asm.synthetic.args;

import minecraft.class02233;
import minecraft.class05363;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;
import org.spongepowered.asm.mixin.injection.invoke.arg.ArgumentCountException;
import org.spongepowered.asm.mixin.injection.invoke.arg.ArgumentIndexOutOfBoundsException;

public class ArgsN4
extends Args {
    public int $1() {
        return (Integer)this.values[1];
    }

    private ArgsN4(Object[] objectArray) {
        super(objectArray);
    }

    public String toString() {
        return "";
    }

    public static ArgsN4 of(int n, int n2, double d, long l, class02233 class022332, int n3, class05363 class053632, boolean bl) {
        return new ArgsN4(new Object[]{n, n2, d, l, class022332, n3, class053632, bl});
    }

    public void set(int n, Object object) {
        Integer n2;
        block11: {
            Comparable<Integer> comparable;
            block10: {
                int n3;
                block9: {
                    block8: {
                        block7: {
                            block6: {
                                block5: {
                                    block4: {
                                        block3: {
                                            block2: {
                                                if (n == 0) break block2;
                                                if (n == 1) break block3;
                                                if (n == 2) break block4;
                                                if (n == 3) break block5;
                                                if (n == 4) break block6;
                                                if (n == 5) break block7;
                                                if (n == 6) break block8;
                                                if (n != 7) {
                                                    throw new ArgumentIndexOutOfBoundsException(n);
                                                }
                                                break block9;
                                            }
                                            n3 = n;
                                            comparable = (Integer)object;
                                            break block10;
                                        }
                                        n3 = n;
                                        comparable = (Integer)object;
                                        break block10;
                                    }
                                    n3 = n;
                                    comparable = (Double)object;
                                    break block10;
                                }
                                n3 = n;
                                comparable = (Long)object;
                                break block10;
                            }
                            n3 = n;
                            n2 = (class02233)object;
                            break block11;
                        }
                        n3 = n;
                        comparable = (Integer)object;
                        break block10;
                    }
                    n3 = n;
                    n2 = (class05363)object;
                    break block11;
                }
                n3 = n;
                comparable = n2 = (Boolean)object;
            }
            if (comparable == null) {
                throw new NullPointerException("Argument with primitive type cannot be set to NULL");
            }
        }
        this.values[n3] = n2;
    }

    public void setAll(Object[] objectArray) {
        int n = objectArray.length;
        if (n != 8) {
            throw new ArgumentCountException(n, 8, "(int, int, double, long, net.minecraft.class_9779, int, net.minecraft.class_4184, boolean)");
        }
        Object[] objectArray2 = this.values;
        Object[] objectArray3 = this.values;
        int n2 = 0;
        Comparable<Integer> comparable = (Integer)objectArray[0];
        if (comparable != null) {
            objectArray2[n2] = comparable;
            objectArray2 = objectArray3;
            objectArray3 = objectArray3;
            n2 = 1;
            comparable = (Integer)objectArray[1];
            if (comparable != null) {
                objectArray2[n2] = comparable;
                objectArray2 = objectArray3;
                objectArray3 = objectArray3;
                n2 = 2;
                comparable = (Double)objectArray[2];
                if (comparable != null) {
                    objectArray2[n2] = comparable;
                    objectArray2 = objectArray3;
                    objectArray3 = objectArray3;
                    n2 = 3;
                    comparable = (Long)objectArray[3];
                    if (comparable != null) {
                        objectArray2[n2] = comparable;
                        objectArray3[4] = (class02233)objectArray[4];
                        objectArray2 = objectArray3;
                        objectArray3 = objectArray3;
                        n2 = 5;
                        comparable = (Integer)objectArray[5];
                        if (comparable != null) {
                            objectArray2[n2] = comparable;
                            objectArray3[6] = (class05363)objectArray[6];
                            objectArray2 = objectArray3;
                            objectArray3 = objectArray3;
                            n2 = 7;
                            comparable = (Boolean)objectArray[7];
                            if (comparable != null) {
                                objectArray2[n2] = comparable;
                                return;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Argument with primitive type cannot be set to NULL");
    }

    public int $0() {
        return (Integer)this.values[0];
    }

    public double $2() {
        return (Double)this.values[2];
    }

    public long $3() {
        return (Long)this.values[3];
    }

    public class02233 $4() {
        return (class02233)this.values[4];
    }

    public class05363 $6() {
        return (class05363)this.values[6];
    }

    public boolean $7() {
        return (Boolean)this.values[7];
    }

    public int $5() {
        return (Integer)this.values[5];
    }
}

