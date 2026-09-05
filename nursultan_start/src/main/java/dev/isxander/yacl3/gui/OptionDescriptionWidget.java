/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class00405
 *  minecraft.class00580
 *  minecraft.class01028
 *  minecraft.class01054
 *  minecraft.class01065
 *  minecraft.class01590
 *  minecraft.class02089
 *  minecraft.class02106
 *  minecraft.class03255
 *  minecraft.class03428
 *  minecraft.class03457
 *  minecraft.class04674
 *  minecraft.class04995
 *  minecraft.class05936
 *  minecraft.class06202
 *  minecraft.class06478
 *  minecraft.class06601
 *  minecraft.class06613
 */
package dev.isxander.yacl3.gui;

import dev.isxander.yacl3.gui.DescriptionWithName;
import dev.isxander.yacl3.gui.image.ImageRenderer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Supplier;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class00580;
import minecraft.class01028;
import minecraft.class01054;
import minecraft.class01065;
import minecraft.class01590;
import minecraft.class02089;
import minecraft.class02106;
import minecraft.class03255;
import minecraft.class03428;
import minecraft.class03457;
import minecraft.class04674;
import minecraft.class04995;
import minecraft.class05936;
import minecraft.class06202;
import minecraft.class06478;
import minecraft.class06601;
import minecraft.class06613;

