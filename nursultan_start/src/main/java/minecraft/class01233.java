/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09444
 *  com.google.common.collect.Lists
 *  minecraft.class00753
 *  minecraft.class01219
 *  minecraft.class02610
 *  minecraft.class04995
 *  minecraft.class05163
 *  minecraft.class06069
 *  minecraft.class06993
 *  minecraft.class07111
 *  minecraft.class07209
 *  minecraft.class07536
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class09444;
import com.google.common.collect.Lists;
import java.util.List;
import minecraft.class00753;
import minecraft.class01219;
import minecraft.class02610;
import minecraft.class04995;
import minecraft.class05163;
import minecraft.class06069;
import minecraft.class06993;
import minecraft.class07111;
import minecraft.class07209;
import minecraft.class07536;
import org.jspecify.annotations.Nullable;

public class class01233 {
    private class07111 N = class07111.field_11302;
    private class06993 y = class06993.field_11467;
    private class07209 L = class07209.field_10980;
    private boolean u;
    private @Nullable class05163 i;
    private class02610 R = class02610.field_52238;
    private @Nullable class06069 M;
    private int B;
    private final List<class01219> Z = Lists.newArrayList();
    private boolean z;
    private boolean U;

    public class07111 L() {
        return this.N;
    }

    public class01233 L(boolean bl) {
        this.U = bl;
        return this;
    }

    public @Nullable class05163 M() {
        return this.i;
    }

    public boolean B() {
        return this.z;
    }

    public List<class01219> Z() {
        return this.Z;
    }

    public class07209 i() {
        return this.L;
    }

    public boolean U() {
        return this.U;
    }

    public boolean z() {
        return this.R == class02610.field_52238;
    }

    public class06993 u() {
        return this.y;
    }

    public class01233 y(class01219 class012192) {
        this.Z.remove(class012192);
        return this;
    }

    public class01233 y() {
        this.Z.clear();
        return this;
    }

    public class01233 y(boolean bl) {
        this.z = bl;
        return this;
    }

    public class06069 y(@Nullable class07209 class072092) {
        if (this.M != null) {
            return this.M;
        }
        if (class072092 == null) {
            return class06069.y((long)class07536.L());
        }
        return class06069.y((long)class04995.N((class00753)class072092));
    }

    public class01233 N(class06993 class069932) {
        this.y = class069932;
        return this;
    }

    public class01233 N(class07111 class071112) {
        this.N = class071112;
        return this;
    }

    public class01233 N(class02610 class026102) {
        this.R = class026102;
        return this;
    }

    public class09444 N(List<class09444> list, @Nullable class07209 class072092) {
        int n = list.size();
        if (n == 0) {
            throw new IllegalStateException("No palettes");
        }
        return list.get(this.y(class072092).y(n));
    }

    public class01233 N() {
        class01233 class012332 = new class01233();
        class012332.N = this.N;
        class012332.y = this.y;
        class012332.L = this.L;
        class012332.u = this.u;
        class012332.i = this.i;
        class012332.R = this.R;
        class012332.M = this.M;
        class012332.B = this.B;
        class012332.Z.addAll(this.Z);
        class012332.z = this.z;
        class012332.U = this.U;
        return class012332;
    }

    public class01233 N(class01219 class012192) {
        this.Z.add(class012192);
        return this;
    }

    public class01233 N(@Nullable class06069 class060692) {
        this.M = class060692;
        return this;
    }

    public class01233 N(class05163 class051632) {
        this.i = class051632;
        return this;
    }

    public class01233 N(boolean bl) {
        this.u = bl;
        return this;
    }

    public class01233 N(class07209 class072092) {
        this.L = class072092;
        return this;
    }

    public boolean R() {
        return this.u;
    }
}

