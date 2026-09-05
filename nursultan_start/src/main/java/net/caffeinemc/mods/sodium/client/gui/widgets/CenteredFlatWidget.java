/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class02089
 *  minecraft.class02106
 *  minecraft.class06601
 *  minecraft.class06613
 *  net.caffeinemc.mods.sodium.client.util.Dim2i
 *  org.jspecify.annotations.Nullable
 */
package net.caffeinemc.mods.sodium.client.gui.widgets;

import java.util.Objects;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class02089;
import minecraft.class02106;
import minecraft.class06601;
import minecraft.class06613;
import net.caffeinemc.mods.sodium.client.gui.ButtonTheme;
import net.caffeinemc.mods.sodium.client.gui.ColorTheme;
import net.caffeinemc.mods.sodium.client.gui.widgets.AbstractWidget;
import net.caffeinemc.mods.sodium.client.util.Dim2i;
import org.jspecify.annotations.Nullable;

public abstract class CenteredFlatWidget
extends AbstractWidget {
    private final boolean isSelectable;
    private final ButtonTheme theme;
    private boolean selected;
    private boolean enabled = true;
    private boolean visible = true;
    private final class00392 label;
    private final class00392 subtitle;

    public CenteredFlatWidget(Dim2i dim2i, class00392 class003922, class00392 class003923, boolean bl, ColorTheme colorTheme) {
        super(dim2i);
        this.label = class003922;
        this.subtitle = class003923;
        this.isSelectable = bl;
        this.theme = new ButtonTheme(colorTheme, 0x8FFFFFF, -1879048192, 0x40000000);
    }

    public CenteredFlatWidget(Dim2i dim2i, class00392 class003922, boolean bl, ColorTheme colorTheme) {
        this(dim2i, class003922, null, bl, colorTheme);
    }

    public void setEnabled(boolean bl) {
        this.enabled = bl;
    }

    public boolean method_25404(class06601 class066012) {
        if (!this.method_25370()) {
            return false;
        }
        if (class066012.L()) {
            this.doAction();
            return true;
        }
        return false;
    }

    @Override
    public @Nullable class02106 method_48205(class02089 class020892) {
        if (!this.enabled || !this.visible) {
            return null;
        }
        return super.method_48205(class020892);
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        int n3;
        if (!this.visible) {
            return;
        }
        this.hovered = this.method_25405(n, n2);
        int n4 = this.hovered ? this.theme.bgHighlight : (n3 = this.selected ? this.theme.bgDefault : this.theme.bgInactive);
        int n5 = this.selected || !this.isSelectable ? this.theme.themeLighter : (this.hovered ? this.theme.theme : this.theme.themeDarker);
        int n6 = this.getX();
        int n7 = this.getY();
        int n8 = this.getLimitX();
        int n9 = this.getLimitY();
        if (this.isSelectable) {
            this.drawRect(class010542, n6, n7, n8, n9, n3);
        }
        if (this.selected) {
            this.drawRect(class010542, n8 - 3, n7, n8, n9, this.theme.themeLighter);
        }
        int n10 = this.renderIcon(class010542, n5);
        if (this.subtitle == null) {
            String string = this.truncateToFitWidth(this.label, n10);
            float f2 = n7;
            int n11 = this.getTextBoxHeight();
            Objects.requireNonNull(this.font);
            this.drawString(class010542, string, n6 + n10, (int)Math.ceil(f2 + (float)(n11 - 9) * 0.5f), n5);
        } else {
            float f3 = (float)n7 + (float)this.getTextBoxHeight() * 0.5f;
            String string = this.truncateToFitWidth(this.label, n10);
            Objects.requireNonNull(this.font);
            this.drawString(class010542, string, n6 + n10, (int)Math.ceil(f3 - (9.0f + 1.0f)), n5);
            this.drawString(class010542, this.truncateToFitWidth(this.subtitle, n10), n6 + n10, (int)Math.ceil(f3 + 1.0f), n5);
        }
        if (this.enabled && this.method_25370()) {
            this.drawBorder(class010542, n6, n7, n8, n9, -2147418130);
        }
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        if (!this.enabled || !this.visible) {
            return false;
        }
        if (class066132.v() == 0 && this.method_25405(class066132.n(), class066132.t())) {
            this.doAction();
            return true;
        }
        return false;
    }

    protected int renderIcon(class01054 class010542, int n) {
        return 8;
    }

    public void setVisible(boolean bl) {
        this.visible = bl;
    }

    private String truncateToFitWidth(class00392 class003922, int n) {
        return this.truncateTextToFit(class003922.getString(), this.getWidth() - 14 - n);
    }

    protected int getTextBoxHeight() {
        return this.getHeight();
    }

    private void doAction() {
        this.onAction();
        this.playClickSound();
    }

    abstract void onAction();

    public void setSelected(boolean bl) {
        this.selected = bl;
    }
}

