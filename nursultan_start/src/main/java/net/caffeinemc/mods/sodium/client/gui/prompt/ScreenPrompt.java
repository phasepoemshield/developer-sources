/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01028
 *  minecraft.class01054
 *  minecraft.class01294
 *  minecraft.class01590
 *  minecraft.class04654
 *  minecraft.class05936
 *  minecraft.class06202
 *  minecraft.class06601
 *  minecraft.class06613
 *  net.caffeinemc.mods.sodium.client.util.Dim2i
 *  org.jspecify.annotations.NonNull
 */
package net.caffeinemc.mods.sodium.client.gui.prompt;

import java.util.List;
import java.util.Objects;
import minecraft.class00392;
import minecraft.class01028;
import minecraft.class01054;
import minecraft.class01294;
import minecraft.class01590;
import minecraft.class04654;
import minecraft.class05936;
import minecraft.class06202;
import minecraft.class06601;
import minecraft.class06613;
import net.caffeinemc.mods.sodium.client.gui.ButtonTheme;
import net.caffeinemc.mods.sodium.client.gui.prompt.ScreenPrompt$Action;
import net.caffeinemc.mods.sodium.client.gui.prompt.ScreenPromptable;
import net.caffeinemc.mods.sodium.client.gui.widgets.AbstractWidget;
import net.caffeinemc.mods.sodium.client.gui.widgets.FlatButtonWidget;
import net.caffeinemc.mods.sodium.client.util.Dim2i;
import org.jspecify.annotations.NonNull;

public class ScreenPrompt
implements class01294,
class04654 {
    public static final int PROMPT_WIDTH = 320;
    public static final int PROMPT_HEIGHT = 190;
    private static final int BUTTON_MARGIN = 4;
    private static final int CLOSE_BUTTON_WIDTH = 80;
    private static final int ACTION_BUTTON_WIDTH = 110;
    private static final ButtonTheme PROMPT_THEME = new ButtonTheme(-1, -1, -1, -13027015, -13948117, -13948117);
    private final ScreenPromptable parent;
    private final List<class05936> text;
    private final ScreenPrompt$Action action;
    private FlatButtonWidget closeButton;
    private FlatButtonWidget actionButton;
    private final int width;
    private final int height;

    public ScreenPrompt(ScreenPromptable screenPromptable, List<class05936> list, int n, int n2, ScreenPrompt$Action screenPrompt$Action) {
        this.parent = screenPromptable;
        this.text = list;
        this.width = n;
        this.height = n2;
        this.action = screenPrompt$Action;
    }

    public void init() {
        Dim2i dim2i = this.parent.getDimensions();
        int n = dim2i.getCenterX() - this.width / 2;
        int n2 = dim2i.getCenterY() - this.height / 2;
        int n3 = n2 + this.height - 20 - 4;
        int n4 = n + this.width - 80 - 4;
        int n5 = n4 - 110 - 4;
        this.closeButton = new FlatButtonWidget(new Dim2i(n4, n3, 80, 20), (class00392)class00392.y((String)"Close"), this::close, true, false, PROMPT_THEME);
        this.actionButton = new FlatButtonWidget(new Dim2i(n5, n3, 110, 20), this.action.label, this::runAction, true, false, PROMPT_THEME);
    }

    private void close() {
        this.parent.setPrompt(null);
    }

    public boolean method_25404(class06601 class066012) {
        if (class066012.i()) {
            this.close();
            return true;
        }
        return super.method_25404(class066012);
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        Dim2i dim2i = this.parent.getDimensions();
        class010542.N(0, 0, class010542.N(), class010542.y(), 0x70090909);
        int n3 = dim2i.getCenterX() - this.width / 2;
        int n4 = dim2i.getCenterY() - this.height / 2;
        class010542.N(n3, n4, n3 + this.width, n4 + this.height, -15263977);
        class010542.y(n3, n4, this.width, this.height, -15592942);
        int n5 = n3 + 5;
        int n6 = n4 + 5;
        int n7 = this.width - 10;
        class01590 class015902 = (class01590)class06202.Nq().i_3;
        for (class05936 object : this.text) {
            List list = class015902.L(object, n7);
            for (class01028 class010282 : list) {
                class010542.N(class015902, class010282, n5, n6, -1, true);
                Objects.requireNonNull(class015902);
                n6 += 9 + 2;
            }
            n6 += 8;
        }
        for (AbstractWidget abstractWidget : this.getWidgets()) {
            abstractWidget.method_25394(class010542, n, n2, f);
        }
    }

    public void method_25365(boolean bl) {
        if (bl) {
            this.parent.setPrompt(this);
        } else {
            this.parent.setPrompt(null);
        }
    }

    public boolean method_25370() {
        return this.parent.getPrompt() == this;
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        for (AbstractWidget abstractWidget : this.getWidgets()) {
            if (!abstractWidget.method_25402(class066132, bl)) continue;
            return true;
        }
        return false;
    }

    public @NonNull List<AbstractWidget> getWidgets() {
        return List.of(this.actionButton, this.closeButton);
    }

    private void runAction() {
        this.action.runnable.run();
        this.close();
    }
}

