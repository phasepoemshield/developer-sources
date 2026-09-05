/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  minecraft.class00392
 *  minecraft.class01028
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class01894
 *  minecraft.class04650
 *  minecraft.class04680
 *  minecraft.class05936
 *  minecraft.class06202
 *  minecraft.class06541
 *  minecraft.class07321
 *  minecraft.class08394
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import java.util.List;
import minecraft.class00392;
import minecraft.class01028;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class01894;
import minecraft.class04650;
import minecraft.class04680;
import minecraft.class05936;
import minecraft.class06086;
import minecraft.class06095;
import minecraft.class06202;
import minecraft.class06541;
import minecraft.class07321;
import minecraft.class08394;
import org.jspecify.annotations.Nullable;

public class class06132
implements class04680 {
    private static final class01894 N = class01894.y((String)"toast/system");
    private static final int i = 200;
    private static final int R = 12;
    private static final int M = 10;
    private final class06095 B;
    private class00392 Z;
    private List<class01028> z;
    private long U;
    private boolean E;
    private final int W;
    private boolean m;
    private class04650 P = class04650.field_2209;

    public int L() {
        return this.W;
    }

    public static void L(class06202 class062022, String string) {
        class06132.N(class062022.m(), class06095.i, (class00392)class00392.L((String)"pack.copyFailure"), (class00392)class00392.y((String)string));
    }

    public class06132(class06095 class060952, class00392 class003922, @Nullable class00392 class003923) {
        this(class060952, class003922, (List<class01028>)class06132.N(class003923), Math.max(160, 30 + Math.max(((class01590)class06202.Nq().i_3).N((class05936)class003922), class003923 == null ? 0 : ((class01590)class06202.Nq().i_3).N((class05936)class003923))));
    }

    private class06132(class06095 class060952, class00392 class003922, List<class01028> list, int n) {
        this.B = class060952;
        this.Z = class003922;
        this.z = list;
        this.W = n;
    }

    public void B() {
        this.m = true;
    }

    public class06095 R() {
        return this.B;
    }

    public class04650 i() {
        return this.P;
    }

    public int u() {
        return 20 + Math.max(this.z.size(), 1) * 12;
    }

    public static void y(class06202 class062022, String string) {
        class06132.N(class062022.m(), class06095.u, (class00392)class00392.L((String)"selectWorld.delete_failure"), (class00392)class00392.y((String)string));
    }

    public static void y(class06086 class060862, class06095 class060952, class00392 class003922, @Nullable class00392 class003923) {
        class06132 class061322 = class060862.N(class06132.class, class060952);
        if (class061322 == null) {
            class06132.N(class060862, class060952, class003922, class003923);
        } else {
            class061322.N(class003922, class003923);
        }
    }

    public static void y(class06202 class062022, class07321 class073212) {
        class06132.y(class062022.m(), class06095.z, (class00392)class00392.N((String)"chunk.toast.saveFailure", (Object[])new Object[]{class00392.N((class07321)class073212)}).N(class06541.field_1061), (class00392)class00392.L((String)"chunk.toast.checkLog"));
    }

    public static void N(class06202 class062022, int n) {
        class06132.N(class062022.m(), class06095.R, (class00392)class00392.L((String)"gui.fileDropFailure.title"), (class00392)class00392.N((String)"gui.fileDropFailure.detail", (Object[])new Object[]{n}));
    }

    public static class06132 N(class06202 class062022, class06095 class060952, class00392 class003922, class00392 class003923) {
        class01590 class015902 = (class01590)class062022.i_3;
        List var5 = class015902.L((class05936)class003923, 200);
        int n = Math.max(200, var5.stream().mapToInt(arg_0 -> ((class01590)class015902).N(arg_0)).max().orElse(200));
        return new class06132(class060952, class003922, var5, n + 30);
    }

    public static void N(class06086 class060862, class06095 class060952, class00392 class003922, @Nullable class00392 class003923) {
        class060862.N(new class06132(class060952, class003922, class003923));
    }

    public static void N(class06202 class062022, class07321 class073212) {
        class06132.y(class062022.m(), class06095.Z, (class00392)class00392.N((String)"chunk.toast.loadFailure", (Object[])new Object[]{class00392.N((class07321)class073212)}).N(class06541.field_1061), (class00392)class00392.L((String)"chunk.toast.checkLog"));
    }

    public static void N(class06202 class062022) {
        class06132.y(class062022.m(), class06095.B, (class00392)class00392.L((String)"chunk.toast.lowDiskSpace"), (class00392)class00392.L((String)"chunk.toast.lowDiskSpace.description"));
    }

    public void N(class06086 class060862, long l) {
        if (this.E) {
            this.U = l;
            this.E = false;
        }
        double d = (double)this.B.E * class060862.R();
        long l2 = l - this.U;
        this.P = !this.m && (double)l2 < d ? class04650.field_2210 : class04650.field_2209;
    }

    public void N(class01054 class010542, class01590 class015902, long l) {
        class010542.N(class08394.Na, N, 0, 0, this.L(), this.u());
        if (this.z.isEmpty()) {
            class010542.N(class015902, this.Z, 18, 12, -256, false);
        } else {
            class010542.N(class015902, this.Z, 18, 7, -256, false);
            for (int i = 0; i < this.z.size(); ++i) {
                class010542.N(class015902, this.z.get(i), 18, 18 + i * 12, -1, false);
            }
        }
    }

    public void N(class00392 class003922, @Nullable class00392 class003923) {
        this.Z = class003922;
        this.z = class06132.N(class003923);
        this.E = true;
    }

    public static void N(class06202 class062022, String string) {
        class06132.N(class062022.m(), class06095.u, (class00392)class00392.L((String)"selectWorld.access_failure"), (class00392)class00392.y((String)string));
    }

    public static void N(class06086 class060862, class06095 class060952) {
        class06132 class061322 = class060862.N(class06132.class, class060952);
        if (class061322 != null) {
            class061322.B();
        }
    }

    private static ImmutableList<class01028> N(@Nullable class00392 class003922) {
        return class003922 == null ? ImmutableList.of() : ImmutableList.of((Object)class003922.method_30937());
    }
}

