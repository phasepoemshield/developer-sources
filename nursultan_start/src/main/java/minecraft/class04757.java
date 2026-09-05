/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2BooleanMap
 *  it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap
 */
package minecraft;

import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.Set;
import minecraft.class04770;

public final class class04757 {
    private final Object2BooleanMap<class04770> N = new Object2BooleanOpenHashMap();

    public void L(class04770 class047702) {
        this.N.replace((Object)class047702, false);
    }

    public boolean i(class04770 class047702) {
        return this.N.getBoolean((Object)class047702);
    }

    public boolean u(class04770 class047702) {
        return this.N.getOrDefault((Object)class047702, true);
    }

    public void y(class04770 class047702) {
        this.N.replace((Object)class047702, true);
    }

    public void N(class04770 class047702) {
        this.N.removeBoolean((Object)class047702);
    }

    public Set<class04770> N() {
        return this.N.keySet();
    }

    public void N(class04770 class047702, boolean bl) {
        this.N.put((Object)class047702, bl);
    }
}

