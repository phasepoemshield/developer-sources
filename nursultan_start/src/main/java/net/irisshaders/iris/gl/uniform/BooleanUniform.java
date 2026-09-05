/*
 * Decompiled with CFR 0.152.
 */
package net.irisshaders.iris.gl.uniform;

import java.util.function.BooleanSupplier;
import net.irisshaders.iris.gl.uniform.IntUniform;

public class BooleanUniform
extends IntUniform {
    BooleanUniform(int n, BooleanSupplier booleanSupplier) {
        super(n, () -> booleanSupplier.getAsBoolean() ? 1 : 0);
    }
}

