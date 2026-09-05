/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.logging.LogUtils
 *  java.lang.runtime.SwitchBootstraps
 *  minecraft.class00390
 *  minecraft.class00392
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00405
 *  minecraft.class00500
 *  minecraft.class00625
 *  minecraft.class00626
 *  minecraft.class00647
 *  minecraft.class00669
 *  minecraft.class00753
 *  minecraft.class00891
 *  minecraft.class01929
 *  minecraft.class03610
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04995
 *  minecraft.class05216
 *  minecraft.class06068
 *  minecraft.class06889
 *  minecraft.class06984
 *  minecraft.class07001
 *  minecraft.class07036
 *  minecraft.class07049
 *  minecraft.class07109
 *  minecraft.class07209
 *  minecraft.class07701
 *  minecraft.class07703
 *  minecraft.class08036
 *  minecraft.class08152
 *  minecraft.class08299
 *  minecraft.class08329
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.lang.runtime.SwitchBootstraps;
import java.util.List;
import java.util.UUID;
import java.util.function.UnaryOperator;
import minecraft.class00390;
import minecraft.class00392;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00405;
import minecraft.class00500;
import minecraft.class00625;
import minecraft.class00626;
import minecraft.class00647;
import minecraft.class00669;
import minecraft.class00753;
import minecraft.class00891;
import minecraft.class01929;
import minecraft.class03610;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04995;
import minecraft.class05216;
import minecraft.class06068;
import minecraft.class06889;
import minecraft.class06984;
import minecraft.class07001;
import minecraft.class07036;
import minecraft.class07049;
import minecraft.class07109;
import minecraft.class07209;
import minecraft.class07269;
import minecraft.class07299;
import minecraft.class07701;
import minecraft.class07703;
import minecraft.class08036;
import minecraft.class08152;
import minecraft.class08299;
import minecraft.class08329;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class07267
extends class00394 {
    private static final Logger N = LogUtils.getLogger();
    private static final int y = 90;
    private static final int L = 10;
    private static final boolean u = false;
    private @Nullable UUID i;
    private class03610 R = this.N();
    private class03610 M = this.N();
    private boolean B = false;

    public class03610 L() {
        return this.R;
    }

    private boolean L(class03610 class036102) {
        if (class036102 != this.R) {
            this.R = class036102;
            this.E();
            return true;
        }
        return false;
    }

    public int M() {
        return 90;
    }

    public class07267(class07209 class072092, class00500 class005002) {
        this(class00404.field_11911, class072092, class005002);
    }

    public class07267(class00404 class004042, class07209 class072092, class00500 class005002) {
        super(class004042, class072092, class005002);
    }

    public class07269 i() {
        return class07269.N(this);
    }

    public @Nullable UUID Z() {
        return this.i;
    }

    public class04891 U() {
        return class04909.In;
    }

    public boolean z() {
        return this.B;
    }

    public class03610 u() {
        return this.M;
    }

    private boolean y(class03610 class036102) {
        if (class036102 != this.M) {
            this.M = class036102;
            this.E();
            return true;
        }
        return false;
    }

    public boolean y(boolean bl) {
        if (this.B != bl) {
            this.B = bl;
            this.E();
            return true;
        }
        return false;
    }

    public boolean y(UUID uUID) {
        class08036 class080362 = this.z.N(uUID);
        return class080362 == null || !class080362.method_56093(this.d(), 4.0);
    }

    private void E() {
        this.method_5431();
        this.z.method_8413(this.d(), this.w(), this.w(), 3);
    }

    public class07001 N(class01929 class019292) {
        return this.u(class019292);
    }

    public void N(@Nullable UUID uUID) {
        this.i = uUID;
    }

    private void N(class07267 class072672, class07299 class072992, UUID uUID) {
        if (class072672.y(uUID)) {
            class072672.N((UUID)null);
        }
    }

    public class03610 N(boolean bl) {
        return bl ? this.R : this.M;
    }

    public static void N(class07299 class072992, class07209 class072092, class00500 class005002, class07267 class072672) {
        UUID uUID = class072672.Z();
        if (uUID != null) {
            class072672.N(class072672, class072992, uUID);
        }
    }

    protected void N(class08299 class082992) {
        super.N(class082992);
        this.R = class082992.N("front_text", class03610.N).map(this::N).orElseGet(class03610::new);
        this.M = class082992.N("back_text", class03610.N).map(this::N).orElseGet(class03610::new);
        this.B = class082992.N("is_waxed", false);
    }

    private class03610 N(class03610 class036102) {
        for (int i = 0; i < 4; ++i) {
            class00392 class003922 = this.N(class036102.N(i, false));
            class00392 class003923 = this.N(class036102.N(i, true));
            class036102 = class036102.N(i, class003922, class003923);
        }
        return class036102;
    }

    private class00392 N(class00392 class003922) {
        class07299 class072992 = this.z;
        if (class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            try {
                return class00390.N((class07701)class07267.N(null, class047822, this.U), (class00392)class003922, null, (int)0);
            }
            catch (CommandSyntaxException commandSyntaxException) {
                // empty catch block
            }
        }
        return class003922;
    }

    public void N(class08036 class080362, boolean bl, List<class06068> list) {
        if (this.z() || !class080362.method_5667().equals(this.Z()) || this.z == null) {
            N.warn("Player {} just tried to change non-editable sign", (Object)class080362.method_74861());
            return;
        }
        this.N(class036102 -> this.N(class080362, list, (class03610)class036102), bl);
        this.N((UUID)null);
        this.z.method_8413(this.d(), this.w(), this.w(), 3);
    }

    protected void N(class08329 class083292) {
        super.N(class083292);
        class083292.N("front_text", class03610.N, (Object)this.R);
        class083292.N("back_text", class03610.N, (Object)this.M);
        class083292.N("is_waxed", this.B);
    }

    protected class03610 N() {
        return new class03610();
    }

    public boolean N(class08036 class080362) {
        class00891 class008912 = this.w().i();
        if (class008912 instanceof class07036) {
            float f;
            class07036 class070362 = (class07036)class008912;
            class008912 = class070362.T(this.w());
            double d = class080362.method_23317() - ((double)this.d().method_10263() + class008912.M);
            double d2 = class080362.method_23321() - ((double)this.d().method_10260() + class008912.Z);
            float f2 = class070362.U(this.w());
            return class04995.i((float)f2, (float)(f = (float)(class04995.u((double)d2, (double)d) * 57.2957763671875) - 90.0f)) <= 90.0f;
        }
        return false;
    }

    private static class07701 N(@Nullable class08036 class080362, class04782 class047822, class07209 class072092) {
        String string = class080362 == null ? "Sign" : class080362.method_74861();
        class05216 class052162 = class080362 == null ? class00392.y((String)"Sign") : class080362.method_5476();
        return new class07701(class07703.j_, class06889.y((class00753)class072092), class07109.N, class047822, (class08152)class06984.L, string, (class00392)class052162, class047822.method_8503(), (class07049)class080362);
    }

    public boolean N(class04782 class047822, class08036 class080362, class07209 class072092, boolean bl) {
        boolean bl2 = false;
        class00392[] class00392Array = this.N(bl).y(class080362.method_33793());
        int n = class00392Array.length;
        block5: for (int i = 0; i < n; ++i) {
            class00647 class006472 = class00392Array[i].method_10866().Z();
            int n2 = 0;
            switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class00625.class, class00626.class, class00669.class}, (Object)class006472, (int)n2)) {
                case 0: {
                    class00625 class006252 = (class00625)class006472;
                    class047822.method_8503().yL().N(class07267.N(class080362, class047822, class072092), class006252.y());
                    bl2 = true;
                    continue block5;
                }
                case 1: {
                    class00626 class006262 = (class00626)class006472;
                    class080362.method_71753(class006262.y());
                    bl2 = true;
                    continue block5;
                }
                case 2: {
                    class00669 class006692 = (class00669)class006472;
                    class047822.method_8503().N(class006692.y(), class006692.L());
                    bl2 = true;
                    continue block5;
                }
            }
        }
        return bl2;
    }

    public boolean N(boolean bl, class08036 class080362) {
        return this.z() && this.N(bl).y(class080362);
    }

    public boolean N(UnaryOperator<class03610> unaryOperator, boolean bl) {
        class03610 class036102 = this.N(bl);
        return this.N((class03610)unaryOperator.apply(class036102), bl);
    }

    private class03610 N(class08036 class080362, List<class06068> list, class03610 class036102) {
        for (int i = 0; i < list.size(); ++i) {
            class06068 class060682 = list.get(i);
            class00405 class004052 = class036102.N(i, class080362.method_33793()).method_10866();
            class036102 = class080362.method_33793() ? class036102.N(i, (class00392)class00392.y((String)class060682.y()).y(class004052)) : class036102.N(i, (class00392)class00392.y((String)class060682.u()).y(class004052), (class00392)class00392.y((String)class060682.y()).y(class004052));
        }
        return class036102;
    }

    public boolean N(class03610 class036102, boolean bl) {
        return bl ? this.L(class036102) : this.y(class036102);
    }

    public int R() {
        return 10;
    }
}

