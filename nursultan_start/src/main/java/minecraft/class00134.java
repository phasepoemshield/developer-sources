/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  java.lang.runtime.SwitchBootstraps
 *  minecraft.class00392
 *  minecraft.class00625
 *  minecraft.class00626
 *  minecraft.class00647
 *  minecraft.class00669
 *  minecraft.class01883
 *  minecraft.class01885
 *  minecraft.class01894
 *  minecraft.class02060
 *  minecraft.class02071
 *  minecraft.class02102
 *  minecraft.class03686
 *  minecraft.class03695
 *  minecraft.class04141
 *  minecraft.class04654
 *  minecraft.class04897
 *  minecraft.class05096
 *  minecraft.class05362
 *  minecraft.class06202
 *  minecraft.class07686
 *  minecraft.class08739
 *  minecraft.class08770
 *  minecraft.class08781
 *  minecraft.class08782
 *  minecraft.class09009
 *  minecraft.class09034
 *  minecraft.class09037
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.runtime.SwitchBootstraps;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Supplier;
import minecraft.class00103;
import minecraft.class00104;
import minecraft.class00132;
import minecraft.class00392;
import minecraft.class00625;
import minecraft.class00626;
import minecraft.class00647;
import minecraft.class00669;
import minecraft.class01883;
import minecraft.class01885;
import minecraft.class01894;
import minecraft.class02060;
import minecraft.class02071;
import minecraft.class02102;
import minecraft.class03686;
import minecraft.class03695;
import minecraft.class04141;
import minecraft.class04654;
import minecraft.class04897;
import minecraft.class05096;
import minecraft.class05362;
import minecraft.class06202;
import minecraft.class07686;
import minecraft.class08739;
import minecraft.class08770;
import minecraft.class08781;
import minecraft.class08782;
import minecraft.class09009;
import minecraft.class09034;
import minecraft.class09037;
import org.jspecify.annotations.Nullable;

