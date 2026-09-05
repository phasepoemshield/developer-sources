/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class06613
 */
package jerozgen.languagereload.gui;

import jerozgen.languagereload.gui.LanguageListWidget$Entry;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class06613;

public class HeaderEntry
extends LanguageListWidget$Entry {
    private final class01590 textRenderer;
    private final class00392 text;

    public HeaderEntry(class01590 class015902, class00392 class003922) {
        this.textRenderer = class015902;
        this.text = class003922;
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        return false;
    }

    @Override
    public String getCode() {
        return "";
    }

    public void method_25343(class01054 class010542, int n, int n2, boolean bl, float f) {
        int n3 = this.method_46426() + this.method_25368() / 2;
        int n4 = this.method_73385() - 4;
        class010542.N(this.textRenderer, this.text, n3, n4, -1);
    }

    public class00392 method_37006() {
        return this.text;
    }
}

