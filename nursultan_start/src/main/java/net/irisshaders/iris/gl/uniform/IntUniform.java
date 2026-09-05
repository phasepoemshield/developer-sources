/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  net.irisshaders.iris.gl.state.ValueUpdateNotifier
 */
package net.irisshaders.iris.gl.uniform;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.util.function.IntSupplier;
import net.irisshaders.iris.gl.state.ValueUpdateNotifier;
import net.irisshaders.iris.gl.uniform.Uniform;

public class IntUniform
extends Uniform {
    private final IntSupplier value;
    private int cachedValue = 0;

    IntUniform(int n, IntSupplier intSupplier) {
        this(n, intSupplier, null);
    }

    IntUniform(int n, IntSupplier intSupplier, ValueUpdateNotifier valueUpdateNotifier) {
        super(n, valueUpdateNotifier);
        this.value = intSupplier;
    }

    @Override
    public void update() {
        this.updateValue();
        if (this.notifier != null) {
            this.notifier.setListener(this::updateValue);
        }
    }

    private void updateValue() {
        int n = this.value.getAsInt();
        if (this.cachedValue != n) {
            this.cachedValue = n;
            GlStateManager._glUniform1i((int)this.location, (int)n);
        }
    }
}

