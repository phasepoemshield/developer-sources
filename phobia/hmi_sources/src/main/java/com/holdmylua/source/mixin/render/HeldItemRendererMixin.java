/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_11659
 *  net.minecraft.class_11953
 *  net.minecraft.class_11954
 *  net.minecraft.class_12075
 *  net.minecraft.class_1268
 *  net.minecraft.class_1306
 *  net.minecraft.class_1309
 *  net.minecraft.class_1764
 *  net.minecraft.class_1792
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_1839
 *  net.minecraft.class_1935
 *  net.minecraft.class_2246
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_2586
 *  net.minecraft.class_2680
 *  net.minecraft.class_2738
 *  net.minecraft.class_2741
 *  net.minecraft.class_2756
 *  net.minecraft.class_2769
 *  net.minecraft.class_2960
 *  net.minecraft.class_310
 *  net.minecraft.class_3481
 *  net.minecraft.class_3489
 *  net.minecraft.class_3532
 *  net.minecraft.class_3721
 *  net.minecraft.class_3749
 *  net.minecraft.class_3867
 *  net.minecraft.class_4587
 *  net.minecraft.class_742
 *  net.minecraft.class_746
 *  net.minecraft.class_759
 *  net.minecraft.class_765
 *  net.minecraft.class_7833
 *  net.minecraft.class_811
 *  net.minecraft.class_9279
 *  net.minecraft.class_9280
 *  net.minecraft.class_9304
 *  net.minecraft.class_9334
 *  org.joml.Matrix4fc
 *  org.joml.Quaternionfc
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Redirect
 *  ruhack.phobia.system.modulesystem.impl.render.ShaderHands
 *  ruhack.phobia.system.modulesystem.impl.render.SwingAnimation
 */
package com.holdmylua.source.mixin.render;

import com.holdmylua.source.LuaTestHMI;
import com.holdmylua.source.access.AlternateBlockRenderer;
import com.holdmylua.source.access.ItemStackAccessor;
import com.holdmylua.source.access.LivingEntityAccessor;
import com.holdmylua.source.global.DispatcherStorage;
import com.holdmylua.source.global.GlobalsStorage;
import com.holdmylua.source.global.item_model.ItemModelContext;
import com.holdmylua.source.global.item_model.ItemModelStorage;
import com.holdmylua.source.lua_runtime.LuaScriptCache;
import com.holdmylua.source.lua_runtime.ScriptHolder;
import com.holdmylua.source.patricles.Particle;
import com.holdmylua.source.patricles.ParticleRenderManager;
import java.util.ArrayList;
import java.util.List;
import javax.script.ScriptException;
import net.minecraft.class_11659;
import net.minecraft.class_11953;
import net.minecraft.class_11954;
import net.minecraft.class_12075;
import net.minecraft.class_1268;
import net.minecraft.class_1306;
import net.minecraft.class_1309;
import net.minecraft.class_1764;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1839;
import net.minecraft.class_1935;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2586;
import net.minecraft.class_2680;
import net.minecraft.class_2738;
import net.minecraft.class_2741;
import net.minecraft.class_2756;
import net.minecraft.class_2769;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_3481;
import net.minecraft.class_3489;
import net.minecraft.class_3532;
import net.minecraft.class_3721;
import net.minecraft.class_3749;
import net.minecraft.class_3867;
import net.minecraft.class_4587;
import net.minecraft.class_742;
import net.minecraft.class_746;
import net.minecraft.class_759;
import net.minecraft.class_765;
import net.minecraft.class_7833;
import net.minecraft.class_811;
import net.minecraft.class_9279;
import net.minecraft.class_9280;
import net.minecraft.class_9304;
import net.minecraft.class_9334;
import org.joml.Matrix4fc;
import org.joml.Quaternionfc;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import ruhack.phobia.system.modulesystem.impl.render.ShaderHands;
import ruhack.phobia.system.modulesystem.impl.render.SwingAnimation;

