/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.flashyreese.mods.reeses_sodium_options.client.gui.AbstractWidgetExtended
 *  minecraft.class00040
 *  minecraft.class00044
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01294
 *  minecraft.class01590
 *  minecraft.class02089
 *  minecraft.class02106
 *  minecraft.class02111
 *  minecraft.class03255
 *  minecraft.class03428
 *  minecraft.class03432
 *  minecraft.class03434
 *  minecraft.class03457
 *  minecraft.class04654
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class05936
 *  minecraft.class06202
 *  net.caffeinemc.mods.sodium.client.util.Dim2i
 *  org.jspecify.annotations.NonNull
 *  org.jspecify.annotations.Nullable
 */
package net.caffeinemc.mods.sodium.client.gui.widgets;

import me.flashyreese.mods.reeses_sodium_options.client.gui.AbstractWidgetExtended;
import minecraft.class00040;
import minecraft.class00044;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01294;
import minecraft.class01590;
import minecraft.class02089;
import minecraft.class02106;
import minecraft.class02111;
import minecraft.class03255;
import minecraft.class03428;
import minecraft.class03432;
import minecraft.class03434;
import minecraft.class03457;
import minecraft.class04654;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class05936;
import minecraft.class06202;
import net.caffeinemc.mods.sodium.client.gui.Dimensioned;
import net.caffeinemc.mods.sodium.client.util.Dim2i;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

public abstract class AbstractWidget
implements class01294,
class03434,
class04654,
AbstractWidgetExtended,
Dimensioned {
    protected final class01590 font;
    private Dim2i dim;
    protected boolean focused;
    protected boolean hovered;

    public AbstractWidget(Dim2i dim2i) {
        this.font = (class01590)class06202.Nq().i_3;
        this.dim = dim2i;
    }

    @Override
    public Dim2i getDimensions() {
        return this.dim;
    }

    public @Nullable class02106 method_48205(class02089 class020892) {
        return !this.method_25370() ? class02106.N((class04654)this) : null;
    }

    public void method_37020(class03428 class034282) {
        if (this.focused) {
            class034282.N(class03457.field_33791, (class00392)class00392.L((String)"narration.button.usage.focused"));
        } else if (this.hovered) {
            class034282.N(class03457.field_33791, (class00392)class00392.L((String)"narration.button.usage.hovered"));
        }
    }

    public @NonNull class03255 method_48202() {
        return new class03255(this.getX(), this.getY(), this.getWidth(), this.getHeight());
    }

    public @NonNull class03432 method_37018() {
        if (this.focused) {
            return class03432.field_33786;
        }
        if (this.hovered) {
            return class03432.field_33785;
        }
        return class03432.field_33784;
    }

    public boolean method_25405(double d, double d2) {
        return d >= (double)this.getX() && d < (double)this.getLimitX() && d2 >= (double)this.getY() && d2 < (double)this.getLimitY();
    }

    public void method_25365(boolean bl) {
        if (!bl) {
            this.focused = false;
        } else {
            class02111 class021112 = class06202.Nq().Nc();
            if (class021112 == class02111.field_41780 || class021112 == class02111.field_43097) {
                this.focused = true;
            }
        }
    }

    public boolean method_25370() {
        return this.focused;
    }

    protected void drawString(class01054 class010542, class00392 class003922, int n, int n2, int n3) {
        class010542.y(this.font, class003922, n, n2, n3);
    }

    protected void drawString(class01054 class010542, String string, int n, int n2, int n3) {
        class010542.y(this.font, string, n, n2, n3);
    }

    protected void drawRect(class01054 class010542, int n, int n2, int n3, int n4, int n5) {
        class010542.N(n, n2, n3, n4, n5);
    }

    public Dim2i getDim() {
        return this.dim;
    }

    public void setDim(Dim2i dim2i) {
        this.dim = dim2i;
    }

    protected void drawBorder(class01054 class010542, int n, int n2, int n3, int n4, int n5) {
        class010542.N(n, n2, n3, n2 + 1, n5);
        class010542.N(n, n4 - 1, n3, n4, n5);
        class010542.N(n, n2, n + 1, n4, n5);
        class010542.N(n3 - 1, n2, n3, n4, n5);
    }

    protected void drawCenteredString(class01054 class010542, class00392 class003922, int n, int n2, int n3) {
        class010542.N(this.font, class003922, n, n2, n3);
    }

    protected int getStringWidth(class05936 class059362) {
        return this.font.N(class059362);
    }

    protected String truncateTextToFit(String object, int n) {
        String string = "...";
        int n2 = this.font.y(string);
        int n3 = this.font.y((String)object);
        if (n3 > n) {
            n -= n2;
            int n4 = ((String)object).length() - 3;
            int n5 = 1;
            while (n4 - n5 > 1) {
                int n6 = (n4 + n5) / 2;
                String string2 = ((String)object).substring(0, n6);
                int n7 = this.font.y(string2);
                if (n7 > n) {
                    n4 = n6;
                    continue;
                }
                n5 = n6;
            }
            object = ((String)object).substring(0, n5).trim() + string;
        }
        return object;
    }

    protected void playClickSound() {
        class06202.Nq().Nr().N((class00044)class00040.N((class04891)((class04891)class04909.OK.N()), (float)1.0f));
    }

    public boolean isHovered() {
        return this.hovered;
    }
}

