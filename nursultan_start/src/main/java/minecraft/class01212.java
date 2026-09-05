/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  dev.isxander.yacl3.mixin.AbstractSelectionListAccessor
 *  java.lang.MatchException
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01295
 *  minecraft.class01777
 *  minecraft.class01894
 *  minecraft.class03249
 *  minecraft.class03428
 *  minecraft.class03432
 *  minecraft.class03448
 *  minecraft.class03457
 *  minecraft.class03686
 *  minecraft.class04654
 *  minecraft.class05096
 *  minecraft.class05220
 *  minecraft.class06202
 *  minecraft.class08394
 *  org.jspecify.annotations.Nullable
 *  page.langeweile.ok_zoomer.mixin.common.key_binds.AbstractSelectionListAccessor
 */
package minecraft;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import dev.isxander.yacl3.mixin.AbstractSelectionListAccessor;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01202;
import minecraft.class01218;
import minecraft.class01295;
import minecraft.class01777;
import minecraft.class01894;
import minecraft.class03249;
import minecraft.class03428;
import minecraft.class03432;
import minecraft.class03448;
import minecraft.class03457;
import minecraft.class03686;
import minecraft.class04654;
import minecraft.class05096;
import minecraft.class05220;
import minecraft.class06202;
import minecraft.class08394;
import org.jspecify.annotations.Nullable;

