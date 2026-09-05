/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.hash.Hashing
 *  minecraft.class01894
 *  minecraft.class07536
 *  minecraft.class08280
 *  minecraft.class08627
 *  minecraft.class08829
 *  minecraft.class08918
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.hash.Hashing;
import minecraft.class01894;
import minecraft.class07536;
import minecraft.class08280;
import minecraft.class08627;
import minecraft.class08829;
import minecraft.class08918;
import org.jspecify.annotations.Nullable;

public class class04182
implements AutoCloseable {
    public static final class01894 N = class01894.y((String)"textures/misc/unknown_server.png");
    private static final int y = 64;
    private static final int L = 64;
    private final class08627 u;
    private final class01894 i;
    private @Nullable class08829 R;
    private boolean M;

    public boolean L() {
        return this.M;
    }

    private class04182(class08627 class086272, class01894 class018942) {
        this.u = class086272;
        this.i = class018942;
    }

    @Override
    public void close() {
        this.N();
        this.M = true;
    }

    private void u() {
        if (this.M) {
            throw new IllegalStateException("Icon already closed");
        }
    }

    public static class04182 y(class08627 class086272, String string) {
        return new class04182(class086272, class01894.y((String)("servers/" + String.valueOf(Hashing.sha1().hashUnencodedChars((CharSequence)string)) + "/icon")));
    }

    public class01894 y() {
        return this.R != null ? this.i : N;
    }

    public void N(class08280 class082802) {
        if (class082802.N() != 64 || class082802.y() != 64) {
            class082802.close();
            throw new IllegalArgumentException("Icon must be 64x64, but was " + class082802.N() + "x" + class082802.y());
        }
        try {
            this.u();
            if (this.R == null) {
                this.R = new class08829(() -> "Favicon " + String.valueOf(this.i), class082802);
            } else {
                this.R.method_4526(class082802);
                this.R.method_4524();
            }
            this.u.N(this.i, (class08918)this.R);
        }
        catch (Throwable throwable) {
            class082802.close();
            this.N();
            throw throwable;
        }
    }

    public static class04182 N(class08627 class086272, String string) {
        return new class04182(class086272, class01894.y((String)("worlds/" + class07536.N_75((String)string, class01894::y) + "/" + String.valueOf(Hashing.sha1().hashUnencodedChars((CharSequence)string)) + "/icon")));
    }

    public void N() {
        this.u();
        if (this.R != null) {
            this.u.L(this.i);
            this.R.close();
            this.R = null;
        }
    }
}