public class OptionDescriptionWidget
extends class06478 {
    private static final int AUTO_SCROLL_TIMER = 1500;
    private static final float AUTO_SCROLL_SPEED = 1.0f;
    private DescriptionWithName description;
    private List<class01028> wrappedText;
    private static final class06202 minecraft = class06202.Nq();
    private static final class01590 font = (class01590)OptionDescriptionWidget.minecraft.i_3;
    private Supplier<class03255> dimensions;
    private float targetScrollAmount;
    private float currentScrollAmount;
    private int maxScrollAmount;
    private int descriptionY;
    private int lastInteractionTime;
    private boolean scrollingBackward;

    public void tick() {
        if (this.description != null) {
            this.description.description().image().getNow(Optional.empty()).ifPresent(ImageRenderer::tick);
        }
        Objects.requireNonNull(font);
        float f = 0.05f * 9.0f;
        if (this.maxScrollAmount > 0) {
            if (this.currentTimeMS() - this.lastInteractionTime > 1500) {
                if (this.scrollingBackward) {
                    if (this.targetScrollAmount + (f *= -1.0f) < 0.0f) {
                        this.scrollingBackward = false;
                        this.lastInteractionTime = this.currentTimeMS();
                    }
                } else if (this.targetScrollAmount + f > (float)this.maxScrollAmount) {
                    this.scrollingBackward = true;
                    this.lastInteractionTime = this.currentTimeMS();
                }
                this.targetScrollAmount = class04995.N((float)(this.targetScrollAmount + f), (float)0.0f, (float)this.maxScrollAmount);
            }
        }
    }

    public OptionDescriptionWidget(Supplier<class03255> supplier, DescriptionWithName descriptionWithName) {
        super(0, 0, 0, 0, (class00392)(descriptionWithName == null ? class00392.i() : descriptionWithName.name()));
        this.dimensions = supplier;
        this.setOptionDescription(descriptionWithName);
    }

    public boolean method_25404(class06601 class066012) {
        return this.onKeyPressed(class066012.v());
    }

    public class02106 method_48205(class02089 class020892) {
        return null;
    }

    public boolean method_25401(double d, double d2, double d3, double d4) {
        if (this.method_25405(d, d2)) {
            this.targetScrollAmount = class04995.N((float)(this.targetScrollAmount - (float)((int)d4 * 10)), (float)0.0f, (float)this.maxScrollAmount);
            this.lastInteractionTime = this.currentTimeMS();
            return true;
        }
        return false;
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        return this.onMouseClicked(class066132.n(), class066132.t());
    }

    public void setOptionDescription(DescriptionWithName descriptionWithName) {
        this.description = descriptionWithName;
        this.wrappedText = null;
        this.targetScrollAmount = 0.0f;
        this.currentScrollAmount = 0.0f;
        this.lastInteractionTime = this.currentTimeMS();
    }

    private int currentTimeMS() {
        return (int)(class04674.y() * 1000.0);
    }

    private class00405 getDescStyle(int n, int n2) {
        boolean bl = this.method_25405(n, n2);
        if (!bl) {
            return null;
        }
        int n3 = n - this.method_46426();
        int n4 = n2 - this.descriptionY;
        if (n3 < 0 || n3 > this.method_46426() + this.method_25368()) {
            return null;
        }
        if (n4 < 0 || n4 > this.method_46427() + this.method_25364()) {
            return null;
        }
        Objects.requireNonNull(font);
        int n5 = n4 / 9;
        if (n5 >= this.wrappedText.size()) {
            return null;
        }
        return null;
    }

    protected boolean onMouseClicked(double d, double d2) {
        class00405 class004052 = this.getDescStyle((int)d, (int)d2);
        if (class004052 != null && class004052.Z() != null) {
            return false;
        }
        return false;
    }

    protected boolean onKeyPressed(int n) {
        if (this.method_25370()) {
            switch (n) {
                case 265: {
                    this.targetScrollAmount = class04995.N((float)(this.targetScrollAmount - 10.0f), (float)0.0f, (float)this.maxScrollAmount);
                    break;
                }
                case 264: {
                    this.targetScrollAmount = class04995.N((float)(this.targetScrollAmount + 10.0f), (float)0.0f, (float)this.maxScrollAmount);
                    break;
                }
                default: {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public void method_47399(class03428 class034282) {
        if (this.description != null) {
            class034282.N(class03457.field_33788, this.description.name());
            class034282.N(class03457.field_33790, this.description.description().text());
        }
    }

    public void method_48579(class01054 class010542, int n, int n2, float f) {
        Object object;
        if (this.description == null) {
            return;
        }
        this.currentScrollAmount = class04995.B((float)(f * 0.5f), (float)this.currentScrollAmount, (float)this.targetScrollAmount);
        class03255 class032552 = this.dimensions.get();
        this.method_46421(class032552.u());
        this.method_46419(class032552.y());
        this.field_22758 = class032552.M();
        this.field_22759 = class032552.B();
        int n3 = this.method_46427();
        int n4 = font.N((class05936)this.description.name());
        if (n4 > this.method_25368()) {
            class00580 class005802 = class010542.N((class06478)this, class01065.field_63851);
            class00392 class003922 = this.description.name();
            int n5 = this.method_46426();
            int n6 = this.method_46426() + this.method_25368();
            Objects.requireNonNull(font);
            class005802.N(class003922, n5, n6, n3, n3 + 9);
        } else {
            class010542.y(font, this.description.name(), this.method_46426(), n3, -1);
        }
        Objects.requireNonNull(font);
        class010542.L(this.method_46426(), n3 += 5 + 9, this.method_46426() + this.method_25368(), this.method_46427() + this.method_25364());
        n3 -= (int)this.currentScrollAmount;
        if (this.description.description().image().isDone() && ((Optional)(object = (Optional)this.description.description().image().join())).isPresent()) {
            n3 += ((ImageRenderer)((Optional)object).get()).render(class010542, this.method_46426(), n3, this.method_25368(), f) + 5;
        }
        if (this.wrappedText == null) {
            this.wrappedText = font.L((class05936)this.description.description().text(), this.method_25368());
        }
        this.descriptionY = n3;
        object = this.wrappedText.iterator();
        while (object.hasNext()) {
            class01028 class010282 = (class01028)object.next();
            class010542.N(class01065.field_63852).N(this.method_46426(), n3, class010282);
            Objects.requireNonNull(font);
            n3 += 9;
        }
        class010542.R();
        this.maxScrollAmount = Math.max(0, n3 + (int)this.currentScrollAmount - this.method_46427() - this.method_25364());
        if (this.method_25367()) {
            this.lastInteractionTime = this.currentTimeMS();
        }
        if ((object = this.getDescStyle(n, n2)) != null && object.z() != null) {
            class010542.N(font, (class00405)object, n, n2);
        }
        if (this.method_25370()) {
            class010542.y(this.method_46426(), this.method_46427(), this.method_25368(), this.method_25364(), -1);
        }
    }
}

