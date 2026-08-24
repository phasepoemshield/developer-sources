/*
 * Decompiled with CFR 0.152.
 */
package kotlin.random;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.random.Random;
import kotlin.random.RandomKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0000\u0018\u0000 \u00162\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\u0016B\u0019\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0007\u0010\bB9\b\u0000\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0007\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u000e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u000e\u0010\u0015R\u0016\u0010\r\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\r\u0010\u0015R\u0016\u0010\f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\f\u0010\u0015R\u0016\u0010\t\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\t\u0010\u0015R\u0016\u0010\n\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\n\u0010\u0015R\u0016\u0010\u000b\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u000b\u0010\u0015\u00a8\u0006\u0017"}, d2={"Lkotlin/random/XorWowRandom;", "Lkotlin/random/Random;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "seed1", "seed2", "<init>", "(II)V", "x", "y", "z", "w", "v", "addend", "(IIIIII)V", "bitCount", "nextBits", "(I)I", "nextInt", "()I", "I", "Companion", "kotlin-stdlib"})
public final class XorWowRandom
extends Random
implements Serializable {
    private int y;
    private int addend;
    private int z;
    @NotNull
    private static final Companion Companion = new Companion(null);
    private int v;
    private static final long serialVersionUID = 0L;
    private int w;
    private int x;

    public XorWowRandom(int seed1, int seed2) {
        this(seed1, seed2, 0, 0, ~seed1, seed1 << 10 ^ seed2 >>> 4);
    }

    @Override
    public int nextBits(int bitCount) {
        return RandomKt.takeUpperBits(this.nextInt(), bitCount);
    }

    public XorWowRandom(int x, int y, int z, int w, int v, int addend) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
        this.v = v;
        this.addend = addend;
        int n = (this.x | this.y | this.z | this.w | this.v) != 0 ? 1 : 0;
        if (n == 0) {
            boolean bl = false;
            String string = "Initial state must have at least one non-zero element.";
            throw new IllegalArgumentException(string.toString());
        }
        n = 64;
        int n2 = 0;
        while (n2 < n) {
            int it = n2++;
            boolean bl = false;
            this.nextInt();
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int nextInt() {
        void var1_1;
        int t = this.x;
        t ^= t >>> 2;
        this.x = this.y;
        this.y = this.z;
        this.z = this.w;
        int v0 = this.v;
        this.w = v0;
        this.v = t = t ^ t << 1 ^ v0 ^ v0 << 4;
        this.addend += 362437;
        return (int)(var1_1 + this.addend);
    }

    @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2={"Lkotlin/random/XorWowRandom$Companion;", "", "<init>", "()V", "", "serialVersionUID", "J", "kotlin-stdlib"})
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }

        private Companion() {
        }
    }
}

