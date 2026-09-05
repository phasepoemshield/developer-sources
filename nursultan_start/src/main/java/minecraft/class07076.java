/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  minecraft.class00390
 *  minecraft.class00392
 *  minecraft.class00395
 *  minecraft.class00401
 *  minecraft.class00405
 *  minecraft.class00647
 *  minecraft.class00652
 *  minecraft.class02484
 *  minecraft.class03530
 *  minecraft.class03597
 *  minecraft.class03689
 *  minecraft.class03696
 *  minecraft.class03700
 *  minecraft.class04192
 *  minecraft.class05216
 *  minecraft.class06584
 *  minecraft.class07438
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import minecraft.class00390;
import minecraft.class00392;
import minecraft.class00395;
import minecraft.class00401;
import minecraft.class00405;
import minecraft.class00647;
import minecraft.class00652;
import minecraft.class02484;
import minecraft.class03530;
import minecraft.class03597;
import minecraft.class03689;
import minecraft.class03696;
import minecraft.class03700;
import minecraft.class04192;
import minecraft.class05216;
import minecraft.class06584;
import minecraft.class07049;
import minecraft.class07066;
import minecraft.class07072;
import minecraft.class07438;
import org.jspecify.annotations.Nullable;

public class class07076 {
    public static final int N = 100;
    public static final int y = 300;
    private static final class00405 L = class00405.N.N((class00647)new class00652(class03597.G)).N((class00395)new class00401((class00392)class00392.y((String)"MCPE-28723")));
    private final List<class07066> u = Lists.newArrayList();
    private final class07438 i;
    private int R;
    private int M;
    private int B;
    private boolean Z;
    private boolean z;

    public void L() {
        int n;
        int n2 = n = this.Z ? 300 : 100;
        if (this.z && (!this.i.method_5805() || this.i.field_6012 - this.R > n)) {
            boolean bl = this.Z;
            this.z = false;
            this.Z = false;
            this.B = this.i.field_6012;
            if (bl) {
                this.i.method_6044();
            }
            this.u.clear();
        }
    }

    public class07076(class07438 class074382) {
        this.i = class074382;
    }

    private @Nullable class07066 u() {
        class07066 class070662 = null;
        class07066 class070663 = null;
        float f = 0.0f;
        float f2 = 0.0f;
        for (int i = 0; i < this.u.size(); ++i) {
            float f3;
            class07066 class070664 = this.u.get(i);
            class07066 class070665 = i > 0 ? this.u.get(i - 1) : null;
            class07072 class070722 = class070664.N();
            boolean bl = class070722.N((class03530<class03689>)class03696.j);
            float f4 = f3 = bl ? Float.MAX_VALUE : class070664.u();
            if ((class070722.N((class03530<class03689>)class03696.W) || bl) && f3 > 0.0f && (class070662 == null || f3 > f2)) {
                class070662 = i > 0 ? class070665 : class070664;
                f2 = f3;
            }
            if (class070664.L() == null || class070663 != null && !(class070664.y() > f)) continue;
            class070663 = class070664;
            f = class070664.y();
        }
        if (f2 > 5.0f && class070662 != null) {
            return class070662;
        }
        if (f > 5.0f && class070663 != null) {
            return class070663;
        }
        return null;
    }

    public int y() {
        if (this.Z) {
            return this.i.field_6012 - this.M;
        }
        return this.B - this.M;
    }

    private class00392 N(class07049 class070492, class00392 class003922, String string, String string2) {
        class06584 class065842;
        class06584 class065843 = class065842 = class070492 instanceof class07438 ? ((class07438)class070492).method_6047() : class06584.E;
        if (!class065842.R() && class065842.L(class02484.B)) {
            return class00392.N((String)string, (Object[])new Object[]{this.i.method_5476(), class003922, class065842.V()});
        }
        return class00392.N((String)string2, (Object[])new Object[]{this.i.method_5476(), class003922});
    }

    public void N(class07072 class070722, float f) {
        this.L();
        class04192 class041922 = class04192.N((class07438)this.i);
        class07066 class070662 = new class07066(class070722, f, class041922, (float)this.i.field_6017);
        this.u.add(class070662);
        this.R = this.i.field_6012;
        this.z = true;
        if (!this.Z && this.i.method_5805() && class07076.N(class070722)) {
            this.Z = true;
            this.B = this.M = this.i.field_6012;
            this.i.method_6000();
        }
    }

    private static @Nullable class00392 N(@Nullable class07049 class070492) {
        return class070492 == null ? null : class070492.method_5476();
    }

    public class00392 N() {
        if (this.u.isEmpty()) {
            return class00392.N((String)"death.attack.generic", (Object[])new Object[]{this.i.method_5476()});
        }
        class07072 class070722 = this.u.get(this.u.size() - 1).N();
        class07066 class070662 = this.u();
        class03700 class037002 = class070722.U().i();
        if (class037002 == class03700.field_42362 && class070662 != null) {
            return this.N(class070662, class070722.u());
        }
        if (class037002 == class03700.field_42363) {
            String string = "death.attack." + class070722.R();
            class05216 class052162 = class00390.N((class00392)class00392.L((String)(string + ".link"))).L(L);
            return class00392.N((String)(string + ".message"), (Object[])new Object[]{this.i.method_5476(), class052162});
        }
        return class070722.N(this.i);
    }

    private static boolean N(class07072 class070722) {
        return class070722.u() instanceof class07438;
    }

    private class00392 N(class07066 class070662, @Nullable class07049 class070492) {
        class07072 class070722 = class070662.N();
        if (class070722.N((class03530<class03689>)class03696.W) || class070722.N((class03530<class03689>)class03696.j)) {
            class04192 class041922 = Objects.requireNonNullElse(class070662.L(), class04192.N);
            return class00392.N((String)class041922.N(), (Object[])new Object[]{this.i.method_5476()});
        }
        class00392 class003922 = class07076.N(class070492);
        class07049 class070493 = class070722.u();
        class00392 class003923 = class07076.N(class070493);
        if (class003923 != null && !class003923.equals((Object)class003922)) {
            return this.N(class070493, class003923, "death.fell.assist.item", "death.fell.assist");
        }
        if (class003922 != null) {
            return this.N(class070492, class003922, "death.fell.finish.item", "death.fell.finish");
        }
        return class00392.N((String)"death.fell.killer", (Object[])new Object[]{this.i.method_5476()});
    }
}

