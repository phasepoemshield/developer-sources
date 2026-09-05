/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01018
 *  minecraft.class01594
 *  minecraft.class06202
 *  minecraft.class06221
 *  minecraft.class08844
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class01018;
import minecraft.class01594;
import minecraft.class04678;
import minecraft.class06202;
import minecraft.class06221;
import minecraft.class08844;
import org.jspecify.annotations.Nullable;

public final class class04669
implements AutoCloseable {
    private final class06202 N;
    private final class01594 y;

    public class04669(class06202 class062022) {
        this.N = class062022;
        this.y = new class01594(class06221::new);
    }

    @Override
    public void close() {
        this.y.N();
    }

    public class08844 N(class01018 class010182, @Nullable String string, String string2) {
        return new class08844((class04678)this.N, this.y, class010182, string, string2);
    }
}

