/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import java.util.function.Consumer;
import minecraft.class03425;

class class03446
implements Consumer<String> {
    private boolean y = true;
    final /* synthetic */ StringBuilder N;

    class03446(class03425 class034252, StringBuilder stringBuilder) {
        this.N = stringBuilder;
    }

    @Override
    public void accept(String string) {
        if (!this.y) {
            this.N.append(". ");
        }
        this.y = false;
        this.N.append(string);
    }
}

