/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10944
 *  Nursultan.class10946
 *  Nursultan.class10948
 *  Nursultan.class11938
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  com.mojang.blaze3d.pipeline.BlendFunction
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  com.mojang.blaze3d.platform.DestFactor
 *  com.mojang.blaze3d.textures.GpuTextureView
 *  com.viaversion.viafabricplus.features.item.negative_item_count.NegativeItemUtil
 *  dev.isxander.yacl3.gui.render.GuiRenderStateSink
 *  java.lang.MatchException
 *  java.lang.runtime.SwitchBootstraps
 *  minecraft.class00380
 *  minecraft.class00391
 *  minecraft.class00392
 *  minecraft.class00395
 *  minecraft.class00398
 *  minecraft.class00401
 *  minecraft.class00405
 *  minecraft.class00577
 *  minecraft.class00580
 *  minecraft.class01127
 *  minecraft.class01590
 *  minecraft.class01643
 *  minecraft.class01647
 *  minecraft.class01650
 *  minecraft.class01664
 *  minecraft.class01670
 *  minecraft.class01677
 *  minecraft.class01894
 *  minecraft.class02112
 *  minecraft.class02118
 *  minecraft.class02128
 *  minecraft.class02484
 *  minecraft.class02566
 *  minecraft.class02708
 *  minecraft.class02721
 *  minecraft.class03255
 *  minecraft.class03448
 *  minecraft.class03662
 *  minecraft.class04453
 *  minecraft.class04830
 *  minecraft.class04995
 *  minecraft.class05005
 *  minecraft.class05096
 *  minecraft.class05630
 *  minecraft.class05904
 *  minecraft.class05913
 *  minecraft.class05936
 *  minecraft.class06202
 *  minecraft.class06260
 *  minecraft.class06357
 *  minecraft.class06478
 *  minecraft.class06541
 *  minecraft.class06563
 *  minecraft.class06584
 *  minecraft.class06608
 *  minecraft.class06619
 *  minecraft.class06985
 *  minecraft.class07018
 *  minecraft.class07074
 *  minecraft.class07080
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class07536
 *  minecraft.class07878
 *  minecraft.class08097
 *  minecraft.class08117
 *  minecraft.class08188
 *  minecraft.class08270
 *  minecraft.class08388
 *  minecraft.class08394
 *  minecraft.class08589
 *  minecraft.class08626
 *  minecraft.class08627
 *  minecraft.class08647
 *  minecraft.class08649
 *  minecraft.class08650
 *  minecraft.class08651
 *  minecraft.class08652
 *  minecraft.class08656
 *  minecraft.class08660
 *  minecraft.class08661
 *  minecraft.class08663
 *  minecraft.class08665
 *  minecraft.class08667
 *  minecraft.class08669
 *  minecraft.class08676
 *  minecraft.class08679
 *  minecraft.class08763
 *  minecraft.class08800
 *  minecraft.class08842
 *  minecraft.class08844
 *  minecraft.class08898
 *  minecraft.class08918
 *  minecraft.class08961
 *  net.caffeinemc.mods.sodium.api.texture.SpriteUtil
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.rendering.v1.DrawItemStackOverlayCallback
 *  org.joml.Matrix3x2f
 *  org.joml.Matrix3x2fStack
 *  org.joml.Matrix3x2fc
 *  org.joml.Quaternionf
 *  org.joml.Vector2ic
 *  org.joml.Vector3f
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  page.langeweile.ok_zoomer.utils.ZoomUtils
 */
package minecraft;

import Nursultan.class10944;
import Nursultan.class10946;
import Nursultan.class10948;
import Nursultan.class11938;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.platform.DestFactor;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.viaversion.viafabricplus.features.item.negative_item_count.NegativeItemUtil;
import dev.isxander.yacl3.gui.render.GuiRenderStateSink;
import java.lang.runtime.SwitchBootstraps;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import minecraft.class00380;
import minecraft.class00391;
import minecraft.class00392;
import minecraft.class00395;
import minecraft.class00398;
import minecraft.class00401;
import minecraft.class00405;
import minecraft.class00577;
import minecraft.class00580;
import minecraft.class01028;
import minecraft.class01051;
import minecraft.class01065;
import minecraft.class01074;
import minecraft.class01127;
import minecraft.class01590;
import minecraft.class01643;
import minecraft.class01647;
import minecraft.class01650;
import minecraft.class01664;
import minecraft.class01670;
import minecraft.class01677;
import minecraft.class01894;
import minecraft.class02112;
import minecraft.class02118;
import minecraft.class02128;
import minecraft.class02484;
import minecraft.class02566;
import minecraft.class02708;
import minecraft.class02721;
import minecraft.class03255;
import minecraft.class03448;
import minecraft.class03662;
import minecraft.class04453;
import minecraft.class04830;
import minecraft.class04995;
import minecraft.class05005;
import minecraft.class05096;
import minecraft.class05630;
import minecraft.class05904;
import minecraft.class05913;
import minecraft.class05936;
import minecraft.class06202;
import minecraft.class06260;
import minecraft.class06357;
import minecraft.class06478;
import minecraft.class06541;
import minecraft.class06563;
import minecraft.class06584;
import minecraft.class06608;
import minecraft.class06619;
import minecraft.class06985;
import minecraft.class07018;
import minecraft.class07074;
import minecraft.class07080;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class07536;
import minecraft.class07878;
import minecraft.class08097;
import minecraft.class08117;
import minecraft.class08188;
import minecraft.class08270;
import minecraft.class08388;
import minecraft.class08394;
import minecraft.class08589;
import minecraft.class08626;
import minecraft.class08627;
import minecraft.class08647;
import minecraft.class08649;
import minecraft.class08650;
import minecraft.class08651;
import minecraft.class08652;
import minecraft.class08656;
import minecraft.class08660;
import minecraft.class08661;
import minecraft.class08663;
import minecraft.class08665;
import minecraft.class08667;
import minecraft.class08669;
import minecraft.class08676;
import minecraft.class08679;
import minecraft.class08763;
import minecraft.class08800;
import minecraft.class08842;
import minecraft.class08844;
import minecraft.class08898;
import minecraft.class08918;
import minecraft.class08961;
import net.caffeinemc.mods.sodium.api.texture.SpriteUtil;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.DrawItemStackOverlayCallback;
import org.joml.Matrix3x2f;
import org.joml.Matrix3x2fStack;
import org.joml.Matrix3x2fc;
import org.joml.Quaternionf;
import org.joml.Vector2ic;
import org.joml.Vector3f;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import page.langeweile.ok_zoomer.utils.ZoomUtils;

