/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  minecraft.class01894
 *  org.spongepowered.asm.mixin.injection.invoke.arg.Args
 *  org.spongepowered.asm.mixin.injection.invoke.arg.ArgumentCountException
 *  org.spongepowered.asm.mixin.injection.invoke.arg.ArgumentIndexOutOfBoundsException
 */
package org.spongepowered.asm.synthetic.args;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import minecraft.class01894;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;
import org.spongepowered.asm.mixin.injection.invoke.arg.ArgumentCountException;
import org.spongepowered.asm.mixin.injection.invoke.arg.ArgumentIndexOutOfBoundsException;

public class ArgsN3
extends Args {
    public class01894 $1() {
        return (class01894)this.values[1];
    }

    private ArgsN3(Object[] objectArray) {
        super(objectArray);
    }

    public String toString() {
        return "";
    }

    public static ArgsN3 of(RenderPipeline renderPipeline, class01894 class018942, int n, int n2, int n3, int n4) {
        return new ArgsN3(new Object[]{renderPipeline, class018942, n, n2, n3, n4});
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
                                    object2 = (RenderPipeline)object;
                                    break block8;
                                }
                                n3 = n;
                                object2 = (class01894)object;
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
            throw new ArgumentCountException(n, 6, "(com.mojang.blaze3d.pipeline.RenderPipeline, net.minecraft.class_2960, int, int, int, int)");
        }
        Object[] objectArray2 = this.values;
        this.values[0] = (RenderPipeline)objectArray[0];
        objectArray2[1] = (class01894)objectArray[1];
        Object[] objectArray3 = objectArray2;
        Object[] objectArray4 = objectArray2;
        int n2 = 2;
        Integer n3 = (Integer)objectArray[2];
        if (n3 != null) {
            objectArray3[n2] = n3;
            objectArray3 = objectArray4;
            objectArray4 = objectArray4;
            n2 = 3;
            n3 = (Integer)objectArray[3];
            if (n3 != null) {
                objectArray3[n2] = n3;
                objectArray3 = objectArray4;
                objectArray4 = objectArray4;
                n2 = 4;
                n3 = (Integer)objectArray[4];
                if (n3 != null) {
                    objectArray3[n2] = n3;
                    objectArray3 = objectArray4;
                    objectArray4 = objectArray4;
                    n2 = 5;
                    n3 = (Integer)objectArray[5];
                    if (n3 != null) {
                        objectArray3[n2] = n3;
                        return;
                    }
                }
            }
        }
        throw new NullPointerException("Argument with primitive type cannot be set to NULL");
    }

    public RenderPipeline $0() {
        return (RenderPipeline)this.values[0];
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