public abstract class class00134<T extends class09037>
extends class05096 {
    public static final class00392 y = class00392.L((String)"menu.custom_screen_info.disconnect");
    private static final int N = 20;
    private static final class01883 L = new class01883(class01894.y((String)"dialog/warning_button"), class01894.y((String)"dialog/warning_button_disabled"), class01894.y((String)"dialog/warning_button_highlighted"));
    private final T u;
    private final class03686 i = new class03686((class05096)this);
    private final @Nullable class05096 R;
    private @Nullable class00104 M;
    private class05362 B;
    private final class08781 Z;
    private Supplier<Optional<class00647>> z = class08770.N;

    public @Nullable class05096 L() {
        return this.R;
    }

    public class00134(@Nullable class05096 class050962, T t, class08781 class087812) {
        super(t.H_().y());
        this.u = t;
        this.R = class050962;
        this.Z = class087812;
    }

    private class05362 u() {
        class04897 class048972 = new class04897(0, 0, 20, 20, L, class053622 -> this.field_22787.N(class00132.N(this.field_22787, this.Z, this)), (class00392)class00392.L((String)"menu.custom_screen_info.button_narration"));
        class048972.method_47400(class04141.N((class00392)class00392.L((String)"menu.custom_screen_info.tooltip")));
        return class048972;
    }

    protected void y() {
        int n = this.B.method_46426();
        int n2 = this.B.method_46427();
        if (n < 0 || n2 < 0 || n > this.field_22789 - 20 || n2 > this.field_22790 - 20) {
            this.B.method_46421(Math.max(0, this.field_22789 - 40));
            this.B.method_46419(Math.min(5, this.field_22790));
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void N(class00647 class006472, @Nullable class05096 class050962) {
        class00647 class006473 = class006472;
        Objects.requireNonNull(class006473);
        class00647 class006474 = class006473;
        int n = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class00625.class, class00626.class, class00669.class}, (Object)class006474, (int)n)) {
            case 0: {
                String string2;
                try {
                    String string;
                    string2 = string = ((class00625)class006474).y();
                }
                catch (Throwable throwable) {
                    throw new MatchException(throwable.toString(), throwable);
                }
                this.Z.N(class07686.N((String)string2), class050962);
                return;
            }
            case 1: {
                class00626 class006262 = (class00626)class006474;
                this.Z.N(class006262.y(), class050962);
                return;
            }
            case 2: {
                class00669 class006692 = (class00669)class006474;
                this.Z.N(class006692.y(), class006692.L());
                this.field_22787.N(class050962);
                return;
            }
        }
        class00134.method_71847((class00647)class006472, (class06202)this.field_22787, (class05096)class050962);
    }

    public void N(Optional<class00647> optional, class08782 class087822) {
        class00134 class001342;
        switch (class087822) {
            default: {
                throw new MatchException(null, null);
            }
            case field_60963: {
                class00134 class001343 = this;
                break;
            }
            case field_60962: {
                class00134 class001343 = this.R;
                break;
            }
            case field_60964: {
                class00134 class001343 = class001342 = new class08739(this.R);
            }
        }
        if (optional.isPresent()) {
            this.N(optional.get(), class001342);
        } else {
            this.field_22787.N((class05096)class001342);
        }
    }

    public void N(Optional<class00647> optional) {
        this.N(optional, this.u.H_().R());
    }

    protected static class02102 N(List<? extends class02102> list, int n) {
        class02060 class020602 = new class02060();
        class020602.L().y();
        class020602.N(2).y(2);
        int n2 = list.size();
        int n3 = n2 / n;
        int n4 = n3 * n;
        for (int i = 0; i < n4; ++i) {
            class020602.N(list.get(i), i / n, i % n);
        }
        if (n2 != n4) {
            class01885 class018852 = class01885.i().N(2);
            class018852.L().y();
            for (int i = n4; i < n2; ++i) {
                class018852.N(list.get(i));
            }
            class020602.N((class02102)class018852, n3, 0, 1, n);
        }
        return class020602;
    }

    protected void N(class03686 class036862, class08770 class087702, T t, class08781 class087812) {
    }

    protected void N(class01885 class018852, class08770 class087702, T t, class08781 class087812) {
    }

    protected class02102 N() {
        class01885 class018852 = class01885.i().N(10);
        class018852.L().y().i();
        class018852.N((class02102)new class02071(this.field_22785, this.field_22793));
        class018852.N((class02102)this.B);
        return class018852;
    }

    public final void method_25426() {
        super.method_25426();
        this.B = this.u();
        this.B.method_48591(-10);
        class08770 class087702 = new class08770(this);
        class01885 class018852 = class01885.u().N(10);
        class018852.L().y();
        this.i.N(this.N());
        for (class09034 class090342 : this.u.H_().M()) {
            class02102 class021022 = class00103.N(this, class090342);
            if (class021022 == null) continue;
            class018852.N(class021022);
        }
        for (class09034 class090342 : this.u.H_().B()) {
            class087702.N((class09009)class090342, arg_0 -> ((class01885)class018852).N(arg_0));
        }
        this.N(class018852, class087702, this.u, this.Z);
        this.M = new class00104(this.field_22787, (class03695)class018852, this.i.u());
        this.i.L((class02102)this.M);
        this.N(this.i, class087702, this.u, this.Z);
        this.z = class087702.N(this.u.u());
        this.i.method_48206(class064782 -> {
            if (class064782 != this.B) {
                this.method_37063((class04654)class064782);
            }
        });
        this.method_37063((class04654)this.B);
        this.method_48640();
    }

    public boolean method_25422() {
        return this.u.H_().u();
    }

    public void method_48640() {
        this.M.y(this.i.u());
        this.i.N();
        this.y();
    }

    public void method_25419() {
        this.N(this.z.get(), class08782.field_60962);
    }

    public boolean method_25421() {
        return this.u.H_().i();
    }
}

