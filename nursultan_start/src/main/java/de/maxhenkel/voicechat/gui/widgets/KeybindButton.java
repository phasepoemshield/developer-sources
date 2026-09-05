/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01065
 *  minecraft.class03428
 *  minecraft.class04648
 *  minecraft.class04655
 *  minecraft.class05216
 *  minecraft.class05630
 *  minecraft.class06202
 *  minecraft.class06308
 *  minecraft.class06428
 *  minecraft.class06478
 *  minecraft.class06541
 *  minecraft.class06601
 *  minecraft.class06611
 *  minecraft.class06613
 */
package de.maxhenkel.voicechat.gui.widgets;

import javax.annotation.Nullable;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01065;
import minecraft.class03428;
import minecraft.class04648;
import minecraft.class04655;
import minecraft.class05216;
import minecraft.class05630;
import minecraft.class06202;
import minecraft.class06308;
import minecraft.class06428;
import minecraft.class06478;
import minecraft.class06541;
import minecraft.class06601;
import minecraft.class06611;
import minecraft.class06613;

public class KeybindButton
extends class06308 {
    private static final class06202 mc = class06202.Nq();
    protected class06428 keyMapping;
    @Nullable
    protected class00392 description;
    protected boolean listening;

    private static class00392 getText(class06428 class064282) {
        return class064282.m();
    }

    public KeybindButton(class06428 class064282, int n, int n2, int n3, int n4, @Nullable class00392 class003922) {
        super(n, n2, n3, n4, (class00392)class00392.i());
        this.keyMapping = class064282;
        this.description = class003922;
        this.updateText();
    }

    public KeybindButton(class06428 class064282, int n, int n2, int n3, int n4) {
        this(class064282, n, n2, n3, n4, null);
    }

    public boolean method_25404(class06601 class066012) {
        if (this.listening) {
            if (class066012.i()) {
                this.keyMapping.y(class04655.yI);
            } else {
                this.keyMapping.y(class04655.N((class06601)class066012));
            }
            class06428.i();
            ((class05630)KeybindButton.mc.i_7).Np();
            this.listening = false;
            this.updateText();
            return true;
        }
        return super.method_25404(class066012);
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        if (this.listening) {
            if (class066132.v() == 0) {
                this.listening = false;
                this.updateText();
                return this.method_25405(class066132.n(), class066132.t());
            }
            this.keyMapping.y(class04648.field_1672.N(class066132.v()));
            class06428.i();
            ((class05630)KeybindButton.mc.i_7).Np();
            this.listening = false;
            this.updateText();
            return true;
        }
        return super.method_25402(class066132, bl);
    }

    public boolean method_16803(class06601 class066012) {
        if (this.listening && class066012.i()) {
            return true;
        }
        return super.method_16803(class066012);
    }

    public void resetListening() {
        this.listening = false;
        this.updateText();
    }

    public boolean isListening() {
        return this.listening;
    }

    public void method_25306(class06611 class066112) {
        this.listening = true;
        this.updateText();
    }

    public void method_75752(class01054 class010542, int n, int n2, float f) {
        this.method_75794(class010542);
        this.method_75793(class010542.N((class06478)this, class01065.field_63850));
    }

    protected void updateText() {
        class05216 class052162 = this.listening ? class00392.y((String)"> ").y((class00392)KeybindButton.getText(this.keyMapping).L().N(new class06541[]{class06541.field_1068, class06541.field_1073})).i(" <").N(class06541.field_1054) : KeybindButton.getText(this.keyMapping).L();
        if (this.description != null) {
            class052162 = this.description.L().i(": ").y((class00392)class052162);
        }
        this.method_25355((class00392)class052162);
    }

    public void method_47399(class03428 class034282) {
    }
}

