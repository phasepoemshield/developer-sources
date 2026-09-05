/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.textures.GpuTextureView
 *  com.viaversion.viafabricplus.injection.access.networking.downloading_terrain.ILevelLoadingScreen
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viafabricplus.settings.impl.GeneralSettings
 *  com.viaversion.viafabricplus.util.ChatUtil
 *  com.viaversion.viafabricplus.visuals.settings.VisualSettings
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class00549
 *  minecraft.class00552
 *  minecraft.class00869
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class02566
 *  minecraft.class03063
 *  minecraft.class03334
 *  minecraft.class03428
 *  minecraft.class03448
 *  minecraft.class03457
 *  minecraft.class04453
 *  minecraft.class04654
 *  minecraft.class04995
 *  minecraft.class05096
 *  minecraft.class05153
 *  minecraft.class05220
 *  minecraft.class05362
 *  minecraft.class05384
 *  minecraft.class05731
 *  minecraft.class06134
 *  minecraft.class06202
 *  minecraft.class07209
 *  minecraft.class07536
 *  minecraft.class08188
 *  minecraft.class08388
 *  minecraft.class08394
 *  minecraft.class08627
 *  minecraft.class08679
 *  minecraft.class08771
 *  minecraft.class08918
 *  net.raphimc.vialegacy.protocol.classic.c0_28_30toa1_0_15.storage.ClassicProgressStorage
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.mojang.blaze3d.textures.GpuTextureView;
import com.viaversion.viafabricplus.injection.access.networking.downloading_terrain.ILevelLoadingScreen;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viafabricplus.settings.impl.GeneralSettings;
import com.viaversion.viafabricplus.util.ChatUtil;
import com.viaversion.viafabricplus.visuals.settings.VisualSettings;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Objects;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class00549;
import minecraft.class00552;
import minecraft.class00869;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class02566;
import minecraft.class03063;
import minecraft.class03334;
import minecraft.class03428;
import minecraft.class03448;
import minecraft.class03457;
import minecraft.class04453;
import minecraft.class04654;
import minecraft.class04995;
import minecraft.class05096;
import minecraft.class05153;
import minecraft.class05220;
import minecraft.class05362;
import minecraft.class05384;
import minecraft.class05731;
import minecraft.class05858;
import minecraft.class06134;
import minecraft.class06202;
import minecraft.class07209;
import minecraft.class07536;
import minecraft.class08188;
import minecraft.class08388;
import minecraft.class08394;
import minecraft.class08627;
import minecraft.class08679;
import minecraft.class08771;
import minecraft.class08918;
import net.raphimc.vialegacy.protocol.classic.c0_28_30toa1_0_15.storage.ClassicProgressStorage;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class05850
extends class05096
implements ILevelLoadingScreen {
    private static final class00392 N = class00392.L((String)"multiplayer.downloadingTerrain");
    private static final class00392 y = class00392.L((String)"narrator.ready_to_play");
    private static final long L = 2000L;
    private static final int u = 200;
    private class05384 i;
    private float R;
    private long M = -1L;
    private class05858 B;
    private @Nullable class08388 Z;
    private static final Object2IntMap<class00549> z = (Object2IntMap)class07536.N((Object)new Object2IntOpenHashMap(), object2IntOpenHashMap -> {
        object2IntOpenHashMap.defaultReturnValue(0);
        object2IntOpenHashMap.put((Object)class00549.L, 0x545454);
        object2IntOpenHashMap.put((Object)class00549.u, 0x999999);
        object2IntOpenHashMap.put((Object)class00549.i, 6250897);
        object2IntOpenHashMap.put((Object)class00549.R, 8434258);
        object2IntOpenHashMap.put((Object)class00549.M, 0xD1D1D1);
        object2IntOpenHashMap.put((Object)class00549.B, 7497737);
        object2IntOpenHashMap.put((Object)class00549.Z, 3159410);
        object2IntOpenHashMap.put((Object)class00549.z, 2213376);
        object2IntOpenHashMap.put((Object)class00549.U, 0xCCCCCC);
        object2IntOpenHashMap.put((Object)class00549.E, 16769184);
        object2IntOpenHashMap.put((Object)class00549.W, 15884384);
        object2IntOpenHashMap.put((Object)class00549.m, 0xFFFFFF);
    });
    private long U;
    private int E;
    private boolean W;
    private boolean m = false;

    public class05850(class05384 class053842, class05858 class058582) {
        super(class05153.N);
        this.i = class053842;
        this.B = class058582;
    }

    public static void N(class01054 class010542, int n, int n2, int n3, int n4, class08771 class087712) {
        int n5;
        int n6 = n3 + n4;
        int n7 = class087712.N() * 2 + 1;
        int n8 = n7 * n6 - n4;
        int n9 = n - n8 / 2;
        int n10 = n2 - n8 / 2;
        if (((class05731)class06202.Nq().L_0).y(class06134.V)) {
            n5 = n6 / 2 + 1;
            class010542.N(n - n5, n2 - n5, n + n5, n2 + n5, -65536);
        }
        for (n5 = 0; n5 < n7; ++n5) {
            for (int i = 0; i < n7; ++i) {
                class00549 class005492 = class087712.N(n5, i);
                int n11 = n9 + n5 * n6;
                int n12 = n10 + i * n6;
                class010542.N(n11, n12, n11 + n3, n12 + n3, class02566.M((int)z.getInt((Object)class005492)));
            }
        }
    }

    private class08388 N() {
        if (this.Z != null) {
            return this.Z;
        }
        this.Z = this.field_22787.yU().N().N(class00869.iq.W());
        return this.Z;
    }

    private class05858 N(class05850 class058502) {
        if (VisualSettings.INSTANCE.hideDownloadTerrainScreenTransitionEffects.isEnabled()) {
            return class05858.field_51489;
        }
        return this.B;
    }

    private void N(CallbackInfo callbackInfo) {
        if (class06202.Nq() != null && class06202.Nq().q()) {
            return;
        }
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_20_2)) {
            callbackInfo.cancel();
            if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_18)) {
                if (this.W) {
                    this.method_25419();
                }
                if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_1)) {
                    ++this.E;
                    if (this.E % 20 == 0) {
                        this.field_22787.NE().N((class00381)new class00552(0L));
                    }
                }
            } else if (System.currentTimeMillis() > this.U + 30000L) {
                this.method_25419();
            } else if (this.m) {
                if ((class04453)this.field_22787.T_4 == null) {
                    return;
                }
                class07209 class072092 = ((class04453)this.field_22787.T_4).method_24515();
                if ((class03448)this.field_22787.T_3 != null && ((class03448)this.field_22787.T_3).method_31601(class072092.method_10264()) || ((class03063)this.field_22787.B_2).N(class072092) || ((class04453)this.field_22787.T_4).method_7325() || !((class04453)this.field_22787.T_4).method_5805()) {
                    this.method_25419();
                }
            } else {
                this.m = ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_19_1) ? this.W || System.currentTimeMillis() > this.U + 2000L : this.W;
            }
        }
    }

    private void N(class01054 class010542, int n, int n2, float f, CallbackInfo callbackInfo) {
        if (((Boolean)GeneralSettings.INSTANCE.showClassicLoadingProgressInConnectScreen.getValue()).booleanValue()) {
            UserConnection userConnection = ProtocolTranslator.getPlayNetworkUserConnection();
            if (userConnection == null) {
                return;
            }
            ClassicProgressStorage classicProgressStorage = (ClassicProgressStorage)userConnection.get(ClassicProgressStorage.class);
            if (classicProgressStorage == null) {
                return;
            }
            class010542.N((class01590)this.field_22787.i_3, ChatUtil.prefixText((String)classicProgressStorage.status), this.field_22789 / 2, this.field_22790 / 2 - 30, -1);
        }
    }

    public void N(class05384 class053842, class05858 class058582) {
        this.i = class053842;
        this.B = class058582;
    }

    private void N(class01054 class010542, int n, int n2, int n3, int n4, float f) {
        class010542.N(n, n2, n + n3, n2 + n4, -16777216);
        class010542.N(n, n2, n + Math.round(f * (float)n3), n2 + n4, -16711936);
    }

    public void method_25426() {
        super.method_25426();
        this.method_37063((class04654)class05362.method_46430((class00392)class05220.U, class053622 -> this.method_25419()).N(74).N(5, 5).N());
    }

    public boolean method_25422() {
        return false;
    }

    public void method_25393() {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        super.method_25393();
        this.R += (this.i.i() - this.R) * 0.2f;
        if (this.i.y()) {
            this.method_25419();
        }
    }

    public void method_25420(class01054 class010542, int n, int n2, float f) {
        switch (this.N(this).ordinal()) {
            case 2: {
                this.method_57728(class010542, f);
                this.method_57734(class010542);
                this.method_57735(class010542);
                break;
            }
            case 0: {
                class010542.N(class08394.Nf, this.N(), 0, 0, class010542.N(), class010542.y());
                break;
            }
            case 1: {
                class08627 class086272 = class06202.Nq().NO();
                class08918 class089182 = class086272.y(class03334.N);
                class08918 class089183 = class086272.y(class03334.y);
                class08679 class086792 = class08679.N((GpuTextureView)class089182.method_71659(), (class08188)class089182.method_75484(), (GpuTextureView)class089183.method_71659(), (class08188)class089183.method_75484());
                class010542.N(class08394.Nb, class086792, 0, 0, this.field_22789, this.field_22790);
            }
        }
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        int n3;
        super.method_25394(class010542, n, n2, f);
        long l = class07536.L();
        if (l - this.M > 2000L) {
            this.M = l;
            this.method_37064(true);
        }
        int n4 = this.field_22789 / 2;
        int n5 = this.field_22790 / 2;
        class08771 class087712 = this.i.u();
        if (class087712 != null) {
            int n6 = 2;
            class05850.N(class010542, n4, n5, 2, 0, class087712);
            int n7 = n5 - class087712.N() * 2;
            Objects.requireNonNull(this.field_22793);
            n3 = n7 - 27;
        } else {
            n3 = n5 - 50;
        }
        class010542.N(this.field_22793, N, n4, n3, -1);
        if (this.i.R()) {
            Objects.requireNonNull(this.field_22793);
            this.N(class010542, n4 - 100, n3 + 9 + 3, 200, 2, this.R);
        }
        this.N(class010542, n, n2, f, null);
    }

    public void method_25419() {
        this.field_22787.NT().u(y);
        super.method_25419();
    }

    public boolean method_25421() {
        return false;
    }

    protected boolean method_48262() {
        return false;
    }

    protected void method_37056(class03428 class034282) {
        if (this.i.R()) {
            class034282.N(class03457.field_33788, (class00392)class00392.N((String)"loading.progress", (Object[])new Object[]{class04995.y((float)(this.i.i() * 100.0f))}));
        }
    }

    public void viaFabricPlus$setReady() {
        this.W = true;
    }
}

