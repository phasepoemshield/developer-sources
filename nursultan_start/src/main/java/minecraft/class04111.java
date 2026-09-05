/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09544
 *  Nursultan.class09824
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  minecraft.class04546
 *  minecraft.class05952
 *  minecraft.class05957
 *  minecraft.class07297
 */
package minecraft;

import Nursultan.class09544;
import Nursultan.class09824;
import com.google.common.collect.ImmutableList;
import java.util.List;
import minecraft.class04129;
import minecraft.class04546;
import minecraft.class05952;
import minecraft.class05957;
import minecraft.class07297;

public abstract class class04111<T extends class04111<T>>
implements class07297<T> {
    private final ImmutableList.Builder<class05957> N = ImmutableList.builder();

    protected abstract T L();

    public class09824 L(class04111<?> class041112) {
        return new class09824(new class04111[]{this, class041112});
    }

    protected List<class05957> i() {
        return this.N.build();
    }

    public final T M() {
        return this.L();
    }

    public abstract class04129 y();

    public class09544 y(class04111<?> class041112) {
        return new class09544(new class04111[]{this, class041112});
    }

    public T y(class05952 class059522) {
        this.N.add((Object)class059522.build());
        return this.L();
    }

    public class04546 N(class04111<?> class041112) {
        return new class04546(new class04111[]{this, class041112});
    }
}

