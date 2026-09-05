/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  minecraft.class00891
 *  minecraft.class05018
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import minecraft.class00891;
import minecraft.class05018;
import minecraft.class05565;
import org.jspecify.annotations.Nullable;

public class class05547 {
    private final class00891 R;
    final Map<class05565, class00891> N = Maps.newHashMap();
    boolean y = true;
    boolean L = true;
    @Nullable String u;
    @Nullable String i;

    public boolean L() {
        return this.y;
    }

    class05547(class00891 class008912) {
        this.R = class008912;
    }

    public Optional<String> i() {
        if (class05018.B((String)this.u)) {
            return Optional.empty();
        }
        return Optional.of(this.u);
    }

    public boolean u() {
        return this.L;
    }

    public Map<class05565, class00891> y() {
        return this.N;
    }

    public class00891 N() {
        return this.R;
    }

    public class00891 N(class05565 class055652) {
        return this.N.get((Object)class055652);
    }

    public Optional<String> R() {
        if (class05018.B((String)this.i)) {
            return Optional.empty();
        }
        return Optional.of(this.i);
    }
}