@Mixin(value={class_759.class})
public abstract class HeldItemRendererMixin {
    @Unique
    boolean mainHandSwitchEvent = false;
    @Unique
    boolean offHandSwitchEvent = false;
    @Unique
    class_1792 prevMainHand = class_1802.field_8162;
    @Unique
    class_1792 prevOffHand = class_1802.field_8162;
    @Unique
    private final ArrayList<Particle> particles = new ArrayList();
    @Shadow
    @Final
    private class_310 field_4050;
    @Shadow
    private class_1799 field_4047;
    @Shadow
    private class_1799 field_4048;
    @Unique
    private boolean swingMHand = false;
    @Unique
    private boolean swingOHand = false;
    @Unique
    private float mainHandSwingProgress = 0.0f;
    @Unique
    private float offHandSwingProgress = 0.0f;

    @Shadow
    protected abstract void method_3219(class_4587 var1, class_11659 var2, int var3, float var4, float var5, class_1306 var6);

    @Shadow
    protected abstract void method_3228(class_742 var1, float var2, float var3, class_1268 var4, float var5, class_1799 var6, float var7, class_4587 var8, class_11659 var9, int var10);

    @Shadow
    protected abstract void method_3223(class_4587 var1, class_11659 var2, int var3, class_1799 var4);

    @Shadow
    public abstract void method_3233(class_1309 var1, class_1799 var2, class_811 var3, class_4587 var4, class_11659 var5, int var6);

    @Unique
    private void copyAppearanceComponents(class_1799 source, class_1799 target) {
        if (source.method_57826(class_9334.field_49633)) {
            target.method_57379(class_9334.field_49633, (Object)((class_9304)source.method_58694(class_9334.field_49633)));
        }
        if (source.method_57826(class_9334.field_54199)) {
            target.method_57379(class_9334.field_54199, (Object)((class_2960)source.method_58694(class_9334.field_54199)));
        }
        if (source.method_57826(class_9334.field_49637)) {
            target.method_57379(class_9334.field_49637, (Object)((class_9280)source.method_58694(class_9334.field_49637)));
        }
        if (source.method_57826(class_9334.field_49628)) {
            target.method_57379(class_9334.field_49628, (Object)((class_9279)source.method_58694(class_9334.field_49628)));
        }
    }

    @Unique
    private void applyArmMatrices(class_4587 matrices, int light, float equipProgress, float swingProgress, class_1306 arm) {
        boolean bl = arm != class_1306.field_6182;
        float f = bl ? 1.0f : -1.0f;
        float g = class_3532.method_15355((float)swingProgress);
        float h = -0.3f * class_3532.method_15374((double)(g * (float)Math.PI));
        float i = 0.4f * class_3532.method_15374((double)(g * ((float)Math.PI * 2)));
        float j = -0.4f * class_3532.method_15374((double)(swingProgress * (float)Math.PI));
        matrices.method_46416(f * (h + 0.64000005f), i + -0.6f + equipProgress * -0.6f, j + -0.71999997f);
        matrices.method_22907((Quaternionfc)class_7833.field_40716.rotationDegrees(f * 45.0f));
        float k = class_3532.method_15374((double)(swingProgress * swingProgress * (float)Math.PI));
        float l = class_3532.method_15374((double)(g * (float)Math.PI));
        matrices.method_22907((Quaternionfc)class_7833.field_40716.rotationDegrees(f * l * 70.0f));
        matrices.method_22907((Quaternionfc)class_7833.field_40718.rotationDegrees(f * k * -20.0f));
        class_746 abstractClientPlayerEntity = this.field_4050.field_1724;
        matrices.method_46416(f * -1.0f, 3.6f, 3.5f);
        matrices.method_22907((Quaternionfc)class_7833.field_40718.rotationDegrees(f * 120.0f));
        matrices.method_22907((Quaternionfc)class_7833.field_40714.rotationDegrees(200.0f));
        matrices.method_22907((Quaternionfc)class_7833.field_40716.rotationDegrees(f * -135.0f));
        matrices.method_46416(f * 5.6f, 0.0f, 0.0f);
    }