@Environment(value=EnvType.CLIENT)
public class class01054
implements GuiRenderStateSink {
    private static final int B = 2;
    final class06202 N;
    private final Matrix3x2fStack Z;
    public final class01051 y = new class01051();
    private final class08097 z;
    private final class08626 U;
    public final class08651 L;
    private class06619 E = class06619.N;
    final int u;
    final int i;
    private @Nullable Runnable W;
    @Nullable class00405 R;
    @Nullable class00405 M;

    public void L(int n, int n2, int n3, int n4) {
        class03255 class032552 = new class03255(n, n2, n3 - n, n4 - n2).N((Matrix3x2fc)this.Z);
        this.y.N(class032552);
    }

    public void L() {
        this.L.N();
    }

    private void L(class06584 class065842, int n, int n2) {
        if (class065842.j()) {
            int n3 = n + 2;
            int n4 = n2 + 13;
            this.N(class08394.NH, n3, n4, n3 + 13, n4 + 2, -16777216);
            this.N(class08394.NH, n3, n4, n3 + class065842.v(), n4 + 1, class02566.M((int)class065842.n()));
        }
    }

    public void M() {
        if (this.R != null) {
            this.N((class01590)this.N.i_3, this.R, this.u, this.i);
        }
        if (this.M != null && this.M.Z() != null) {
            this.N(class06608.u);
        }
        if (this.W != null) {
            this.L();
            this.W.run();
            this.W = null;
        }
    }

    public class01054(class06202 class062022, class08651 class086512, int n, int n2) {
        this(class062022, new Matrix3x2fStack(16), class086512, n, n2);
    }

    private class01054(class06202 class062022, Matrix3x2fStack matrix3x2fStack, class08651 class086512, int n, int n2) {
        this.N = class062022;
        this.Z = matrix3x2fStack;
        this.u = n;
        this.i = n2;
        class08117 class081172 = class062022.yW();
        this.z = class081172;
        this.U = class081172.N(class08589.B);
        this.L = class086512;
    }

    public class00580 B() {
        return this.N(class01065.field_63851);
    }

    public Matrix3x2fStack i() {
        return this.Z;
    }

    private void u(class06584 class065842, int n, int n2) {
        float f;
        class04453 class044532 = (class04453)this.N.T_4;
        float f2 = f = class044532 == null ? 0.0f : class044532.method_7357().N(class065842, this.N.NK().N(true));
        if (f > 0.0f) {
            int n3 = n2 + class04995.y((float)(16.0f * (1.0f - f)));
            int n4 = n3 + class04995.u((float)(16.0f * f));
            this.N(class08394.NH, n, n3, n + 16, n4, Integer.MAX_VALUE);
        }
        this.N(class065842, n, n2, null);
    }

    private int u(class06584 class065842) {
        return NegativeItemUtil.getCount((class06584)class065842);
    }

    public void u() {
        this.L.y();
    }

    public void y(class06584 class065842, int n, int n2, int n3) {
        this.N(null, (class07299)((class03448)this.N.T_3), class065842, n, n2, n3);
    }

    public void y(class06584 class065842, int n, int n2) {
        this.y(class065842, n, n2, 0);
    }

    public void y(class01590 class015902, class06584 class065842, int n, int n2) {
        this.N(class015902, class05096.method_25408((class06202)this.N, (class06584)class065842), class065842.N(), n, n2, (class01894)class065842.method_58694(class02484.V));
    }

    public void y(class01590 class015902, class01028 class010282, int n, int n2, int n3) {
        this.N(class015902, class010282, n, n2, n3, true);
    }

    public void y(int n, int n2, int n3, int n4, int n5) {
        this.N(n, n2, n + n3, n2 + 1, n5);
        this.N(n, n2 + n4 - 1, n + n3, n2 + n4, n5);
        this.N(n, n2 + 1, n + 1, n2 + n4 - 1, n5);
        this.N(n + n3 - 1, n2 + 1, n + n3, n2 + n4 - 1, n5);
    }

    public void y(class01590 class015902, class00392 class003922, int n, int n2, int n3) {
        this.N(class015902, class003922, n, n2, n3, true);
    }

    private void y(class01590 class015902, class06584 class065842, int n, int n2, @Nullable String string) {
        class06584 class065843 = class065842;
        if (this.u(class065843) != 1 || string != null) {
            String string2;
            if (string == null) {
                class065843 = class065842;
                int n3 = this.u(class065843);
                string2 = this.N(n3);
            } else {
                string2 = string;
            }
            String string3 = string2;
            this.N(class015902, string3, n + 19 - 2 - class015902.y(string3), n2 + 6 + 3, -1, true);
        }
    }

    private void y(RenderPipeline renderPipeline, GpuTextureView gpuTextureView, class08188 class081882, int n, int n2, int n3, int n4, float f, float f2, float f3, float f4, int n5) {
        this.L.N((class08669)new class08661(renderPipeline, class08679.N((GpuTextureView)gpuTextureView, (class08188)class081882), new Matrix3x2f((Matrix3x2fc)this.Z), n, n2, n3, n4, f, f2, f3, f4, n5, this.y.y()));
    }

    public void y(class01590 class015902, List<? extends class01028> list, int n, int n2, @Nullable class01894 class018942) {
        this.N(class015902, list.stream().map(class06357::N).collect(Collectors.toList()), n, n2, class02128.N, class018942, false);
    }

    public void y(class01590 class015902, List<? extends class01028> list, int n, int n2) {
        this.y(class015902, list, n, n2, null);
    }

    public void y(int n, int n2, int n3, int n4) {
        if (n3 < n2) {
            int n5 = n2;
            n2 = n3;
            n3 = n5;
        }
        this.N(n, n2 + 1, n + 1, n3, n4);
    }

    public void y(class01590 class015902, @Nullable String string, int n, int n2, int n3) {
        this.N(class015902, string, n, n2, n3, true);
    }

    public int y() {
        return this.N.Nt().s();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void N(class01590 class015902, @Nullable class00405 class004052, int n, int n2) {
        if (class004052 == null) {
            return;
        }
        if (class004052.z() == null) return;
        class00395 class003952 = class004052.z();
        Objects.requireNonNull(class003952);
        class00395 class003953 = class003952;
        int n3 = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class00380.class, class00391.class, class00401.class}, (Object)class003953, (int)n3)) {
            case 0: {
                try {
                    class06584 class065842;
                    class06584 class065843 = class065842 = ((class00380)class003953).y();
                    this.y(class015902, class065843, n, n2);
                    return;
                }
                catch (Throwable throwable) {
                    throw new MatchException(throwable.toString(), throwable);
                }
            }
            case 1: {
                class00391 class003912 = (class00391)class003953;
                {
                    class00398 class003982;
                    class00398 class003983 = class003982 = class003912.y();
                    if (!((class05630)this.N.i_7).W) return;
                    this.N(class015902, class003983.N(), n, n2);
                    return;
                }
            }
            case 2: {
                class00401 class004012 = (class00401)class003953;
                {
                    class00392 class003922 = class004012.y();
                    this.y(class015902, class015902.L((class05936)class003922, Math.max(this.N() / 2, 200)), n, n2);
                    return;
                }
            }
        }
    }

    public void N(class08800 class088002, float f, Vector3f vector3f, Quaternionf quaternionf, @Nullable Quaternionf quaternionf2, int n, int n2, int n3, int n4) {
        this.L.N((class08647)new class08665(class088002, vector3f, quaternionf, quaternionf2, n, n2, n3, n4, f, this.y.y()));
    }

    public void N(class08270 class082702) {
        class06202 class062022 = class06202.Nq();
        class08627 class086272 = class062022.NO();
        class08918 class089182 = class086272.y(class082702.N);
        this.N(class08394.Na, class089182.method_71659(), class089182.method_75484(), 0, 0, 128, 128, 0.0f, 1.0f, 0.0f, 1.0f, -1);
        for (class10944 class109442 : class082702.y) {
            class08918 class089183;
            if (!class109442.i) continue;
            this.Z.pushMatrix();
            this.Z.translate((float)class109442.y / 2.0f + 64.0f, (float)class109442.L / 2.0f + 64.0f);
            this.Z.rotate((float)Math.PI / 180 * (float)class109442.u * 360.0f / 16.0f);
            this.Z.scale(4.0f, 4.0f);
            this.Z.translate(-0.125f, 0.125f);
            class08388 class083882 = class109442.N;
            if (class083882 != null) {
                class089183 = class086272.y(class083882.method_45852());
                this.N(class08394.Na, class089183.method_71659(), class089183.method_75484(), -1, -1, 1, 1, class083882.method_4594(), class083882.method_4577(), class083882.method_4575(), class083882.method_4593(), -1);
            }
            this.Z.popMatrix();
            if (class109442.R == null) continue;
            class089183 = (class01590)class062022.i_3;
            float f = class089183.N((class05936)class109442.R);
            float f2 = 25.0f / f;
            Objects.requireNonNull(class089183);
            float f3 = class04995.N((float)f2, (float)0.0f, (float)(6.0f / 9.0f));
            this.Z.pushMatrix();
            this.Z.translate((float)class109442.y / 2.0f + 64.0f - f * f3 / 2.0f, (float)class109442.L / 2.0f + 64.0f + 4.0f);
            this.Z.scale(f3, f3);
            this.L.N(new class08652((class01590)class089183, class109442.R.method_30937(), (Matrix3x2fc)new Matrix3x2f((Matrix3x2fc)this.Z), 0, 0, -1, Integer.MIN_VALUE, false, false, this.y.y()));
            this.Z.popMatrix();
        }
    }

    public boolean N(int n, int n2) {
        return this.y.N(n, n2);
    }

    public void N(List<class05005> list, int n, int n2, int n3, int n4) {
        this.L.N((class08647)new class08660(list, n, n2, n3, n4, this.y.y()));
    }

    public void N(class06260 class062602, float f, class05904 class059042, int n, int n2, int n3, int n4) {
        this.L.N((class08647)new class08663(class062602, class059042, n, n2, n3, n4, f, this.y.y()));
    }

    public void N(class08842 class088422, class06563 class065632, class02708 class027082, int n, int n2, int n3, int n4) {
        this.L.N((class08647)new class08667(class088422, class065632, class027082, n, n2, n3, n4, this.y.y()));
    }

    public void N(class01127 class011272, class01894 class018942, float f, float f2, float f3, int n, int n2, int n3, int n4) {
        this.L.N((class08647)new class08649(class011272, class018942, f2, f3, n, n2, n3, n4, f, this.y.y()));
    }

    public void N(class02721 class027212, class01894 class018942, float f, float f2, float f3, float f4, int n, int n2, int n3, int n4) {
        this.L.N((class08647)new class08676(class027212, class018942, f2, f3, f4, n, n2, n3, n4, f, this.y.y()));
    }

    public void N(int n, int n2, int n3, int n4, int n5, int n6) {
        this.N(class08394.NH, class08679.N(), n, n2, n3, n4, n5, (Integer)n6);
    }

    public void N(RenderPipeline renderPipeline, class08679 class086792, int n, int n2, int n3, int n4) {
        this.N(renderPipeline, class086792, n, n2, n3, n4, -1, null);
    }

    public void N(class01590 class015902, List<class00392> list, int n, int n2, @Nullable class01894 class018942) {
        this.N(class015902, list.stream().map(class00392::method_30937).map(class06357::N).toList(), n, n2, class02128.N, class018942, false);
    }

    public void N(class01590 class015902, List<class00392> list, int n, int n2) {
        this.N(class015902, list, n, n2, null);
    }

    public void N(class01590 class015902, class00392 class003922, int n, int n2, @Nullable class01894 class018942) {
        this.y(class015902, List.of(class003922.method_30937()), n, n2, class018942);
    }

    public void N(class01590 class015902, class00392 class003922, int n, int n2) {
        this.N(class015902, class003922, n, n2, null);
    }

    public void N(int n, int n2, int n3, int n4, int n5) {
        this.N(class08394.NH, n, n2, n3, n4, n5);
    }

    public void N(RenderPipeline renderPipeline, int n, int n2, int n3, int n4, int n5) {
        int n6;
        if (n < n3) {
            n6 = n;
            n = n3;
            n3 = n6;
        }
        if (n2 < n4) {
            n6 = n2;
            n2 = n4;
            n4 = n6;
        }
        this.N(renderPipeline, class08679.N(), n, n2, n3, n4, n5, null);
    }

    public void N(class01590 class015902, List<class06357> list, int n, int n2, class02112 class021122, @Nullable class01894 class018942) {
        class06357 class063572;
        int n3;
        int n4 = 0;
        int n5 = list.size() == 1 ? -2 : 0;
        for (class06357 class063573 : list) {
            int n6 = class063573.method_32664(class015902);
            if (n6 > n4) {
                n4 = n6;
            }
            n5 += class063573.method_32661(class015902);
        }
        int n7 = n4;
        int n8 = n5;
        Vector2ic vector2ic = class021122.method_47944(this.N(), this.y(), n, n2, n7, n8);
        int n9 = vector2ic.x();
        int n10 = vector2ic.y();
        this.Z.pushMatrix();
        class02118.N((class01054)this, (int)n9, (int)n10, (int)n7, (int)n8, (class01894)class018942);
        int n11 = n10;
        for (n3 = 0; n3 < list.size(); ++n3) {
            class063572 = list.get(n3);
            class063572.method_32665(this, class015902, n9, n11);
            n11 += class063572.method_32661(class015902) + (n3 == 0 ? 2 : 0);
        }
        n11 = n10;
        for (n3 = 0; n3 < list.size(); ++n3) {
            class063572 = list.get(n3);
            class063572.method_32666(class015902, n9, n11, n7, n8, this);
            n11 += class063572.method_32661(class015902) + (n3 == 0 ? 2 : 0);
        }
        this.Z.popMatrix();
    }

    private void N(class01590 class015902, List<class06357> list, int n, int n2, class02112 class021122, @Nullable class01894 class018942, boolean bl) {
        if (list.isEmpty()) {
            return;
        }
        if (this.W == null || bl) {
            this.W = () -> this.N(class015902, list, n, n2, class021122, class018942);
        }
    }

    public void N(class01590 class015902, List<class01028> list, class02112 class021122, int n, int n2, boolean bl) {
        this.N(class015902, list.stream().map(class06357::N).collect(Collectors.toList()), n, n2, class021122, null, bl);
    }

    private void N(RenderPipeline renderPipeline, class08388 class083882, int n, int n2, int n3, int n4, int n5, CallbackInfo callbackInfo) {
        SpriteUtil.INSTANCE.markSpriteActive(class083882);
    }

    private void N(RenderPipeline renderPipeline, GpuTextureView gpuTextureView, class08188 class081882, int n, int n2, int n3, int n4, float f, float f2, float f3, float f4, int n5, Operation operation) {
        if (ZoomUtils.getFadeModifier() != null) {
            float f5 = ZoomUtils.getFadeModifier().floatValue();
            if (renderPipeline.getBlendFunction().isPresent() && ((BlendFunction)renderPipeline.getBlendFunction().get()).destAlpha() == DestFactor.ZERO) {
                operation.call(new Object[]{renderPipeline, gpuTextureView, class081882, n, n2, n3, n4, Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), class02566.y((int)n5, (float)f5)});
            } else {
                operation.call(new Object[]{renderPipeline, gpuTextureView, class081882, n, n2, n3, n4, Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), class02566.N((float)f5, (int)n5)});
            }
        } else {
            operation.call(new Object[]{renderPipeline, gpuTextureView, class081882, n, n2, n3, n4, Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), n5});
        }
    }

    private void N(class06584 class065842, int n, int n2, CallbackInfo callbackInfo) {
        class10946 class109462 = class10946.N((class01054)this, (class06584)class065842, (int)n, (int)n2);
        class11938.L().L((Object)class109462);
    }

    private void N(class07438 class074382, class07299 class072992, class06584 class065842, int n, int n2, int n3, CallbackInfo callbackInfo) {
        class10948 class109482 = class10948.N((class01054)this, (class06584)class065842, (int)n, (int)n2);
        class11938.L().L((Object)class109482);
    }

    public void N(class01590 class015902, class06584 class065842, int n, int n2, @Nullable String string, CallbackInfo callbackInfo) {
        if (!class065842.R()) {
            ((DrawItemStackOverlayCallback)DrawItemStackOverlayCallback.EVENT.invoker()).onDrawItemStackOverlay(this, class015902, class065842, n, n2);
        }
    }

    public void N(class06619 class066192) {
        this.E = class066192;
    }

    private String N(int n) {
        if (n <= 0) {
            return class06541.field_1061.toString() + n;
        }
        return String.valueOf(n);
    }

    public void N(class08844 class088442) {
        class088442.N(this.E);
    }

    private void N(RenderPipeline renderPipeline, class08388 class083882, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, CallbackInfo callbackInfo) {
        SpriteUtil.INSTANCE.markSpriteActive(class083882);
    }

    private class00577 N(float f) {
        return new class00577((Matrix3x2fc)new Matrix3x2f((Matrix3x2fc)this.Z), f, this.y.y());
    }

    public class00580 N(class01065 class010652, @Nullable Consumer<class00405> consumer) {
        return new class01074(this, this.N(1.0f), class010652, consumer);
    }

    public class00580 N(class01065 class010652) {
        return this.N(class010652, null);
    }

    public class00580 N(class06478 class064782, class01065 class010652) {
        return new class01074(this, this.N(class064782.method_75798()), class010652, null);
    }

    public class08388 N(class05913 class059132) {
        return this.z.N(class059132);
    }

    public int N() {
        return this.N.Nt().P();
    }

    public void N(int n, int n2, int n3, int n4) {
        if (n2 < n) {
            int n5 = n;
            n = n2;
            n2 = n5;
        }
        this.N(n, n3, n2 + 1, n3 + 1, n4);
    }

    public void N(RenderPipeline renderPipeline, class08388 class083882, int n, int n2, int n3, int n4, int n5) {
        this.N(renderPipeline, class083882, n, n2, n3, n4, n5, null);
        if (n3 == 0 || n4 == 0) {
            return;
        }
        this.N(renderPipeline, class083882.method_45852(), n, n + n3, n2, n2 + n4, class083882.method_4594(), class083882.method_4577(), class083882.method_4593(), class083882.method_4575(), n5);
    }

    public void N(RenderPipeline renderPipeline, class08388 class083882, int n, int n2, int n3, int n4) {
        this.N(renderPipeline, class083882, n, n2, n3, n4, -1);
    }

    public void N(RenderPipeline renderPipeline, class01894 class018942, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        class08388 class083882 = this.U.N(class018942);
        if (class01054.N(class083882) instanceof class01670) {
            this.N(renderPipeline, class083882, n, n2, n3, n4, n5, n6, n7, n8, n9);
        } else {
            this.L(n5, n6, n5 + n7, n6 + n8);
            this.N(renderPipeline, class018942, n5 - n3, n6 - n4, n, n2, n9);
            this.R();
        }
    }

    public void N(RenderPipeline renderPipeline, class01894 class018942, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        this.N(renderPipeline, class018942, n, n2, n3, n4, n5, n6, n7, n8, -1);
    }

    public void N(RenderPipeline renderPipeline, class01894 class018942, int n, int n2, int n3, int n4, int n5) {
        class08388 class083882 = this.U.N(class018942);
        class01650 class016502 = class01054.N(class083882);
        Objects.requireNonNull(class016502);
        class01650 class016503 = class016502;
        int n6 = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class01670.class, class01647.class, class01664.class}, (Object)class016503, (int)n6)) {
            case 0: {
                class01670 class016702 = (class01670)class016503;
                this.N(renderPipeline, class083882, n, n2, n3, n4, n5);
                break;
            }
            case 1: {
                class01647 class016472 = (class01647)class016503;
                this.N(renderPipeline, class083882, n, n2, n3, n4, 0, 0, class016472.y(), class016472.L(), class016472.y(), class016472.L(), n5);
                break;
            }
            case 2: {
                class01664 class016642 = (class01664)class016503;
                this.N(renderPipeline, class083882, class016642, n, n2, n3, n4, n5);
                break;
            }
        }
    }

    private static class01650 N(class08388 class083882) {
        return class083882.method_45851().method_73021(class01677.L).orElse(class01677.N).N();
    }

    public void N(RenderPipeline renderPipeline, class01894 class018942, int n, int n2, float f, float f2, int n3, int n4, int n5, int n6, int n7) {
        this.N(renderPipeline, class018942, n, n2, f, f2, n3, n4, n3, n4, n5, n6, n7);
    }

    private void N(RenderPipeline renderPipeline, class08388 class083882, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11) {
        if (n3 <= 0 || n4 <= 0) {
            return;
        }
        if (n7 <= 0 || n8 <= 0) {
            throw new IllegalArgumentException("Tile size must be positive, got " + n7 + "x" + n8);
        }
        class08918 class089182 = this.N.NO().y(class083882.method_45852());
        GpuTextureView gpuTextureView = class089182.method_71659();
        this.N(renderPipeline, gpuTextureView, class089182.method_75484(), n7, n8, n, n2, n + n3, n2 + n4, class083882.method_4580((float)n5 / (float)n9), class083882.method_4580((float)(n5 + n7) / (float)n9), class083882.method_4570((float)n6 / (float)n10), class083882.method_4570((float)(n6 + n8) / (float)n10), n11);
    }

    private void N(RenderPipeline renderPipeline, class01664 class016642, class08388 class083882, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11) {
        if (n3 <= 0 || n4 <= 0) {
            return;
        }
        if (class016642.i()) {
            this.N(renderPipeline, class083882.method_45852(), n, n + n3, n2, n2 + n4, class083882.method_4580((float)n5 / (float)n9), class083882.method_4580((float)(n5 + n7) / (float)n9), class083882.method_4570((float)n6 / (float)n10), class083882.method_4570((float)(n6 + n8) / (float)n10), n11);
        } else {
            this.N(renderPipeline, class083882, n, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11);
        }
    }

    private void N(RenderPipeline renderPipeline, class08388 class083882, class01664 class016642, int n, int n2, int n3, int n4, int n5) {
        class01643 class016432 = class016642.u();
        int n6 = Math.min(class016432.N(), n3 / 2);
        int n7 = Math.min(class016432.L(), n3 / 2);
        int n8 = Math.min(class016432.y(), n4 / 2);
        int n9 = Math.min(class016432.u(), n4 / 2);
        if (n3 == class016642.y() && n4 == class016642.L()) {
            this.N(renderPipeline, class083882, class016642.y(), class016642.L(), 0, 0, n, n2, n3, n4, n5);
            return;
        }
        if (n4 == class016642.L()) {
            this.N(renderPipeline, class083882, class016642.y(), class016642.L(), 0, 0, n, n2, n6, n4, n5);
            this.N(renderPipeline, class016642, class083882, n + n6, n2, n3 - n7 - n6, n4, n6, 0, class016642.y() - n7 - n6, class016642.L(), class016642.y(), class016642.L(), n5);
            this.N(renderPipeline, class083882, class016642.y(), class016642.L(), class016642.y() - n7, 0, n + n3 - n7, n2, n7, n4, n5);
            return;
        }
        if (n3 == class016642.y()) {
            this.N(renderPipeline, class083882, class016642.y(), class016642.L(), 0, 0, n, n2, n3, n8, n5);
            this.N(renderPipeline, class016642, class083882, n, n2 + n8, n3, n4 - n9 - n8, 0, n8, class016642.y(), class016642.L() - n9 - n8, class016642.y(), class016642.L(), n5);
            this.N(renderPipeline, class083882, class016642.y(), class016642.L(), 0, class016642.L() - n9, n, n2 + n4 - n9, n3, n9, n5);
            return;
        }
        this.N(renderPipeline, class083882, class016642.y(), class016642.L(), 0, 0, n, n2, n6, n8, n5);
        this.N(renderPipeline, class016642, class083882, n + n6, n2, n3 - n7 - n6, n8, n6, 0, class016642.y() - n7 - n6, n8, class016642.y(), class016642.L(), n5);
        this.N(renderPipeline, class083882, class016642.y(), class016642.L(), class016642.y() - n7, 0, n + n3 - n7, n2, n7, n8, n5);
        this.N(renderPipeline, class083882, class016642.y(), class016642.L(), 0, class016642.L() - n9, n, n2 + n4 - n9, n6, n9, n5);
        this.N(renderPipeline, class016642, class083882, n + n6, n2 + n4 - n9, n3 - n7 - n6, n9, n6, class016642.L() - n9, class016642.y() - n7 - n6, n9, class016642.y(), class016642.L(), n5);
        this.N(renderPipeline, class083882, class016642.y(), class016642.L(), class016642.y() - n7, class016642.L() - n9, n + n3 - n7, n2 + n4 - n9, n7, n9, n5);
        this.N(renderPipeline, class016642, class083882, n, n2 + n8, n6, n4 - n9 - n8, 0, n8, n6, class016642.L() - n9 - n8, class016642.y(), class016642.L(), n5);
        this.N(renderPipeline, class016642, class083882, n + n6, n2 + n8, n3 - n7 - n6, n4 - n9 - n8, n6, n8, class016642.y() - n7 - n6, class016642.L() - n9 - n8, class016642.y(), class016642.L(), n5);
        this.N(renderPipeline, class016642, class083882, n + n3 - n7, n2 + n8, n7, n4 - n9 - n8, class016642.y() - n7, n8, n7, class016642.L() - n9 - n8, class016642.y(), class016642.L(), n5);
    }

    private void N(RenderPipeline renderPipeline, class08388 class083882, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        this.N(renderPipeline, class083882, n, n2, n3, n4, n5, n6, n7, n8, n9, null);
        if (n7 == 0 || n8 == 0) {
            return;
        }
        this.N(renderPipeline, class083882.method_45852(), n5, n5 + n7, n6, n6 + n8, class083882.method_4580((float)n3 / (float)n), class083882.method_4580((float)(n3 + n7) / (float)n), class083882.method_4570((float)n4 / (float)n2), class083882.method_4570((float)(n4 + n8) / (float)n2), n9);
    }

    public void N(class01590 class015902, class05936 class059362, int n, int n2, int n3, int n4) {
        this.N(class015902, class059362, n, n2, n3, n4, true);
    }

    public void N(class01590 class015902, class00392 class003922, int n, int n2, int n3, boolean bl) {
        this.N(class015902, class003922.method_30937(), n, n2, n3, bl);
    }

    public void N(class01590 class015902, class01028 class010282, int n, int n2, int n3) {
        this.y(class015902, class010282, n - class015902.N(class010282) / 2, n2, n3);
    }

    public void N(class01590 class015902, class01028 class010282, int n, int n2, int n3, boolean bl) {
        if (class02566.y((int)n3) == 0) {
            return;
        }
        this.L.N(new class08652(class015902, class010282, (Matrix3x2fc)new Matrix3x2f((Matrix3x2fc)this.Z), n, n2, n3, 0, bl, false, this.y.y()));
    }

    public void N(class01590 class015902, @Nullable String string, int n, int n2, int n3, boolean bl) {
        if (string == null) {
            return;
        }
        this.N(class015902, class07018.y().N(class05936.R((String)string)), n, n2, n3, bl);
    }

    public void N(RenderPipeline renderPipeline, class01894 class018942, int n, int n2, int n3, int n4, float f) {
        this.N(renderPipeline, class018942, n, n2, n3, n4, class02566.y((float)f));
    }

    public void N(RenderPipeline renderPipeline, class01894 class018942, int n, int n2, int n3, int n4) {
        this.N(renderPipeline, class018942, n, n2, n3, n4, -1);
    }

    public void N(class01590 class015902, class00392 class003922, int n, int n2, int n3) {
        class01028 class010282 = class003922.method_30937();
        this.y(class015902, class010282, n - class015902.N(class010282) / 2, n2, n3);
    }

    public void N(class01590 class015902, class00392 class003922, int n, int n2, int n3, int n4) {
        int n5 = ((class05630)this.N.i_7).y(0.0f);
        if (n5 != 0) {
            int n6 = 2;
            Objects.requireNonNull(class015902);
            this.N(n - 2, n2 - 2, n + n3 + 2, n2 + 9 + 2, class02566.N((int)n5, (int)n4));
        }
        this.N(class015902, class003922, n, n2, n4, true);
    }

    public void N(class01590 class015902, class05936 class059362, int n, int n2, int n3, int n4, boolean bl) {
        for (class01028 class010282 : class015902.L(class059362, n3)) {
            this.N(class015902, class010282, n, n2, n4, bl);
            Objects.requireNonNull(class015902);
            n2 += 9;
        }
    }

    public void N(class01590 class015902, class06584 class065842, int n, int n2, @Nullable String string) {
        if (class065842.R()) {
            this.N(class015902, class065842, n, n2, string, null);
            return;
        }
        this.Z.pushMatrix();
        this.L(class065842, n, n2);
        this.u(class065842, n, n2);
        this.y(class015902, class065842, n, n2, string);
        this.Z.popMatrix();
        this.N(class015902, class065842, n, n2, string, null);
    }

    public void N(class01590 class015902, class06584 class065842, int n, int n2) {
        this.N(class015902, class065842, n, n2, null);
    }

    private void N(@Nullable class07438 class074382, @Nullable class07299 class072992, class06584 class065842, int n, int n2, int n3) {
        if (class065842.R()) {
            this.N(class074382, class072992, class065842, n, n2, n3, null);
            return;
        }
        class08763 class087632 = new class08763();
        this.N.NM().N((class08898)class087632, class065842, class03662.field_4317, class072992, (class08961)class074382, n3);
        try {
            this.L.N(new class08650(class065842.B().U().toString(), new Matrix3x2f((Matrix3x2fc)this.Z), class087632, n, n2, this.y.y()));
        }
        catch (Throwable throwable) {
            class07080 class070802 = class07080.N((Throwable)throwable, (String)"Rendering item");
            class07074 class070742 = class070802.N("Item being rendered");
            class070742.N("Item Type", () -> String.valueOf(class065842.B()));
            class070742.N("Item Components", () -> String.valueOf(class065842.y()));
            class070742.N("Item Foil", () -> String.valueOf(class065842.Q()));
            throw new class07878(class070802);
        }
        this.N(class074382, class072992, class065842, n, n2, n3, null);
    }

    public void N(class07438 class074382, class06584 class065842, int n, int n2, int n3) {
        this.N(class074382, class074382.method_73183(), class065842, n, n2, n3);
    }

    public void N(int n, int n2, int n3, int n4, boolean bl) {
        if (bl) {
            this.N(class08394.Nc, n, n2, n3, n4, -1);
        }
        this.N(class08394.NX, n, n2, n3, n4, -16776961);
    }

    public void N(class01590 class015902, String string, int n, int n2, int n3) {
        this.y(class015902, string, n - class015902.y(string) / 2, n2, n3);
    }

    public void N(class01590 class015902, List<class00392> list, Optional<class04830> optional, int n, int n2, @Nullable class01894 class018942) {
        List list2 = (List)list.stream().map(class00392::method_30937).map(class06357::N).collect(class07536.y());
        optional.ifPresent(class048302 -> list2.add(list2.isEmpty() ? 0 : 1, class06357.N((class04830)class048302)));
        this.N(class015902, list2, n, n2, class02128.N, class018942, false);
    }

    public void N(class01590 class015902, List<class00392> list, Optional<class04830> optional, int n, int n2) {
        this.N(class015902, list, optional, n, n2, null);
    }

    private void N(RenderPipeline renderPipeline, class08679 class086792, int n, int n2, int n3, int n4, int n5, @Nullable Integer n6) {
        this.L.N((class08669)new class08656(renderPipeline, class086792, (Matrix3x2fc)new Matrix3x2f((Matrix3x2fc)this.Z), n, n2, n3, n4, n5, n6 != null ? n6 : n5, this.y.y()));
    }

    public void N(List<class01028> list, int n, int n2) {
        this.N((class01590)this.N.i_3, list, class02128.N, n, n2, false);
    }

    public void N(class00392 class003922, int n, int n2) {
        this.N(List.of(class003922.method_30937()), n, n2);
    }

    private void N(RenderPipeline renderPipeline, class01894 class018942, int n, int n2, int n3, int n4, float f, float f2, float f3, float f4, int n5) {
        class08918 class089182 = this.N.NO().y(class018942);
        this.N(renderPipeline, class089182.method_71659(), class089182.method_75484(), n, n3, n2, n4, f, f2, f3, f4, n5);
    }

    public void N(class01894 class018942, int n, int n2, int n3, int n4, float f, float f2, float f3, float f4) {
        this.N(class08394.Na, class018942, n, n3, n2, n4, f, f2, f3, f4, -1);
    }

    public void N(RenderPipeline renderPipeline, class01894 class018942, int n, int n2, float f, float f2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        this.N(renderPipeline, class018942, n, n + n3, n2, n2 + n4, (f + 0.0f) / (float)n7, (f + (float)n5) / (float)n7, (f2 + 0.0f) / (float)n8, (f2 + (float)n6) / (float)n8, n9);
    }

    public void N(RenderPipeline renderPipeline, class01894 class018942, int n, int n2, float f, float f2, int n3, int n4, int n5, int n6, int n7, int n8) {
        this.N(renderPipeline, class018942, n, n2, f, f2, n3, n4, n5, n6, n7, n8, -1);
    }

    public void N(RenderPipeline renderPipeline, class01894 class018942, int n, int n2, float f, float f2, int n3, int n4, int n5, int n6) {
        this.N(renderPipeline, class018942, n, n2, f, f2, n3, n4, n3, n4, n5, n6);
    }

    public void N(class06584 class065842, int n, int n2, int n3) {
        this.N((class07438)((class04453)this.N.T_4), (class07299)((class03448)this.N.T_3), class065842, n, n2, n3);
    }

    public void N(class06584 class065842, int n, int n2) {
        this.N((class07438)((class04453)this.N.T_4), (class07299)((class03448)this.N.T_3), class065842, n, n2, 0);
    }

    private void N(RenderPipeline renderPipeline, GpuTextureView gpuTextureView, class08188 class081882, int n, int n2, int n3, int n4, int n5, int n6, float f, float f2, float f3, float f4, int n7) {
        this.L.N((class08669)new class06985(renderPipeline, class08679.N((GpuTextureView)gpuTextureView, (class08188)class081882), new Matrix3x2f((Matrix3x2fc)this.Z), n, n2, n3, n4, n5, n6, f, f2, f3, f4, n7, this.y.y()));
    }

    private void N(RenderPipeline renderPipeline, GpuTextureView gpuTextureView, class08188 class081882, int n, int n2, int n3, int n4, float f, float f2, float f3, float f4, int n5) {
        this.N(renderPipeline, gpuTextureView, class081882, n, n2, n3, n4, f, f2, f3, f4, n5, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)12, (String)"[com.mojang.blaze3d.pipeline.RenderPipeline, com.mojang.blaze3d.textures.GpuTextureView, net.minecraft.class_12137, int, int, int, int, float, float, float, float, int]");
            Object[] objectArray2 = objectArray;
            this.y((RenderPipeline)objectArray[0], (GpuTextureView)objectArray2[1], (class08188)objectArray2[2], (Integer)objectArray2[3], (Integer)objectArray2[4], (Integer)objectArray2[5], (Integer)objectArray2[6], ((Float)objectArray2[7]).floatValue(), ((Float)objectArray2[8]).floatValue(), ((Float)objectArray2[9]).floatValue(), ((Float)objectArray2[10]).floatValue(), (Integer)objectArray2[11]);
            return null;
        });
    }

    public void yacl$submit(class08669 class086692) {
        this.L.N(class086692);
    }

    public void R() {
        this.y.N();
    }

    public class03255 yacl$peekScissorStack() {
        return this.y.y();
    }
}

