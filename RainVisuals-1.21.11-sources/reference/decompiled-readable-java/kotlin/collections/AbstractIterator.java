/*
 * Decompiled with CFR 0.152.
 */
package kotlin.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.State;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H$\u00a2\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0004\u00a2\u0006\u0004\b\u0007\u0010\u0004J\u0010\u0010\t\u001a\u00020\bH\u0096\u0002\u00a2\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00028\u0000H\u0096\u0002\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00028\u0000H\u0004\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0002\u00a2\u0006\u0004\b\u0010\u0010\nR\u0018\u0010\u0011\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0014\u0010\u0015\u00a8\u0006\u0016"}, d2={"Lkotlin/collections/AbstractIterator;", "T", "", "<init>", "()V", "", "computeNext", "done", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "value", "setNext", "(Ljava/lang/Object;)V", "tryToComputeNext", "nextValue", "Ljava/lang/Object;", "Lkotlin/collections/State;", "state", "Lkotlin/collections/State;", "kotlin-stdlib"})
public abstract class AbstractIterator<T>
implements Iterator<T>,
KMappedMarker {
    @Nullable
    private T nextValue;
    @NotNull
    private State state = State.NotReady;

    protected abstract void computeNext();

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public T next() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        this.state = State.NotReady;
        return this.nextValue;
    }

    private final boolean tryToComputeNext() {
        this.state = State.Failed;
        this.computeNext();
        return this.state == State.Ready;
    }

    protected final void setNext(T value) {
        this.nextValue = value;
        this.state = State.Ready;
    }

    protected final void done() {
        this.state = State.Done;
    }

    @Override
    public boolean hasNext() {
        boolean bl;
        boolean bl2;
        boolean bl3 = bl2 = this.state != State.Failed;
        if (!bl2) {
            String string = "Failed requirement.";
            throw new IllegalArgumentException(string.toString());
        }
        switch (WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()]) {
            case 1: {
                bl = false;
                break;
            }
            case 2: {
                bl = true;
                break;
            }
            default: {
                bl = this.tryToComputeNext();
            }
        }
        return bl;
    }

    @Metadata(mv={1, 9, 0}, k=3, xi=48)
    public final class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] nArray = new int[State.values().length];
            try {
                nArray[State.Done.ordinal()] = 1;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                nArray[State.Ready.ordinal()] = 2;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            $EnumSwitchMapping$0 = nArray;
        }
    }
}

