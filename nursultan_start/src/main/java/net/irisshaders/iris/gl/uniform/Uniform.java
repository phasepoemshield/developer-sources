/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.gl.state.ValueUpdateNotifier
 */
package net.irisshaders.iris.gl.uniform;

import net.irisshaders.iris.gl.state.ValueUpdateNotifier;

public abstract class Uniform {
    protected final int location;
    protected final ValueUpdateNotifier notifier;

    Uniform(int n) {
        this(n, null);
    }

    Uniform(int n, ValueUpdateNotifier valueUpdateNotifier) {
        this.location = n;
        this.notifier = valueUpdateNotifier;
    }

    public abstract void update();

    public final int getLocation() {
        return this.location;
    }

    public final ValueUpdateNotifier getNotifier() {
        return this.notifier;
    }
}

