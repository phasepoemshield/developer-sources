/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml;

import java.util.Iterator;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.Yaml;

class Yaml$1
implements Iterator<Object> {
    final /* synthetic */ Yaml this$0;

    Yaml$1(Yaml yaml) {
        this.this$0 = yaml;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean hasNext() {
        return this.this$0.constructor.checkData();
    }

    @Override
    public Object next() {
        return this.this$0.constructor.getData();
    }
}

