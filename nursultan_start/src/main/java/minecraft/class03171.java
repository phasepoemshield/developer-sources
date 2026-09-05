/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10153
 *  minecraft.class01424
 *  minecraft.class06995
 *  minecraft.class06997
 *  minecraft.class07001
 *  minecraft.class07009
 *  minecraft.class07019
 *  minecraft.class07029
 *  minecraft.class07037
 *  minecraft.class07707
 *  minecraft.class07709
 *  minecraft.class07720
 *  minecraft.class07729
 *  minecraft.class07730
 *  minecraft.class07741
 *  minecraft.class07757
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10153;
import java.util.ArrayDeque;
import java.util.Deque;
import minecraft.class01424;
import minecraft.class03153;
import minecraft.class03154;
import minecraft.class03166;
import minecraft.class03169;
import minecraft.class03175;
import minecraft.class03184;
import minecraft.class06995;
import minecraft.class06997;
import minecraft.class07001;
import minecraft.class07009;
import minecraft.class07019;
import minecraft.class07029;
import minecraft.class07037;
import minecraft.class07707;
import minecraft.class07709;
import minecraft.class07720;
import minecraft.class07729;
import minecraft.class07730;
import minecraft.class07741;
import minecraft.class07757;
import org.jspecify.annotations.Nullable;

public class class03171
implements class03175 {
    private final Deque<class03169> N = new ArrayDeque<class03169>();

    private void L(class01424<?> class014242) {
        if (class014242 == class07741.N) {
            this.N.addLast(new class03184());
        } else if (class014242 == class07001.y) {
            this.N.addLast(new class03166());
        }
    }

    public class03171() {
        this.N.addLast((class03169)new class10153());
    }

    protected int i() {
        return this.N.size() - 1;
    }

    public @Nullable class07709 u() {
        return this.N.getFirst().N();
    }

    @Override
    public class03153 y(class01424<?> class014242, int n) {
        this.L(class014242);
        return class03153.field_36248;
    }

    @Override
    public class03154 y(class01424<?> class014242) {
        this.L(class014242);
        return class03154.field_36253;
    }

    @Override
    public class03154 y() {
        class07709 class077092 = this.N.removeLast().N();
        if (class077092 != null) {
            this.N.getLast().N(class077092);
        }
        return class03154.field_36253;
    }

    @Override
    public class03153 N(class01424<?> class014242) {
        return class03153.field_36248;
    }

    @Override
    public class03154 N(String string) {
        this.N((class07709)class07707.N((String)string));
        return class03154.field_36253;
    }

    @Override
    public class03154 N(class01424<?> class014242, int n) {
        return class03154.field_36253;
    }

    @Override
    public class03154 N(long[] lArray) {
        this.N((class07709)new class07757(lArray));
        return class03154.field_36253;
    }

    @Override
    public class03154 N(double d) {
        this.N((class07709)class07019.N((double)d));
        return class03154.field_36253;
    }

    private void N(class07709 class077092) {
        this.N.getLast().N(class077092);
    }

    @Override
    public class03154 N() {
        this.N((class07709)class06997.y);
        return class03154.field_36253;
    }

    @Override
    public class03153 N(class01424<?> class014242, String string) {
        this.N.getLast().N(string);
        this.L(class014242);
        return class03153.field_36248;
    }

    @Override
    public class03154 N(float f) {
        this.N((class07709)class07009.N((float)f));
        return class03154.field_36253;
    }

    @Override
    public class03154 N(long l) {
        this.N((class07709)class07729.N((long)l));
        return class03154.field_36253;
    }

    @Override
    public class03154 N(int n) {
        this.N((class07709)class07720.N((int)n));
        return class03154.field_36253;
    }

    @Override
    public class03154 N(short s) {
        this.N((class07709)class07730.N((short)s));
        return class03154.field_36253;
    }

    @Override
    public class03154 N(byte by) {
        this.N((class07709)class07037.N((byte)by));
        return class03154.field_36253;
    }

    @Override
    public class03154 N(byte[] byArray) {
        this.N((class07709)new class07029(byArray));
        return class03154.field_36253;
    }

    @Override
    public class03154 N(int[] nArray) {
        this.N((class07709)new class06995(nArray));
        return class03154.field_36253;
    }
}

