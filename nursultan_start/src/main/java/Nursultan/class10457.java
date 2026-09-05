/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Ticker
 */
package Nursultan;

import com.google.common.base.Ticker;
import java.util.function.LongSupplier;

public class class10457
extends Ticker {
    final /* synthetic */ LongSupplier N;

    public class10457(LongSupplier longSupplier) {
        this.N = longSupplier;
    }

    public long read() {
        return this.N.getAsLong();
    }
}

