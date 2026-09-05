/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04782
 *  minecraft.class06889
 *  minecraft.class07072
 *  minecraft.class07209
 *  minecraft.class08036
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00676;
import minecraft.class00690;
import minecraft.class00699;
import minecraft.class04782;
import minecraft.class06889;
import minecraft.class07072;
import minecraft.class07209;
import minecraft.class08036;
import org.jspecify.annotations.Nullable;

public abstract class class00692
implements class00699 {
    protected final class00690 N;

    @Override
    public void L() {
    }

    @Override
    public float M() {
        float f = (float)this.N.method_18798().Z() + 1.0f;
        float f2 = Math.min(f, 40.0f);
        return 0.7f / f2 / f;
    }

    public class00692(class00690 class006902) {
        this.N = class006902;
    }

    @Override
    public float i() {
        return 0.6f;
    }

    @Override
    public void u() {
    }

    @Override
    public void y() {
    }

    @Override
    public float N(class07072 class070722, float f) {
        return f;
    }

    @Override
    public boolean N() {
        return false;
    }

    @Override
    public void N(class04782 class047822) {
    }

    @Override
    public void N(class00676 class006762, class07209 class072092, class07072 class070722, @Nullable class08036 class080362) {
    }

    @Override
    public @Nullable class06889 R() {
        return null;
    }
}

