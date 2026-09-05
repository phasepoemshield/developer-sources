/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.blaze3d.systems.RenderSystem
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import java.util.Objects;
import minecraft.class03453;

class class03433 {
    public final int N;
    public final int y;

    class03433(int n, int n2) {
        this.N = n;
        this.y = n2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        class03433 class034332 = (class03433)object;
        return this.N == class034332.N && this.y == class034332.y;
    }

    public String toString() {
        return this.N + "x" + this.y;
    }

    public int hashCode() {
        return Objects.hash(this.N, this.y);
    }

    static List<class03433> N(int n, int n2) {
        RenderSystem.assertOnRenderThread();
        int n3 = RenderSystem.getDevice().getMaxTextureSize();
        if (n <= 0 || n > n3 || n2 <= 0 || n2 > n3) {
            return ImmutableList.of((Object)class03453.U);
        }
        return ImmutableList.of((Object)new class03433(n, n2), (Object)class03453.U);
    }
}

