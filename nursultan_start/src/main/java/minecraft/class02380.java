/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import java.util.Optional;
import minecraft.class02362;

class class02380<B, V>
implements class02362<B, Optional<V>> {
    final /* synthetic */ class02362 N;

    class02380(class02362 class023622) {
        this.N = class023622;
    }

    public Optional<V> decode(B b) {
        if (b.readBoolean()) {
            return Optional.of(this.N.decode(b));
        }
        return Optional.empty();
    }

    public void encode(B b, Optional<V> optional) {
        if (optional.isPresent()) {
            b.writeBoolean(true);
            this.N.encode(b, optional.get());
        } else {
            b.writeBoolean(false);
        }
    }
}

