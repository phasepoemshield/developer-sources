/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  minecraft.class03556
 *  minecraft.class07084
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;
import minecraft.class00834;
import minecraft.class00849;
import minecraft.class03556;
import minecraft.class07084;

public class class00814 {
    private final ImmutableMap.Builder<class03556<class07084>, class00849> N = ImmutableMap.builder();

    public Optional<class00834> y() {
        return Optional.of(new class00834((Map<class03556<class07084>, class00849>)this.N.build()));
    }

    public static class00814 N() {
        return new class00814();
    }

    public class00814 N(class03556<class07084> class035562, class00849 class008492) {
        this.N.put(class035562, (Object)class008492);
        return this;
    }

    public class00814 N(class03556<class07084> class035562) {
        this.N.put(class035562, (Object)new class00849());
        return this;
    }
}

