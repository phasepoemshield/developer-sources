/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06584
 *  minecraft.class06695
 */
package Nursultan;

import java.util.Iterator;
import java.util.NoSuchElementException;
import minecraft.class06584;
import minecraft.class06695;

public class class10644
implements Iterator<class06584> {
    private final class06695 N;
    private int y;
    private final int L;

    public class10644(class06695 class066952) {
        this.N = class066952;
        this.L = class066952.method_5439();
    }

    @Override
    public boolean hasNext() {
        return this.y < this.L;
    }

    @Override
    public class06584 next() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        return this.N.method_5438(this.y++);
    }
}

