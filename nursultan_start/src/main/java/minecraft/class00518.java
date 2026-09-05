/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00390
 *  minecraft.class00392
 *  minecraft.class00395
 *  minecraft.class00401
 *  minecraft.class00493
 *  minecraft.class01762
 *  minecraft.class06640
 *  minecraft.class06675
 *  minecraft.class06683
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Objects;
import java.util.Optional;
import minecraft.class00390;
import minecraft.class00392;
import minecraft.class00395;
import minecraft.class00401;
import minecraft.class00493;
import minecraft.class01762;
import minecraft.class06640;
import minecraft.class06675;
import minecraft.class06683;
import org.jspecify.annotations.Nullable;

public class class00518 {
    private final class06683 N;
    private final String y;
    private final class06675 L;
    private class00392 u;
    private class00392 i;
    private class06640 R;
    private boolean M;
    private @Nullable class01762 B;

    public String L() {
        return this.y;
    }

    public @Nullable class01762 M() {
        return this.B;
    }

    public class00518(class06683 class066832, String string, class06675 class066752, class00392 class003922, class06640 class066402, boolean bl, @Nullable class01762 class017622) {
        this.N = class066832;
        this.y = string;
        this.L = class066752;
        this.u = class003922;
        this.i = this.z();
        this.R = class066402;
        this.M = bl;
        this.B = class017622;
    }

    public class00392 B() {
        return this.i;
    }

    public class06640 Z() {
        return this.R;
    }

    public class00392 i() {
        return this.u;
    }

    private class00392 z() {
        return class00390.N((class00392)this.u.L().N(class004052 -> class004052.N((class00395)new class00401((class00392)class00392.y((String)this.y)))));
    }

    public class06675 u() {
        return this.L;
    }

    public void y(@Nullable class01762 class017622) {
        this.B = class017622;
        this.N.u(this);
    }

    public class06683 y() {
        return this.N;
    }

    public void N(class06640 class066402) {
        this.R = class066402;
        this.N.u(this);
    }

    public void N(boolean bl) {
        this.M = bl;
        this.N.u(this);
    }

    public class00493 N() {
        return new class00493(this.y, this.L, this.u, this.R, this.M, Optional.ofNullable(this.B));
    }

    public class01762 N(class01762 class017622) {
        return Objects.requireNonNullElse(this.B, class017622);
    }

    public void N(class00392 class003922) {
        this.u = class003922;
        this.i = this.z();
        this.N.u(this);
    }

    public boolean R() {
        return this.M;
    }
}

