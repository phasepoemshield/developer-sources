/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02083
 *  minecraft.class03926
 *  minecraft.class03962
 *  minecraft.class04469
 *  minecraft.class04470
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.time.Instant;
import minecraft.class02083;
import minecraft.class03055;
import minecraft.class03073;
import minecraft.class03079;
import minecraft.class03080;
import minecraft.class03083;
import minecraft.class03926;
import minecraft.class03962;
import minecraft.class04469;
import minecraft.class04470;
import org.jspecify.annotations.Nullable;

class class03045
implements class03073 {
    final /* synthetic */ class04470 N;
    final /* synthetic */ class03962 y;
    final /* synthetic */ class03080 L;

    @Override
    public class03926 unpack(@Nullable class04469 class044692, class03079 class030792) throws class03083 {
        if (class044692 == null) {
            throw new class03083(class03083.N);
        }
        if (this.N.y().N()) {
            throw new class03083(class03083.L);
        }
        class02083 class020832 = this.L.y;
        if (class020832 == null) {
            throw new class03083(class03083.y);
        }
        if (class030792.y().isBefore(this.L.L)) {
            this.N();
            throw new class03083(class03083.i);
        }
        this.L.L = class030792.y();
        class03926 class039262 = new class03926(class020832, class044692, class030792, null, class03055.L);
        if (!class039262.N(this.y)) {
            this.N();
            throw new class03083(class03083.u);
        }
        if (class039262.N(Instant.now())) {
            class03080.N.warn("Received expired chat: '{}'. Is the client/server system time unsynchronized?", (Object)class030792.N());
        }
        this.L.y = class020832.N();
        return class039262;
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    class03045(class03080 class030802, class04470 class044702, class03962 class039622) {
        this.L = class030802;
        this.N = class044702;
        this.y = class039622;
    }

    @Override
    public void N() {
        this.L.y = null;
    }
}

