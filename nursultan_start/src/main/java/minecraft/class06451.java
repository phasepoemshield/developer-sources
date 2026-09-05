/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10578
 *  Nursultan.class10579
 *  com.google.common.collect.Lists
 *  com.viaversion.viafabricplus.visuals.settings.VisualSettings
 *  dev.caoimhe.compactchat.ext.IChatHudExt
 *  dev.caoimhe.compactchat.message.MessageManager
 *  minecraft.class00392
 *  minecraft.class00395
 *  minecraft.class00401
 *  minecraft.class00405
 *  minecraft.class00580
 *  minecraft.class00647
 *  minecraft.class00669
 *  minecraft.class01028
 *  minecraft.class01054
 *  minecraft.class01056
 *  minecraft.class01309
 *  minecraft.class01311
 *  minecraft.class01590
 *  minecraft.class01894
 *  minecraft.class01962
 *  minecraft.class02566
 *  minecraft.class03054
 *  minecraft.class04189
 *  minecraft.class04469
 *  minecraft.class04643
 *  minecraft.class04995
 *  minecraft.class05096
 *  minecraft.class05216
 *  minecraft.class05630
 *  minecraft.class06202
 *  minecraft.class06541
 *  minecraft.class08027
 *  minecraft.class08700
 *  org.joml.Matrix3x2f
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import Nursultan.class10578;
import Nursultan.class10579;
import com.google.common.collect.Lists;
import com.viaversion.viafabricplus.visuals.settings.VisualSettings;
import dev.caoimhe.compactchat.ext.IChatHudExt;
import dev.caoimhe.compactchat.message.MessageManager;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Optional;
import minecraft.class00392;
import minecraft.class00395;
import minecraft.class00401;
import minecraft.class00405;
import minecraft.class00580;
import minecraft.class00647;
import minecraft.class00669;
import minecraft.class01028;
import minecraft.class01054;
import minecraft.class01056;
import minecraft.class01309;
import minecraft.class01311;
import minecraft.class01590;
import minecraft.class01894;
import minecraft.class01962;
import minecraft.class02566;
import minecraft.class03054;
import minecraft.class04189;
import minecraft.class04469;
import minecraft.class04643;
import minecraft.class04995;
import minecraft.class05096;
import minecraft.class05216;
import minecraft.class05630;
import minecraft.class06202;
import minecraft.class06390;
import minecraft.class06419;
import minecraft.class06437;
import minecraft.class06450;
import minecraft.class06457;
import minecraft.class06465;
import minecraft.class06467;
import minecraft.class06468;
import minecraft.class06469;
import minecraft.class06475;
import minecraft.class06477;
import minecraft.class06541;
import minecraft.class08027;
import minecraft.class08700;
import org.joml.Matrix3x2f;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class06451
implements IChatHudExt {
    private static Logger R = LoggerFactory.getLogger((String)"minecraft.class06451");
    private static final int M = 100;
    private static final int B = 4;
    private static final int Z = 40;
    private static final int z = 210;
    private static final int U = 60;
    private static final class00392 E = class00392.L((String)"chat.deleted_marker").N(new class06541[]{class06541.field_1080, class06541.field_1056});
    public static final int N = 8;
    public static final class01894 y = class01894.y((String)"internal/expand_chat_queue");
    private static final class00405 W = class00405.N.N((class00647)new class00669(y, Optional.empty())).N((class00395)new class00401((class00392)class00392.L((String)"chat.queue.tooltip")));
    public final class06202 L;
    public final class04189<String> u;
    public final List<class06390> i;
    private final List<class06419> m;
    private int P;
    private boolean s;
    private @Nullable class06450 T;
    private @Nullable class01311 b;
    private final List<class06437> j;
    private final MessageManager v = new MessageManager((IChatHudExt)this);

    public class04189<String> L() {
        return this.u;
    }

    private void L(class06390 class063902) {
        String string = class063902.y().getString().replaceAll("\r", "\\\\r").replaceAll("\n", "\\\\n");
        String string2 = (String)class01962.N((Object)class063902.u(), class03054::B);
        if (string2 != null) {
            R.info("[{}] [CHAT] {}", (Object)string2, (Object)string);
        } else {
            R.info("[CHAT] {}", (Object)string);
        }
    }

    public int M() {
        return this.s() / this.b();
    }

    private int P() {
        return class06451.N((Double)((class05630)this.L.i_7).I().method_41753());
    }

    private double T() {
        return (Double)((class05630)this.L.i_7).g().method_41753();
    }

    public class06451(class06202 class062022) {
        this.u = new class04189(100);
        this.i = Lists.newArrayList();
        this.m = Lists.newArrayList();
        this.j = new ArrayList<class06437>();
        this.L = class062022;
        this.u.addAll(class062022.NA().N());
    }

    public void B() {
        this.T = null;
    }

    public void Z() {
        class05096 class050962 = (class05096)this.L.v_3;
        if (class050962 instanceof class01311) {
            class01311 class013112;
            this.b = class013112 = (class01311)class050962;
        }
    }

    public boolean i() {
        return (class05096)this.L.v_3 instanceof class01311;
    }

    private int b() {
        Objects.requireNonNull((class01590)this.L.i_3);
        return (int)(9.0 * ((Double)((class05630)this.L.i_7).t().method_41753() + 1.0));
    }

    private int s() {
        return class06451.y(this.i() ? (Double)((class05630)this.L.i_7).o().method_41753() : (Double)((class05630)this.L.i_7).J().method_41753());
    }

    private void m() {
        this.m.clear();
        for (class06390 class063902 : Lists.reverse(this.i)) {
            this.N(class063902);
        }
    }

    public class06467 U() {
        return new class06467(List.copyOf(this.i), List.copyOf(this.u), List.copyOf(this.j));
    }

    public @Nullable class01311 z() {
        class01311 class013112 = this.b;
        this.b = null;
        return class013112;
    }

    private class06390 u(class06390 class063902) {
        return new class06390(class063902.N(), E, null, class03054.N());
    }

    public void u() {
        this.P = 0;
        this.s = false;
    }

    public void y(String string) {
        boolean bl = string.startsWith("/");
        this.T = new class06450(string, bl ? class06468.field_62005 : class06468.field_62004);
    }

    private @Nullable class06437 y(class04469 class044692) {
        int n = ((class01056)this.L.i_6).R();
        ListIterator<class06390> listIterator = this.i.listIterator();
        while (listIterator.hasNext()) {
            class06390 class063902 = listIterator.next();
            if (!class044692.equals((Object)class063902.L())) continue;
            int n2 = class063902.N() + 60;
            if (n >= n2) {
                listIterator.set(this.u(class063902));
                this.m();
                return null;
            }
            return new class06437(class044692, n2);
        }
        return null;
    }

    public static int y(double d) {
        int n = 180;
        int n2 = 20;
        return class04995.N((double)(d * 160.0 + 20.0));
    }

    public final void y(class06390 class063902) {
        this.i.addFirst((Object)class063902);
        while (this.i.size() > 100) {
            this.i.removeLast();
        }
    }

    public void y(class06468 class064682, class01309<?> class013092) {
        this.L.N(this.N(class064682, class013092));
    }

    public class00392 y(class00392 class003922) {
        return this.v.compactMessage(class003922);
    }

    public void y() {
        this.u();
        this.m();
    }

    private boolean E() {
        return ((class05630)this.L.i_7).v().method_41753() == class08027.field_7536;
    }

    private class03054 N(class03054 class030542) {
        return VisualSettings.INSTANCE.hideSignatureIndicator.isEnabled() ? null : class030542;
    }

    public void N(boolean bl, CallbackInfo callbackInfo) {
        this.v.clear();
    }

    public void N(class06467 class064672) {
        this.u.clear();
        this.u.addAll(class064672.y);
        this.j.clear();
        this.j.addAll(class064672.L);
        this.i.clear();
        this.i.addAll(class064672.N);
        this.m();
    }

    public <T extends class01311> T N(class06468 class064682, class01309<T> class013092) {
        if (this.T != null && class064682.N(this.T)) {
            return (T)class013092.create(this.T.N(), true);
        }
        return (T)class013092.create(class064682.N(), false);
    }

    private void N(class06465 class064652, int n, int n2, boolean bl) {
        int n3;
        if (this.E()) {
            return;
        }
        int n5 = this.m.size();
        if (n5 <= 0) {
            return;
        }
        class04643 class046432 = class08700.N();
        class046432.N("chat");
        float f = (float)this.T();
        int n6 = class04995.u((float)((float)this.P() / f));
        int n7 = class04995.y((float)((float)(n - 40) / f));
        float f3 = ((Double)((class05630)this.L.i_7).n().method_41753()).floatValue() * 0.9f + 0.1f;
        float f4 = ((Double)((class05630)this.L.i_7).d().method_41753()).floatValue();
        Objects.requireNonNull((class01590)this.L.i_3);
        int n8 = 9;
        int n9 = 8;
        double d = (Double)((class05630)this.L.i_7).t().method_41753();
        int n10 = (int)((double)n8 * (d + 1.0));
        int n11 = (int)Math.round(8.0 * (d + 1.0) - 4.0 * d);
        long l = this.L.N().L();
        class06457 class064572 = bl ? class06457.N : class06457.N(n2);
        class064652.N((Matrix3x2f matrix3x2f) -> {
            matrix3x2f.scale(f, f);
            matrix3x2f.translate(4.0f, 0.0f);
        });
        this.N(class064572, (class064192, n4, f2) -> {
            int n5 = n7 - n4 * n10;
            int n6 = n5 - n10;
            class064652.N(-4, n6, n6 + 4 + 4, n5, class02566.L((float)(f2 * f4)));
        });
        if (l > 0L) {
            class064652.N(-2, n7, n6 + 4, n7 + n8, class02566.L((float)f4));
        }
        int n12 = this.N(class064572, (class10579)new class10578(this, n7, n10, n11, class064652, f3, n8));
        if (l > 0L) {
            n3 = n7 + n8;
            class05216 class052162 = class00392.N((String)"chat.queue", (Object[])new Object[]{l}).y(W);
            class064652.N(n3 - 8, 0.5f * f3, class052162.method_30937());
        }
        if (bl) {
            n3 = n5 * n10;
            int n13 = n12 * n10;
            int n14 = this.P * n13 / n5 - n7;
            int n15 = n13 * n13 / n3;
            if (n3 != n13) {
                int n16 = n14 > 0 ? 170 : 96;
                int n17 = this.s ? 0xCC3333 : 0x3333AA;
                int n18 = n6 + 4;
                class064652.N(n18, -n14, n18 + 2, -n14 - n15, class02566.R((int)n16, (int)n17));
                class064652.N(n18 + 2, -n14, n18 + 1, -n14 - n15, class02566.R((int)n16, (int)0xCCCCCC));
            }
        }
        class046432.L();
    }

    public final void N(class06390 class063902) {
        int n = class04995.N((double)((double)this.P() / this.T()));
        List<class01028> list = class063902.N((class01590)this.L.i_3, n);
        boolean bl = this.i();
        for (int i = 0; i < list.size(); ++i) {
            class01028 class010282 = list.get(i);
            if (bl && this.P > 0) {
                this.s = true;
                this.N(1);
            }
            boolean bl2 = i == list.size() - 1;
            this.m.addFirst((Object)new class06419(class063902.N(), class010282, class063902.u(), bl2));
        }
        while (this.m.size() > 100) {
            this.m.removeLast();
        }
    }

    public void N(class04469 class044692) {
        class06437 class064372 = this.y(class044692);
        if (class064372 != null) {
            this.j.add(class064372);
        }
    }

    public void N(class00580 class005802, int n, int n2, boolean bl) {
        this.N(new class06477(class005802), n, n2, bl);
    }

    public void N(class00392 class003922, @Nullable class04469 class044692, @Nullable class03054 class030542) {
        class030542 = this.N(class030542);
        class003922 = this.y(class003922);
        class06390 class063902 = new class06390(((class01056)this.L.i_6).R(), class003922, class044692, class030542);
        this.L(class063902);
        this.N(class063902);
        this.y(class063902);
    }

    public void N(class00392 class003922) {
        this.N(class003922, null, this.L.NW() ? class03054.y() : class03054.N());
    }

    public void N(boolean bl) {
        this.N(bl, null);
        this.L.N().u();
        this.j.clear();
        this.m.clear();
        this.i.clear();
        if (bl) {
            this.u.clear();
            this.u.addAll(this.L.NA().N());
        }
    }

    public void N(class01054 class010542, class01590 class015902, int n, int n2, int n3, boolean bl, boolean bl2) {
        class010542.i().pushMatrix();
        this.N(bl ? new class06469(class010542, class015902, n2, n3, bl2) : new class06475(class010542), class010542.y(), n, bl);
        class010542.i().popMatrix();
    }

    private int N(class06457 class064572, class10579 class105792) {
        int n = this.M();
        int n2 = 0;
        for (int i = Math.min(this.m.size() - this.P, n) - 1; i >= 0; --i) {
            int n3 = i + this.P;
            class06419 class064192 = this.m.get(n3);
            float f = class064572.calculate(class064192);
            if (!(f > 1.0E-5f)) continue;
            ++n2;
            class105792.accept(class064192, i, f);
        }
        return n2;
    }

    public static int N(double d) {
        int n = 320;
        int n2 = 40;
        return class04995.N((double)(d * 280.0 + 40.0));
    }

    public void N() {
        if (!this.j.isEmpty()) {
            this.W();
        }
    }

    public void N(String string) {
        if (!string.equals(this.u.peekLast())) {
            if (this.u.size() >= 100) {
                this.u.removeFirst();
            }
            this.u.addLast((Object)string);
        }
        if (string.startsWith("/")) {
            this.L.NA().N(string);
        }
    }

    public void N(int n) {
        this.P += n;
        int n2 = this.m.size();
        if (this.P > n2 - this.M()) {
            this.P = n2 - this.M();
        }
        if (this.P <= 0) {
            this.P = 0;
            this.s = false;
        }
    }

    public void compactChat$refreshMessages() {
        this.m();
    }

    private void W() {
        int n = ((class01056)this.L.i_6).R();
        this.j.removeIf(class064372 -> {
            if (n >= class064372.y()) {
                return this.y(class064372.N()) == null;
            }
            return false;
        });
    }

    public static double R() {
        int n = 180;
        int n2 = 20;
        return 70.0 / (double)(class06451.y(1.0) - 20);
    }

    public List compactChat$getMessages() {
        return this.i;
    }
}

