/*
 * Decompiled with CFR 0.152.
 */
package dev.babbaj.pathfinder.xz;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class ag {
    public final int a;
    public final byte[] a;
    public int b;

    ag(int n2) {
        block3: {
            block2: {
                this.a = new byte[256];
                this.b = 0;
                if (n2 <= 0) break block2;
                if (n2 <= 256) break block3;
            }
            throw new IllegalArgumentException();
        }
        this.a = n2;
    }
}