public abstract class class01212<E extends class01202<E>>
extends class01777
implements AbstractSelectionListAccessor,
page.langeweile.ok_zoomer.mixin.common.key_binds.AbstractSelectionListAccessor {
    private static final class01894 field_49478 = class01894.y((String)"textures/gui/menu_list_background.png");
    private static final class01894 field_49892 = class01894.y((String)"textures/gui/inworld_menu_list_background.png");
    private static final int field_62110 = 2;
    public final class06202 field_22740;
    protected final int field_62109;
    private final List<E> field_22739 = new class01218(this);
    protected boolean field_22744 = true;
    private @Nullable E field_22751;
    private @Nullable E field_33780;

    public /* synthetic */ List getChildren() {
        return this.field_22739;
    }

    public class01212(class06202 class062022, int n, int n2, int n3, int n4) {
        super(0, n3, n, n2, class05220.N);
        this.field_22740 = class062022;
        this.field_62109 = n4;
    }

    public List<E> method_25396() {
        return Collections.unmodifiableList(this.field_22739);
    }

    public /* synthetic */ @Nullable class04654 method_25399() {
        return this.method_25336();
    }

    public class03432 method_37018() {
        if (this.method_25370()) {
            return class03432.field_33786;
        }
        if (this.field_33780 != null) {
            return class03432.field_33785;
        }
        return class03432.field_33784;
    }

    public void method_25365(boolean bl) {
        super.method_25365(bl);
        if (!bl) {
            this.method_25395(null);
        }
    }

    public void method_25395(@Nullable class04654 class046542) {
        E e = this.method_25336();
        if (e != class046542 && e instanceof class01295) {
            class01295 class012952 = (class01295)e;
            class012952.method_25395(null);
        }
        super.method_25395(class046542);
        int n = this.field_22739.indexOf(class046542);
        if (n >= 0) {
            class01202 class012022 = (class01202)this.field_22739.get(n);
            this.method_25313(class012022);
        }
    }

    public Optional<class04654> method_19355(double d, double d2) {
        return Optional.ofNullable(this.method_25308(d, d2));
    }

    private List wrapOperation$edp000$yet_another_config_lib_v3$modifyChildrenCall(class01212 class012122, Operation operation) {
        return this.method_25396();
    }

    public @Nullable E method_25334() {
        return this.field_22751;
    }

    public @Nullable E method_25336() {
        return (E)((class01202)super.method_25399());
    }

    public void method_57712(int n, class03686 class036862) {
        this.method_57714(n, class036862.u(), class036862.L());
    }

    public void method_44382(double d) {
        super.method_44382(d);
        this.method_73367();
    }

    public void method_48579(class01054 class010542, int n, int n2, float f) {
        this.field_33780 = this.method_25405(n, n2) ? this.method_25308(n, n2) : null;
        this.method_57715(class010542);
        this.method_49603(class010542);
        this.method_25311(class010542, n, n2, f);
        class010542.R();
        this.method_57713(class010542);
        this.method_44396(class010542, n, n2);
    }

    public int method_73370(E e, int n) {
        ((class01202)e).method_46421(this.method_25342());
        ((class01202)e).method_73381(this.method_25322());
        ((class01202)e).method_46419(this.method_73378());
        ((class01202)e).method_73383(n);
        this.field_22739.add(e);
        return this.field_22739.size() - 1;
    }

    public int method_25321(E e) {
        return this.method_73370(e, this.field_62109);
    }

    protected @Nullable E method_37019() {
        return this.field_33780;
    }

    private void method_73367() {
        int n = this.method_73376() - (int)this.method_44387();
        for (class01202 class012022 : this.field_22739) {
            class012022.method_46419(n);
            n += class012022.method_25364();
            class012022.method_46421(this.method_25342());
            class012022.method_73381(this.method_25322());
        }
    }

    protected void method_73374(E e) {
        this.field_22739.removeIf(class012023 -> class012023 != e);
        if (this.field_22751 != e) {
            this.method_25313(null);
        }
    }

    public void method_25314(Collection<E> collection) {
        this.method_25339();
        for (class01202 class012022 : collection) {
            this.method_25321(class012022);
        }
    }

    private int method_73376() {
        return this.method_46427() + 2;
    }

    public @Nullable E method_48199(class03249 class032492, Predicate<E> predicate, @Nullable E e) {
        int n;
        switch (class032492) {
            default: {
                throw new MatchException(null, null);
            }
            case field_41829: 
            case field_41828: {
                int n2 = 0;
                break;
            }
            case field_41826: {
                int n2 = -1;
                break;
            }
            case field_41827: {
                int n2 = n = 1;
            }
        }
        if (!this.method_25396().isEmpty() && n != 0) {
            class01212 class012122;
            int n3 = e == null ? (n > 0 ? 0 : this.method_25396().size() - 1) : this.method_25396().indexOf(e) + n;
            for (int i = n3; i >= 0 && i < this.wrapOperation$edp000$yet_another_config_lib_v3$modifyChildrenCall(class012122 = this, objectArray -> {
                WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)1, (String)"[net.minecraft.class_350]");
                return ((class01212)((Object)((Object)objectArray[0]))).field_22739;
            }).size(); i += n) {
                class01202 class012022 = (class01202)this.method_25396().get(i);
                if (!predicate.test(class012022)) continue;
                return (E)class012022;
            }
        }
        return null;
    }

    public int method_73378() {
        int n = this.method_73376() - (int)this.method_44387();
        for (class01202 class012022 : this.field_22739) {
            n += class012022.method_25364();
        }
        return n;
    }

    protected void method_37017(class03428 class034282, E e) {
        int n;
        List<E> list = this.method_25396();
        if (list.size() > 1 && (n = list.indexOf(e)) != -1) {
            class034282.N(class03457.field_33789, (class00392)class00392.N((String)"narrator.position.list", (Object[])new Object[]{n + 1, list.size()}));
        }
    }

    public void method_25339() {
        this.field_22739.clear();
        this.field_22751 = null;
    }

    public int method_25342() {
        return this.method_46426() + this.field_22758 / 2 - this.method_25322() / 2;
    }

    public void method_25313(@Nullable E e) {
        this.field_22751 = e;
        if (e != null) {
            boolean bl;
            boolean bl2 = ((class01202)e).method_73382() < this.method_46427();
            boolean bl3 = bl = ((class01202)e).method_73386() > this.method_55443();
            if (this.field_22740.Nc().y() || bl2 || bl) {
                this.method_73377(e);
            }
        }
    }

    protected void method_44399(E e) {
        this.method_73375(e, this.field_62109);
    }

    protected void method_73375(E e, int n) {
        double d = (double)this.method_44390() - this.method_44387();
        ((class01202)e).method_73383(n);
        this.field_22739.addFirst(e);
        this.method_73367();
        this.method_44382((double)this.method_44390() - d);
    }

    public int method_25322() {
        return 220;
    }

    protected void method_73372(Comparator<E> comparator) {
        this.field_22739.sort(comparator);
        this.method_73367();
    }

    protected int method_25340() {
        return this.method_25396().size();
    }

    protected void method_73377(E e) {
        int n;
        int n2 = ((class01202)e).method_46427() - this.method_46427() - 2;
        if (n2 < 0) {
            this.method_25309(n2);
        }
        if ((n = this.method_55443() - ((class01202)e).method_46427() - ((class01202)e).method_25364() - 2) < 0) {
            this.method_25309(-n);
        }
    }

    protected void method_73368(int n, int n2) {
        Collections.swap(this.field_22739, n, n2);
        this.method_73367();
        this.method_73377((class01202)this.field_22739.get(n2));
    }

    protected boolean method_73379() {
        return true;
    }

    void method_29621(class01202<E> class012022) {
        class012022.field_22752 = this;
    }

    private void method_25309(int n) {
        this.method_44382(this.method_44387() + (double)n);
    }

    protected void method_25324(E e) {
        int n = 0;
        for (class01202 class012022 : this.field_22739) {
            if (class012022 == e) {
                n += class012022.method_25364() / 2;
                break;
            }
            n += class012022.method_25364();
        }
        this.method_44382((double)n - (double)this.field_22759 / 2.0);
    }

    public void method_57714(int n, int n2, int n3) {
        this.method_73369(n, n2, 0, n3);
    }

    protected void method_44650(E e) {
        double d = (double)this.method_44390() - this.method_44387();
        this.method_25330(e);
        this.method_44382((double)this.method_44390() - d);
    }

    protected void method_49603(class01054 class010542) {
        class010542.L(this.method_46426(), this.method_46427(), this.method_55442(), this.method_55443());
    }

    protected void method_57715(class01054 class010542) {
        class01894 class018942 = (class03448)this.field_22740.T_3 == null ? field_49478 : field_49892;
        class010542.N(class08394.Na, class018942, this.method_46426(), this.method_46427(), (float)this.method_55442(), (float)(this.method_55443() + (int)this.method_44387()), this.method_25368(), this.method_25364(), 32, 32);
    }

    protected @Nullable E method_48197(class03249 class032492) {
        return (E)this.method_48198(class032492, class012022 -> true);
    }

    protected void method_44397(class01054 class010542, int n, int n2, float f, E e) {
        if (this.method_73379() && this.method_25334() == e) {
            int n3 = this.method_25370() ? -1 : -8355712;
            this.method_44398(class010542, e, n3);
        }
        ((class01202)e).method_25343(class010542, n, n2, Objects.equals(this.field_33780, e), f);
    }

    public int method_25319(int n) {
        class01202 class012022 = (class01202)this.field_22739.get(n);
        return class012022.method_46427() + class012022.method_25364();
    }

    public void method_25311(class01054 class010542, int n, int n2, float f) {
        for (class01202 class012022 : this.field_22739) {
            if (class012022.method_46427() + class012022.method_25364() < this.method_46427() || class012022.method_46427() > this.method_55443()) continue;
            this.method_44397(class010542, n, n2, f, class012022);
        }
    }

    protected int method_65507() {
        return this.method_31383() + 6 + 2;
    }

    public void method_73369(int n, int n2, int n3, int n4) {
        this.method_55445(n, n2);
        this.y(n3, n4);
        this.method_73367();
        if (this.method_25334() != null) {
            this.method_73377(this.method_25334());
        }
        this.method_65506();
    }

    protected @Nullable E method_48198(class03249 class032492, Predicate<E> predicate) {
        return this.method_48199(class032492, predicate, this.method_25334());
    }

    public /* synthetic */ class06202 getMinecraft() {
        return this.field_22740;
    }

    public int method_25337(int n) {
        return ((class01202)this.field_22739.get(n)).method_46427();
    }

    protected void method_73373(List<E> list) {
        list.forEach(this::method_25330);
    }

    public int method_44395() {
        int n = 0;
        for (class01202 class012022 : this.field_22739) {
            n += class012022.method_25364();
        }
        return n + 4;
    }

    protected double method_44393() {
        return (double)this.field_62109 / 2.0;
    }

    protected void method_57713(class01054 class010542) {
        class01894 class018942 = (class03448)this.field_22740.T_3 == null ? class05096.field_49895 : class05096.field_49897;
        class01894 class018943 = (class03448)this.field_22740.T_3 == null ? class05096.field_49896 : class05096.field_49898;
        class010542.N(class08394.Na, class018942, this.method_46426(), this.method_46427() - 2, 0.0f, 0.0f, this.method_25368(), 2, 32, 2);
        class010542.N(class08394.Na, class018943, this.method_46426(), this.method_55443(), 0.0f, 0.0f, this.method_25368(), 2, 32, 2);
    }

    public void method_25330(E e) {
        if (this.field_22739.remove(e)) {
            this.method_73367();
            if (e == this.method_25334()) {
                this.method_25313(null);
            }
        }
    }

    public int method_31383() {
        return this.method_25342() + this.method_25322();
    }

    public @Nullable E method_25308(double d, double d2) {
        for (class01202 class012022 : this.field_22739) {
            if (!class012022.method_25405(d, d2)) continue;
            return (E)class012022;
        }
        return null;
    }

    public void method_44398(class01054 class010542, E e, int n) {
        int n2 = ((class01202)e).method_46426();
        int n3 = ((class01202)e).method_46427();
        int n4 = n2 + ((class01202)e).method_25368();
        int n5 = n3 + ((class01202)e).method_25364();
        class010542.N(n2, n3, n4, n5, n);
        class010542.N(n2 + 1, n3 + 1, n4 - 1, n5 - 1, -16777216);
    }
}

