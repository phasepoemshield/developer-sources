/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.LongSet
 *  minecraft.class03482
 *  minecraft.class05795
 *  minecraft.class07321
 *  minecraft.class08050
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import it.unimi.dsi.fastutil.longs.LongSet;
import java.io.IOException;
import java.util.function.BooleanSupplier;
import minecraft.class00538;
import minecraft.class00549;
import minecraft.class00570;
import minecraft.class03482;
import minecraft.class05795;
import minecraft.class07321;
import minecraft.class08050;
import org.jspecify.annotations.Nullable;

public abstract class class00558
implements class00538,
AutoCloseable {
    public boolean L(int n, int n2) {
        return this.N(n, n2, class00549.m, false) != null;
    }

    public abstract class05795 L();

    @Override
    public void close() throws IOException {
    }

    public LongSet u() {
        return LongSet.of();
    }

    @Override
    public @Nullable class03482 y(int n, int n2) {
        return this.N(n, n2, class00549.L, false);
    }

    public abstract int y();

    public void N(boolean bl) {
    }

    public @Nullable class00570 N(int n, int n2, boolean bl) {
        return (class00570)this.N(n, n2, class00549.m, bl);
    }

    public boolean N(class07321 class073212, boolean bl) {
        return false;
    }

    public void N(int n, int n2, int n3, boolean bl) {
    }

    public abstract @Nullable class08050 N(int var1, int var2, class00549 var3, boolean var4);

    public abstract void N(BooleanSupplier var1, boolean var2);

    public abstract String N();

    public @Nullable class00570 N(int n, int n2) {
        return this.N(n, n2, false);
    }
}

