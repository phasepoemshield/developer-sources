/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.hash.HashCode
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.hash.HashCode;
import java.net.URL;
import java.nio.file.Path;
import java.util.UUID;
import minecraft.class03819;
import minecraft.class03834;
import minecraft.class03843;
import org.jspecify.annotations.Nullable;

class class03845 {
    final UUID N;
    final URL y;
    final @Nullable HashCode L;
    @Nullable Path u;
    @Nullable class03834 i;
    class03819 R = class03819.field_47643;
    class03843 M = class03843.field_47639;
    boolean B;

    class03845(UUID uUID, URL uRL, @Nullable HashCode hashCode) {
        this.N = uUID;
        this.y = uRL;
        this.L = hashCode;
    }

    public void N(class03834 class038342) {
        if (this.i == null) {
            this.i = class038342;
        }
    }

    public boolean N() {
        return this.i != null;
    }
}

