/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07321
 *  org.jspecify.annotations.Nullable
 */
package Nursultan;

import java.util.Spliterators;
import java.util.function.Consumer;
import minecraft.class07321;
import org.jspecify.annotations.Nullable;

public class class10736
extends Spliterators.AbstractSpliterator<class07321> {
    private @Nullable class07321 i;
    final /* synthetic */ class07321 N;
    final /* synthetic */ class07321 y;
    final /* synthetic */ int L;
    final /* synthetic */ int u;

    @Override
    public boolean tryAdvance(Consumer<? super class07321> consumer) {
        if (this.i == null) {
            this.i = this.N;
        } else {
            int n = this.i.B;
            int n2 = this.i.Z;
            if (n == this.y.B) {
                if (n2 == this.y.Z) {
                    return false;
                }
                this.i = new class07321(this.N.B, n2 + this.L);
            } else {
                this.i = new class07321(n + this.u, n2);
            }
        }
        consumer.accept((class07321)this.i);
        return true;
    }

    public class10736(long l, int n, class07321 class073212, class07321 class073213, int n2, int n3) {
        this.N = class073212;
        this.y = class073213;
        this.L = n2;
        this.u = n3;
        super(l, n);
    }
}

