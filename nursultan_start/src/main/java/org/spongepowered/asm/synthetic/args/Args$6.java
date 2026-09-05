/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.spongepowered.asm.mixin.injection.invoke.arg.Args
 *  org.spongepowered.asm.mixin.injection.invoke.arg.ArgumentCountException
 *  org.spongepowered.asm.mixin.injection.invoke.arg.ArgumentIndexOutOfBoundsException
 */
package org.spongepowered.asm.synthetic.args;

import java.util.function.BiConsumer;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;
import org.spongepowered.asm.mixin.injection.invoke.arg.ArgumentCountException;
import org.spongepowered.asm.mixin.injection.invoke.arg.ArgumentIndexOutOfBoundsException;

public class Args$6
extends Args {
    private Args$6(Object[] objectArray) {
        super(objectArray);
    }

    public String toString() {
        return "";
    }

    public static Args$6 of(BiConsumer biConsumer) {
        return new Args$6(new Object[]{biConsumer});
    }

    public void set(int n, Object object) {
        if (n != 0) {
            throw new ArgumentIndexOutOfBoundsException(n);
        }
        this.values[n] = (BiConsumer)object;
    }

    public void setAll(Object[] objectArray) {
        int n = objectArray.length;
        if (n != 1) {
            throw new ArgumentCountException(n, 1, "(java.util.function.BiConsumer)");
        }
        Object[] objectArray2 = this.values;
        this.values[0] = (BiConsumer)objectArray[0];
    }

    public BiConsumer $0() {
        return (BiConsumer)this.values[0];
    }
}

