/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.utils.accessor.IChunkArray
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  jerozgen.languagereload.mixin.ClientChunkMapAccessor
 *  minecraft.class00554
 *  minecraft.class00570
 *  minecraft.class01296
 *  minecraft.class01688
 *  minecraft.class07321
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import baritone.utils.accessor.IChunkArray;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicReferenceArray;
import jerozgen.languagereload.mixin.ClientChunkMapAccessor;
import minecraft.class00554;
import minecraft.class00570;
import minecraft.class01296;
import minecraft.class01688;
import minecraft.class07321;
import org.jspecify.annotations.Nullable;

public class class01705
implements IChunkArray,
ClientChunkMapAccessor {
    final AtomicReferenceArray<@Nullable class00570> N;
    final LongOpenHashSet y = new LongOpenHashSet();
    final int L;
    private final int B;
    volatile int u;
    volatile int i;
    int R;
    final /* synthetic */ class01688 M;

    private void L(class00570 class005702) {
        class00554[] class00554Array = class005702.u();
        for (int i = 0; i < class00554Array.length; ++i) {
            if (!class00554Array[i].L()) continue;
            class07321 class073212 = class005702.R();
            this.y.add(class01296.y((int)class073212.B, (int)class005702.method_31604(i), (int)class073212.Z));
        }
    }

    class01705(class01688 class016882, int n) {
        this.M = class016882;
        this.L = n;
        this.B = n * 2 + 1;
        this.N = new AtomicReferenceArray(this.B * this.B);
    }

    public boolean y(int n, int n2) {
        return Math.abs(n - this.u) <= this.L && Math.abs(n2 - this.i) <= this.L;
    }

    private void y(class00570 class005702) {
        class00554[] class00554Array = class005702.u();
        for (int i = 0; i < class00554Array.length; ++i) {
            class07321 class073212 = class005702.R();
            this.y.remove(class01296.y((int)class073212.B, (int)class005702.method_31604(i), (int)class073212.Z));
        }
    }

    void y(int n, class00570 class005702) {
        if (this.N.compareAndSet(n, class005702, null)) {
            --this.R;
            this.y(class005702);
        }
        this.M.L.N(class005702);
    }

    int N(int n, int n2) {
        return Math.floorMod(n2, this.B) * this.B + Math.floorMod(n, this.B);
    }

    protected @Nullable class00570 N(int n) {
        return this.N.get(n);
    }

    private void N(String string) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(string);){
            int n = this.M.y.L;
            for (int i = this.i - n; i <= this.i + n; ++i) {
                for (int j = this.u - n; j <= this.u + n; ++j) {
                    class00570 class005702 = this.M.y.N.get(this.M.y.N(j, i));
                    if (class005702 == null) continue;
                    class07321 class073212 = class005702.R();
                    fileOutputStream.write((class073212.B + "\t" + class073212.Z + "\t" + class005702.O() + "\n").getBytes(StandardCharsets.UTF_8));
                }
            }
        }
        catch (IOException iOException) {
            class01688.N.error("Failed to dump chunks to file {}", (Object)string, (Object)iOException);
        }
    }

    public void N(int n, int n2, int n3, boolean bl) {
        if (!this.y(n, n3)) {
            return;
        }
        long l = class01296.y((int)n, (int)n2, (int)n3);
        if (bl) {
            this.y.add(l);
        } else if (this.y.remove(l)) {
            this.M.L.N(l);
        }
    }

    void N(int n, @Nullable class00570 class005702) {
        class00570 class005703 = this.N.getAndSet(n, class005702);
        if (class005703 != null) {
            --this.R;
            this.y(class005703);
            this.M.L.N(class005703);
        }
        if (class005702 != null) {
            ++this.R;
            this.L(class005702);
        }
    }

    void N(class00570 class005702) {
        class07321 class073212 = class005702.R();
        class00554[] class00554Array = class005702.u();
        for (int i = 0; i < class00554Array.length; ++i) {
            class00554 class005542 = class00554Array[i];
            long l = class01296.y((int)class073212.B, (int)class005702.method_31604(i), (int)class073212.Z);
            if (class005542.L()) {
                this.y.add(l);
                continue;
            }
            if (!this.y.remove(l)) continue;
            this.M.L.N(l);
        }
    }

    public void copyFrom(IChunkArray iChunkArray) {
        this.u = iChunkArray.centerX();
        this.i = iChunkArray.centerZ();
        AtomicReferenceArray var2 = iChunkArray.getChunks();
        for (int i = 0; i < var2.length(); ++i) {
            class00570 class005702 = (class00570)var2.get(i);
            if (class005702 == null) continue;
            class07321 class073212 = class005702.R();
            if (!this.y(class073212.B, class073212.Z)) continue;
            int n = this.N(class073212.B, class073212.Z);
            if (this.N.get(n) != null) {
                throw new IllegalStateException("Doing this would mutate the client's REAL loaded chunks?!");
            }
            this.N(n, class005702);
        }
    }

    public int centerZ() {
        return this.i;
    }

    public int centerX() {
        return this.u;
    }

    public AtomicReferenceArray getChunks() {
        return this.N;
    }

    public int viewDistance() {
        return this.L;
    }

    public /* synthetic */ AtomicReferenceArray languagereload_getChunks() {
        return this.N;
    }
}

