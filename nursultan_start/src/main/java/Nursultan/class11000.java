/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.AbstractIterator
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DataResult$Error
 *  com.mojang.serialization.DataResult$Success
 *  java.lang.MatchException
 *  java.lang.runtime.SwitchBootstraps
 *  minecraft.class07709
 *  minecraft.class08318
 *  org.jspecify.annotations.Nullable
 */
package Nursultan;

import com.google.common.collect.AbstractIterator;
import com.mojang.serialization.DataResult;
import java.lang.runtime.SwitchBootstraps;
import java.util.ListIterator;
import java.util.Objects;
import minecraft.class07709;
import minecraft.class08318;
import org.jspecify.annotations.Nullable;

public class class11000<T>
extends AbstractIterator<T> {
    final /* synthetic */ ListIterator N;
    final /* synthetic */ class08318 y;

    public class11000(class08318 class083182, ListIterator listIterator) {
        this.y = class083182;
        this.N = listIterator;
    }

    protected @Nullable T computeNext() {
        while (this.N.hasNext()) {
            DataResult dataResult;
            int n = this.N.nextIndex();
            class07709 class077092 = (class07709)this.N.next();
            Objects.requireNonNull(this.y.y.parse(this.y.N.N(), (Object)class077092));
            int n2 = 0;
            switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{DataResult.Success.class, DataResult.Error.class}, (Object)dataResult, (int)n2)) {
                default: {
                    throw new MatchException(null, null);
                }
                case 0: {
                    return (T)((DataResult.Success)dataResult).value();
                }
                case 1: 
            }
            DataResult.Error error = (DataResult.Error)dataResult;
            this.y.N(n, class077092, error);
            if (!error.partialValue().isPresent()) continue;
            return error.partialValue().get();
        }
        return (T)this.endOfData();
    }
}

