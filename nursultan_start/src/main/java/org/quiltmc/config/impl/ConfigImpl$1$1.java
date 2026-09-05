/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.quiltmc.config.api.values.TrackedValue
 */
package org.quiltmc.config.impl;

import java.util.Iterator;
import org.quiltmc.config.api.values.TrackedValue;
import org.quiltmc.config.api.values.ValueTreeNode;
import org.quiltmc.config.impl.ConfigImpl;
import org.quiltmc.config.impl.ConfigImpl$1;

class ConfigImpl$1$1
implements Iterator {
    private final Iterator itr;
    private ValueTreeNode next;
    final /* synthetic */ ConfigImpl$1 this$1;

    ConfigImpl$1$1(ConfigImpl$1 configImpl$1) {
        this.this$1 = configImpl$1;
        this.itr = ConfigImpl.access$000(configImpl$1.this$0).leaves().iterator();
    }

    @Override
    public boolean hasNext() {
        while (this.itr.hasNext() && !(this.next instanceof TrackedValue)) {
            this.next = (ValueTreeNode)this.itr.next();
        }
        return this.next != null;
    }

    public TrackedValue next() {
        this.next = null;
        return (TrackedValue)this.next;
    }
}

