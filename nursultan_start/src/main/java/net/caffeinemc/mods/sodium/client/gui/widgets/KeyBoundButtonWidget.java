/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class06202
 *  minecraft.class06541
 *  minecraft.class06601
 *  net.caffeinemc.mods.sodium.client.util.Dim2i
 */
package net.caffeinemc.mods.sodium.client.gui.widgets;

import minecraft.class00392;
import minecraft.class06202;
import minecraft.class06541;
import minecraft.class06601;
import net.caffeinemc.mods.sodium.client.gui.widgets.FlatButtonWidget;
import net.caffeinemc.mods.sodium.client.util.Dim2i;

public class KeyBoundButtonWidget
extends FlatButtonWidget {
    private final int shortcutKey;
    private final class00392 underlinedLabel;

    public KeyBoundButtonWidget(Dim2i dim2i, class00392 class003922, Runnable runnable, boolean bl, boolean bl2, int n) {
        super(dim2i, class003922, runnable, bl, bl2);
        this.shortcutKey = n;
        this.underlinedLabel = KeyBoundButtonWidget.buildUnderlinedLabel(class003922, n);
    }

    private static int indexOfIgnoreCase(String string, char c) {
        char c2 = Character.toLowerCase(c);
        for (int i = 0; i < string.length(); ++i) {
            if (Character.toLowerCase(string.charAt(i)) != c2) continue;
            return i;
        }
        return -1;
    }

    @Override
    protected class00392 getRenderedLabel() {
        return this.isEnabled() && class06202.Nq().U() ? this.underlinedLabel : super.getRenderedLabel();
    }

    public boolean tryActivateShortcut(class06601 class066012) {
        if (this.isEnabled() && this.isVisible() && class066012.E() && class066012.v() == this.shortcutKey) {
            this.doAction();
            return true;
        }
        return false;
    }

    private static class00392 buildUnderlinedLabel(class00392 class003922, int n) {
        char c;
        String string = class003922.getString();
        int n2 = KeyBoundButtonWidget.indexOfIgnoreCase(string, c = (char)n);
        if (n2 >= 0) {
            return class00392.i().y((class00392)class00392.y((String)string.substring(0, n2))).y((class00392)class00392.y((String)string.substring(n2, n2 + 1)).N(class06541.field_1073)).y((class00392)class00392.y((String)string.substring(n2 + 1)));
        }
        return class00392.i().y(class003922).y((class00392)class00392.y((String)" [")).y((class00392)class00392.y((String)String.valueOf(c)).N(class06541.field_1073)).y((class00392)class00392.y((String)"]"));
    }
}

