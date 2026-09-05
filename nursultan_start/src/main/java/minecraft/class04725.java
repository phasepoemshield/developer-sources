/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class01885
 *  minecraft.class02102
 *  minecraft.class03686
 *  minecraft.class03725
 *  minecraft.class04654
 *  minecraft.class04927
 *  minecraft.class04981
 *  minecraft.class05018
 *  minecraft.class05092
 *  minecraft.class05096
 *  minecraft.class05220
 *  minecraft.class05362
 *  minecraft.class05407
 *  minecraft.class06478
 *  minecraft.class07536
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class01885;
import minecraft.class02102;
import minecraft.class03686;
import minecraft.class03725;
import minecraft.class04654;
import minecraft.class04927;
import minecraft.class04981;
import minecraft.class05018;
import minecraft.class05092;
import minecraft.class05096;
import minecraft.class05220;
import minecraft.class05362;
import minecraft.class05407;
import minecraft.class06478;
import minecraft.class07536;
import org.jspecify.annotations.Nullable;

public class class04725
extends class05407 {
    private static final class00392 N = class00392.L((String)"mco.configure.world.buttons.invite");
    private static final class00392 y = class00392.L((String)"mco.configure.world.invite.profile.name").y(-6250336);
    private static final class00392 L = class00392.L((String)"mco.configure.world.players.inviting").y(-6250336);
    private static final class00392 u = class00392.L((String)"mco.configure.world.players.error").y(-65536);
    private static final class00392 i = class00392.L((String)"mco.configure.world.players.invite.duplicate").y(-65536);
    private final class03686 R = new class03686((class05096)this);
    private @Nullable class04927 M;
    private @Nullable class05362 B;
    private final class04981 Z;
    private final class05092 z;
    private @Nullable class00392 U;

    public class04725(class05092 class050922, class04981 class049812) {
        super(N);
        this.z = class050922;
        this.Z = class049812;
    }

    private void N(class00392 class003922) {
        this.U = class003922;
        this.field_22787.NT().u(class003922);
    }

    private void N() {
        if (this.B == null || this.M == null) {
            return;
        }
        if (class05018.B((String)this.M.method_1882())) {
            this.N(u);
            return;
        }
        if (this.Z.Z.stream().anyMatch(class049502 -> class049502.N.equalsIgnoreCase(this.M.method_1882()))) {
            this.N(i);
            return;
        }
        long l = this.Z.y;
        String string = this.M.method_1882().trim();
        this.B.field_22763 = false;
        this.M.method_1888(false);
        this.N(L);
        CompletableFuture.supplyAsync(() -> this.z.N(l, string), (Executor)class07536.Z()).thenAcceptAsync(bl -> {
            if (bl.booleanValue()) {
                this.field_22787.N((class05096)this.z);
            } else {
                this.N(u);
            }
            this.M.method_1888(true);
            this.B.field_22763 = true;
        }, this.field_44944);
    }

    public void method_25426() {
        this.R.N(N, this.field_22793);
        class01885 class018852 = (class01885)this.R.L((class02102)class01885.u().N(8));
        this.M = new class04927((class01590)this.field_22787.i_3, 200, 20, (class00392)class00392.L((String)"mco.configure.world.invite.profile.name"));
        class018852.N((class02102)class03725.N((class01590)this.field_22793, (class02102)this.M, (class00392)y));
        this.B = (class05362)class018852.N((class02102)class05362.method_46430((class00392)N, class053622 -> this.N()).N(200).N());
        this.R.y((class02102)class05362.method_46430((class00392)class05220.U, class053622 -> this.method_25419()).N(200).N());
        this.R.method_48206(class046542 -> {
            class06478 cfr_ignored_0 = (class06478)this.method_37063((class04654)class046542);
        });
        this.method_48640();
    }

    protected void method_56131() {
        if (this.M != null) {
            this.method_48265((class04654)this.M);
        }
    }

    public void method_48640() {
        this.R.N();
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        super.method_25394(class010542, n, n2, f);
        if (this.U != null && this.B != null) {
            class010542.N(this.field_22793, this.U, this.field_22789 / 2, this.B.method_46427() + this.B.method_25364() + 8, -1);
        }
    }

    public void method_25419() {
        this.field_22787.N((class05096)this.z);
    }
}

