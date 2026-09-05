/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01054
 *  org.spongepowered.asm.mixin.injection.invoke.arg.Args
 *  org.spongepowered.asm.mixin.injection.invoke.arg.ArgumentCountException
 *  org.spongepowered.asm.mixin.injection.invoke.arg.ArgumentIndexOutOfBoundsException
 */
package org.spongepowered.asm.synthetic.args;

import minecraft.class01054;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;
import org.spongepowered.asm.mixin.injection.invoke.arg.ArgumentCountException;
import org.spongepowered.asm.mixin.injection.invoke.arg.ArgumentIndexOutOfBoundsException;

public class Args$2
extends Args {
    public int $1() {
        return (Integer)this.values[1];
    }

    private Args$2(Object[] objectArray) {
        super(objectArray);
    }

    public String toString() {
        return "";
    }

    public static Args$2 of(class01054 class010542, int n, int n2, int n3, int n4, int n5) {
        return new Args$2(new Object[]{class010542, n, n2, n3, n4, n5});
    }

    public void set(int n, Object object) {
        Object object2;
        block8: {
            Integer n2;
            block9: {
                int n3;
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
                                        if (n != 5) {
                                            throw new ArgumentIndexOutOfBoundsException(n);
                                        }
                                        break block7;
                                    }
                                    n3 = n;
                                    object2 = (class01054)object;
                                    break block8;
                                }
                                n3 = n;
                                n2 = (Integer)object;
                                break block9;
                            }
                            n3 = n;
                            n2 = (Integer)object;
                            break block9;
                        }
                        n3 = n;
                        n2 = (Integer)object;
                        break block9;
                    }
                    n3 = n;
                    n2 = (Integer)object;
                    break block9;
                }
                n3 = n;
                n2 = object2 = (Integer)object;
            }
            if (n2 == null) {
                throw new NullPointerException("Argument with primitive type cannot be set to NULL");
            }
        }
        this.values[n3] = object2;
    }

    public void setAll(Object[] objectArray) {
        int n = objectArray.length;
        if (n != 6) {
            throw new ArgumentCountException(n, 6, "(net.minecraft.class_332, int, int, int, int, int)");
        }
        this.values[0] = (class01054)objectArray[0];
        Object[] objectArray2 = this.values;
        Object[] objectArray3 = this.values;
        int n2 = 1;
        Integer n3 = (Integer)objectArray[1];
        if (n3 != null) {
            objectArray2[n2] = n3;
            objectArray2 = objectArray3;
            objectArray3 = objectArray3;
            n2 = 2;
            n3 = (Integer)objectArray[2];
            if (n3 != null) {
                objectArray2[n2] = n3;
                objectArray2 = objectArray3;
                objectArray3 = objectArray3;
                n2 = 3;
                n3 = (Integer)objectArray[3];
                if (n3 != null) {
                    objectArray2[n2] = n3;
                    objectArray2 = objectArray3;
                    objectArray3 = objectArray3;
                    n2 = 4;
                    n3 = (Integer)objectArray[4];
                    if (n3 != null) {
                        objectArray2[n2] = n3;
                        objectArray2 = objectArray3;
                        objectArray3 = objectArray3;
                        n2 = 5;
                        n3 = (Integer)objectArray[5];
                        if (n3 != null) {
                            objectArray2[n2] = n3;
                            return;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Argument with primitive type cannot be set to NULL");
    }

    public class01054 $0() {
        return (class01054)this.values[0];
    }

    public int $2() {
        return (Integer)this.values[2];
    }

    public int $3() {
        return (Integer)this.values[3];
    }

    public int $4() {
        return (Integer)this.values[4];
    }

    public int $5() {
        return (Integer)this.values[5];
    }
}

