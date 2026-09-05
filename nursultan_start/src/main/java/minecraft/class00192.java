/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class04701
 *  minecraft.class05007
 *  minecraft.class06086
 *  minecraft.class06095
 *  minecraft.class06132
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.OptionalLong;
import minecraft.class00232;
import minecraft.class00392;
import minecraft.class04701;
import minecraft.class05007;
import minecraft.class06086;
import minecraft.class06095;
import minecraft.class06132;
import org.jspecify.annotations.Nullable;

class class00192
implements class05007 {
    private final class06095 L = new class06095();
    private class00392 u = class00392.i();
    private @Nullable class00392 i = null;
    private int R;
    private int M;
    private OptionalLong B = OptionalLong.empty();
    final /* synthetic */ int N;
    final /* synthetic */ class00232 y;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    class00192(class00232 class002322, int n) {
        this.y = class002322;
        this.N = n;
    }

    private void y() {
        this.y.y.execute(() -> class06132.y((class06086)this.y.y.m(), (class06095)this.L, (class00392)this.u, (class00392)this.i));
    }

    private void y(long l) {
        this.i = this.B.isPresent() ? class00392.N((String)"download.pack.progress.percent", (Object[])new Object[]{l * 100L / this.B.getAsLong()}) : class00392.N((String)"download.pack.progress.bytes", (Object[])new Object[]{class04701.y((long)l)});
        this.y();
    }

    public void N(OptionalLong optionalLong) {
        class00232.N.debug("File size = {} bytes", (Object)optionalLong);
        this.B = optionalLong;
        this.y(0L);
    }

    public void N(boolean bl) {
        if (!bl) {
            class00232.N.info("Pack {} failed to download", (Object)this.R);
            ++this.M;
        } else {
            class00232.N.debug("Download ended for pack {}", (Object)this.R);
        }
        if (this.R == this.N) {
            if (this.M > 0) {
                this.u = class00392.N((String)"download.pack.failed", (Object[])new Object[]{this.M, this.N});
                this.i = null;
                this.y();
            } else {
                class06132.N((class06086)this.y.y.m(), (class06095)this.L);
            }
        }
    }

    public void N(long l) {
        class00232.N.debug("Progress for pack {}: {} bytes", (Object)this.R, (Object)l);
        this.y(l);
    }

    public void N() {
        ++this.R;
        this.u = class00392.N((String)"download.pack.title", (Object[])new Object[]{this.R, this.N});
        this.y();
        class00232.N.debug("Starting pack {}/{} download", (Object)this.R, (Object)this.N);
    }
}

