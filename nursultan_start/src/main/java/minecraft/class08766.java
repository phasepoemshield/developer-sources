/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01237
 *  minecraft.class01384
 *  minecraft.class01421
 *  minecraft.class01422
 *  minecraft.class01540
 *  minecraft.class03255
 *  minecraft.class03386
 *  minecraft.class04790
 *  minecraft.class06202
 *  minecraft.class08133
 *  minecraft.class08650
 *  minecraft.class08651
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Objects;
import minecraft.class01237;
import minecraft.class01384;
import minecraft.class01421;
import minecraft.class01422;
import minecraft.class01540;
import minecraft.class03255;
import minecraft.class03386;
import minecraft.class04790;
import minecraft.class06202;
import minecraft.class08133;
import minecraft.class08650;
import minecraft.class08651;
import minecraft.class08672;
import minecraft.class08763;
import minecraft.class08778;
import org.jspecify.annotations.Nullable;

public class class08766
extends class08672<class08778> {
    private boolean y;
    private @Nullable Object L;

    public boolean L() {
        return this.y;
    }

    public class08766(class01422 class014222) {
        super(class014222);
    }

    public void i() {
        this.L = null;
    }

    public void u() {
        this.y = false;
    }

    @Override
    protected String y() {
        return "oversized_item";
    }

    @Override
    protected float N(int n, int n2) {
        return (float)n / 2.0f;
    }

    @Override
    public Class<class08778> N() {
        return class08778.class;
    }

    @Override
    protected void N(class08778 class087782, class01421 class014212) {
        class014212.y(1.0f, -1.0f, -1.0f);
        class08650 class086502 = class087782.y();
        class03255 class032552 = class086502.M();
        Objects.requireNonNull(class032552);
        float f = (float)(class032552.u() + class032552.i()) / 2.0f;
        float f2 = (float)(class032552.y() + class032552.L()) / 2.0f;
        float f3 = (float)class086502.u() + 8.0f;
        float f4 = (float)class086502.i() + 8.0f;
        class014212.N((f3 - f) / 16.0f, (f2 - f4) / 16.0f, 0.0f);
        class08763 class087632 = class086502.L();
        if (!class087632.R()) {
            ((class03386)class06202.Nq().i_5).v().N(class01540.field_60026);
        } else {
            ((class03386)class06202.Nq().i_5).v().N(class01540.field_60027);
        }
        class08133 class081332 = ((class03386)class06202.Nq().i_5).L();
        class04790 class047902 = class081332.L();
        class087632.N(class014212, (class01237)class047902, 0xF000F0, class01384.u, 0);
        class081332.N();
        this.L = class087632.Z();
    }

    @Override
    public void N(class08778 class087782, class08651 class086512) {
        super.N(class087782, class086512);
        this.y = true;
    }

    @Override
    public boolean N(class08778 class087782) {
        class08763 class087632 = class087782.y().L();
        return !class087632.u() && class087632.Z().equals(this.L);
    }
}

