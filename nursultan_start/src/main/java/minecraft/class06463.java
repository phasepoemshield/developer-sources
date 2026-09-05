/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Strings
 *  com.mojang.blaze3d.buffers.GpuBuffer
 *  com.mojang.blaze3d.buffers.GpuBufferSlice
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  com.mojang.blaze3d.systems.RenderPass
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.systems.RenderSystem$class_5590
 *  com.mojang.blaze3d.textures.GpuTextureView
 *  com.mojang.blaze3d.vertex.VertexFormat$class_5596
 *  com.mojang.datafixers.DataFixUtils
 *  it.unimi.dsi.fastutil.objects.Reference2LongArrayMap
 *  it.unimi.dsi.fastutil.objects.Reference2LongMap$Entry
 *  me.flashyreese.mods.sodiumextra.client.SodiumExtraClientMod
 *  minecraft.class00549
 *  minecraft.class00570
 *  minecraft.class01054
 *  minecraft.class01285
 *  minecraft.class01590
 *  minecraft.class01894
 *  minecraft.class02270
 *  minecraft.class02276
 *  minecraft.class02303
 *  minecraft.class02427
 *  minecraft.class02579
 *  minecraft.class02609
 *  minecraft.class02869
 *  minecraft.class03448
 *  minecraft.class03469
 *  minecraft.class03716
 *  minecraft.class03718
 *  minecraft.class03751
 *  minecraft.class03755
 *  minecraft.class04453
 *  minecraft.class04643
 *  minecraft.class04782
 *  minecraft.class05096
 *  minecraft.class05363
 *  minecraft.class05630
 *  minecraft.class05731
 *  minecraft.class05834
 *  minecraft.class05850
 *  minecraft.class06134
 *  minecraft.class06202
 *  minecraft.class06541
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07321
 *  minecraft.class07331
 *  minecraft.class07536
 *  minecraft.class07835
 *  minecraft.class08066
 *  minecraft.class08337
 *  minecraft.class08394
 *  minecraft.class08694
 *  minecraft.class08700
 *  minecraft.class08771
 *  net.caffeinemc.mods.sodium.client.SodiumClientMod
 *  net.caffeinemc.mods.sodium.client.util.FrameTimeStatistics
 *  net.caffeinemc.mods.sodium.client.util.FrameTimeStatistics$Percentile
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fStack
 *  org.joml.Matrix4fc
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 *  org.joml.Vector4f
 *  org.joml.Vector4fc
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.google.common.base.Strings;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.datafixers.DataFixUtils;
import it.unimi.dsi.fastutil.objects.Reference2LongArrayMap;
import it.unimi.dsi.fastutil.objects.Reference2LongMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.concurrent.CompletableFuture;
import me.flashyreese.mods.sodiumextra.client.SodiumExtraClientMod;
import minecraft.class00549;
import minecraft.class00570;
import minecraft.class01054;
import minecraft.class01285;
import minecraft.class01590;
import minecraft.class01894;
import minecraft.class02270;
import minecraft.class02276;
import minecraft.class02303;
import minecraft.class02427;
import minecraft.class02579;
import minecraft.class02609;
import minecraft.class02869;
import minecraft.class03448;
import minecraft.class03469;
import minecraft.class03716;
import minecraft.class03718;
import minecraft.class03751;
import minecraft.class03755;
import minecraft.class04453;
import minecraft.class04643;
import minecraft.class04782;
import minecraft.class05096;
import minecraft.class05363;
import minecraft.class05630;
import minecraft.class05731;
import minecraft.class05834;
import minecraft.class05850;
import minecraft.class06134;
import minecraft.class06202;
import minecraft.class06428;
import minecraft.class06473;
import minecraft.class06541;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07321;
import minecraft.class07331;
import minecraft.class07536;
import minecraft.class07835;
import minecraft.class08066;
import minecraft.class08337;
import minecraft.class08394;
import minecraft.class08694;
import minecraft.class08700;
import minecraft.class08771;
import net.caffeinemc.mods.sodium.client.SodiumClientMod;
import net.caffeinemc.mods.sodium.client.util.FrameTimeStatistics;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;
import org.joml.Matrix4fc;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.joml.Vector4f;
import org.joml.Vector4fc;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class06463 {
    private static final float N = 0.01f;
    private static final int y = 36;
    private static final int L = 2;
    private static final int u = 2;
    private static final int i = 2;
    private final class06202 R;
    private final class01590 M;
    private final GpuBuffer B;
    private final RenderSystem.class_5590 Z;
    private @Nullable class07321 z;
    private @Nullable class00570 U;
    private @Nullable CompletableFuture<class00570> E;
    private boolean W;
    private boolean m;
    private boolean P;
    private final class02270 s;
    private final class02270 T;
    private final class02270 b;
    private final class02270 j;
    private final Map<class02303, class02270> v;
    private final class03755 n;
    private final class03751 t;
    private final class03716 G;
    private final class03718 l;
    private final class02427 d;
    private final List w = new ArrayList();
    private final List k = new ArrayList();
    private long Y = 0L;
    private boolean Q = true;

    public boolean L() {
        return ((class05731)this.R.L_0).u() && this.W;
    }

    public void M() {
        boolean bl = this.m = !((class05731)this.R.L_0).u() || !this.m;
        if (this.m) {
            ((class05731)this.R.L_0).N(true);
            this.P = false;
        }
    }

    private @Nullable class07299 P() {
        if ((class03448)this.R.T_3 == null) {
            return null;
        }
        return (class07299)DataFixUtils.orElse(Optional.ofNullable(this.R.Na()).flatMap(class083372 -> Optional.ofNullable(class083372.N(((class03448)this.R.T_3).method_27983()))), (Object)((class03448)this.R.T_3));
    }

    private @Nullable class00570 T() {
        if ((class03448)this.R.T_3 == null || this.z == null) {
            return null;
        }
        if (this.U == null) {
            this.U = ((class03448)this.R.T_3).method_8497(this.z.B, this.z.Z);
        }
        return this.U;
    }

    public class06463(class06202 class062022) {
        this.Z = RenderSystem.getSequentialBuffer((VertexFormat.class_5596)VertexFormat.class_5596.field_27377);
        this.s = new class02270(1);
        this.T = new class02270(class02869.values().length);
        this.b = new class02270(1);
        this.j = new class02270(1);
        this.v = Map.of(class02303.field_48817, this.T);
        this.R = class062022;
        this.M = (class01590)class062022.i_3;
        this.n = new class03755(this.M, (class02276)this.s);
        this.t = new class03751(this.M, (class02276)this.T, () -> Float.valueOf((class03448)class062022.T_3 == null ? 0.0f : ((class03448)class062022.T_3).method_54719().M()));
        this.G = new class03716(this.M, (class02276)this.b);
        this.l = new class03718(this.M, (class02276)this.j);
        this.d = new class02427(this.M);
        try (class02579 class025792 = class02579.N((int)(class07835.P.getVertexSize() * 12 * 2));){
            class07331 class073312 = new class07331(class025792, VertexFormat.class_5596.field_27377, class07835.P);
            class073312.method_22912(0.0f, 0.0f, 0.0f).method_39415(-16777216).method_22914(1.0f, 0.0f, 0.0f).method_75298(4.0f);
            class073312.method_22912(1.0f, 0.0f, 0.0f).method_39415(-16777216).method_22914(1.0f, 0.0f, 0.0f).method_75298(4.0f);
            class073312.method_22912(0.0f, 0.0f, 0.0f).method_39415(-16777216).method_22914(0.0f, 1.0f, 0.0f).method_75298(4.0f);
            class073312.method_22912(0.0f, 1.0f, 0.0f).method_39415(-16777216).method_22914(0.0f, 1.0f, 0.0f).method_75298(4.0f);
            class073312.method_22912(0.0f, 0.0f, 0.0f).method_39415(-16777216).method_22914(0.0f, 0.0f, 1.0f).method_75298(4.0f);
            class073312.method_22912(0.0f, 0.0f, 1.0f).method_39415(-16777216).method_22914(0.0f, 0.0f, 1.0f).method_75298(4.0f);
            class073312.method_22912(0.0f, 0.0f, 0.0f).method_39415(-65536).method_22914(1.0f, 0.0f, 0.0f).method_75298(2.0f);
            class073312.method_22912(1.0f, 0.0f, 0.0f).method_39415(-65536).method_22914(1.0f, 0.0f, 0.0f).method_75298(2.0f);
            class073312.method_22912(0.0f, 0.0f, 0.0f).method_39415(-16711936).method_22914(0.0f, 1.0f, 0.0f).method_75298(2.0f);
            class073312.method_22912(0.0f, 1.0f, 0.0f).method_39415(-16711936).method_22914(0.0f, 1.0f, 0.0f).method_75298(2.0f);
            class073312.method_22912(0.0f, 0.0f, 0.0f).method_39415(-8421377).method_22914(0.0f, 0.0f, 1.0f).method_75298(2.0f);
            class073312.method_22912(0.0f, 0.0f, 1.0f).method_39415(-8421377).method_22914(0.0f, 0.0f, 1.0f).method_75298(2.0f);
            try (class02609 class026092 = class073312.y();){
                this.B = RenderSystem.getDevice().createBuffer(() -> "Crosshair vertex buffer", 32, class026092.N());
            }
        }
    }

    public void B() {
        boolean bl = this.W = !((class05731)this.R.L_0).u() || !this.W;
        if (this.W) {
            ((class05731)this.R.L_0).N(true);
        }
    }

    public class02270 Z() {
        return this.T;
    }

    public boolean i() {
        return ((class05731)this.R.L_0).u() && this.m;
    }

    private @Nullable class00570 s() {
        if ((class03448)this.R.T_3 == null || this.z == null) {
            return null;
        }
        if (this.E == null) {
            class04782 class047822 = this.m();
            if (class047822 == null) {
                return null;
            }
            this.E = class047822.method_14178().y(this.z.B, this.z.Z, class00549.m, false).thenApply(class028182 -> (class00570)class028182.y(null));
        }
        return this.E.getNow(null);
    }

    private @Nullable class04782 m() {
        if ((class03448)this.R.T_3 == null) {
            return null;
        }
        class08337 class083372 = this.R.Na();
        if (class083372 != null) {
            return class083372.N(((class03448)this.R.T_3).method_27983());
        }
        return null;
    }

    public class02270 U() {
        return this.j;
    }

    public class02270 z() {
        return this.b;
    }

    public boolean u() {
        return ((class05731)this.R.L_0).u() && this.P;
    }

    public boolean y() {
        class05731 class057312 = (class05731)this.R.L_0;
        return !(!class057312.u() && class057312.y().isEmpty() || ((class05630)this.R.i_7).NG && (class05096)this.R.v_3 == null);
    }

    private static long y(long l) {
        return l > 0L ? Math.round(1.0E9 / (double)l) : 0L;
    }

    public void y(class06463 class064632, class01054 class010542, List list, boolean bl) {
        if (this.Q) {
            this.k.clear();
            this.k.addAll(list);
        }
        this.N(class010542, this.k, bl);
    }

    public class02427 E() {
        return this.d;
    }

    private void N(class01054 class010542, CallbackInfo callbackInfo, List list) {
        if (!((class05731)class06202.Nq().L_0).y(SodiumClientMod.SODIUM_FPS_PERCENTILES)) {
            return;
        }
        Reference2LongArrayMap var5 = FrameTimeStatistics.INSTANCE.get();
        if (var5 == null || var5.isEmpty()) {
            return;
        }
        int n = 0;
        for (int i = 0; i < list.size(); ++i) {
            String string = (String)list.get(i);
            if (string == null || !string.contains(" fps T:")) continue;
            n = i + 1;
            break;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Reference2LongMap.Entry entry : var5.reference2LongEntrySet()) {
            if (!stringBuilder.isEmpty()) {
                stringBuilder.append(' ');
            }
            long l = entry.getLongValue();
            stringBuilder.append(class06541.field_1080).append(((FrameTimeStatistics.Percentile)entry.getKey()).name()).append('=').append(class06541.field_1070).append(class06463.y(l));
        }
        stringBuilder.append(class06541.field_1080).append(" fps");
        list.add(n, stringBuilder.toString());
    }

    public void N() {
        this.E = null;
        this.U = null;
    }

    private void N(long l, CallbackInfo callbackInfo) {
        FrameTimeStatistics.INSTANCE.logSample(l);
    }

    public void N(class01054 class010542, CallbackInfo callbackInfo) {
        if (SodiumExtraClientMod.options().extraSettings.steadyDebugHud) {
            long l = class07536.L();
            if (l > this.Y) {
                this.Q = true;
                this.Y = l + (long)SodiumExtraClientMod.options().extraSettings.steadyDebugHudRefreshInterval * 50L;
            } else {
                this.Q = false;
            }
        } else {
            this.Q = true;
        }
    }

    public void N(class06463 class064632, class01054 class010542, List list, boolean bl) {
        if (this.Q) {
            this.w.clear();
            this.w.addAll(list);
        }
        this.N(class010542, this.w, bl);
    }

    public void N(long l) {
        this.N(l, null);
        this.s.N(l);
    }

    private void N(class01054 class010542, List<String> list, boolean bl) {
        int n;
        int n2;
        int n3;
        String string;
        int n4;
        Objects.requireNonNull(this.M);
        int n5 = 9;
        for (n4 = 0; n4 < list.size(); ++n4) {
            string = list.get(n4);
            if (Strings.isNullOrEmpty((String)string)) continue;
            n3 = this.M.y(string);
            n2 = bl ? 2 : class010542.N() - 2 - n3;
            n = 2 + n5 * n4;
            class010542.N(n2 - 1, n - 1, n2 + n3 + 1, n + n5 - 1, -1873784752);
        }
        for (n4 = 0; n4 < list.size(); ++n4) {
            string = list.get(n4);
            if (Strings.isNullOrEmpty((String)string)) continue;
            n3 = this.M.y(string);
            n2 = bl ? 2 : class010542.N() - 2 - n3;
            n = 2 + n5 * n4;
            class010542.N(this.M, string, n2, n, -2039584, false);
        }
    }

    public void N(long[] lArray, class02303 class023032) {
        class02270 class022702 = this.v.get(class023032);
        if (class022702 != null) {
            class022702.N(lArray);
        }
    }

    public void N(class01054 class010542) {
        class08337 class083372;
        Object object;
        ArrayList arrayList;
        class07321 class073212;
        Object object2;
        this.N(class010542, null);
        class05630 class056302 = (class05630)this.R.i_7;
        if (!this.R.yu() || class056302.NG && (class05096)this.R.v_3 == null) {
            return;
        }
        Collection var3 = ((class05731)this.R.L_0).y();
        if (var3.isEmpty()) {
            return;
        }
        class010542.L();
        class04643 class046432 = class08700.N();
        class046432.N("debug");
        if (this.R.F() != null && (class03448)this.R.T_3 != null) {
            object2 = this.R.F().method_24515();
            class073212 = new class07321((class07209)object2);
        } else {
            class073212 = null;
        }
        if (!Objects.equals(this.z, class073212)) {
            this.z = class073212;
            this.N();
        }
        object2 = new ArrayList();
        ArrayList<String> arrayList2 = new ArrayList<String>();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList3 = new ArrayList();
        class06473 class064732 = new class06473(this, (List)object2, arrayList2, arrayList3, linkedHashMap);
        class07299 class072992 = this.P();
        for (class01894 class018942 : var3) {
            class01285 class012852 = class06134.N((class01894)class018942);
            if (class012852 == null) continue;
            class012852.method_72751((class05834)class064732, class072992, this.T(), this.s());
        }
        if (!object2.isEmpty()) {
            object2.add("");
        }
        if (!arrayList2.isEmpty()) {
            arrayList2.add("");
        }
        if (!arrayList3.isEmpty()) {
            int n = (arrayList3.size() + 1) / 2;
            object2.addAll(arrayList3.subList(0, n));
            arrayList2.addAll(arrayList3.subList(n, arrayList3.size()));
            object2.add("");
            if (n < arrayList3.size()) {
                arrayList2.add("");
            }
        }
        if (!(arrayList = new ArrayList(linkedHashMap.values())).isEmpty()) {
            int n = (arrayList.size() + 1) / 2;
            for (int i = 0; i < arrayList.size(); ++i) {
                object = (Collection)arrayList.get(i);
                if (object.isEmpty()) continue;
                if (i < n) {
                    object2.addAll(object);
                    object2.add("");
                    continue;
                }
                arrayList2.addAll((Collection<String>)object);
                arrayList2.add("");
            }
        }
        if (((class05731)this.R.L_0).u()) {
            object2.add("");
            boolean bl = this.R.Na() != null;
            class06428 class064282 = class056302.r;
            object = class064282.m().getString();
            String string = "[" + (String)(class064282.W() ? "" : (String)object + "+");
            String string2 = string + class056302.NT.m().getString() + "]";
            String string3 = string + class056302.Nb.m().getString() + "]";
            String string4 = string + class056302.Nj.m().getString() + "]";
            object2.add("Debug charts: " + string2 + " Profiler " + (this.W ? "visible" : "hidden") + "; " + string3 + " " + (bl ? "FPS + TPS " : "FPS ") + (this.m ? "visible" : "hidden") + "; " + string4 + " " + (!this.R.q() ? "Bandwidth + Ping" : "Ping") + (this.P ? " visible" : " hidden"));
            String string5 = string + class056302.Nz.m().getString() + "]";
            object2.add("To edit: press " + string5);
        }
        this.N(class010542, null, (List)object2);
        boolean bl = true;
        ArrayList<String> arrayList4 = object2;
        class01054 class010543 = class010542;
        class06463 class064632 = this;
        this.N(class064632, class010543, arrayList4, bl);
        bl = false;
        arrayList4 = arrayList2;
        class010543 = class010542;
        class064632 = this;
        this.y(class064632, class010543, arrayList4, bl);
        class010542.L();
        this.d.N(10);
        if (this.i()) {
            int n = class010542.N();
            int n2 = n / 2;
            this.n.N(class010542, 0, this.n.N(n2));
            if (this.T.u() > 0) {
                int n3 = this.t.N(n2);
                this.t.N(class010542, n - n3, n3);
            }
            this.d.N(this.t.N());
        }
        if (this.u() && this.R.NE() != null) {
            int n = class010542.N();
            int n4 = n / 2;
            if (!this.R.q()) {
                this.l.N(class010542, 0, this.l.N(n4));
            }
            int n5 = this.G.N(n4);
            this.G.N(class010542, n - n5, n5);
            this.d.N(this.G.N());
        }
        if (((class05731)this.R.L_0).y(class06134.V) && (class083372 = this.R.Na()) != null && (class04453)this.R.T_4 != null) {
            class08771 class087712 = class083372.z(16 + class03469.N);
            class087712.N(((class04453)this.R.T_4).method_73183().method_27983(), ((class04453)this.R.T_4).method_31476());
            class05850.N((class01054)class010542, (int)(class010542.N() / 2), (int)(class010542.y() / 2), (int)4, (int)1, (class08771)class087712);
        }
        try (class08694 class086942 = class046432.i("profilerPie");){
            this.d.N(class010542);
        }
        class046432.L();
    }

    public void N(class05363 class053632) {
        Matrix4fStack matrix4fStack = RenderSystem.getModelViewStack();
        matrix4fStack.pushMatrix();
        matrix4fStack.translate(0.0f, 0.0f, -1.0f);
        matrix4fStack.rotateX(class053632.i() * ((float)Math.PI / 180));
        matrix4fStack.rotateY(class053632.R() * ((float)Math.PI / 180));
        float f = 0.01f * (float)this.R.Nt().j();
        matrix4fStack.scale(-f, f, -f);
        RenderPipeline renderPipeline = class08394.Nt;
        class08066 class080662 = class06202.Nq().e();
        GpuTextureView gpuTextureView = class080662.u();
        GpuTextureView gpuTextureView2 = class080662.R();
        GpuBuffer gpuBuffer = this.Z.method_68274(36);
        GpuBufferSlice gpuBufferSlice = RenderSystem.getDynamicUniforms().N((Matrix4fc)matrix4fStack, (Vector4fc)new Vector4f(1.0f, 1.0f, 1.0f, 1.0f), (Vector3fc)new Vector3f(), (Matrix4fc)new Matrix4f());
        try (RenderPass renderPass = RenderSystem.getDevice().createCommandEncoder().createRenderPass(() -> "3d crosshair", gpuTextureView, OptionalInt.empty(), gpuTextureView2, OptionalDouble.empty());){
            renderPass.setPipeline(renderPipeline);
            RenderSystem.bindDefaultUniforms((RenderPass)renderPass);
            renderPass.setVertexBuffer(0, this.B);
            renderPass.setIndexBuffer(gpuBuffer, this.Z.method_31924());
            renderPass.setUniform("DynamicTransforms", gpuBufferSlice);
            renderPass.drawIndexed(0, 0, 36, 1);
        }
        matrix4fStack.popMatrix();
    }

    public void W() {
        this.T.i();
        this.b.i();
        this.j.i();
    }

    public void R() {
        boolean bl = this.P = !((class05731)this.R.L_0).u() || !this.P;
        if (this.P) {
            ((class05731)this.R.L_0).N(true);
            this.m = false;
        }
    }
}

