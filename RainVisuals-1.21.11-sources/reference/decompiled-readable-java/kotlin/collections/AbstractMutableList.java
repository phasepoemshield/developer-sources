/*
 * Decompiled with CFR 0.152.
 */
package kotlin.collections;

import java.util.AbstractList;
import java.util.List;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.markers.KMutableList;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\t\b\u0004\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u0000H&\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0006H&\u00a2\u0006\u0004\b\f\u0010\rJ \u0010\u000e\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u0000H\u00a6\u0002\u00a2\u0006\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2={"Lkotlin/collections/AbstractMutableList;", "E", "", "Ljava/util/AbstractList;", "<init>", "()V", "", "index", "element", "", "add", "(ILjava/lang/Object;)V", "removeAt", "(I)Ljava/lang/Object;", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"})
@SinceKotlin(version="1.1")
public abstract class AbstractMutableList<E>
extends AbstractList<E>
implements List<E>,
KMutableList {
    public abstract E removeAt(int var1);

    @Override
    public abstract E set(int var1, E var2);

    @Override
    public abstract void add(int var1, E var2);

    public abstract int getSize();

    protected AbstractMutableList() {
    }
}

