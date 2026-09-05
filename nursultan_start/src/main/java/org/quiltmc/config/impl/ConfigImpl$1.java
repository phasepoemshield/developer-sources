/*
 * Decompiled with CFR 0.152.
 */
package org.quiltmc.config.impl;

import java.util.Iterator;
import org.quiltmc.config.impl.ConfigImpl;
import org.quiltmc.config.impl.ConfigImpl$1$1;

class ConfigImpl$1
implements Iterable {
    final /* synthetic */ ConfigImpl this$0;

    ConfigImpl$1(ConfigImpl configImpl) {
        this.this$0 = configImpl;
    }

    public Iterator iterator() {
        return new ConfigImpl$1$1(this);
    }
}

