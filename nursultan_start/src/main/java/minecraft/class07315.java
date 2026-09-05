/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class04782
 *  minecraft.class07703
 */
package minecraft;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import minecraft.class00392;
import minecraft.class04782;
import minecraft.class07305;
import minecraft.class07327;
import minecraft.class07703;

public class class07315
implements class07703,
AutoCloseable {
    private final class04782 L;
    private static final DateTimeFormatter u = DateTimeFormatter.ofPattern("HH:mm:ss", Locale.ROOT);
    private boolean i;
    final /* synthetic */ class07327 N;

    protected class07315(class07327 class073272, class04782 class047822) {
        this.N = class073272;
        this.L = class047822;
    }

    public boolean B() {
        return !this.i && this.L.method_64395().N(class07305.M) != false;
    }

    @Override
    public void close() throws Exception {
        this.i = true;
    }

    public void N(class00392 class003922) {
        if (!this.i) {
            this.N.y = class00392.y((String)("[" + u.format(ZonedDateTime.now()) + "] ")).y(class003922);
            this.N.N(this.L);
        }
    }

    public boolean A_() {
        return !this.i && this.L.method_64395().N(class07305.F) != false;
    }

    public boolean B_() {
        return !this.i;
    }
}

