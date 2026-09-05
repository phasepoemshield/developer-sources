/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09461
 *  com.viaversion.viafabricplus.features.limitation.max_chat_length.MaxChatLength
 *  com.viaversion.viafabricplus.settings.impl.DebugSettings
 *  minecraft.class00392
 *  minecraft.class00405
 *  minecraft.class00580
 *  minecraft.class00604
 *  minecraft.class00647
 *  minecraft.class00669
 *  minecraft.class01028
 *  minecraft.class01054
 *  minecraft.class01056
 *  minecraft.class01590
 *  minecraft.class01683
 *  minecraft.class03040
 *  minecraft.class03428
 *  minecraft.class03457
 *  minecraft.class04453
 *  minecraft.class04654
 *  minecraft.class04927
 *  minecraft.class04995
 *  minecraft.class05018
 *  minecraft.class05096
 *  minecraft.class05630
 *  minecraft.class05910
 *  minecraft.class06202
 *  minecraft.class06451
 *  minecraft.class06541
 *  minecraft.class06601
 *  minecraft.class06613
 *  org.apache.commons.lang3.StringUtils
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import Nursultan.class09461;
import com.viaversion.viafabricplus.features.limitation.max_chat_length.MaxChatLength;
import com.viaversion.viafabricplus.settings.impl.DebugSettings;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class00580;
import minecraft.class00604;
import minecraft.class00647;
import minecraft.class00669;
import minecraft.class01028;
import minecraft.class01054;
import minecraft.class01056;
import minecraft.class01322;
import minecraft.class01590;
import minecraft.class01683;
import minecraft.class03040;
import minecraft.class03428;
import minecraft.class03457;
import minecraft.class04453;
import minecraft.class04654;
import minecraft.class04927;
import minecraft.class04995;
import minecraft.class05018;
import minecraft.class05096;
import minecraft.class05630;
import minecraft.class05910;
import minecraft.class06202;
import minecraft.class06451;
import minecraft.class06541;
import minecraft.class06601;
import minecraft.class06613;
import org.apache.commons.lang3.StringUtils;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class01311
extends class05096 {
    public static final double N = 7.0;
    private static final class00392 M = class00392.L((String)"chat_screen.usage");
    private String B = "";
    private int Z = -1;
    protected class04927 y;
    protected String L;
    protected boolean u;
    protected class01322 i = class01322.field_62016;
    public class05910 R;

    private boolean L() {
        return !DebugSettings.INSTANCE.legacyTabCompletions.isEnabled() || !this.y.method_1882().startsWith("/");
    }

    public class01311(String string, boolean bl) {
        super((class00392)class00392.L((String)"chat_screen.title"));
        this.L = string;
        this.u = bl;
    }

    private void y(String string) {
        boolean bl = true;
        this.R.N(this.N(bl));
        class05910 class059102 = this.R;
        if (this.N(class059102)) {
            class059102.u();
        }
        this.u = false;
    }

    private void y(CallbackInfo callbackInfo) {
        if (DebugSettings.INSTANCE.legacyTabCompletions.isEnabled()) {
            this.y.method_1852(this.L);
            this.R.u();
        }
    }

    private boolean y() {
        return this.field_22787.L();
    }

    public void N(String string, boolean bl) {
        if ((string = this.N(string)).isEmpty()) {
            return;
        }
        if (bl) {
            ((class01056)this.field_22787.i_6).i().N(string);
        }
        if (string.startsWith("/")) {
            ((class01683)((class04453)this.field_22787.T_4).y_0).u(string.substring(1));
        } else {
            ((class01683)((class04453)this.field_22787.T_4).y_0).L(string);
        }
    }

    private boolean N(class00405 class004052, boolean bl) {
        class00647 class006472 = class004052.Z();
        if (bl) {
            if (class004052.U() != null) {
                this.method_25415(class004052.U(), false);
            }
        } else if (class006472 != null) {
            if (class006472 instanceof class00669 && ((class00669)class006472).y().equals((Object)class06451.y)) {
                class03040 class030402 = this.field_22787.N();
                if (class030402.L() != 0L) {
                    class030402.y();
                }
            } else {
                class01311.method_71999((class00647)class006472, (class06202)this.field_22787, (class05096)this);
            }
            return true;
        }
        return false;
    }

    public String N(String string) {
        return class05018.i((String)StringUtils.normalizeSpace((String)string.trim()));
    }

    public void N(int n) {
        int n2 = this.Z + n;
        int n3 = ((class01056)this.field_22787.i_6).i().L().size();
        if ((n2 = class04995.N((int)n2, (int)0, (int)n3)) == this.Z) {
            return;
        }
        if (n2 == n3) {
            this.Z = n3;
            this.y.method_1852(this.B);
            return;
        }
        if (this.Z == n3) {
            this.B = this.y.method_1882();
        }
        this.y.method_1852((String)((class01056)this.field_22787.i_6).i().L().get(n2));
        this.R.N(false);
        this.Z = n2;
    }

    private @Nullable class01028 N(String string, int n) {
        if (this.u) {
            return class01028.a_((String)string, (class00405)class00405.N.N(class06541.field_1080).y(Boolean.valueOf(true)));
        }
        return null;
    }

    private boolean N(class05910 class059102) {
        return this.L();
    }

    private boolean N(boolean bl) {
        String string = this.y.method_1882();
        if (this.L()) {
            return true;
        }
        return !string.isEmpty();
    }

    private void N(CallbackInfo callbackInfo) {
        if (this.y.method_1861() == 256) {
            this.y.method_1880(MaxChatLength.getChatLength());
        }
    }

    public boolean N(class04927 class049272, String string) {
        return !DebugSettings.INSTANCE.legacyTabCompletions.isEnabled();
    }

    protected boolean N() {
        return this.i != class01322.field_62016 && (this.i != class01322.field_62015 || (Boolean)((class05630)this.field_22787.i_7).Nd().method_41753() == false);
    }

    public void method_25426() {
        this.Z = ((class01056)this.field_22787.i_6).i().L().size();
        this.y = new class09461(this, (class01590)this.field_22787.i_4, 4, this.field_22790 - 12, this.field_22789 - 4, 12, (class00392)class00392.L((String)"chat.editBox"));
        this.y.method_1880(256);
        this.y.method_1858(false);
        String string = this.L;
        class04927 class049272 = this.y;
        if (this.N(class049272, string)) {
            class049272.method_1852(string);
        }
        this.y.method_1863(this::y);
        this.y.method_73210(this::N);
        this.y.method_1856(false);
        this.method_37063((class04654)this.y);
        this.R = new class05910(this.field_22787, (class05096)this, this.y, this.field_22793, false, false, 1, 10, true, -805306368);
        this.R.y(false);
        this.R.N(false);
        this.R.u();
        this.N((CallbackInfo)null);
        this.y((CallbackInfo)null);
    }

    protected void method_56131() {
        this.method_48265((class04654)this.y);
    }

    public boolean method_25404(class06601 class066012) {
        if (this.R.N(class066012)) {
            return true;
        }
        if (this.u && class066012.v() == 259) {
            this.y.method_1852("");
            this.u = false;
            return true;
        }
        if (super.method_25404(class066012)) {
            return true;
        }
        if (class066012.u()) {
            this.N(this.y.method_1882(), true);
            this.i = class01322.field_62017;
            this.field_22787.N(null);
            return true;
        }
        switch (class066012.v()) {
            case 265: {
                this.N(-1);
                break;
            }
            case 264: {
                this.N(1);
                break;
            }
            case 266: {
                ((class01056)this.field_22787.i_6).i().N(((class01056)this.field_22787.i_6).i().M() - 1);
                break;
            }
            case 267: {
                ((class01056)this.field_22787.i_6).i().N(-((class01056)this.field_22787.i_6).i().M() + 1);
                break;
            }
            default: {
                return false;
            }
        }
        return true;
    }

    public void method_25415(String string, boolean bl) {
        if (bl) {
            this.y.method_1852(string);
        } else {
            this.y.method_1867(string);
        }
    }

    public void method_25432() {
        ((class01056)this.field_22787.i_6).i().u();
        this.L = this.y.method_1882();
        if (this.N() || StringUtils.isBlank((CharSequence)this.L)) {
            ((class01056)this.field_22787.i_6).i().B();
        } else if (!this.u) {
            ((class01056)this.field_22787.i_6).i().y(this.L);
        }
    }

    public void method_25420(class01054 class010542, int n, int n2, float f) {
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        class010542.N(2, this.field_22790 - 14, this.field_22789 - 2, this.field_22790 - 2, ((class05630)this.field_22787.i_7).N(Integer.MIN_VALUE));
        ((class01056)this.field_22787.i_6).i().N(class010542, this.field_22793, ((class01056)this.field_22787.i_6).R(), n, n2, true, this.y());
        super.method_25394(class010542, n, n2, f);
        this.R.N(class010542, n, n2);
    }

    public void method_25419() {
        this.i = class01322.field_62015;
        super.method_25419();
    }

    public boolean method_25421() {
        return false;
    }

    protected void method_37062(class03428 class034282) {
        class034282.N(class03457.field_33788, this.method_25440());
        class034282.N(class03457.field_33791, M);
        String string = this.y.method_1882();
        if (!string.isEmpty()) {
            class034282.N().N(class03457.field_33788, (class00392)class00392.N((String)"chat_screen.message", (Object[])new Object[]{string}));
        }
    }

    public void method_25410(int n, int n2) {
        this.L = this.y.method_1882();
        this.method_25423(n, n2);
    }

    public boolean method_73217() {
        return true;
    }

    public boolean method_25401(double d, double d2, double d3, double d4) {
        if (this.R.N(d4 = class04995.N((double)d4, (double)-1.0, (double)1.0))) {
            return true;
        }
        if (!this.field_22787.L()) {
            d4 *= 7.0;
        }
        ((class01056)this.field_22787.i_6).i().N((int)d4);
        return true;
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        if (this.R.N(class066132)) {
            return true;
        }
        if (class066132.v() == 0) {
            int n = this.field_22787.Nt().s();
            class00604 class006042 = new class00604(this.method_64506(), (int)class066132.n(), (int)class066132.t()).N(this.y());
            ((class01056)this.field_22787.i_6).i().N((class00580)class006042, n, ((class01056)this.field_22787.i_6).R(), true);
            class00405 class004052 = class006042.y();
            if (class004052 != null && this.N(class004052, this.y())) {
                this.L = this.y.method_1882();
                return true;
            }
        }
        return super.method_25402(class066132, bl);
    }
}

