/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  minecraft.class07049
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import java.util.function.Consumer;
import minecraft.class07049;
import org.jspecify.annotations.Nullable;

public class class01139 {
    private Int2ObjectMap<class07049> N = new Int2ObjectLinkedOpenHashMap();
    private Int2ObjectMap<class07049> y = new Int2ObjectLinkedOpenHashMap();
    private @Nullable Int2ObjectMap<class07049> L;

    public boolean L(class07049 class070492) {
        return this.N.containsKey(class070492.method_5628());
    }

    public void y(class07049 class070492) {
        this.N();
        this.N.remove(class070492.method_5628());
    }

    private void N() {
        if (this.L == this.N) {
            this.y = this.N;
            this.N = ((Int2ObjectLinkedOpenHashMap)this.N).clone();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void N(Consumer<class07049> consumer) {
        if (this.L != null) {
            throw new UnsupportedOperationException("Only one concurrent iteration supported");
        }
        this.L = this.N;
        try {
            for (class07049 class070492 : this.N.values()) {
                consumer.accept(class070492);
            }
        }
        finally {
            this.L = null;
        }
    }

    public void N(class07049 class070492) {
        this.N();
        this.N.put(class070492.method_5628(), (Object)class070492);
    }
}

