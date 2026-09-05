/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.viaversion.viafabricplus.ViaFabricPlus
 *  com.viaversion.viafabricplus.features.networking.remove_signed_commands.SignedCommands1_21_6
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  java.lang.MatchException
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01557
 *  minecraft.class01683
 *  minecraft.class01894
 *  minecraft.class03443
 *  minecraft.class04453
 *  minecraft.class05096
 *  minecraft.class05153
 *  minecraft.class05216
 *  minecraft.class05630
 *  minecraft.class06202
 *  minecraft.class06541
 *  minecraft.class06601
 *  minecraft.class06613
 *  minecraft.class07282
 *  minecraft.class08394
 *  minecraft.class09008
 *  net.raphimc.vialegacy.api.LegacyProtocolVersion
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.google.common.collect.Lists;
import com.viaversion.viafabricplus.ViaFabricPlus;
import com.viaversion.viafabricplus.features.networking.remove_signed_commands.SignedCommands1_21_6;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01557;
import minecraft.class01683;
import minecraft.class01894;
import minecraft.class03443;
import minecraft.class04453;
import minecraft.class05096;
import minecraft.class05153;
import minecraft.class05216;
import minecraft.class05630;
import minecraft.class05949;
import minecraft.class05951;
import minecraft.class06202;
import minecraft.class06541;
import minecraft.class06601;
import minecraft.class06613;
import minecraft.class07282;
import minecraft.class08394;
import minecraft.class09008;
import net.raphimc.vialegacy.api.LegacyProtocolVersion;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class05954
extends class05096 {
    static final class01894 N = class01894.y((String)"gamemode_switcher/slot");
    static final class01894 y = class01894.y((String)"gamemode_switcher/selection");
    private static final class01894 L = class01894.y((String)"textures/gui/container/gamemode_switcher.png");
    private static final int u = 128;
    private static final int i = 128;
    private static final int R = 26;
    private static final int M = 5;
    private static final int B = 31;
    private static final int Z = 5;
    private static int z = class05949.values().length * 31 - 5;
    private final class05949 U;
    private class05949 E;
    private int W;
    private int m;
    private boolean P;
    private final List<class05951> s = Lists.newArrayList();
    private class05949[] T;

    private class05949[] L() {
        if (ViaFabricPlus.getImpl().getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_7_6)) {
            return this.T;
        }
        return class05949.values();
    }

    public class05954() {
        super(class05153.N);
        this.E = this.U = class05949.N(this.N());
        this.N(null);
    }

    private void y() {
        class05954.N(this.field_22787, this.E);
    }

    private void y(CallbackInfo callbackInfo) {
        if (ViaFabricPlus.getImpl().getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.c0_28toc0_30)) {
            this.method_25419();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void N(class01683 class016832, class00381 class003812) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_5) && class003812 instanceof class09008) {
            class09008 class090082 = (class09008)class003812;
            try {
                SignedCommands1_21_6.sendGameMode((class07282)class090082.N());
                return;
            }
            catch (Throwable throwable) {
                throw new MatchException(throwable.toString(), throwable);
            }
        }
        class016832.N(class003812);
    }

    private void N(CallbackInfo callbackInfo) {
        if (ViaFabricPlus.getImpl().getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_7_6)) {
            ArrayList arrayList = new ArrayList(Arrays.stream(class05949.values()).toList());
            arrayList.remove((Object)class05949.field_24579);
            if (ViaFabricPlus.getImpl().getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.r1_2_4tor1_2_5)) {
                arrayList.remove((Object)class05949.field_24578);
            }
            this.T = (class05949[])arrayList.toArray(class05949[]::new);
            z = this.T.length * 31 - 5;
        }
    }

    private class07282 N() {
        class03443 class034432 = (class03443)class06202.Nq().T_2;
        class07282 class072822 = class034432.z();
        if (class072822 != null) {
            return class072822;
        }
        return class034432.U() == class07282.field_9220 ? class07282.field_9215 : class07282.field_9220;
    }

    private static void N(class06202 class062022, class05949 class059492) {
        if (!class062022.T()) {
            return;
        }
        class05949 class059493 = class05949.N(((class03443)class062022.T_2).U());
        if (class059492 != class059493 && class01557.N.N(((class04453)class062022.T_4).method_75004())) {
            class05954.N((class01683)((class04453)class062022.T_4).y_0, (class00381)new class09008(class059492.field_60755));
        }
    }

    public void method_25426() {
        this.y(null);
        super.method_25426();
        this.s.clear();
        this.E = this.U;
        for (int i = 0; i < this.L().length; ++i) {
            class05949 class059492 = this.L()[i];
            this.s.add(new class05951(class059492, this.field_22789 / 2 - z / 2 + i * 31, this.field_22790 / 2 - 31));
        }
    }

    public boolean method_25404(class06601 class066012) {
        if (((class05630)this.field_22787.i_7).NZ.N(class066012)) {
            this.P = false;
            this.E = this.E.N();
            return true;
        }
        return super.method_25404(class066012);
    }

    public void method_25420(class01054 class010542, int n, int n2, float f) {
        int n3 = this.field_22789 / 2 - 62;
        int n4 = this.field_22790 / 2 - 31 - 27;
        class010542.N(class08394.Na, L, n3, n4, 0.0f, 0.0f, 125, 75, 128, 128);
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        class010542.N(this.field_22793, this.E.field_24581, this.field_22789 / 2, this.field_22790 / 2 - 31 - 20, -1);
        class05216 class052162 = class00392.N((String)"debug.gamemodes.select_next", (Object[])new Object[]{((class05630)this.field_22787.i_7).NZ.m().L().N(class06541.field_1075)});
        class010542.N(this.field_22793, (class00392)class052162, this.field_22789 / 2, this.field_22790 / 2 + 5, -1);
        if (!this.P) {
            this.W = n;
            this.m = n2;
            this.P = true;
        }
        boolean bl = this.W == n && this.m == n2;
        for (class05951 class059512 : this.s) {
            class059512.method_25394(class010542, n, n2, f);
            class059512.N(this.E == class059512.N);
            if (bl || !class059512.method_25367()) continue;
            this.E = class059512.N;
        }
    }

    public boolean method_25421() {
        return false;
    }

    public boolean method_25406(class06613 class066132) {
        if (((class05630)this.field_22787.i_7).r.N(class066132)) {
            this.y();
            this.field_22787.N(null);
            return true;
        }
        return super.method_25406(class066132);
    }

    public boolean method_16803(class06601 class066012) {
        if (((class05630)this.field_22787.i_7).r.N(class066012)) {
            this.y();
            this.field_22787.N(null);
            return true;
        }
        return super.method_16803(class066012);
    }
}

