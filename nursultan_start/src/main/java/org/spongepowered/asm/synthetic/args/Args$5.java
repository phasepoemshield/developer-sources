/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07050
 *  org.spongepowered.asm.mixin.injection.invoke.arg.Args
 *  org.spongepowered.asm.mixin.injection.invoke.arg.ArgumentCountException
 *  org.spongepowered.asm.mixin.injection.invoke.arg.ArgumentIndexOutOfBoundsException
 */
package org.spongepowered.asm.synthetic.args;

import minecraft.class07050;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;
import org.spongepowered.asm.mixin.injection.invoke.arg.ArgumentCountException;
import org.spongepowered.asm.mixin.injection.invoke.arg.ArgumentIndexOutOfBoundsException;

public class Args$5
extends Args {
    public int $1() {
        return (Integer)this.values[1];
    }

    private Args$5(Object[] objectArray) {
        super(objectArray);
    }

    public String toString() {
        return "";
    }

    public static Args$5 of(class07050 class070502, int n, float f, float f2) {
        return new Args$5(new Object[]{class070502, n, Float.valueOf(f), Float.valueOf(f2)});
    }

    public void set(int n, Object object) {
        Object object2;
        block6: {
            Number number;
            block7: {
                int n2;
                block5: {
                    block4: {
                        block3: {
                            block2: {
                                if (n == 0) break block2;
                                if (n == 1) break block3;
                                if (n == 2) break block4;
                                if (n != 3) {
                                    throw new ArgumentIndexOutOfBoundsException(n);
                                }
                                break block5;
                            }
                            n2 = n;
                            object2 = (class07050)object;
                            break block6;
                        }
                        n2 = n;
                        number = (Integer)object;
                        break block7;
                    }
                    n2 = n;
                    number = (Float)object;
                    break block7;
                }
                n2 = n;
                number = object2 = (Float)object;
            }
            if (number == null) {
                throw new NullPointerException("Argument with primitive type cannot be set to NULL");
            }
        }
        this.values[n2] = object2;
    }

    public void setAll(Object[] objectArray) {
        int n = objectArray.length;
        if (n != 4) {
            throw new ArgumentCountException(n, 4, "");
        }
        this.values[0] = (class07050)objectArray[0];
        Object[] objectArray2 = this.values;
        Object[] objectArray3 = this.values;
        int n2 = 1;
        Number number = (Integer)objectArray[1];
        if (number != null) {
            objectArray2[n2] = number;
            objectArray2 = objectArray3;
            objectArray3 = objectArray3;
            n2 = 2;
            number = (Float)objectArray[2];
            if (number != null) {
                objectArray2[n2] = number;
                objectArray2 = objectArray3;
                objectArray3 = objectArray3;
                n2 = 3;
                number = (Float)objectArray[3];
                if (number != null) {
                    objectArray2[n2] = number;
                    return;
                }
            }
        }
        throw new NullPointerException("Argument with primitive type cannot be set to NULL");
    }

    public class07050 $0() {
        return (class07050)this.values[0];
    }

    public float $2() {
        return ((Float)this.values[2]).floatValue();
    }

    public float $3() {
        return ((Float)this.values[3]).floatValue();
    }
}

