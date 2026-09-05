/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class00753
 *  minecraft.class01054
 *  minecraft.class01894
 *  minecraft.class04161
 *  minecraft.class04227
 *  minecraft.class04654
 *  minecraft.class04927
 *  minecraft.class04995
 *  minecraft.class05096
 *  minecraft.class05216
 *  minecraft.class05220
 *  minecraft.class05362
 *  minecraft.class05946
 *  minecraft.class06366
 *  minecraft.class06541
 *  minecraft.class06993
 *  minecraft.class07529
 *  minecraft.class08610
 *  minecraft.class08616
 *  minecraft.class08628
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Objects;
import java.util.Optional;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class00753;
import minecraft.class01054;
import minecraft.class01894;
import minecraft.class04161;
import minecraft.class04227;
import minecraft.class04654;
import minecraft.class04927;
import minecraft.class04995;
import minecraft.class05096;
import minecraft.class05216;
import minecraft.class05220;
import minecraft.class05362;
import minecraft.class05946;
import minecraft.class06366;
import minecraft.class06541;
import minecraft.class06993;
import minecraft.class07529;
import minecraft.class08610;
import minecraft.class08616;
import minecraft.class08628;
import org.jspecify.annotations.Nullable;

public class class00231
extends class05096 {
    private static final class00392 N = class00392.L((String)"test_instance_block.test_id");
    private static final class00392 y = class00392.L((String)"test_instance_block.size");
    private static final class00392 L = class00392.L((String)"test_instance_block.entities");
    private static final class00392 u = class00392.L((String)"test_instance_block.rotation");
    private static final int i = 8;
    private static final int R = 316;
    private final class08610 M;
    private @Nullable class04927 B;
    private @Nullable class04927 Z;
    private @Nullable class04927 z;
    private @Nullable class04927 U;
    private @Nullable class04161 E;
    private @Nullable class05362 W;
    private @Nullable class05362 m;
    private @Nullable class06366<Boolean> P;
    private @Nullable class06366<class06993> s;

    private void L() {
        this.method_25419();
    }

    public class00231(class08610 class086102) {
        super((class00392)class086102.w().i().M());
        this.M = class086102;
    }

    private void y() {
        this.N(class08616.field_55922);
        this.method_25419();
    }

    private static float y(int n) {
        return (float)(316 - (n - 1) * 8) / (float)n;
    }

    private static class00392 N(class06993 class069932) {
        return class00392.y((String)(switch (class069932) {
            default -> throw new MatchException(null, null);
            case class06993.field_11467 -> "0";
            case class06993.field_11463 -> "90";
            case class06993.field_11464 -> "180";
            case class06993.field_11465 -> "270";
        }));
    }

    private void N(boolean bl) {
        if (!this.N(bl ? class08616.field_55920 : class08616.field_55921)) {
            this.E.method_25355((class00392)class00392.L((String)"test_instance.description.invalid_id").N(class06541.field_1061));
        }
        this.N();
    }

    private void N(class00753 class007532) {
        this.Z.method_1852(Integer.toString(class007532.method_10263()));
        this.z.method_1852(Integer.toString(class007532.method_10264()));
        this.U.method_1852(Integer.toString(class007532.method_10260()));
    }

    private static int N(int n) {
        return (int)class00231.y(n);
    }

    private int N(int n, int n2) {
        int n3 = this.field_22789 / 2 - 158;
        float f = class00231.y(n2);
        return (int)((float)n3 + (float)n * (8.0f + f));
    }

    private static int N(String string) {
        try {
            return class04995.N((int)Integer.parseInt(string), (int)1, (int)48);
        }
        catch (NumberFormatException numberFormatException) {
            return 1;
        }
    }

    private void N() {
        boolean bl;
        this.W.field_22763 = bl = this.s.y() == class06993.field_11467 && class01894.L((String)this.B.method_1882()) != null;
        if (this.m != null) {
            this.m.field_22763 = bl;
        }
    }

    public void N(class00392 class003923, Optional<class00753> optional) {
        class05216 class052162 = class00392.i();
        this.M.E().ifPresent(class003922 -> class052162.y((class00392)class00392.N((String)"test_instance.description.failed", (Object[])new Object[]{class00392.i().N(class06541.field_1061).y(class003922)})).i("\n\n"));
        class052162.y(class003923);
        this.E.method_25355((class00392)class052162);
        optional.ifPresent(this::N);
    }

    private boolean N(class08616 class086162) {
        Optional<class01894> optional = Optional.ofNullable(class01894.L((String)this.B.method_1882()));
        Optional<class05946> optional2 = optional.map(class018942 -> class05946.N((class05946)class04227.yt, (class01894)class018942));
        class00753 class007532 = new class00753(class00231.N(this.Z.method_1882()), class00231.N(this.z.method_1882()), class00231.N(this.U.method_1882()));
        boolean bl = (Boolean)this.P.y() == false;
        this.field_22787.NE().N((class00381)new class08628(this.M.d(), class086162, optional2, class007532, (class06993)this.s.y(), bl));
        return optional.isPresent();
    }

    public void method_25426() {
        int n = this.field_22789 / 2 - 158;
        boolean bl = class07529.ND;
        int n2 = bl ? 3 : 2;
        int n3 = class00231.N(n2);
        this.B = new class04927(this.field_22793, n, 40, 316, 20, (class00392)class00392.L((String)"test_instance_block.test_id"));
        this.B.method_1880(128);
        Optional var5 = this.M.M();
        if (var5.isPresent()) {
            this.B.method_1852(((class05946)var5.get()).N().toString());
        }
        this.B.method_1863(string -> this.N(false));
        this.method_37063((class04654)this.B);
        Objects.requireNonNull(this.field_22793);
        this.E = new class04161(n, 70, 316, 8 * 9, (class00392)class00392.y((String)""), this.field_22793);
        this.method_37063((class04654)this.E);
        class00753 class007532 = this.M.z();
        int n4 = 0;
        this.Z = new class04927(this.field_22793, this.N(n4++, 5), 160, class00231.N(5), 20, (class00392)class00392.L((String)"structure_block.size.x"));
        this.Z.method_1880(15);
        this.method_37063((class04654)this.Z);
        this.z = new class04927(this.field_22793, this.N(n4++, 5), 160, class00231.N(5), 20, (class00392)class00392.L((String)"structure_block.size.y"));
        this.z.method_1880(15);
        this.method_37063((class04654)this.z);
        this.U = new class04927(this.field_22793, this.N(n4++, 5), 160, class00231.N(5), 20, (class00392)class00392.L((String)"structure_block.size.z"));
        this.U.method_1880(15);
        this.method_37063((class04654)this.U);
        this.N(class007532);
        this.s = (class06366)this.method_37063((class04654)class06366.N(class00231::N, (Object)this.M.U()).N((Object[])class06993.values()).N().N(this.N(n4++, 5), 160, class00231.N(5), 20, u, (class063662, class069932) -> this.N()));
        this.P = (class06366)this.method_37063((class04654)class06366.N((!this.M.Z() ? 1 : 0) != 0).N().N(this.N(n4++, 5), 160, class00231.N(5), 20, L));
        n4 = 0;
        this.method_37063((class04654)class05362.method_46430((class00392)class00392.L((String)"test_instance.action.reset"), class053622 -> {
            this.N(class08616.field_55923);
            this.field_22787.N(null);
        }).N(this.N(n4++, n2), 185, n3, 20).N());
        this.W = (class05362)this.method_37063((class04654)class05362.method_46430((class00392)class00392.L((String)"test_instance.action.save"), class053622 -> {
            this.N(class08616.field_55924);
            this.field_22787.N(null);
        }).N(this.N(n4++, n2), 185, n3, 20).N());
        if (bl) {
            this.m = (class05362)this.method_37063((class04654)class05362.method_46430((class00392)class00392.y((String)"Export Structure"), class053622 -> {
                this.N(class08616.field_55925);
                this.field_22787.N(null);
            }).N(this.N(n4++, n2), 185, n3, 20).N());
        }
        this.method_37063((class04654)class05362.method_46430((class00392)class00392.L((String)"test_instance.action.run"), class053622 -> {
            this.N(class08616.field_55926);
            this.field_22787.N(null);
        }).N(this.N(0, 3), 210, class00231.N(3), 20).N());
        this.method_37063((class04654)class05362.method_46430((class00392)class05220.u, class053622 -> this.y()).N(this.N(1, 3), 210, class00231.N(3), 20).N());
        this.method_37063((class04654)class05362.method_46430((class00392)class05220.i, class053622 -> this.L()).N(this.N(2, 3), 210, class00231.N(3), 20).N());
        this.N(true);
    }

    public boolean method_73150() {
        return true;
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        super.method_25394(class010542, n, n2, f);
        int n3 = this.field_22789 / 2 - 158;
        class010542.N(this.field_22793, this.field_22785, this.field_22789 / 2, 10, -1);
        class010542.y(this.field_22793, N, n3, 30, -6250336);
        class010542.y(this.field_22793, y, n3, 150, -6250336);
        class010542.y(this.field_22793, u, this.s.method_46426(), 150, -6250336);
        class010542.y(this.field_22793, L, this.P.method_46426(), 150, -6250336);
    }
}

