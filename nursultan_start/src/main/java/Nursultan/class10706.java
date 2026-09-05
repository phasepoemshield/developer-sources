/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07023
 *  minecraft.class07709
 */
package Nursultan;

import java.util.Iterator;
import java.util.NoSuchElementException;
import minecraft.class07023;
import minecraft.class07709;

public class class10706
implements Iterator<class07709> {
    private int y;
    final /* synthetic */ class07023 N;

    public class10706(class07023 class070232) {
        this.N = class070232;
    }

    @Override
    public boolean hasNext() {
        return this.y < this.N.size();
    }

    @Override
    public class07709 next() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        return this.N.get(this.y++);
    }
}

