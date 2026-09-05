/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class03289
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04803
 *  minecraft.class06584
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07299
 *  minecraft.class08299
 *  minecraft.class08329
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class02131;
import minecraft.class02154;
import minecraft.class03289;
import minecraft.class03662;
import minecraft.class03666;
import minecraft.class03688;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04803;
import minecraft.class06584;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07299;
import minecraft.class08299;
import minecraft.class08329;
import org.jspecify.annotations.Nullable;

public class class03694
extends class03688 {
    private static final String s = "item";
    private static final String T = "item_display";
    private static final class02131<class06584> b = class03289.N(class03694.class, (class04383)class02154.B);
    private static final class02131<Byte> j = class03289.N(class03694.class, (class04383)class02154.N);
    private final class04803 v = class04803.N(this::s, this::N);
    private @Nullable class03666 n;

    public final class03662 T() {
        return class03662.field_42469.apply(((Byte)this.field_6011.N(j)).byteValue());
    }

    public @Nullable class04803 method_32318(int n) {
        if (n == 0) {
            return this.v;
        }
        return null;
    }

    @Override
    public void method_5674(class02131<?> class021312) {
        super.method_5674(class021312);
        if (b.equals(class021312) || j.equals(class021312)) {
            this.P = true;
        }
    }

    @Override
    protected void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(b, (Object)class06584.E);
        class042932.N(j, (Object)class03662.field_4315.N());
    }

    @Override
    protected void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class06584 class065842 = this.s();
        if (!class065842.R()) {
            class083292.N(s, class06584.y, (Object)class065842);
        }
        class083292.N(T, class03662.field_42468, (Object)this.T());
    }

    @Override
    protected void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.N(class082992.N(s, class06584.y).orElse(class06584.E));
        this.N(class082992.N(T, class03662.field_42468).orElse(class03662.field_4315));
    }

    public class03694(class07078<?> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    public @Nullable class03666 b() {
        return this.n;
    }

    public final class06584 s() {
        return (class06584)this.field_6011.N(b);
    }

    public final void N(class03662 class036622) {
        this.field_6011.N(j, (Object)class036622.N());
    }

    @Override
    protected void N(boolean bl, float f) {
        class06584 class065842 = this.s();
        class065842.N((class07049)this);
        this.n = new class03666(class065842, this.T());
    }

    public final void N(class06584 class065842) {
        this.field_6011.N(b, (Object)class065842);
    }
}

