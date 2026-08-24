/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u0011\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000\u00a2\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0004\u00a2\u0006\u0004\b\u0004\u0010\u000bJ\u001f\u0010\u000e\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u0000H\u0004\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u0003*\u00028\u0000H$\u00a2\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0012\u001a\u00020\u00038\u0004@\u0004X\u0084\u000e\u00a2\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0004\u0010\u0013R\"\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00168\u0002X\u0082\u0004\u00a2\u0006\f\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u0019\u0010\u001a\u00a8\u0006\u001b"}, d2={"Lkotlin/jvm/internal/PrimitiveSpreadBuilder;", "", "T", "", "size", "<init>", "(I)V", "spreadArgument", "", "addSpread", "(Ljava/lang/Object;)V", "()I", "values", "result", "toArray", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "getSize", "(Ljava/lang/Object;)I", "position", "I", "getPosition", "setPosition", "", "spreads", "[Ljava/lang/Object;", "getSpreads$annotations", "()V", "kotlin-stdlib"})
public abstract class PrimitiveSpreadBuilder<T> {
    private int position;
    private final int size;
    @NotNull
    private final T[] spreads;

    protected final void setPosition(int n) {
        this.position = n;
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    protected final T toArray(@NotNull T values2, @NotNull T result) {
        void var2_2;
        Intrinsics.checkNotNullParameter(values2, "values");
        Intrinsics.checkNotNullParameter(result, "result");
        int dstIndex = 0;
        int copyValuesFrom = 0;
        IntIterator intIterator = new IntRange(0, this.size - 1).iterator();
        while (intIterator.hasNext()) {
            void var6_6;
            void var8_8;
            int i = intIterator.nextInt();
            T spreadArgument = this.spreads[i];
            if (spreadArgument == null) continue;
            if (copyValuesFrom < i) {
                System.arraycopy(values2, copyValuesFrom, result, dstIndex, i - copyValuesFrom);
                dstIndex += i - copyValuesFrom;
            }
            int spreadSize = this.getSize(spreadArgument);
            System.arraycopy(spreadArgument, 0, result, dstIndex, spreadSize);
            dstIndex += var8_8;
            copyValuesFrom = var6_6 + true;
        }
        if (copyValuesFrom < this.size) {
            void var4_4;
            void var3_3;
            System.arraycopy(values2, copyValuesFrom, var2_2, (int)var3_3, this.size - var4_4);
        }
        return var2_2;
    }

    protected final int getPosition() {
        return this.position;
    }

    public PrimitiveSpreadBuilder(int size) {
        this.size = size;
        this.spreads = new Object[this.size];
    }

    protected final int size() {
        int n;
        int totalLength = 0;
        IntIterator intIterator = new IntRange(0, this.size - 1).iterator();
        while (intIterator.hasNext()) {
            int i = intIterator.nextInt();
            T t = this.spreads[i];
            n = totalLength + (t != null ? this.getSize(t) : 1);
        }
        return n;
    }

    public final void addSpread(@NotNull T spreadArgument) {
        Intrinsics.checkNotNullParameter(spreadArgument, "spreadArgument");
        int n = this.position;
        this.position = n + 1;
        this.spreads[n] = spreadArgument;
    }

    private static /* synthetic */ void getSpreads$annotations() {
    }

    protected abstract int getSize(@NotNull T var1);
}

