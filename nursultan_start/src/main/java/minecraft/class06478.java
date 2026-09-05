/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.terraformersmc.modmenu.mixin.AccessorClickableWidget
 *  minecraft.class00040
 *  minecraft.class00044
 *  minecraft.class00392
 *  minecraft.class00580
 *  minecraft.class01054
 *  minecraft.class01294
 *  minecraft.class02089
 *  minecraft.class02102
 *  minecraft.class02106
 *  minecraft.class03255
 *  minecraft.class03428
 *  minecraft.class03432
 *  minecraft.class03434
 *  minecraft.class03457
 *  minecraft.class03556
 *  minecraft.class04141
 *  minecraft.class04282
 *  minecraft.class04654
 *  minecraft.class04909
 *  minecraft.class05216
 *  minecraft.class06202
 *  minecraft.class06595
 *  minecraft.class06608
 *  minecraft.class06613
 *  minecraft.class09033
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.terraformersmc.modmenu.mixin.AccessorClickableWidget;
import java.time.Duration;
import java.util.function.Consumer;
import minecraft.class00040;
import minecraft.class00044;
import minecraft.class00392;
import minecraft.class00580;
import minecraft.class01054;
import minecraft.class01294;
import minecraft.class02089;
import minecraft.class02102;
import minecraft.class02106;
import minecraft.class03255;
import minecraft.class03428;
import minecraft.class03432;
import minecraft.class03434;
import minecraft.class03457;
import minecraft.class03556;
import minecraft.class04141;
import minecraft.class04282;
import minecraft.class04654;
import minecraft.class04909;
import minecraft.class05216;
import minecraft.class06202;
import minecraft.class06595;
import minecraft.class06608;
import minecraft.class06613;
import minecraft.class09033;
import org.jspecify.annotations.Nullable;

