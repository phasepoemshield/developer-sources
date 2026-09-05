/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  minecraft.class00392
 *  minecraft.class00500
 *  minecraft.class00999
 *  minecraft.class01028
 *  minecraft.class01143
 *  minecraft.class01237
 *  minecraft.class01421
 *  minecraft.class01423
 *  minecraft.class01583
 *  minecraft.class01686
 *  minecraft.class02022
 *  minecraft.class03662
 *  minecraft.class04790
 *  minecraft.class05436
 *  minecraft.class06031
 *  minecraft.class06202
 *  minecraft.class06271
 *  minecraft.class06327
 *  minecraft.class06889
 *  minecraft.class06959
 *  minecraft.class07209
 *  minecraft.class07295
 *  minecraft.class07311
 *  minecraft.class08098
 *  minecraft.class08103
 *  minecraft.class08107
 *  minecraft.class08109
 *  minecraft.class08112
 *  minecraft.class08113
 *  minecraft.class08121
 *  minecraft.class08130
 *  minecraft.class08141
 *  minecraft.class08143
 *  minecraft.class08146
 *  minecraft.class08388
 *  minecraft.class08453
 *  minecraft.class08800
 *  minecraft.class08804
 *  minecraft.class08887
 *  minecraft.class08915
 *  net.caffeinemc.mods.sodium.client.render.frapi.render.MeshItemCommand
 *  net.caffeinemc.mods.sodium.client.render.frapi.render.OrderedSubmitNodeCollectorExtension
 *  net.caffeinemc.mods.sodium.client.render.frapi.render.SubmitNodeCollectionExtension
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.renderer.v1.mesh.MeshView
 *  net.fabricmc.fabric.api.renderer.v1.render.ItemRenderTypeGetter
 *  net.fabricmc.fabric.impl.renderer.BatchingRenderCommandQueueExtension
 *  net.fabricmc.fabric.impl.renderer.ExtendedBlockCommand
 *  net.fabricmc.fabric.impl.renderer.ExtendedBlockStateModelCommand
 *  net.irisshaders.iris.layer.BlockEntityRenderStateShard
 *  net.irisshaders.iris.layer.OuterWrappedRenderType
 *  net.irisshaders.iris.layer.RenderingWrapper
 *  net.irisshaders.iris.mixinterface.ModelStorage
 *  net.irisshaders.iris.vertices.ImmediateState
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Quaternionf
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import minecraft.class00392;
import minecraft.class00500;
import minecraft.class00999;
import minecraft.class01028;
import minecraft.class01143;
import minecraft.class01237;
import minecraft.class01421;
import minecraft.class01423;
import minecraft.class01583;
import minecraft.class01686;
import minecraft.class02022;
import minecraft.class03662;
import minecraft.class04790;
import minecraft.class05436;
import minecraft.class06031;
import minecraft.class06202;
import minecraft.class06271;
import minecraft.class06327;
import minecraft.class06889;
import minecraft.class06959;
import minecraft.class07209;
import minecraft.class07295;
import minecraft.class07311;
import minecraft.class07926;
import minecraft.class07928;
import minecraft.class07942;
import minecraft.class08098;
import minecraft.class08103;
import minecraft.class08107;
import minecraft.class08109;
import minecraft.class08112;
import minecraft.class08113;
import minecraft.class08121;
import minecraft.class08130;
import minecraft.class08141;
import minecraft.class08143;
import minecraft.class08146;
import minecraft.class08388;
import minecraft.class08453;
import minecraft.class08800;
import minecraft.class08804;
import minecraft.class08887;
import minecraft.class08915;
import net.caffeinemc.mods.sodium.client.render.frapi.render.MeshItemCommand;
import net.caffeinemc.mods.sodium.client.render.frapi.render.OrderedSubmitNodeCollectorExtension;
import net.caffeinemc.mods.sodium.client.render.frapi.render.SubmitNodeCollectionExtension;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.mesh.MeshView;
import net.fabricmc.fabric.api.renderer.v1.render.ItemRenderTypeGetter;
import net.fabricmc.fabric.impl.renderer.BatchingRenderCommandQueueExtension;
import net.fabricmc.fabric.impl.renderer.ExtendedBlockCommand;
import net.fabricmc.fabric.impl.renderer.ExtendedBlockStateModelCommand;
import net.irisshaders.iris.layer.BlockEntityRenderStateShard;
import net.irisshaders.iris.layer.OuterWrappedRenderType;
import net.irisshaders.iris.layer.RenderingWrapper;
import net.irisshaders.iris.mixinterface.ModelStorage;
import net.irisshaders.iris.vertices.ImmediateState;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Quaternionf;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(value=EnvType.CLIENT)
public class class07937
implements class07926,
OrderedSubmitNodeCollectorExtension,
SubmitNodeCollectionExtension,
BatchingRenderCommandQueueExtension {
    private final List<class08130> N;
    private final List<class06031> y;
    private final class08112 L;
    private final List<class08113> u;
    private final List<class08146> i;
    private final List<class01143> R;
    private final List<class08121> M;
    private final List<class06327> B;
    private final List<class08109> Z;
    private final List<class05436> z;
    private final class08103 U;
    private final class07928 E;
    private final class08143 W;
    private final class04790 m;
    private boolean P = false;
    private final List s = new ArrayList();
    private final List T = new ArrayList();
    private final List b = new ArrayList();

    public class08112 L() {
        return this.L;
    }

    public List<class08121> M() {
        return this.M;
    }

    public void P() {
        this.N.clear();
        this.y.clear();
        this.L.N();
        this.u.clear();
        this.i.clear();
        this.R.clear();
        this.M.clear();
        this.B.clear();
        this.Z.clear();
        this.z.clear();
        this.U.N();
        this.W.N();
        this.E.N();
        this.y(null);
        this.N((CallbackInfo)null);
    }

    public class07937(class04790 class047902) {
        this.N = new ArrayList<class08130>();
        this.y = new ArrayList<class06031>();
        this.L = new class08112();
        this.u = new ArrayList<class08113>();
        this.i = new ArrayList<class08146>();
        this.R = new ArrayList<class01143>();
        this.M = new ArrayList<class08121>();
        this.B = new ArrayList<class06327>();
        this.Z = new ArrayList<class08109>();
        this.z = new ArrayList<class05436>();
        this.U = new class08103();
        this.E = new class07928();
        this.W = new class08143();
        this.m = class047902;
    }

    public List<class06327> B() {
        return this.B;
    }

    public class07928 Z() {
        return this.E;
    }

    public List<class08146> i() {
        return this.i;
    }

    public void s() {
        this.U.y();
        this.E.y();
        this.W.y();
        this.P = false;
    }

    public boolean m() {
        return this.P;
    }

    public List<class05436> U() {
        return this.z;
    }

    public List<class08109> z() {
        return this.Z;
    }

    public List<class08113> u() {
        return this.u;
    }

    private void y(class01421 class014212, class07311 class073112, class00999 class009992) {
        this.P = true;
        this.W.N(class014212, class073112, class009992);
    }

    private void y(class06271 class062712, Object object, class01421 class014212, class07311 class073112, int n, int n2, int n3, class08388 class083882, int n4, class08141 class081412) {
        class08107 class081072;
        this.P = true;
        class08107 class081073 = class081072 = new class08107(class014212.L().u(), class062712, object, n, n2, n3, class083882, n4, class081412);
        class07311 class073113 = class073112;
        class08103 class081032 = this.U;
        this.N(class081032, class073113, class081073, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)3, (String)"[net.minecraft.class_11683$class_12048, net.minecraft.class_1921, net.minecraft.class_11661$class_11670]");
            Object[] objectArray2 = objectArray;
            ((class08103)objectArray[0]).N((class07311)objectArray2[1], (class08107)objectArray2[2]);
            return null;
        });
    }

    private void y(CallbackInfo callbackInfo) {
        this.s.clear();
        this.T.clear();
    }

    private boolean y(List list, Object object, Operation operation) {
        ((ModelStorage)object).iris$capture();
        return (Boolean)operation.call(new Object[]{list, object});
    }

    public List<class06031> y() {
        return this.y;
    }

    public class08103 E() {
        return this.U;
    }

    private boolean N(List list, Object object, Operation operation) {
        ((ModelStorage)object).iris$capture();
        return (Boolean)operation.call(new Object[]{list, object});
    }

    public void N(CallbackInfo callbackInfo) {
        this.b.clear();
    }

    private void N(class06271 class062712, Object object, class01421 class014212, class07311 class073112, int n, int n2, int n3, class08388 class083882, int n4, class08141 class081412, Operation operation) {
        if (ImmediateState.isRenderingBEs) {
            class073112 = OuterWrappedRenderType.wrapExactlyOnce((String)"iris:block_entity", (class07311)class073112, (RenderingWrapper)BlockEntityRenderStateShard.INSTANCE);
        }
        operation.call(new Object[]{class062712, object, class014212, class073112, n, n2, n3, class083882, n4, class081412});
    }

    private void N(class08103 class081032, class07311 class073112, class08107 class081072, Operation operation) {
        ((ModelStorage)class081072).iris$capture();
        operation.call(new Object[]{class081032, class073112, class081072});
    }

    private void N(class01421 class014212, class07311 class073112, class00999 class009992, Operation operation) {
        if (ImmediateState.isRenderingBEs) {
            class073112 = OuterWrappedRenderType.wrapExactlyOnce((String)"iris:block_entity", (class07311)class073112, (RenderingWrapper)BlockEntityRenderStateShard.INSTANCE);
        }
        operation.call(new Object[]{class014212, class073112, class009992});
    }

    @Override
    public void N(class01421 class014212, float f, List<class08453> list) {
        this.P = true;
        class01423 class014232 = class014212.L();
        this.N.add(new class08130(new Matrix4f((Matrix4fc)class014232.N()), f, list));
    }

    private void N(class07928 class079282, class07311 class073112, class08098 class080982, Operation operation) {
        ((ModelStorage)class080982).iris$capture();
        operation.call(new Object[]{class079282, class073112, class080982});
    }

    @Override
    public void N(class01421 class014212, class07311 class073112, class00999 class009992) {
        this.N(class014212, class073112, class009992, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)3, (String)"[net.minecraft.class_4587, net.minecraft.class_1921, net.minecraft.class_11659$class_11660]");
            Object[] objectArray2 = objectArray;
            this.y((class01421)objectArray[0], (class07311)objectArray2[1], (class00999)objectArray2[2]);
            return null;
        });
    }

    @Override
    public void N(class05436 class054362) {
        this.P = true;
        this.z.add(class054362);
    }

    @Override
    public void N(class01421 class014212, class00500 class005002, int n, int n2, int n3) {
        this.P = true;
        this.R.add(new class01143(class014212.L().u(), class005002, n, n2, n3));
        class06202.Nq().D().L().N(class005002.i(), class03662.field_4315, class014212, (class01237)this.m, n, n2, n3);
    }

    @Override
    public <S> void N(class06271<? super S> class062712, S s, class01421 class014212, class07311 class073112, int n, int n2, int n3, @Nullable class08388 class083882, int n4, @Nullable class08141 class081412) {
        this.N(class062712, s, class014212, class073112, n, n2, n3, class083882, n4, class081412, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)10, (String)"[net.minecraft.class_3879, java.lang.Object, net.minecraft.class_4587, net.minecraft.class_1921, int, int, int, net.minecraft.class_1058, int, net.minecraft.class_11683$class_11792]");
            Object[] objectArray2 = objectArray;
            this.y((class06271)objectArray[0], objectArray2[1], (class01421)objectArray2[2], (class07311)objectArray2[3], (Integer)objectArray2[4], (Integer)objectArray2[5], (Integer)objectArray2[6], (class08388)objectArray2[7], (Integer)objectArray2[8], (class08141)objectArray2[9]);
            return null;
        });
    }

    @Override
    public void N(class01421 class014212, class03662 class036622, int n, int n2, int n3, int[] nArray, List<class02022> list, class07311 class073112, class08915 class089152) {
        this.P = true;
        class08109 class081092 = new class08109(class014212.L().u(), class036622, n, n2, n3, nArray, list, class073112, class089152);
        List<class08109> var10 = this.Z;
        this.N(var10, class081092, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)2, (String)"[java.util.List, java.lang.Object]");
            return ((List)objectArray[0]).add(objectArray[1]);
        });
    }

    @Override
    public void N(class01421 class014212, class07311 class073112, class08887 class088872, float f, float f2, float f3, int n, int n2, int n3) {
        this.P = true;
        this.B.add(new class06327(class014212.L().u(), class073112, class088872, f, f2, f3, n, n2, n3));
    }

    @Override
    public void N(class01421 class014212, class07942 class079422) {
        this.P = true;
        this.M.add(new class08121(new Matrix4f((Matrix4fc)class014212.L().N()), class079422));
    }

    public List<class08130> N() {
        return this.N;
    }

    @Override
    public void N(class01421 class014212, @Nullable class06889 class068892, int n, class00392 class003922, boolean bl, int n2, double d, class06959 class069592) {
        this.P = true;
        this.L.N(class014212, class068892, n, class003922, bl, n2, d, class069592);
    }

    @Override
    public void N(class01686 class016862, class01421 class014212, class07311 class073112, int n, int n2, @Nullable class08388 class083882, boolean bl, boolean bl2, int n3, @Nullable class08141 class081412, int n4) {
        this.P = true;
        class08098 class080982 = new class08098(class014212.L().u(), class016862, n, n2, class083882, bl, bl2, n3, class081412, n4);
        class07311 class073113 = class073112;
        class07928 class079282 = this.E;
        this.N(class079282, class073113, class080982, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)3, (String)"[net.minecraft.class_11793$class_12049, net.minecraft.class_1921, net.minecraft.class_11661$class_11789]");
            Object[] objectArray2 = objectArray;
            ((class07928)objectArray[0]).N((class07311)objectArray2[1], (class08098)objectArray2[2]);
            return null;
        });
    }

    @Override
    public void N(class01421 class014212, float f, float f2, class01028 class010282, boolean bl, class01583 class015832, int n, int n2, int n3, int n4) {
        this.P = true;
        class08113 class081132 = new class08113(new Matrix4f((Matrix4fc)class014212.L().N()), f, f2, class010282, bl, class015832, n, n2, n3, n4);
        List<class08113> var11 = this.u;
        this.y(var11, class081132, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)2, (String)"[java.util.List, java.lang.Object]");
            return ((List)objectArray[0]).add(objectArray[1]);
        });
    }

    @Override
    public void N(class01421 class014212, class08800 class088002, Quaternionf quaternionf) {
        this.P = true;
        this.y.add(new class06031(class014212.L().u(), class088002, quaternionf));
    }

    @Override
    public void N(class01421 class014212, class08804 class088042) {
        this.P = true;
        this.i.add(new class08146(new Matrix4f((Matrix4fc)class014212.L().N()), class088042));
    }

    public void fabric_submitItem(class01421 class014212, class03662 class036622, int n, int n2, int n3, int[] nArray, List list, class07311 class073112, class08915 class089152, MeshView meshView, ItemRenderTypeGetter itemRenderTypeGetter) {
        this.P = true;
        this.b.add(new MeshItemCommand(class014212.L().u(), class036622, n, n2, n3, nArray, list, class073112, class089152, meshView, itemRenderTypeGetter));
    }

    public void submitBlock(class01421 class014212, class00500 class005002, int n, int n2, int n3, class07295 class072952, class07209 class072092) {
        this.P = true;
        this.s.add(new ExtendedBlockCommand(class014212.L().u(), class005002, n, n2, n3, class072952, class072092));
        class06202.Nq().D().L().N(class005002.i(), class03662.field_4315, class014212, (class01237)this.m, n, n2, n3);
    }

    public class08143 W() {
        return this.W;
    }

    public List<class01143> R() {
        return this.R;
    }

    public void submitBlockStateModel(class01421 class014212, Function function, class08887 class088872, float f, float f2, float f3, int n, int n2, int n3, class07295 class072952, class07209 class072092, class00500 class005002) {
        this.P = true;
        this.T.add(new ExtendedBlockStateModelCommand(class014212.L().u(), function, class088872, f, f2, f3, n, n2, n3, class072952, class072092, class005002));
    }

    public List fabric_getExtendedBlockCommands() {
        return this.s;
    }

    public List fabric_getExtendedBlockStateModelCommands() {
        return this.T;
    }

    public List sodium_getMeshItemCommands() {
        return this.b;
    }
}

