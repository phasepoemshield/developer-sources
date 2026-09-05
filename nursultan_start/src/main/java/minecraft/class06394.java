/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  minecraft.class00042
 *  minecraft.class00381
 *  minecraft.class00490
 *  minecraft.class00493
 *  minecraft.class00497
 *  minecraft.class00502
 *  minecraft.class00518
 *  minecraft.class01766
 *  minecraft.class01772
 *  minecraft.class01785
 *  minecraft.class01890
 *  minecraft.class02565
 *  minecraft.class02724
 *  minecraft.class02796
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class06642
 *  minecraft.class06645
 *  minecraft.class06676
 *  minecraft.class06679
 *  minecraft.class06683
 *  minecraft.class08049
 *  minecraft.class08091
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import minecraft.class00042;
import minecraft.class00381;
import minecraft.class00490;
import minecraft.class00493;
import minecraft.class00497;
import minecraft.class00502;
import minecraft.class00518;
import minecraft.class01766;
import minecraft.class01772;
import minecraft.class01785;
import minecraft.class01890;
import minecraft.class02565;
import minecraft.class02724;
import minecraft.class02796;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class06642;
import minecraft.class06645;
import minecraft.class06676;
import minecraft.class06679;
import minecraft.class06683;
import minecraft.class08049;
import minecraft.class08091;
import org.jspecify.annotations.Nullable;

public class class06394
extends class06683 {
    private final class02796 y;
    private final Set<class00518> L = Sets.newHashSet();
    private boolean u;

    public void L(class01766 class017662) {
        super.L(class017662);
        this.y.Nm().N((class00381)new class01785(class017662.method_5820(), null));
        this.z();
    }

    public void L(class00518 class005182) {
        super.L(class005182);
        this.z();
    }

    public void L(class00502 class005022) {
        super.L(class005022);
        this.y.Nm().N((class00381)class02565.N((class00502)class005022, (boolean)false));
        this.i(class005022);
        this.z();
    }

    public void M(class00518 class005182) {
        List<class00381<?>> var2 = this.R(class005182);
        for (class04770 class047702 : this.y.Nm().v()) {
            for (class00381<?> var6 : var2) {
                class047702.field_13987.method_14364(var6);
            }
        }
        this.L.add(class005182);
    }

    public class06394(class02796 class027962) {
        this.y = class027962;
    }

    public List<class00381<?>> B(class00518 class005182) {
        ArrayList arrayList = Lists.newArrayList();
        arrayList.add(new class08091(class005182, 1));
        for (class01890 class018902 : class01890.values()) {
            if (this.N(class018902) != class005182) continue;
            arrayList.add(new class06642(class018902, class005182));
        }
        return arrayList;
    }

    public void Z(class00518 class005182) {
        List<class00381<?>> var2 = this.B(class005182);
        for (class04770 class047702 : this.y.Nm().v()) {
            for (class00381<?> var6 : var2) {
                class047702.field_13987.method_14364(var6);
            }
        }
        this.L.remove(class005182);
    }

    public void i(class00518 class005182) {
        super.i(class005182);
        if (this.L.contains(class005182)) {
            this.Z(class005182);
        }
        this.z();
    }

    public void i(class01766 class017662, class00518 class005182) {
        super.i(class017662, class005182);
        if (this.L.contains(class005182)) {
            this.y.Nm().N((class00381)new class01785(class017662.method_5820(), class005182.L()));
        }
        this.z();
    }

    private void i(class00502 class005022) {
        for (class04782 class047822 : this.y.NO()) {
            class005022.B().stream().map(string -> this.y.Nm().N(string)).filter(Objects::nonNull).forEach(class047702 -> class047822.method_70636().u((class00042)class047702));
        }
    }

    private class06645 U() {
        return new class06645(this.B(), this.R(), this.Z(), this.M());
    }

    protected void z() {
        this.u = true;
    }

    public int z(class00518 class005182) {
        int n = 0;
        for (class01890 class018902 : class01890.values()) {
            if (this.N(class018902) != class005182) continue;
            ++n;
        }
        return n;
    }

    public void u(class00502 class005022) {
        super.u(class005022);
        this.y.Nm().N((class00381)class02565.N((class00502)class005022));
        this.i(class005022);
        this.z();
    }

    public void u(class01766 class017662, class00518 class005182) {
        super.u(class017662, class005182);
        this.z();
    }

    public void u(class00518 class005182) {
        super.u(class005182);
        if (this.L.contains(class005182)) {
            this.y.Nm().N((class00381)new class08091(class005182, 2));
        }
        this.z();
    }

    public void y(String string, class00502 class005022) {
        super.y(string, class005022);
        this.y.Nm().N((class00381)class02565.N((class00502)class005022, (String)string, (class02724)class02724.field_29156));
        this.R(string);
        this.z();
    }

    public void y(class00502 class005022) {
        super.y(class005022);
        this.y.Nm().N((class00381)class02565.N((class00502)class005022, (boolean)true));
        this.z();
    }

    public void N(class06645 class066452) {
        class066452.N().forEach(class004932 -> this.N((class00493)class004932));
        class066452.y().forEach(class066792 -> this.N((class06679)class066792));
        class066452.L().forEach((class018902, string) -> {
            class00518 class005182 = this.N((String)string);
            this.N((class01890)class018902, class005182);
        });
        class066452.u().forEach(class004972 -> this.N((class00497)class004972));
    }

    public void N(class01766 class017662, class00518 class005182, class00490 class004902) {
        super.N(class017662, class005182, class004902);
        if (this.L.contains(class005182)) {
            this.y.Nm().N((class00381)new class08049(class017662.method_5820(), class005182.L(), class004902.y(), Optional.ofNullable(class004902.u()), Optional.ofNullable(class004902.i())));
        }
        this.z();
    }

    public void N(class06676 class066762) {
        if (this.u) {
            this.u = false;
            class066762.N(this.U());
        }
    }

    public boolean N(String string, class00502 class005022) {
        if (super.N(string, class005022)) {
            this.y.Nm().N((class00381)class02565.N((class00502)class005022, (String)string, (class02724)class02724.field_29155));
            this.R(string);
            this.z();
            return true;
        }
        return false;
    }

    public void N(class01890 class018902, @Nullable class00518 class005182) {
        class00518 class005183 = this.N(class018902);
        super.N(class018902, class005182);
        if (class005183 != class005182 && class005183 != null) {
            if (this.z(class005183) > 0) {
                this.y.Nm().N((class00381)new class06642(class018902, class005182));
            } else {
                this.Z(class005183);
            }
        }
        if (class005182 != null) {
            if (this.L.contains(class005182)) {
                this.y.Nm().N((class00381)new class06642(class018902, class005182));
            } else {
                this.M(class005182);
            }
        }
        this.z();
    }

    private void R(String string) {
        class04770 class047702 = this.y.Nm().N(string);
        if (class047702 != null) {
            class047702.method_51469().method_70636().u((class00042)class047702);
        }
    }

    public List<class00381<?>> R(class00518 class005182) {
        ArrayList arrayList = Lists.newArrayList();
        arrayList.add(new class08091(class005182, 0));
        for (class01890 class018902 : class01890.values()) {
            if (this.N(class018902) != class005182) continue;
            arrayList.add(new class06642(class018902, class005182));
        }
        for (class01772 class017722 : this.N(class005182)) {
            arrayList.add(new class08049(class017722.L(), class005182.L(), class017722.u(), Optional.ofNullable(class017722.i()), Optional.ofNullable(class017722.R())));
        }
        return arrayList;
    }
}

