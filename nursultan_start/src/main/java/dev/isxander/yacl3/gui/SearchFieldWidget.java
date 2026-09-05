/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class04927
 */
package dev.isxander.yacl3.gui;

import dev.isxander.yacl3.gui.YACLScreen;
import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class04927;

public class SearchFieldWidget
extends class04927 {
    private class00392 emptyText;
    private final YACLScreen yaclScreen;
    private final class01590 font;
    private final Consumer<String> updateConsumer;
    private boolean isEmpty = true;

    public SearchFieldWidget(YACLScreen yACLScreen, class01590 class015902, int n, int n2, int n3, int n4, class00392 class003922, class00392 class003923, Consumer<String> consumer) {
        super(class015902, n, n2, n3, n4, class003922);
        this.method_1863(this::update);
        this.yaclScreen = yACLScreen;
        this.font = class015902;
        this.emptyText = class003923;
        this.updateConsumer = consumer;
    }

    private void update(String string) {
        boolean bl = this.isEmpty;
        this.isEmpty = string.isEmpty();
        if (this.isEmpty && bl) {
            return;
        }
        this.updateConsumer.accept(string);
    }

    public boolean isEmpty() {
        return this.isEmpty;
    }

    public String getQuery() {
        return this.method_1882().toLowerCase();
    }

    public class00392 getEmptyText() {
        return this.emptyText;
    }

    public void setEmptyText(class00392 class003922) {
        this.emptyText = class003922;
    }

    public void method_48579(class01054 class010542, int n, int n2, float f) {
        super.method_48579(class010542, n, n2, f);
        if (this.method_1885() && this.isEmpty()) {
            class010542.N(this.font, this.emptyText, this.method_46426() + 4, this.method_46427() + (this.field_22759 - 8) / 2, 0x707070, true);
        }
    }
}