public abstract class class06478
implements class01294,
class02102,
class03434,
class04654,
AccessorClickableWidget {
    protected int field_22758;
    protected int field_22759;
    private int field_22760;
    private int field_22761;
    protected class00392 field_22754;
    protected boolean field_22762;
    public boolean field_22763 = true;
    public boolean field_22764 = true;
    protected float field_22765 = 1.0f;
    private int field_42116;
    private boolean field_22756;
    private final class04282 field_41095 = new class04282();

    public class06478(int n, int n2, int n3, int n4, class00392 class003922) {
        this.field_22760 = n;
        this.field_22761 = n2;
        this.field_22758 = n3;
        this.field_22759 = n4;
        this.field_22754 = class003922;
    }

    public float method_75798() {
        return this.field_22765;
    }

    public void method_25350(float f) {
        this.field_22765 = f;
    }

    public @Nullable class02106 method_48205(class02089 class020892) {
        if (!this.method_37303()) {
            return null;
        }
        if (!this.method_25370()) {
            return class02106.N((class04654)this);
        }
        return null;
    }

    public final void method_25394(class01054 class010542, int n, int n2, float f) {
        if (!this.field_22764) {
            return;
        }
        this.field_22762 = class010542.N(n, n2) && this.method_72102(n, n2);
        this.method_48579(class010542, n, n2, f);
        this.field_41095.N(class010542, n, n2, this.method_49606(), this.method_25370(), this.method_48202());
    }

    public final void method_37020(class03428 class034282) {
        this.method_47399(class034282);
        this.field_41095.N(class034282);
    }

    public class03255 method_48202() {
        return super.method_48202();
    }

    public class03432 method_37018() {
        if (this.method_25370()) {
            return class03432.field_33786;
        }
        if (this.field_22762) {
            return class03432.field_33785;
        }
        return class03432.field_33784;
    }

    public boolean method_25405(double d, double d2) {
        return this.method_37303() && this.method_72102(d, d2);
    }

    public boolean method_37303() {
        return this.field_22764 && this.field_22763;
    }

    public int method_48590() {
        return this.field_42116;
    }

    public boolean method_25403(class06613 class066132, double d, double d2) {
        if (this.method_25351(class066132.G())) {
            this.method_25349(class066132, d, d2);
            return true;
        }
        return false;
    }

    public void method_25365(boolean bl) {
        this.field_22756 = bl;
    }

    public void method_48591(int n) {
        this.field_42116 = n;
    }

    public boolean method_25370() {
        return this.field_22756;
    }

    public boolean method_25406(class06613 class066132) {
        if (this.method_25351(class066132.G())) {
            this.method_25357(class066132);
            return true;
        }
        return false;
    }

    public void method_48206(Consumer<class06478> consumer) {
        consumer.accept(this);
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        if (!this.method_37303()) {
            return false;
        }
        if (this.method_25351(class066132.G()) && this.method_25405(class066132.n(), class066132.t())) {
            this.method_25354(class06202.Nq().Nr());
            this.method_25348(class066132, bl);
            return true;
        }
        return false;
    }

    public int method_46427() {
        return this.field_22761;
    }

    public void method_46419(int n) {
        this.field_22761 = n;
    }

    public int method_46426() {
        return this.field_22760;
    }

    public void method_47400(@Nullable class04141 class041412) {
        this.field_41095.N(class041412);
    }

    public void method_46421(int n) {
        this.field_22760 = n;
    }

    public /* synthetic */ class04282 getTooltip() {
        return this.field_41095;
    }

    public void method_25358(int n) {
        this.field_22758 = n;
    }

    public class00392 method_25369() {
        return this.field_22754;
    }

    public int method_25364() {
        return this.field_22759;
    }

    public int method_25368() {
        return this.field_22758;
    }

    public void method_25355(class00392 class003922) {
        this.field_22754 = class003922;
    }

    public void method_47402(Duration duration) {
        this.field_41095.N(duration);
    }

    public void method_25348(class06613 class066132, boolean bl) {
    }

    public void method_55445(int n, int n2) {
        this.field_22758 = n;
        this.field_22759 = n2;
    }

    protected void method_76256(class01054 class010542) {
        if (this.method_49606()) {
            class010542.N(this.method_37303() ? class06608.u : class06608.B);
        }
    }

    public int method_55442() {
        return this.method_46426() + this.method_25368();
    }

    protected void method_75799(class00580 class005802, class00392 class003922, int n) {
        int n2 = this.method_46426() + n;
        int n3 = this.method_46426() + this.method_25368() - n;
        int n4 = this.method_46427();
        int n5 = this.method_46427() + this.method_25364();
        class005802.N(class003922, n2, n3, n4, n5);
    }

    public boolean method_25351(class06595 class065952) {
        return class065952.v() == 0;
    }

    public boolean method_25367() {
        return this.method_49606() || this.method_25370();
    }

    protected void method_37021(class03428 class034282) {
        class034282.N(class03457.field_33788, (class00392)this.method_25360());
        if (this.field_22763) {
            if (this.method_25370()) {
                class034282.N(class03457.field_33791, (class00392)class00392.L((String)"narration.button.usage.focused"));
            } else {
                class034282.N(class03457.field_33791, (class00392)class00392.L((String)"narration.button.usage.hovered"));
            }
        }
    }

    public void method_55444(int n, int n2, int n3, int n4) {
        this.method_55445(n, n2);
        this.y(n3, n4);
    }

    public void method_25357(class06613 class066132) {
    }

    public static void method_62888(class09033 class090332) {
        class090332.N((class00044)class00040.N((class03556)class04909.OK, (float)1.0f));
    }

    protected abstract void method_47399(class03428 var1);

    public boolean method_49606() {
        return this.field_22762;
    }

    protected void method_25349(class06613 class066132, double d, double d2) {
    }

    protected class05216 method_25360() {
        return class06478.method_32602(this.method_25369());
    }

    public void method_25354(class09033 class090332) {
        class06478.method_62888(class090332);
    }

    public int method_55443() {
        return this.method_46427() + this.method_25364();
    }

    protected abstract void method_48579(class01054 var1, int var2, int var3, float var4);

    private boolean method_72102(double d, double d2) {
        return d >= (double)this.method_46426() && d2 >= (double)this.method_46427() && d < (double)this.method_55442() && d2 < (double)this.method_55443();
    }

    public static class05216 method_32602(class00392 class003922) {
        return class00392.N((String)"gui.narrate.button", (Object[])new Object[]{class003922});
    }

    public void method_53533(int n) {
        this.field_22759 = n;
    }
}