    @Unique
    private void itemPose(class_4587 matrices, class_1799 item, boolean bl, float swingProgress, class_742 player, boolean mainHand, class_1268 hand, float equipProgress, float mainHandSwingProgress, float offHandSwingProgress, boolean mainHandSwitchEvent, boolean offHandSwitchEvent, boolean swingMHand, boolean swingOHand, boolean interact, boolean blockBreaking, List<Particle> particles) throws ScriptException, NoSuchMethodException {
        int l = bl ? 1 : -1;
        matrices.method_22904(0.5 * (double)l, -0.15, -0.85);
        matrices.method_49278((Quaternionfc)class_7833.field_40714.rotationDegrees(15.0f), 0.5f, 0.5f, 0.5f);
        matrices.method_22905(0.9f, 0.9f, 0.9f);
        ScriptHolder.itemScriptCache.execute(matrices, bl, GlobalsStorage.registry, swingProgress, item, player, hand, mainHand, LuaTestHMI.deltaTime, equipProgress, mainHandSwingProgress, offHandSwingProgress, mainHandSwitchEvent, offHandSwitchEvent, swingMHand, swingOHand, interact, blockBreaking, particles);
        for (LuaScriptCache scriptCache : ScriptHolder.itemAddonsCache) {
            scriptCache.execute(matrices, bl, GlobalsStorage.registry, swingProgress, item, player, hand, mainHand, LuaTestHMI.deltaTime, equipProgress, mainHandSwingProgress, offHandSwingProgress, mainHandSwitchEvent, offHandSwitchEvent, swingMHand, swingOHand, interact, blockBreaking, particles);
        }
    }

    @Unique
    private void mainHandPose(class_4587 matrices, class_1799 item, boolean bl, float swingProgress, float equipProgress, class_742 player, boolean mainHand, class_1268 hand, float mainHandSwingProgress, float offHandSwingProgress, boolean mainHandSwitchEvent, boolean offHandSwitchEvent, boolean swingMHand, boolean swingOHand, boolean interact, boolean blockBreaking, List<Particle> particles) throws ScriptException, NoSuchMethodException {
        int l = bl ? 1 : -1;
        ScriptHolder.handRelativeScriptCache.execute(matrices, bl, GlobalsStorage.registry, swingProgress, item, player, hand, mainHand, LuaTestHMI.deltaTime, equipProgress, mainHandSwingProgress, offHandSwingProgress, mainHandSwitchEvent, offHandSwitchEvent, swingMHand, swingOHand, interact, blockBreaking, particles);
        for (LuaScriptCache scriptCache : ScriptHolder.handRelativeAddonsCache) {
            scriptCache.execute(matrices, bl, GlobalsStorage.registry, swingProgress, item, player, hand, mainHand, LuaTestHMI.deltaTime, equipProgress, mainHandSwingProgress, offHandSwingProgress, mainHandSwitchEvent, offHandSwitchEvent, swingMHand, swingOHand, interact, blockBreaking, particles);
        }
        if (!item.method_7960()) {
            matrices.method_22904(1.5 * (double)l, -0.3, -0.6);
            matrices.method_49278((Quaternionfc)class_7833.field_40714.rotationDegrees(15.0f), 0.5f * (float)l, 0.5f, 0.5f);
            matrices.method_49278((Quaternionfc)class_7833.field_40716.rotationDegrees((float)(35 * l)), 0.5f * (float)l, 0.5f, 0.5f);
            matrices.method_49278((Quaternionfc)class_7833.field_40718.rotationDegrees((float)(-65 * l)), 0.5f * (float)l, 0.5f, 0.5f);
            matrices.method_22905(0.9f, 0.9f, 0.9f);
        }
    }

