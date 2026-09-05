/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10514
 *  Nursultan.class10516
 *  Nursultan.class10517
 *  com.google.common.collect.ImmutableList
 *  de.maxhenkel.voicechat.gui.widgets.ImageButton
 *  de.maxhenkel.voicechat.voice.client.ClientManager
 *  de.maxhenkel.voicechat.voice.common.PlayerState
 *  javax.annotation.Nullable
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01056
 *  minecraft.class01590
 *  minecraft.class01631
 *  minecraft.class01683
 *  minecraft.class01883
 *  minecraft.class01894
 *  minecraft.class02566
 *  minecraft.class03409
 *  minecraft.class03434
 *  minecraft.class03749
 *  minecraft.class03933
 *  minecraft.class04141
 *  minecraft.class04453
 *  minecraft.class04654
 *  minecraft.class05096
 *  minecraft.class05216
 *  minecraft.class05220
 *  minecraft.class05362
 *  minecraft.class05729
 *  minecraft.class06202
 *  minecraft.class06478
 *  minecraft.class06541
 *  minecraft.class07529
 *  minecraft.class08394
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import Nursultan.class10514;
import Nursultan.class10516;
import Nursultan.class10517;
import com.google.common.collect.ImmutableList;
import de.maxhenkel.voicechat.gui.widgets.ImageButton;
import de.maxhenkel.voicechat.voice.client.ClientManager;
import de.maxhenkel.voicechat.voice.common.PlayerState;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Supplier;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01056;
import minecraft.class01590;
import minecraft.class01631;
import minecraft.class01683;
import minecraft.class01883;
import minecraft.class01894;
import minecraft.class02566;
import minecraft.class03409;
import minecraft.class03434;
import minecraft.class03749;
import minecraft.class03933;
import minecraft.class04141;
import minecraft.class04453;
import minecraft.class04654;
import minecraft.class05096;
import minecraft.class05216;
import minecraft.class05220;
import minecraft.class05362;
import minecraft.class05463;
import minecraft.class05470;
import minecraft.class05729;
import minecraft.class06202;
import minecraft.class06478;
import minecraft.class06541;
import minecraft.class07529;
import minecraft.class08394;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class05472
extends class05729<class05472> {
    private static final class01894 R = class01894.y((String)"icon/draft_report");
    private static final Duration M = Duration.ofMillis(500L);
    private static final class01883 B = new class01883(class01894.y((String)"social_interactions/report_button"), class01894.y((String)"social_interactions/report_button_disabled"), class01894.y((String)"social_interactions/report_button_highlighted"));
    private static final class01883 Z = new class01883(class01894.y((String)"social_interactions/mute_button"), class01894.y((String)"social_interactions/mute_button_highlighted"));
    private static final class01883 z = new class01883(class01894.y((String)"social_interactions/unmute_button"), class01894.y((String)"social_interactions/unmute_button_highlighted"));
    private final class06202 U;
    private final List<class06478> E;
    private final UUID W;
    private final String m;
    private final Supplier<class01631> P;
    private boolean s;
    private boolean T;
    private final boolean b;
    private boolean j;
    private final boolean v;
    @javax.annotation.Nullable
    private @Nullable class05362 n;
    private @Nullable class05362 t;
    @javax.annotation.Nullable
    private @Nullable class05362 G;
    private float l;
    private static final class00392 d = class00392.L((String)"gui.socialInteractions.status_hidden").N(class06541.field_1056);
    private static final class00392 w = class00392.L((String)"gui.socialInteractions.status_blocked").N(class06541.field_1056);
    private static final class00392 k = class00392.L((String)"gui.socialInteractions.status_offline").N(class06541.field_1056);
    private static final class00392 Y = class00392.L((String)"gui.socialInteractions.status_hidden_offline").N(class06541.field_1056);
    private static final class00392 Q = class00392.L((String)"gui.socialInteractions.status_blocked_offline").N(class06541.field_1056);
    private static final class00392 O = class00392.L((String)"gui.socialInteractions.tooltip.report.disabled");
    private static final class00392 g = class00392.L((String)"gui.socialInteractions.tooltip.hide");
    private static final class00392 I = class00392.L((String)"gui.socialInteractions.tooltip.show");
    private static final class00392 J = class00392.L((String)"gui.socialInteractions.tooltip.report");
    private static final int o = 24;
    private static final int q = 4;
    public static final int N = class02566.y((int)190, (int)0, (int)0, (int)0);
    private static final int K = 20;
    public static final int y = class02566.y((int)255, (int)74, (int)74, (int)74);
    public static final int L = class02566.y((int)255, (int)48, (int)48, (int)48);
    public static final int u = class02566.y((int)255, (int)255, (int)255, (int)255);
    public static final int i = class02566.y((int)140, (int)255, (int)255, (int)255);
    private static final class01894 V = class01894.N((String)"voicechat", (String)"icons/invite_button");
    private static final Duration e = Duration.ofMillis(500L);
    private ImageButton H;
    private boolean c;

    public Supplier<class01631> L() {
        return this.P;
    }

    private void L(boolean bl) {
        this.t.field_22764 = bl;
        this.n.field_22764 = !bl;
        this.E.set(0, (class06478)(bl ? this.t : this.n));
    }

    public class05472(class06202 class062022, class05470 class054702, UUID uUID, String string, Supplier<class01631> supplier, boolean bl) {
        boolean bl2;
        this.U = class062022;
        this.W = uUID;
        this.m = string;
        this.P = supplier;
        class03409 class034092 = class062022.R();
        this.b = class034092.N().N();
        this.v = bl;
        this.N(class034092);
        class05216 class052162 = class00392.N((String)"gui.socialInteractions.narration.hide", (Object[])new Object[]{string});
        class05216 class052163 = class00392.N((String)"gui.socialInteractions.narration.show", (Object[])new Object[]{string});
        class05463 class054632 = class062022.yv();
        boolean bl3 = class062022.b().N(class062022.q());
        boolean bl4 = bl2 = !((class04453)class062022.T_4).method_5667().equals(uUID);
        if (class07529.Nu || bl2 && bl3 && !class054632.i(uUID)) {
            this.G = new class10517(this, 0, 0, 20, 20, B, class053622 -> class034092.N(class062022, (class05096)class054702, () -> class062022.N((class05096)new class03749((class05096)class054702, class034092, this)), false), (class00392)class00392.L((String)"gui.socialInteractions.report"));
            this.G.field_22763 = this.b;
            this.G.method_47400(this.Z());
            this.G.method_47402(M);
            this.n = new class10514(this, 0, 0, 20, 20, Z, class053622 -> {
                class054632.N(uUID);
                this.N(true, (class00392)class00392.N((String)"gui.socialInteractions.hidden_in_chat", (Object[])new Object[]{string}));
            }, (class00392)class00392.L((String)"gui.socialInteractions.hide"));
            this.n.method_47400(class04141.N((class00392)g, (class00392)class052162));
            this.n.method_47402(M);
            this.t = new class10516(this, 0, 0, 20, 20, z, class053622 -> {
                class054632.y(uUID);
                this.N(false, (class00392)class00392.N((String)"gui.socialInteractions.shown_in_chat", (Object[])new Object[]{string}));
            }, (class00392)class00392.L((String)"gui.socialInteractions.show"));
            this.t.method_47400(class04141.N((class00392)I, (class00392)class052163));
            this.t.method_47402(M);
            this.E = new ArrayList<class06478>();
            this.E.add((class06478)this.n);
            this.E.add((class06478)this.G);
            this.L(class054632.u(this.W));
        } else {
            this.E = ImmutableList.of();
        }
        this.N(class062022, class054702, uUID, string, supplier, bl, null);
    }

    private class04141 Z() {
        if (!this.b) {
            return class04141.N((class00392)O);
        }
        return class04141.N((class00392)J, (class00392)class00392.N((String)"gui.socialInteractions.narration.report", (Object[])new Object[]{this.m}));
    }

    public boolean i() {
        return this.T;
    }

    private boolean U() {
        PlayerState playerState = ClientManager.getPlayerStateManager().getState(this.W);
        if (playerState == null) {
            return false;
        }
        return !playerState.hasGroup();
    }

    private class00392 z() {
        boolean bl = this.U.yv().u(this.W);
        boolean bl2 = this.U.yv().i(this.W);
        if (bl2 && this.s) {
            return Q;
        }
        if (bl && this.s) {
            return Y;
        }
        if (bl2) {
            return w;
        }
        if (bl) {
            return d;
        }
        if (this.s) {
            return k;
        }
        return class05220.N;
    }

    public boolean u() {
        return this.s;
    }

    public void y(boolean bl) {
        this.T = bl;
    }

    public UUID y() {
        return this.W;
    }

    private void N(class06202 class062022, class05470 class054702, UUID uUID, String string, Supplier supplier, boolean bl, CallbackInfo callbackInfo) {
        if (this.E instanceof ArrayList) {
            this.H = new ImageButton(0, 0, V, imageButton -> {
                ((class01683)((class04453)class062022.T_4).y_0).u("voicechat invite %s".formatted(new Object[]{this.m}));
                this.c = true;
            });
            this.H.method_47400(class04141.N((class00392)class00392.N((String)"message.voicechat.invite_player", (Object[])new Object[]{this.m})));
            this.H.method_47402(e);
            this.E.add((class06478)this.H);
        }
    }

    private void N(class01054 class010542, int n, int n2, boolean bl, float f, CallbackInfo callbackInfo) {
        if (this.H != null && this.n != null && this.G != null) {
            if (ClientManager.getPlayerStateManager().getGroupID() == null || !this.U()) {
                this.H.field_22764 = false;
                return;
            }
            this.H.field_22764 = true;
            this.H.field_22763 = !this.c;
            this.H.y(this.method_73380() + (this.method_73387() - this.n.method_25368() - 4 - this.G.method_25368() - 4) - this.H.method_25368() - 4, this.method_73382() + (this.method_73384() - this.H.method_25364()) / 2);
            this.H.method_25394(class010542, n, n2, f);
        }
    }

    public void N(class03409 class034092) {
        this.j = class034092.N(this.W);
    }

    public String N() {
        return this.m;
    }

    public void N(boolean bl) {
        this.s = bl;
    }

    public class05216 N(class05216 class052162) {
        class00392 class003922 = this.z();
        if (class003922 == class05220.N) {
            return class00392.y((String)this.m).i(", ").y((class00392)class052162);
        }
        return class00392.y((String)this.m).i(", ").y(class003922).i(", ").y((class00392)class052162);
    }

    private void N(boolean bl, class00392 class003922) {
        this.L(bl);
        ((class01056)this.U.i_6).i().N(class003922);
        this.U.NT().u(class003922);
    }

    public List<? extends class04654> method_25396() {
        return this.E;
    }

    public boolean R() {
        return this.v;
    }

    public List<? extends class03434> method_37025() {
        return this.E;
    }

    public void method_25343(class01054 class010542, int n, int n2, boolean bl, float f) {
        int n3;
        int n4 = this.method_73380() + 4;
        int n5 = this.method_73382() + (this.method_73384() - 24) / 2;
        int n6 = n4 + 24 + 4;
        class00392 class003922 = this.z();
        if (class003922 == class05220.N) {
            class010542.N(this.method_73380(), this.method_73382(), this.method_73389(), this.method_73386(), y);
            int n7 = this.method_73382();
            int n8 = this.method_73384();
            Objects.requireNonNull((class01590)this.U.i_3);
            n3 = n7 + (n8 - 9) / 2;
        } else {
            class010542.N(this.method_73380(), this.method_73382(), this.method_73389(), this.method_73386(), L);
            int n9 = this.method_73382();
            int n10 = this.method_73384();
            Objects.requireNonNull((class01590)this.U.i_3);
            Objects.requireNonNull((class01590)this.U.i_3);
            n3 = n9 + (n10 - (9 + 9)) / 2;
            class010542.y((class01590)this.U.i_3, class003922, n6, n3 + 12, i);
        }
        class03933.N((class01054)class010542, (class01631)this.P.get(), (int)n4, (int)n5, (int)24);
        class010542.y((class01590)this.U.i_3, this.m, n6, n3, u);
        if (this.s) {
            class010542.N(n4, n5, n4 + 24, n5 + 24, N);
        }
        if (this.n != null && this.t != null && this.G != null) {
            float f2 = this.l;
            this.n.method_46421(this.method_73380() + (this.method_73387() - this.n.method_25368() - 4) - 20 - 4);
            this.n.method_46419(this.method_73382() + (this.method_73384() - this.n.method_25364()) / 2);
            this.n.method_25394(class010542, n, n2, f);
            this.t.method_46421(this.method_73380() + (this.method_73387() - this.t.method_25368() - 4) - 20 - 4);
            this.t.method_46419(this.method_73382() + (this.method_73384() - this.t.method_25364()) / 2);
            this.N(class010542, n, n2, bl, f, null);
            this.t.method_25394(class010542, n, n2, f);
            this.G.method_46421(this.method_73380() + (this.method_73387() - this.t.method_25368() - 4));
            this.G.method_46419(this.method_73382() + (this.method_73384() - this.t.method_25364()) / 2);
            this.G.method_25394(class010542, n, n2, f);
            if (f2 == this.l) {
                this.l = 0.0f;
            }
        }
        if (this.j && this.G != null) {
            class010542.N(class08394.Na, R, this.G.method_46426() + 5, this.G.method_46427() + 1, 15, 15);
        }
    }
}

