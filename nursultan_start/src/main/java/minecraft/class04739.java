/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.util.Either
 *  com.mojang.logging.LogUtils
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01321
 *  minecraft.class01590
 *  minecraft.class01885
 *  minecraft.class01894
 *  minecraft.class02071
 *  minecraft.class02102
 *  minecraft.class03686
 *  minecraft.class04613
 *  minecraft.class04638
 *  minecraft.class04654
 *  minecraft.class04969
 *  minecraft.class04982
 *  minecraft.class05096
 *  minecraft.class05097
 *  minecraft.class05111
 *  minecraft.class05220
 *  minecraft.class05362
 *  minecraft.class05407
 *  minecraft.class05434
 *  minecraft.class06202
 *  minecraft.class06478
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Either;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01321;
import minecraft.class01590;
import minecraft.class01885;
import minecraft.class01894;
import minecraft.class02071;
import minecraft.class02102;
import minecraft.class03686;
import minecraft.class04613;
import minecraft.class04638;
import minecraft.class04654;
import minecraft.class04715;
import minecraft.class04727;
import minecraft.class04969;
import minecraft.class04982;
import minecraft.class05096;
import minecraft.class05097;
import minecraft.class05111;
import minecraft.class05220;
import minecraft.class05362;
import minecraft.class05407;
import minecraft.class05434;
import minecraft.class06202;
import minecraft.class06478;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class04739
extends class05407 {
    static final Logger N = LogUtils.getLogger();
    static final class01894 y = class01894.y((String)"widget/slot_frame");
    private static final class00392 Z = class00392.L((String)"mco.template.button.select");
    private static final class00392 z = class00392.L((String)"mco.template.button.trailer");
    private static final class00392 U = class00392.L((String)"mco.template.button.publisher");
    private static final int E = 100;
    final class03686 L = new class03686((class05096)this);
    final Consumer<class04982> u;
    class04715 i;
    private final class04969 W;
    private final List<class00392> m;
    private class05362 P;
    private class05362 s;
    private class05362 T;
    @Nullable class04982 R = null;
    @Nullable String M;
    @Nullable List<class04613> B;

    private void L() {
        if (this.R != null && !this.R.M().isBlank()) {
            class01321.N((class05096)this, (String)this.R.M());
        }
    }

    static /* synthetic */ class01590 L(class04739 class047392) {
        return class047392.field_22793;
    }

    static /* synthetic */ class01590 M(class04739 class047392) {
        return class047392.field_22793;
    }

    public class04739(class00392 class003922, Consumer<class04982> consumer, class04969 class049692, @Nullable class05434 class054342, List<class00392> list) {
        super(class003922);
        this.u = consumer;
        this.W = class049692;
        if (class054342 == null) {
            this.i = new class04715(this);
            this.N(new class05434(10));
        } else {
            this.i = new class04715(this, Lists.newArrayList((Iterable)class054342.y()));
            this.N(class054342);
        }
        this.m = list;
    }

    public class04739(class00392 class003922, Consumer<class04982> consumer, class04969 class049692, @Nullable class05434 class054342) {
        this(class003922, consumer, class049692, class054342, List.of());
    }

    static /* synthetic */ class01590 B(class04739 class047392) {
        return class047392.field_22793;
    }

    static /* synthetic */ class01590 i(class04739 class047392) {
        return class047392.field_22793;
    }

    static /* synthetic */ class01590 u(class04739 class047392) {
        return class047392.field_22793;
    }

    private void u() {
        if (this.R != null && !this.R.i().isBlank()) {
            class01321.N((class05096)this, (String)this.R.i());
        }
    }

    private void y() {
        if (this.R != null) {
            this.u.accept(this.R);
        }
    }

    static /* synthetic */ class01590 y(class04739 class047392) {
        return class047392.field_22793;
    }

    static /* synthetic */ class06202 N(class04739 class047392) {
        return class047392.field_22787;
    }

    private void N(class05434 class054342) {
        new class04727(this, "realms-template-fetcher", class054342).start();
    }

    Either<class05434, Exception> N(class05434 class054342, class05111 class051112) {
        try {
            return Either.left((Object)class051112.N(class054342.L() + 1, class054342.u(), this.W));
        }
        catch (class05097 class050972) {
            return Either.right((Object)((Object)class050972));
        }
    }

    private void N(class01054 class010542, int n, int n2, List<class04613> list) {
        for (int i = 0; i < list.size(); ++i) {
            class04613 class046132 = list.get(i);
            int n3 = class04739.N((int)(4 + i));
            int n4 = class046132.N.stream().mapToInt(class046382 -> this.field_22793.y(class046382.N())).sum();
            int n5 = this.field_22789 / 2 - n4 / 2;
            for (class04638 class046383 : class046132.N) {
                int n6 = class046383.y() ? -13408581 : -1;
                String string = class046383.N();
                class010542.y(this.field_22793, string, n5, n3, n6);
                int n7 = n5 + this.field_22793.y(string);
                if (class046383.y() && n > n5 && n < n7 && n2 > n3 - 3 && n2 < n3 + 8) {
                    class010542.N((class00392)class00392.y((String)class046383.L()), n, n2);
                    this.M = class046383.L();
                }
                n5 = n7;
            }
        }
    }

    void N() {
        this.T.field_22764 = this.R != null && !this.R.i().isEmpty();
        this.s.field_22764 = this.R != null && !this.R.M().isEmpty();
        this.P.field_22763 = this.R != null;
    }

    public void method_25426() {
        int n = this.m.size();
        Objects.requireNonNull(this.method_64506());
        this.L.y(33 + n * 13);
        class01885 class018852 = (class01885)this.L.N((class02102)class01885.u().N(4));
        class018852.L().y();
        class018852.N((class02102)new class02071(this.field_22785, this.field_22793));
        this.m.forEach(class003922 -> class018852.N((class02102)new class02071(class003922, this.field_22793)));
        this.i = (class04715)this.L.L((class02102)new class04715(this, this.i.L()));
        class01885 class018853 = (class01885)this.L.y((class02102)class01885.i().N(8));
        class018853.L().y();
        this.s = (class05362)class018853.N((class02102)class05362.method_46430((class00392)z, class053622 -> this.L()).N(100).N());
        this.P = (class05362)class018853.N((class02102)class05362.method_46430((class00392)Z, class053622 -> this.y()).N(100).N());
        class018853.N((class02102)class05362.method_46430((class00392)class05220.i, class053622 -> this.method_25419()).N(100).N());
        this.T = (class05362)class018853.N((class02102)class05362.method_46430((class00392)U, class053622 -> this.u()).N(100).N());
        this.N();
        this.L.method_48206(class046542 -> {
            class06478 cfr_ignored_0 = (class06478)this.method_37063((class04654)class046542);
        });
        this.method_48640();
    }

    public void method_48640() {
        this.i.method_57712(this.field_22789, this.L);
        this.L.N();
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        super.method_25394(class010542, n, n2, f);
        this.M = null;
        if (this.B != null) {
            this.N(class010542, n, n2, this.B);
        }
    }

    public void method_25419() {
        this.u.accept(null);
    }

    static /* synthetic */ class01590 R(class04739 class047392) {
        return class047392.field_22793;
    }

    public class00392 method_25435() {
        ArrayList arrayList = Lists.newArrayListWithCapacity((int)2);
        arrayList.add(this.field_22785);
        arrayList.addAll(this.m);
        return class05220.N((Collection)arrayList);
    }
}