    @Unique
    private void scenePoseMain(class_4587 matrices, class_1799 item, boolean bl, float swingProgress, float equipProgress, class_742 player, boolean mainHand, class_1268 hand, float mainHandSwingProgress, float offHandSwingProgress, boolean mainHandSwitchEvent, boolean offHandSwitchEvent, boolean swingMHand, boolean swingOHand, boolean interact, boolean blockBreaking, List<Particle> particles) throws ScriptException, NoSuchMethodException {
        ScriptHolder.handScriptCache.execute(matrices, bl, GlobalsStorage.registry, swingProgress, item, player, hand, mainHand, LuaTestHMI.deltaTime, equipProgress, mainHandSwingProgress, offHandSwingProgress, mainHandSwitchEvent, offHandSwitchEvent, swingMHand, swingOHand, interact, blockBreaking, particles);
        for (LuaScriptCache scriptCache : ScriptHolder.handAddonsCache) {
            scriptCache.execute(matrices, bl, GlobalsStorage.registry, swingProgress, item, player, hand, mainHand, LuaTestHMI.deltaTime, equipProgress, mainHandSwingProgress, offHandSwingProgress, mainHandSwitchEvent, offHandSwitchEvent, swingMHand, swingOHand, interact, blockBreaking, particles);
        }
        if (!item.method_7960()) {
            matrices.method_22904(0.0, -0.35, 0.2);
        }
    }

