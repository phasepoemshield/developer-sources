/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  com.viaversion.viafabricplus.injection.access.base.IServerData
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viafabricplus.settings.impl.DebugSettings
 *  com.viaversion.viafabricplus.settings.impl.GeneralSettings
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00390
 *  minecraft.class00392
 *  minecraft.class00606
 *  minecraft.class01028
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class01894
 *  minecraft.class04182
 *  minecraft.class04568
 *  minecraft.class04579
 *  minecraft.class05216
 *  minecraft.class05220
 *  minecraft.class05304
 *  minecraft.class05630
 *  minecraft.class05936
 *  minecraft.class06202
 *  minecraft.class06541
 *  minecraft.class06601
 *  minecraft.class06613
 *  minecraft.class07529
 *  minecraft.class07536
 *  minecraft.class07583
 *  minecraft.class08280
 *  minecraft.class08394
 *  minecraft.class08627
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Lists;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.viaversion.viafabricplus.injection.access.base.IServerData;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viafabricplus.settings.impl.DebugSettings;
import com.viaversion.viafabricplus.settings.impl.GeneralSettings;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import minecraft.class00390;
import minecraft.class00392;
import minecraft.class00606;
import minecraft.class01028;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class01894;
import minecraft.class04182;
import minecraft.class04568;
import minecraft.class04579;
import minecraft.class05216;
import minecraft.class05220;
import minecraft.class05304;
import minecraft.class05630;
import minecraft.class05681;
import minecraft.class05691;
import minecraft.class05936;
import minecraft.class06202;
import minecraft.class06541;
import minecraft.class06601;
import minecraft.class06613;
import minecraft.class07529;
import minecraft.class07536;
import minecraft.class07583;
import minecraft.class08280;
import minecraft.class08394;
import minecraft.class08627;
import org.jspecify.annotations.Nullable;

