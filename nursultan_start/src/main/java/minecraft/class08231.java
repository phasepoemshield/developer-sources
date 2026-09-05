/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10883
 *  com.mojang.blaze3d.shaders.ShaderType
 *  minecraft.class00056
 *  minecraft.class01894
 *  minecraft.class02414
 *  minecraft.class08086
 *  minecraft.class08627
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10883;
import com.mojang.blaze3d.shaders.ShaderType;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import minecraft.class00056;
import minecraft.class01894;
import minecraft.class02414;
import minecraft.class08086;
import minecraft.class08204;
import minecraft.class08205;
import minecraft.class08212;
import minecraft.class08627;
import org.jspecify.annotations.Nullable;

class class08231
implements AutoCloseable {
    private final class08204 u;
    final Map<class01894, Optional<class08086>> N = new HashMap<class01894, Optional<class08086>>();
    boolean y;
    final /* synthetic */ class08212 L;

    class08231(class08212 class082122, class08204 class082042) {
        this.L = class082122;
        this.u = class082042;
    }

    @Override
    public void close() {
        this.N.values().forEach(optional -> optional.ifPresent(class08086::close));
        this.N.clear();
    }

    private class08086 y(class01894 class018942, Set<class01894> set) throws class10883 {
        class02414 class024142 = this.u.y().get(class018942);
        if (class024142 == null) {
            throw new class10883("Could not find post chain with id: " + String.valueOf(class018942));
        }
        return class08086.N((class02414)class024142, (class08627)this.L.u, set, (class01894)class018942, (class00056)this.L.i);
    }

    public @Nullable String N(class01894 class018942, ShaderType shaderType) {
        return this.u.N().get((Object)new class08205(class018942, shaderType));
    }

    public @Nullable class08086 N(class01894 class018942, Set<class01894> set) throws class10883 {
        Optional<class08086> var3 = this.N.get(class018942);
        if (var3 != null) {
            return var3.orElse(null);
        }
        class08086 class080862 = this.y(class018942, set);
        this.N.put(class018942, Optional.of(class080862));
        return class080862;
    }
}

