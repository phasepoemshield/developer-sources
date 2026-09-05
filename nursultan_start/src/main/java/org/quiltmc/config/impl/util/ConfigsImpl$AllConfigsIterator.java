/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.quiltmc.config.api.Config
 */
package org.quiltmc.config.impl.util;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import org.quiltmc.config.api.Config;
import org.quiltmc.config.impl.util.ConfigsImpl;
import org.quiltmc.config.impl.util.ConfigsImpl$1;

class ConfigsImpl$AllConfigsIterator
implements Iterator {
    final Iterator itr1;
    Iterator itr2;

    private ConfigsImpl$AllConfigsIterator() {
        Iterator iterator;
        this.itr1 = iterator = ConfigsImpl.access$100().values().iterator();
        this.itr2 = iterator.hasNext() ? ((Map)iterator.next()).values().iterator() : Collections.emptyIterator();
    }

    /* synthetic */ ConfigsImpl$AllConfigsIterator(ConfigsImpl$1 configsImpl$1) {
        this();
    }

    @Override
    public boolean hasNext() {
        return this.itr1.hasNext() || this.itr2.hasNext();
    }

    public Config next() {
        while (!this.itr2.hasNext() && this.itr1.hasNext()) {
            this.itr2 = ((Map)this.itr1.next()).values().iterator();
        }
        return (Config)this.itr2.next();
    }
}