public class class05692
extends class05681
implements class07583 {
    private static final int y = 32;
    private static final int L = 5;
    private static final int u = 10;
    private static final int i = 8;
    private final class05304 R;
    private final class06202 M;
    private final class04568 B;
    private class04182 Z;
    private byte @Nullable [] z;
    private @Nullable List<class00392> U;
    private @Nullable class01894 E;
    private @Nullable class00392 W;
    final /* synthetic */ class05691 N;
    private boolean m = false;

    public class04568 L() {
        return this.B;
    }

    protected class05692(class05691 class056912, class05304 class053042, class04568 class045682) {
        this.N = class056912;
        this.R = class053042;
        this.B = class045682;
        this.M = class06202.Nq();
        this.Z = class04182.y((class08627)this.M.NO(), (String)class045682.y);
        this.u();
    }

    @Override
    public void close() {
        this.Z.close();
    }

    private class04579 z() {
        if (this.m) {
            return this.B.B();
        }
        return class04579.field_47883;
    }

    private void u() {
        this.U = null;
        switch (this.B.B()) {
            case field_47880: 
            case field_47881: {
                this.E = class05691.L;
                this.W = class05691.w;
                break;
            }
            case field_47883: {
                this.E = class05691.N;
                this.W = class05691.l;
                this.U = this.B.Z;
                break;
            }
            case field_47882: {
                this.E = class05691.y;
                this.W = class05691.d;
                break;
            }
            case field_47884: {
                this.E = this.B.R < 150L ? class05691.M : (this.B.R < 300L ? class05691.R : (this.B.R < 600L ? class05691.i : (this.B.R < 1000L ? class05691.u : class05691.L)));
                this.W = class00392.N((String)"multiplayer.status.ping", (Object[])new Object[]{this.B.R});
                this.U = this.B.Z;
            }
        }
    }

    public void y() {
        this.R.L().y();
    }

    private Future N(ThreadPoolExecutor threadPoolExecutor, Runnable runnable, Operation operation) {
        ProtocolVersion protocolVersion = ((IServerData)this.B).viaFabricPlus$forcedVersion();
        if (protocolVersion == null) {
            protocolVersion = ProtocolTranslator.getTargetVersion();
        }
        this.m = DebugSettings.INSTANCE.disableServerPinging.isEnabled(protocolVersion);
        if (this.m) {
            this.B.B = class00392.N((String)protocolVersion.getName());
            return null;
        }
        return (Future)operation.call(new Object[]{threadPoolExecutor, runnable});
    }

    private List N(class01590 class015902, class05936 class059362, int n) {
        if (this.m) {
            return class015902.L((class05936)class00392.N((String)this.B.y), n);
        }
        return class015902.L(class059362, n);
    }

    private void N(class01054 class010542, class00392 class003922, int n, int n2, Operation operation) {
        ProtocolVersion protocolVersion;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add(class003922);
        if (((Boolean)GeneralSettings.INSTANCE.showAdvertisedServerVersion.getValue()).booleanValue() && (protocolVersion = ((IServerData)this.B).viaFabricPlus$translatingVersion()) != null) {
            arrayList.add(class00392.N((String)"base.viafabricplus.via_translates_to", (Object[])new Object[]{protocolVersion.getName() + " (" + protocolVersion.getOriginalVersion() + ")"}));
            arrayList.add(class00392.N((String)"base.viafabricplus.server_version", (Object[])new Object[]{this.B.B.getString() + " (" + this.B.M + ")"}));
        }
        class010542.N(Lists.transform(arrayList, class00392::method_30937), n, n2);
    }

    private boolean N(class01054 class010542, class00392 class003922, int n, int n2) {
        return !this.m;
    }

    private class01894 N(class04182 class041822) {
        if (this.m) {
            return class04182.N;
        }
        return this.Z.y();
    }

    private boolean N(class01054 class010542, List list, int n, int n2) {
        return !this.m;
    }

    private boolean N(class01054 class010542, RenderPipeline renderPipeline, class01894 class018942, int n, int n2, int n3, int n4) {
        return !this.m;
    }

    private int N(int n) {
        if (this.m) {
            n += 12;
        }
        return n;
    }

    private boolean N(byte @Nullable [] byArray) {
        if (byArray == null) {
            this.Z.N();
        } else {
            try {
                this.Z.N(class08280.N((byte[])byArray));
            }
            catch (Throwable throwable) {
                class05691.j.error("Invalid icon for server {} ({})", new Object[]{this.B.N, this.B.y, throwable});
                return false;
            }
        }
        return true;
    }

    @Override
    public void N() {
        this.R.N(this.B);
    }

    private void N(int n, int n2) {
        this.R.L().N(n, n2);
        class05691.N(this.R.N, n, n2);
    }

    @Override
    boolean N(class05681 class056812) {
        return class056812 instanceof class05692 && ((class05692)class056812).B == this.B;
    }

    protected void N(class01054 class010542, int n, int n2, class01894 class018942) {
        class010542.N(class08394.Na, class018942, n, n2, 0.0f, 0.0f, 32, 32, 32, 32);
    }

    public boolean method_25404(class06601 class066012) {
        if (class066012.L()) {
            this.N();
            return true;
        }
        if (class066012.W()) {
            int n = this.R.N.method_25396().indexOf(this);
            if (n == -1) {
                return true;
            }
            if (class066012.Z() && n < this.R.L().L() - 1 || class066012.B() && n > 0) {
                this.N(n, class066012.Z() ? n + 1 : n - 1);
                return true;
            }
        }
        return super.method_25404(class066012);
    }

    @Override
    public boolean method_25402(class06613 class066132, boolean bl) {
        int n;
        int n2 = (int)class066132.n() - this.method_73380();
        if (this.L(n2, n = (int)class066132.t() - this.method_73382(), 32)) {
            this.N();
            return true;
        }
        int n3 = this.R.N.method_25396().indexOf(this);
        if (n3 > 0 && this.R(n2, n, 32)) {
            this.N(n3, n3 - 1);
            return true;
        }
        if (n3 < this.R.L().L() - 1 && this.M(n2, n, 32)) {
            this.N(n3, n3 + 1);
            return true;
        }
        if (bl) {
            this.N();
        }
        return super.method_25402(class066132, bl);
    }

    public void method_25343(class01054 class010542, int n, int n2, boolean bl, float f) {
        byte[] byArray;
        int n3;
        int n4;
        int n5;
        ThreadPoolExecutor threadPoolExecutor;
        Runnable runnable;
        if (this.B.B() == class04579.field_47880) {
            this.B.N(class04579.field_47881);
            this.B.u = class05220.N;
            this.B.L = class05220.N;
            runnable = () -> {
                try {
                    this.R.y().N(this.B, () -> this.M.execute(this::y), () -> {
                        this.B.N(this.B.M == class07529.y().comp_4027() ? class04579.field_47884 : class04579.field_47883);
                        this.M.execute(this::u);
                    }, class00606.N((boolean)((class05630)this.M.i_7).NC()));
                }
                catch (UnknownHostException unknownHostException) {
                    this.B.N(class04579.field_47882);
                    this.B.u = class05691.t;
                    this.M.execute(this::u);
                }
                catch (Exception exception) {
                    this.B.N(class04579.field_47882);
                    this.B.u = class05691.G;
                    this.M.execute(this::u);
                }
            };
            threadPoolExecutor = class05691.v;
            this.N(threadPoolExecutor, runnable, objectArray -> {
                WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)2, (String)"[java.util.concurrent.ThreadPoolExecutor, java.lang.Runnable]");
                return ((ThreadPoolExecutor)objectArray[0]).submit((Runnable)objectArray[1]);
            });
        }
        class010542.y((class01590)this.M.i_3, this.B.N, this.method_73380() + 32 + 3, this.method_73382() + 1, -1);
        int n6 = this.method_73387() - 32 - 2;
        runnable = this.B.u;
        threadPoolExecutor = (class01590)this.M.i_3;
        List list = this.N((class01590)threadPoolExecutor, (class05936)runnable, n6);
        for (n5 = 0; n5 < Math.min(list.size(), 2); ++n5) {
            class01590 class015902 = (class01590)this.M.i_3;
            class01028 class010282 = (class01028)list.get(n5);
            int n7 = this.method_73380() + 32 + 3;
            int n8 = this.method_73382() + 12;
            Objects.requireNonNull((class01590)this.M.i_3);
            class010542.y(class015902, class010282, n7, n8 + 9 * n5, -8355712);
        }
        threadPoolExecutor = this.Z;
        this.N(class010542, this.method_73380(), this.method_73382(), this.N((class04182)threadPoolExecutor));
        n5 = this.N.method_25396().indexOf(this);
        if (this.B.B() == class04579.field_47881) {
            n4 = (int)(class07536.L() / 100L + (long)(n5 * 2) & 7L);
            if (n4 > 4) {
                n4 = 8 - n4;
            }
            this.E = switch (n4) {
                default -> class05691.B;
                case 1 -> class05691.Z;
                case 2 -> class05691.z;
                case 3 -> class05691.U;
                case 4 -> class05691.E;
            };
        }
        n4 = this.method_73389() - 10 - 5;
        if (this.E != null) {
            int n9 = 8;
            int n10 = 10;
            threadPoolExecutor = class010542;
            runnable = class08394.Na;
            class01894 class018942 = this.E;
            n3 = n4;
            int n11 = this.method_73382();
            if (this.N((class01054)threadPoolExecutor, (RenderPipeline)runnable, class018942, n3, n11, n10, n9)) {
                threadPoolExecutor.N((RenderPipeline)runnable, class018942, n3, n11, n10, n9);
            }
        }
        if (!Arrays.equals(byArray = this.B.L(), this.z)) {
            if (this.N(byArray)) {
                this.z = byArray;
            } else {
                this.B.N(null);
                this.y();
            }
        }
        class00392 class003922 = this.B.B() == this.z() ? this.B.B.L().N(class06541.field_1061) : this.B.L;
        int n12 = ((class01590)this.M.i_3).N((class05936)class003922);
        int n13 = n4 - n12 - 5;
        n6 = -8355712;
        int n14 = this.method_73382() + 1;
        int n15 = n13;
        class010542.y((class01590)this.M.i_3, class003922, this.N(n15), n14, n6);
        if (this.W != null && n >= n4 && n <= n4 + 10 && n2 >= this.method_73382() && n2 <= this.method_73382() + 8) {
            class01054 class010543 = class010542;
            class00392 class003923 = this.W;
            n6 = n;
            n3 = n2;
            if (this.N(class010543, class003923, n6, n3)) {
                this.N(class010543, class003923, n6, n3, objectArray -> {
                    WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)4, (String)"[net.minecraft.class_332, net.minecraft.class_2561, int, int]");
                    Object[] objectArray2 = objectArray;
                    ((class01054)objectArray[0]).N((class00392)objectArray2[1], ((Integer)objectArray2[2]).intValue(), ((Integer)objectArray2[3]).intValue());
                    return null;
                });
            }
        } else if (this.U != null && n >= n13 && n <= n13 + n12 && n2 >= this.method_73382()) {
            int n16 = this.method_73382() - 1;
            Objects.requireNonNull((class01590)this.M.i_3);
            if (n2 <= n16 + 9) {
                n3 = n2;
                n6 = n;
                class01054 class010544 = class010542;
                List list2 = Lists.transform(this.U, class00392::method_30937);
                if (this.N(class010544, list2, n6, n3)) {
                    class010544.N(list2, n6, n3);
                }
            }
        }
        if (((Boolean)((class05630)this.M.i_7).Nm().method_41753()).booleanValue() || bl) {
            class010542.N(this.method_73380(), this.method_73382(), this.method_73380() + 32, this.method_73382() + 32, -1601138544);
            int n17 = n - this.method_73380();
            int n18 = n2 - this.method_73382();
            if (this.L(n17, n18, 32)) {
                class010542.N(class08394.Na, class05691.W, this.method_73380(), this.method_73382(), 32, 32);
                class05691.N(this.N, class010542);
            } else {
                class010542.N(class08394.Na, class05691.m, this.method_73380(), this.method_73382(), 32, 32);
            }
            if (n5 > 0) {
                if (this.R(n17, n18, 32)) {
                    class010542.N(class08394.Na, class05691.P, this.method_73380(), this.method_73382(), 32, 32);
                    class05691.y(this.N, class010542);
                } else {
                    class010542.N(class08394.Na, class05691.s, this.method_73380(), this.method_73382(), 32, 32);
                }
            }
            if (n5 < this.R.L().L() - 1) {
                if (this.M(n17, n18, 32)) {
                    class010542.N(class08394.Na, class05691.T, this.method_73380(), this.method_73382(), 32, 32);
                    class05691.L(this.N, class010542);
                } else {
                    class010542.N(class08394.Na, class05691.b, this.method_73380(), this.method_73382(), 32, 32);
                }
            }
        }
    }

    @Override
    public class00392 method_37006() {
        class05216 class052162 = class00392.i();
        class052162.y((class00392)class00392.N((String)"narrator.select", (Object[])new Object[]{this.B.N}));
        class052162.y(class05220.t);
        switch (this.B.B()) {
            case field_47883: {
                class052162.y(class05691.l);
                class052162.y(class05220.t);
                class052162.y((class00392)class00392.N((String)"multiplayer.status.version.narration", (Object[])new Object[]{this.B.B}));
                class052162.y(class05220.t);
                class052162.y((class00392)class00392.N((String)"multiplayer.status.motd.narration", (Object[])new Object[]{this.B.u}));
                break;
            }
            case field_47882: {
                class052162.y(class05691.d);
                break;
            }
            case field_47881: {
                class052162.y(class05691.w);
                break;
            }
            default: {
                class052162.y(class05691.k);
                class052162.y(class05220.t);
                class052162.y((class00392)class00392.N((String)"multiplayer.status.ping.narration", (Object[])new Object[]{this.B.R}));
                class052162.y(class05220.t);
                class052162.y((class00392)class00392.N((String)"multiplayer.status.motd.narration", (Object[])new Object[]{this.B.u}));
                if (this.B.i == null) break;
                class052162.y(class05220.t);
                class052162.y((class00392)class00392.N((String)"multiplayer.status.player_count.narration", (Object[])new Object[]{this.B.i.y(), this.B.i.N()}));
                class052162.y(class05220.t);
                class052162.y(class00390.N((Collection)this.B.Z, (class00392)class00392.y((String)", ")));
            }
        }
        return class052162;
    }
}

