/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class00580
 *  minecraft.class00937
 *  minecraft.class01590
 *  minecraft.class03660
 *  minecraft.class03682
 *  minecraft.class04222
 *  minecraft.class05482
 *  minecraft.class07536
 */
package minecraft;

import java.util.Objects;
import java.util.OptionalInt;
import minecraft.class00392;
import minecraft.class00580;
import minecraft.class00937;
import minecraft.class01590;
import minecraft.class03660;
import minecraft.class03682;
import minecraft.class04222;
import minecraft.class05482;
import minecraft.class07536;

public class class04230
extends class03660 {
    private OptionalInt N = OptionalInt.empty();
    private OptionalInt y = OptionalInt.empty();
    private final class03682<class04222, class05482> L = class07536.N(class042222 -> {
        if (class042222.L().isPresent()) {
            return class05482.N((class01590)class015902, (int)class042222.y(), (int)class042222.L().getAsInt(), (class00392[])new class00392[]{class042222.N()});
        }
        return class05482.N((class01590)class015902, (class00392)class042222.N(), (int)class042222.y());
    });
    private boolean u = false;

    protected int L() {
        return this.method_46427();
    }

    public class04230(class00392 class003922, class01590 class015902) {
        this(0, 0, class003922, class015902);
    }

    public class04230(int n, int n2, class00392 class003922, class01590 class015902) {
        super(n, n2, 0, 0, class003922, class015902);
        this.field_22763 = false;
    }

    private class04222 u() {
        return new class04222(this.method_25369(), this.N.orElse(Integer.MAX_VALUE), this.y);
    }

    protected int y() {
        return this.method_46426();
    }

    public class04230 y(int n) {
        this.y = OptionalInt.of(n);
        return this;
    }

    public void N(class00580 class005802) {
        class05482 class054822 = (class05482)this.L.N((Object)this.u());
        int n = this.y();
        int n2 = this.L();
        Objects.requireNonNull(this.Z());
        int n3 = 9;
        if (this.u) {
            int n4 = this.method_46426() + this.method_25368() / 2;
            class054822.N(class00937.field_62010, n4, n2, n3, class005802);
        } else {
            class054822.N(class00937.field_62009, n, n2, n3, class005802);
        }
    }

    public class04230 N(int n) {
        this.N = OptionalInt.of(n);
        return this;
    }

    public class04230 N(boolean bl) {
        this.u = bl;
        return this;
    }

    public int method_25364() {
        int n = ((class05482)this.L.N((Object)this.u())).N();
        Objects.requireNonNull(this.Z());
        return n * 9;
    }

    public int method_25368() {
        return ((class05482)this.L.N((Object)this.u())).y();
    }
}

