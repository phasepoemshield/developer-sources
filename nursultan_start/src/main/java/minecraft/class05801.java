/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01065
 *  minecraft.class01894
 *  minecraft.class02111
 *  minecraft.class02566
 *  minecraft.class03428
 *  minecraft.class03457
 *  minecraft.class04995
 *  minecraft.class05216
 *  minecraft.class06202
 *  minecraft.class06466
 *  minecraft.class06478
 *  minecraft.class06601
 *  minecraft.class06608
 *  minecraft.class06613
 *  minecraft.class08394
 *  minecraft.class09033
 */
package minecraft;

import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01065;
import minecraft.class01894;
import minecraft.class02111;
import minecraft.class02566;
import minecraft.class03428;
import minecraft.class03457;
import minecraft.class04995;
import minecraft.class05216;
import minecraft.class06202;
import minecraft.class06466;
import minecraft.class06478;
import minecraft.class06601;
import minecraft.class06608;
import minecraft.class06613;
import minecraft.class08394;
import minecraft.class09033;

public abstract class class05801
extends class06466 {
    private static final class01894 field_45340 = class01894.y((String)"widget/slider");
    private static final class01894 field_45341 = class01894.y((String)"widget/slider_highlighted");
    private static final class01894 field_45342 = class01894.y((String)"widget/slider_handle");
    private static final class01894 field_45343 = class01894.y((String)"widget/slider_handle_highlighted");
    protected static final int field_43054 = 2;
    public static final int field_60708 = 20;
    protected static final int field_41790 = 8;
    private static final int field_41789 = 4;
    protected double field_22753;
    protected boolean field_41796;
    private boolean field_62464;

    public class05801(int n, int n2, int n3, int n4, class00392 class003922, double d) {
        super(n, n2, n3, n4, class003922);
        this.field_22753 = d;
    }

    public boolean method_25404(class06601 class066012) {
        if (class066012.L()) {
            this.field_41796 = !this.field_41796;
            return true;
        }
        if (this.field_41796) {
            boolean bl = class066012.R();
            boolean bl2 = class066012.M();
            if (bl || bl2) {
                float f = bl ? -1.0f : 1.0f;
                this.method_25347(this.field_22753 + (double)(f / (float)(this.field_22758 - 8)));
                return true;
            }
        }
        return false;
    }

    public void method_25365(boolean bl) {
        super.method_25365(bl);
        if (!bl) {
            this.field_41796 = false;
            return;
        }
        class02111 class021112 = class06202.Nq().Nc();
        if (class021112 == class02111.field_41778 || class021112 == class02111.field_41780) {
            this.field_41796 = true;
        }
    }

    protected abstract void method_25344();

    protected abstract void method_25346();

    public void method_25348(class06613 class066132, boolean bl) {
        this.field_62464 = this.field_22763;
        this.method_25345(class066132);
    }

    public void method_25347(double d) {
        double d2 = this.field_22753;
        this.field_22753 = class04995.N((double)d, (double)0.0, (double)1.0);
        if (d2 != this.field_22753) {
            this.method_25344();
        }
        this.method_25346();
    }

    private class01894 method_52716() {
        if (this.method_37303() && this.method_25370() && !this.field_41796) {
            return field_45341;
        }
        return field_45340;
    }

    private void method_25345(class06613 class066132) {
        this.method_25347((class066132.n() - (double)(this.method_46426() + 4)) / (double)(this.field_22758 - 8));
    }

    public void method_25357(class06613 class066132) {
        this.field_62464 = false;
        super.method_25354(class06202.Nq().Nr());
    }

    public void method_47399(class03428 class034282) {
        class034282.N(class03457.field_33788, (class00392)this.method_25360());
        if (this.field_22763) {
            if (this.method_25370()) {
                if (this.field_41796) {
                    class034282.N(class03457.field_33791, (class00392)class00392.L((String)"narration.slider.usage.focused"));
                } else {
                    class034282.N(class03457.field_33791, (class00392)class00392.L((String)"narration.slider.usage.focused.keyboard_cannot_change_value"));
                }
            } else {
                class034282.N(class03457.field_33791, (class00392)class00392.L((String)"narration.slider.usage.hovered"));
            }
        }
    }

    private class01894 method_52717() {
        if (this.method_37303() && (this.field_22762 || this.field_41796)) {
            return field_45343;
        }
        return field_45342;
    }

    public void method_25349(class06613 class066132, double d, double d2) {
        this.method_25345(class066132);
        super.method_25349(class066132, d, d2);
    }

    protected class05216 method_25360() {
        return class00392.N((String)"gui.narrate.slider", (Object[])new Object[]{this.method_25369()});
    }

    public void method_25354(class09033 class090332) {
    }

    public void method_48579(class01054 class010542, int n, int n2, float f) {
        class010542.N(class08394.Na, this.method_52716(), this.method_46426(), this.method_46427(), this.method_25368(), this.method_25364(), class02566.y((float)this.field_22765));
        class010542.N(class08394.Na, this.method_52717(), this.method_46426() + (int)(this.field_22753 * (double)(this.field_22758 - 8)), this.method_46427(), 8, this.method_25364(), class02566.y((float)this.field_22765));
        this.method_75799(class010542.N((class06478)this, class01065.field_63850), this.method_25369(), 2);
        if (this.method_49606()) {
            class010542.N(this.field_62464 ? class06608.R : class06608.u);
        }
    }
}

