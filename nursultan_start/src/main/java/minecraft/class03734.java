/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet
 *  minecraft.class07151
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import java.util.Set;
import minecraft.class03711;
import minecraft.class07151;
import org.jspecify.annotations.Nullable;

public class class03734 {
    private final class03711 N;
    private final @Nullable class03734 y;
    private final Set<class03734> L = new ReferenceOpenHashSet();

    public @Nullable class03734 L() {
        return this.y;
    }

    public class03734(class03711 class037112, @Nullable class03734 class037342) {
        this.N = class037112;
        this.y = class037342;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof class03734)) return false;
        class03734 class037342 = (class03734)object;
        if (!this.N.equals((Object)class037342.N)) return false;
        return true;
    }

    public String toString() {
        return this.N.N().toString();
    }

    public int hashCode() {
        return this.N.hashCode();
    }

    public Iterable<class03734> i() {
        return this.L;
    }

    public class03734 u() {
        return class03734.N(this);
    }

    public void y(class03734 class037342) {
        this.L.add(class037342);
    }

    public class03711 y() {
        return this.N;
    }

    public class07151 N() {
        return this.N.y();
    }

    public static class03734 N(class03734 class037342) {
        class03734 class037343 = class037342;
        class03734 class037344;
        while ((class037344 = class037343.L()) != null) {
            class037343 = class037344;
        }
        return class037343;
    }
}

