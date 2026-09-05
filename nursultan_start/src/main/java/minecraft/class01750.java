/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03099
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class01704;
import minecraft.class01714;
import minecraft.class01742;
import minecraft.class01744;
import minecraft.class01752;
import minecraft.class03099;
import org.jspecify.annotations.Nullable;

class class01750<T>
implements class01744<T> {
    final /* synthetic */ class01752 N;
    final /* synthetic */ class03099 y;

    class01750(class01752 class017522, class03099 class030992) {
        this.N = class017522;
        this.y = class030992;
    }

    @Override
    public class03099 y() {
        return this.y;
    }

    @Override
    public void N(class01742<T> class017422) {
        this.N.N(new class01714<T>(this.y, class017422));
    }

    @Override
    public @Nullable class01704 N() {
        return this.N.y();
    }

    @Override
    public void N(@Nullable class01704 class017042) {
        this.N.N(class017042);
    }
}