    /*
     * WARNING - void declaration
     */
    @Redirect(method={"method_22976(FLnet/minecraft/class_4587;Lnet/minecraft/class_11659;Lnet/minecraft/class_746;I)V"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_759;method_3228(Lnet/minecraft/class_742;FFLnet/minecraft/class_1268;FLnet/minecraft/class_1799;FLnet/minecraft/class_4587;Lnet/minecraft/class_11659;I)V"))
    private void renderOverhaul(class_759 class_7592, class_742 class_7422, float f, float f2, class_1268 class_12682, float f3, class_1799 class_17992, float f4, class_4587 class_45872, class_11659 class_116592, int n) throws ScriptException, NoSuchMethodException {
        void matrices;
        void player;
        if (!SwingAnimation.shouldUseNewHmiRenderer()) {
            class_7592.method_3228(class_7422, f, f2, class_12682, f3, class_17992, f4, class_45872, class_116592, n);
            return;
        }
        class_45872.method_22903();
        SwingAnimation.applyNewHmiViewModel((class_4587)class_45872, (class_1799)class_17992, (class_1268)class_12682);
        if (!player.method_31550()) {
            void orderedRenderCommandQueue;
            void light;
            void equipProgress;
            float swingProgress;
            void tickProgress;
            void hand;
            class_1799 item;
            ((ItemStackAccessor)item).hMI5_0$setTransform(-1);
            boolean bl = hand == class_1268.field_5808;
            boolean interact = false;
            boolean blockBreaking = false;
            if (bl && player.method_6115() && player.method_6058() != hand && (player.method_6079().method_7976() == class_1839.field_8953 || player.method_6079().method_7976() == class_1839.field_8953 || player.method_6079().method_7976() == class_1839.field_8947 && !class_1764.method_7781((class_1799)player.method_6079()))) {
                item = class_1802.field_8162.method_7854();
            }
            if (!bl && player.method_6115() && player.method_6058() != hand && (player.method_6047().method_7976() == class_1839.field_8953 || player.method_6047().method_7976() == class_1839.field_8947 && !class_1764.method_7781((class_1799)player.method_6047()))) {
                item = class_1802.field_8162.method_7854();
            }
            if (bl) {
                boolean bl2 = this.mainHandSwitchEvent = item.method_7909() != this.prevMainHand;
            }
            if (!bl) {
                this.offHandSwitchEvent = item.method_7909() != this.prevOffHand;
            }
            matrices.method_22903();
            if (player instanceof LivingEntityAccessor) {
                float offHandProgress;
                float mainHandProgress;
                LivingEntityAccessor accessor = (LivingEntityAccessor)player;
                this.mainHandSwingProgress = mainHandProgress = accessor.hMI5_0$getMainHandSwingProgress((float)tickProgress);
                this.offHandSwingProgress = offHandProgress = accessor.hMI5_0$getOffHandSwingProgress((float)tickProgress);
                swingProgress = bl ? mainHandProgress : offHandProgress;
                this.swingMHand = accessor.hMI5_0$getMHandEvent();
                this.swingOHand = accessor.hMI5_0$getOHandEvent();
                interact = bl ? accessor.hMI5_0$getMInteract() : accessor.hMI5_0$getOInteract();
                blockBreaking = accessor.hMI5_0$getBlockBreak();
            }
            class_1306 arm = bl ? player.method_6068() : player.method_6068().method_5928();
            boolean bl2 = arm == class_1306.field_6183;
            int l = bl2 ? 1 : -1;
            this.scenePoseMain((class_4587)matrices, item, bl2, swingProgress, (float)equipProgress, (class_742)player, bl, (class_1268)hand, this.mainHandSwingProgress, this.offHandSwingProgress, this.mainHandSwitchEvent, this.offHandSwitchEvent, this.swingMHand, this.swingOHand, interact, blockBreaking, this.particles);
            matrices.method_22903();
            this.mainHandPose((class_4587)matrices, item, bl2, swingProgress, (float)equipProgress, (class_742)player, bl, (class_1268)hand, this.mainHandSwingProgress, this.offHandSwingProgress, this.mainHandSwitchEvent, this.offHandSwitchEvent, this.swingMHand, this.swingOHand, interact, blockBreaking, this.particles);
            int combinedLight = class_765.method_62228((int)light, (int)class_2248.method_9503((class_1792)item.method_7909()).method_9564().method_26213());
            if (player.method_5767()) {
                this.applyArmMatrices((class_4587)matrices, combinedLight, 0.0f, 0.0f, arm);
            } else {
                this.method_3219((class_4587)matrices, (class_11659)orderedRenderCommandQueue, combinedLight, 0.0f, 0.0f, arm);
            }
            matrices.method_22909();
            matrices.method_22903();
            if (!(class_2248.method_9503((class_1792)item.method_7909()) == class_2246.field_10124 || class_2248.method_9503((class_1792)item.method_7909()).method_9564().method_26164(class_3481.field_28040) || class_2248.method_9503((class_1792)item.method_7909()).method_9564().method_26164(class_3481.field_20341) || item.method_7976() == class_1839.field_8950 || item.method_31574(class_1802.field_8725) || item.method_31573(class_3489.field_15556) || item.method_31573(class_3489.field_48298) || !GlobalsStorage.renderAsBlock.getOrDefault(item.method_7909().toString(), true).booleanValue())) {
                swingProgress = 0.0f;
                class_2680 blockState = class_2248.method_9503((class_1792)item.method_7909()).method_9564();
                this.itemPose((class_4587)matrices, item, bl2, swingProgress, (class_742)player, bl, (class_1268)hand, (float)equipProgress, this.mainHandSwingProgress, this.offHandSwingProgress, this.mainHandSwitchEvent, this.offHandSwitchEvent, this.swingMHand, this.swingOHand, interact, blockBreaking, this.particles);
                matrices.method_22904(0.22 * (double)l, 0.25, 0.2);
                if (item.method_31574(class_1802.field_8865) || blockState.method_26164(class_3481.field_15493)) {
                    blockState = (class_2680)blockState.method_11657((class_2769)class_2741.field_12555, (Comparable)class_2738.field_12475);
                }
                if (item.method_7964().toString().toLowerCase().contains("torch") || class_2248.method_9503((class_1792)item.method_7909()) instanceof class_3749 || blockState.method_26164(class_3481.field_40105)) {
                    matrices.method_22904(-0.05 * (double)l, 0.0, 0.0);
                    matrices.method_22905(1.75f, 1.75f, 1.75f);
                } else {
                    matrices.method_22904(-0.25 * (double)l, -0.05, 0.0);
                }
                matrices.method_22903();
                matrices.method_22905(0.3f, 0.3f, 0.3f);
                matrices.method_22904(-0.9 * (double)l, -0.45, -0.7);
                matrices.method_22909();
                if (!bl2) {
                    matrices.method_46416(-0.3f, 0.0f, 0.0f);
                }
                matrices.method_22905(0.3f, 0.3f, 0.3f);
                matrices.method_22904(-0.9 * (double)l, -0.45, -0.7);
                if (item.method_31574(class_1802.field_16315)) {
                    class_3721 bellBlockEntity = new class_3721(class_2338.field_10980, class_2246.field_16332.method_9564());
                    class_11953 state = new class_11953();
                    state.field_62676 = light;
                    this.field_4050.method_31975().method_3550((class_2586)bellBlockEntity).method_3569((class_11954)state, (class_4587)matrices, (class_11659)orderedRenderCommandQueue, new class_12075());
                    ShaderHands.firstPersonItemContext = true;
                    ((AlternateBlockRenderer)this.field_4050.method_1541()).renderSingleBlockWithEmission((class_2680)class_2246.field_16332.method_9564().method_11657((class_2769)class_2741.field_17104, (Comparable)class_3867.field_17099), (class_4587)matrices, (class_11659)orderedRenderCommandQueue, (int)light, this.field_4050.field_1687, (class_742)player);
                    ShaderHands.firstPersonItemContext = false;
                } else {
                    if (blockState.method_28498((class_2769)class_2741.field_12533)) {
                        matrices.method_22903();
                        matrices.method_46416(0.0f, 1.0f, 0.0f);
                        ShaderHands.firstPersonItemContext = true;
                        ((AlternateBlockRenderer)this.field_4050.method_1541()).renderSingleBlockWithEmission((class_2680)blockState.method_11657((class_2769)class_2741.field_12533, (Comparable)class_2756.field_12609), (class_4587)matrices, (class_11659)orderedRenderCommandQueue, (int)light, this.field_4050.field_1687, (class_742)player);
                        ShaderHands.firstPersonItemContext = false;
                        matrices.method_22909();
                    }
                    ShaderHands.firstPersonItemContext = true;
                    ((AlternateBlockRenderer)this.field_4050.method_1541()).renderSingleBlockWithEmission(blockState, (class_4587)matrices, (class_11659)orderedRenderCommandQueue, (int)light, this.field_4050.field_1687, (class_742)player);
                    ShaderHands.firstPersonItemContext = false;
                }
                matrices.method_22903();
                if (!bl2) {
                    matrices.method_46416(1.0f, 0.0f, 0.0f);
                }
                ParticleRenderManager.draw(this.particles, (class_4587)matrices, (class_11659)orderedRenderCommandQueue, "ITEM", (class_1268)hand, (int)light, (class_742)player, (float)tickProgress);
                matrices.method_22909();
            } else if (item.method_7976() == class_1839.field_8949 || item.method_7976() == class_1839.field_42717 || item.method_7976() == class_1839.field_63380) {
                class_1799 renderStack2;
                this.itemPose((class_4587)matrices, item, bl2, swingProgress, (class_742)player, bl, (class_1268)hand, (float)equipProgress, this.mainHandSwingProgress, this.offHandSwingProgress, this.mainHandSwitchEvent, this.offHandSwitchEvent, this.swingMHand, this.swingOHand, interact, blockBreaking, this.particles);
                class_1799 renderStack = new class_1799((class_1935)item.method_7909(), item.method_7947());
                this.copyAppearanceComponents(item, renderStack);
                class_1799 class_17993 = renderStack2 = bl ? GlobalsStorage.mainHandItem : GlobalsStorage.offHandItem;
                if (!renderStack2.method_31574(class_1802.field_8162)) {
                    renderStack = renderStack2;
                }
                DispatcherStorage.setItem(item);
                ItemModelStorage.addData(new ItemModelContext(bl2, swingProgress, (class_742)player, (class_1268)hand, bl, LuaTestHMI.deltaTime, (float)equipProgress, this.mainHandSwingProgress, this.offHandSwingProgress, this.mainHandSwitchEvent, this.offHandSwitchEvent, this.swingMHand, this.swingOHand, interact, blockBreaking, item), item);
                ShaderHands.firstPersonItemContext = true;
                this.method_3233((class_1309)player, renderStack, bl2 ? class_811.field_4320 : class_811.field_4323, (class_4587)matrices, (class_11659)orderedRenderCommandQueue, (int)light);
                ShaderHands.firstPersonItemContext = false;
            } else {
                this.itemPose((class_4587)matrices, item, bl2, swingProgress, (class_742)player, bl, (class_1268)hand, (float)equipProgress, this.mainHandSwingProgress, this.offHandSwingProgress, this.mainHandSwitchEvent, this.offHandSwitchEvent, this.swingMHand, this.swingOHand, interact, blockBreaking, this.particles);
                if (item.method_57826(class_9334.field_49646)) {
                    matrices.method_22903();
                    matrices.method_22904(-0.05 * (double)l, 0.2, 0.1);
                    matrices.method_22907((Quaternionfc)class_7833.field_40716.rotationDegrees((float)(-12 * l)));
                    ShaderHands.firstPersonItemContext = true;
                    this.method_3223((class_4587)matrices, (class_11659)orderedRenderCommandQueue, (int)light, item);
                    ShaderHands.firstPersonItemContext = false;
                    matrices.method_22909();
                } else {
                    class_1799 renderStack;
                    class_1799 class_17994 = renderStack = bl ? GlobalsStorage.mainHandItem : GlobalsStorage.offHandItem;
                    if (renderStack.method_31574(class_1802.field_8162)) {
                        renderStack = item;
                    }
                    DispatcherStorage.setItem(item);
                    ItemModelStorage.addData(new ItemModelContext(bl2, swingProgress, (class_742)player, (class_1268)hand, bl, LuaTestHMI.deltaTime, (float)equipProgress, this.mainHandSwingProgress, this.offHandSwingProgress, this.mainHandSwitchEvent, this.offHandSwitchEvent, this.swingMHand, this.swingOHand, interact, blockBreaking, item), item);
                    ShaderHands.firstPersonItemContext = true;
                    this.method_3233((class_1309)player, renderStack, bl2 ? class_811.field_4320 : class_811.field_4323, (class_4587)matrices, (class_11659)orderedRenderCommandQueue, (int)light);
                    ShaderHands.firstPersonItemContext = false;
                }
                if (bl2) {
                    LuaTestHMI.matricesMain.set((Matrix4fc)matrices.method_23760().method_23761());
                } else {
                    LuaTestHMI.matricesOff.set((Matrix4fc)matrices.method_23760().method_23761());
                }
                matrices.method_22903();
                ParticleRenderManager.draw(this.particles, (class_4587)matrices, (class_11659)orderedRenderCommandQueue, "ITEM", (class_1268)hand, (int)light, (class_742)player, (float)tickProgress);
                matrices.method_22909();
            }
            matrices.method_22909();
            matrices.method_22909();
            if (bl) {
                this.prevMainHand = item.method_7909();
            }
            if (!bl) {
                this.prevOffHand = item.method_7909();
            }
            matrices.method_22903();
            ParticleRenderManager.draw(this.particles, (class_4587)matrices, (class_11659)orderedRenderCommandQueue, "SCREEN", (class_1268)hand, (int)light, (class_742)player, (float)tickProgress);
            matrices.method_22909();
            LuaTestHMI.tickProgress = tickProgress;
            GlobalsStorage.offHandItem = class_1802.field_8162.method_7854();
            GlobalsStorage.mainHandItem = class_1802.field_8162.method_7854();
        }
        matrices.method_22909();
    }
}

