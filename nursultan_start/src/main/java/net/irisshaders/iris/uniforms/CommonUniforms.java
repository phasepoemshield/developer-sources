/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlStateManager$class_1017
 *  minecraft.class00608
 *  minecraft.class00737
 *  minecraft.class00772
 *  minecraft.class02566
 *  minecraft.class03386
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class04798
 *  minecraft.class05630
 *  minecraft.class06202
 *  minecraft.class06532
 *  minecraft.class06889
 *  minecraft.class07047
 *  minecraft.class07049
 *  minecraft.class07055
 *  minecraft.class07070
 *  minecraft.class07209
 *  minecraft.class07438
 *  minecraft.class08626
 *  minecraft.class08918
 *  net.irisshaders.iris.Iris
 *  net.irisshaders.iris.compat.dh.DHCompat
 *  net.irisshaders.iris.gl.state.FogMode
 *  net.irisshaders.iris.gl.state.StateUpdateNotifiers
 *  net.irisshaders.iris.gl.uniform.DynamicUniformHolder
 *  net.irisshaders.iris.gl.uniform.FloatSupplier
 *  net.irisshaders.iris.gl.uniform.UniformHolder
 *  net.irisshaders.iris.gl.uniform.UniformUpdateFrequency
 *  net.irisshaders.iris.layer.GbufferPrograms
 *  net.irisshaders.iris.mixin.GlStateManagerAccessor
 *  net.irisshaders.iris.mixin.statelisteners.BooleanStateAccessor
 *  net.irisshaders.iris.mixin.texture.TextureAtlasAccessor
 *  net.irisshaders.iris.mixinterface.LocalPlayerInterface
 *  net.irisshaders.iris.pbr.TextureInfoCache
 *  net.irisshaders.iris.pbr.TextureInfoCache$TextureInfo
 *  net.irisshaders.iris.pbr.TextureTracker
 *  net.irisshaders.iris.shaderpack.IdMap
 *  net.irisshaders.iris.shaderpack.properties.PackDirectives
 *  org.joml.Math
 *  org.joml.Vector2f
 *  org.joml.Vector2i
 *  org.joml.Vector3d
 *  org.joml.Vector4f
 *  org.joml.Vector4i
 */
package net.irisshaders.iris.uniforms;

import com.mojang.blaze3d.opengl.GlStateManager;
import minecraft.class00608;
import minecraft.class00737;
import minecraft.class00772;
import minecraft.class02566;
import minecraft.class03386;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class04798;
import minecraft.class05630;
import minecraft.class06202;
import minecraft.class06532;
import minecraft.class06889;
import minecraft.class07047;
import minecraft.class07049;
import minecraft.class07055;
import minecraft.class07070;
import minecraft.class07209;
import minecraft.class07438;
import minecraft.class08626;
import minecraft.class08918;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.compat.dh.DHCompat;
import net.irisshaders.iris.gl.state.FogMode;
import net.irisshaders.iris.gl.state.StateUpdateNotifiers;
import net.irisshaders.iris.gl.uniform.DynamicUniformHolder;
import net.irisshaders.iris.gl.uniform.FloatSupplier;
import net.irisshaders.iris.gl.uniform.UniformHolder;
import net.irisshaders.iris.gl.uniform.UniformUpdateFrequency;
import net.irisshaders.iris.layer.GbufferPrograms;
import net.irisshaders.iris.mixin.GlStateManagerAccessor;
import net.irisshaders.iris.mixin.statelisteners.BooleanStateAccessor;
import net.irisshaders.iris.mixin.texture.TextureAtlasAccessor;
import net.irisshaders.iris.mixinterface.LocalPlayerInterface;
import net.irisshaders.iris.pbr.TextureInfoCache;
import net.irisshaders.iris.pbr.TextureTracker;
import net.irisshaders.iris.shaderpack.IdMap;
import net.irisshaders.iris.shaderpack.properties.PackDirectives;
import net.irisshaders.iris.uniforms.BiomeUniforms;
import net.irisshaders.iris.uniforms.CameraUniforms;
import net.irisshaders.iris.uniforms.CapturedRenderingState;
import net.irisshaders.iris.uniforms.CelestialUniforms;
import net.irisshaders.iris.uniforms.ExternallyManagedUniforms;
import net.irisshaders.iris.uniforms.FogUniforms;
import net.irisshaders.iris.uniforms.FrameUpdateNotifier;
import net.irisshaders.iris.uniforms.IdMapUniforms;
import net.irisshaders.iris.uniforms.IrisExclusiveUniforms;
import net.irisshaders.iris.uniforms.IrisInternalUniforms;
import net.irisshaders.iris.uniforms.IrisTimeUniforms;
import net.irisshaders.iris.uniforms.MatrixUniforms;
import net.irisshaders.iris.uniforms.SystemTimeUniforms;
import net.irisshaders.iris.uniforms.ViewportUniforms;
import net.irisshaders.iris.uniforms.WorldTimeUniforms;
import net.irisshaders.iris.uniforms.transforms.SmoothedFloat;
import net.irisshaders.iris.uniforms.transforms.SmoothedVec2f;
import org.joml.Vector2f;
import org.joml.Vector2i;
import org.joml.Vector3d;
import org.joml.Vector4f;
import org.joml.Vector4i;

public final class CommonUniforms {
    private static final class06202 client = class06202.Nq();
    private static final Vector2i ZERO_VECTOR_2i = new Vector2i();
    private static final Vector4i ZERO_VECTOR_4i = new Vector4i(0, 0, 0, 0);
    private static final Vector3d ZERO_VECTOR_3d = new Vector3d();

    private CommonUniforms() {
    }

    static {
        GbufferPrograms.init();
    }

    private static float getConstantMood() {
        if (!(client.F() instanceof class04453)) {
            return 0.0f;
        }
        return org.joml.Math.clamp((float)0.0f, (float)1.0f, (float)((LocalPlayerInterface)client.F()).getCurrentConstantMood());
    }

    public static void addDynamicUniforms(DynamicUniformHolder dynamicUniformHolder, FogMode fogMode) {
        ExternallyManagedUniforms.addExternallyManagedUniforms117((UniformHolder)dynamicUniformHolder);
        FogUniforms.addFogUniforms(dynamicUniformHolder, fogMode);
        IrisInternalUniforms.addFogUniforms(dynamicUniformHolder, fogMode);
        dynamicUniformHolder.uniform1i("entityId", CapturedRenderingState.INSTANCE::getCurrentRenderedEntity, StateUpdateNotifiers.fallbackEntityNotifier);
        dynamicUniformHolder.uniform2i("atlasSize", () -> {
            int n = Iris.getPipelineManager().getPipeline().map(worldRenderingPipeline -> worldRenderingPipeline.getAlbedoTex()).orElse(0);
            if (n == 0) {
                return ZERO_VECTOR_2i;
            }
            class08918 class089182 = TextureTracker.INSTANCE.getTexture(n);
            if (class089182 instanceof class08626) {
                class08626 class086262 = (class08626)class089182;
                TextureAtlasAccessor textureAtlasAccessor = (TextureAtlasAccessor)class086262;
                return new Vector2i(textureAtlasAccessor.callGetWidth(), textureAtlasAccessor.callGetHeight());
            }
            return ZERO_VECTOR_2i;
        }, runnable -> {});
        dynamicUniformHolder.uniform1i("gtextureId", () -> GlStateManagerAccessor.getTEXTURES()[0].field_5167, StateUpdateNotifiers.bindTextureNotifier);
        dynamicUniformHolder.uniform1i("textureReloadCount", CapturedRenderingState.INSTANCE::getTextureReloadCount, StateUpdateNotifiers.bindTextureNotifier);
        dynamicUniformHolder.uniform2i("gtextureSize", () -> {
            int n = GlStateManagerAccessor.getTEXTURES()[0].field_5167;
            TextureInfoCache.TextureInfo textureInfo = TextureInfoCache.INSTANCE.getInfo(n);
            return new Vector2i(textureInfo.getWidth(), textureInfo.getHeight());
        }, StateUpdateNotifiers.bindTextureNotifier);
        dynamicUniformHolder.uniform4i("blendFunc", () -> {
            GlStateManager.class_1017 class_10172 = GlStateManagerAccessor.getBLEND();
            if (((BooleanStateAccessor)class_10172.field_5045).isEnabled()) {
                return new Vector4i(class_10172.field_5049, class_10172.field_5048, class_10172.field_5047, class_10172.field_5046);
            }
            return ZERO_VECTOR_4i;
        }, StateUpdateNotifiers.blendFuncNotifier);
        dynamicUniformHolder.uniform1i("renderStage", () -> GbufferPrograms.getCurrentPhase().ordinal(), StateUpdateNotifiers.phaseChangeNotifier);
    }

    private static boolean isSneaking() {
        if ((class04453)CommonUniforms.client.T_4 != null) {
            return ((class04453)CommonUniforms.client.T_4).method_18276();
        }
        return false;
    }

    public static void generalCommonUniforms(UniformHolder uniformHolder, FrameUpdateNotifier frameUpdateNotifier, PackDirectives packDirectives) {
        ExternallyManagedUniforms.addExternallyManagedUniforms117(uniformHolder);
        SmoothedVec2f smoothedVec2f = new SmoothedVec2f(packDirectives.getEyeBrightnessHalfLife(), packDirectives.getEyeBrightnessHalfLife(), CommonUniforms::getEyeBrightness, frameUpdateNotifier);
        uniformHolder.uniform1b(UniformUpdateFrequency.PER_FRAME, "hideGUI", () -> ((class05630)CommonUniforms.client.i_7).NG).uniform1b(UniformUpdateFrequency.PER_FRAME, "isRightHanded", () -> ((class05630)CommonUniforms.client.i_7).O().method_41753() == class07070.field_6183).uniform1i(UniformUpdateFrequency.PER_FRAME, "isEyeInWater", CommonUniforms::isEyeInWater).uniform1f(UniformUpdateFrequency.PER_FRAME, "blindness", CommonUniforms::getBlindness).uniform1f(UniformUpdateFrequency.PER_FRAME, "darknessFactor", CommonUniforms::getDarknessFactor).uniform1f(UniformUpdateFrequency.PER_FRAME, "darknessLightFactor", CapturedRenderingState.INSTANCE::getDarknessLightFactor).uniform1f(UniformUpdateFrequency.PER_FRAME, "nightVision", CommonUniforms::getNightVision).uniform1b(UniformUpdateFrequency.PER_FRAME, "is_sneaking", CommonUniforms::isSneaking).uniform1b(UniformUpdateFrequency.PER_FRAME, "is_sprinting", CommonUniforms::isSprinting).uniform1b(UniformUpdateFrequency.PER_FRAME, "is_hurt", CommonUniforms::isHurt).uniform1b(UniformUpdateFrequency.PER_FRAME, "is_invisible", CommonUniforms::isInvisible).uniform1b(UniformUpdateFrequency.PER_FRAME, "is_burning", CommonUniforms::isBurning).uniform1b(UniformUpdateFrequency.PER_FRAME, "is_on_ground", CommonUniforms::isOnGround).uniform1f(UniformUpdateFrequency.PER_FRAME, "screenBrightness", () -> (Double)((class05630)CommonUniforms.client.i_7).No().method_41753()).uniform4f(UniformUpdateFrequency.ONCE, "entityColor", () -> new Vector4f(0.0f, 0.0f, 0.0f, 0.0f)).uniform1i(UniformUpdateFrequency.ONCE, "blockEntityId", () -> -1).uniform1i(UniformUpdateFrequency.ONCE, "currentRenderedItemId", () -> -1).uniform1i(UniformUpdateFrequency.PER_FRAME, "anisotropicFiltering", () -> {
            if (((class05630)class06202.Nq().i_7).c().method_41753() == class06532.field_64665) {
                return ((class05630)class06202.Nq().i_7).H();
            }
            return 0;
        }).uniform1f(UniformUpdateFrequency.ONCE, "pi", () -> Math.PI).uniform1f(UniformUpdateFrequency.PER_TICK, "playerMood", CommonUniforms::getPlayerMood).uniform1f(UniformUpdateFrequency.PER_TICK, "constantMood", CommonUniforms::getConstantMood).uniform2i(UniformUpdateFrequency.PER_FRAME, "eyeBrightness", CommonUniforms::getEyeBrightness).uniform2i(UniformUpdateFrequency.PER_FRAME, "eyeBrightnessSmooth", () -> {
            Vector2f vector2f = smoothedVec2f.get();
            return new Vector2i((int)vector2f.x(), (int)vector2f.y());
        }).uniform1f(UniformUpdateFrequency.PER_TICK, "rainStrength", CommonUniforms::getRainStrength).uniform1f(UniformUpdateFrequency.PER_TICK, "wetness", (FloatSupplier)new SmoothedFloat(packDirectives.getWetnessHalfLife(), packDirectives.getDrynessHalfLife(), CommonUniforms::getRainStrength, frameUpdateNotifier)).uniform3d(UniformUpdateFrequency.PER_FRAME, "skyColor", CommonUniforms::getSkyColor).uniform1f(UniformUpdateFrequency.PER_FRAME, "dhFarPlane", DHCompat::getFarPlane).uniform1f(UniformUpdateFrequency.PER_FRAME, "dhNearPlane", DHCompat::getNearPlane).uniform1i(UniformUpdateFrequency.PER_FRAME, "dhRenderDistance", DHCompat::getRenderDistance);
    }

    static int isEyeInWater() {
        boolean bl;
        class04798 class047982 = ((class03386)CommonUniforms.client.i_5).s().W();
        boolean bl2 = bl = (class04453)CommonUniforms.client.T_4 != null && ((class04453)CommonUniforms.client.T_4).method_7325();
        if (class047982 == class04798.field_27886) {
            return 1;
        }
        if (!bl && class047982 == class04798.field_27885) {
            return 2;
        }
        if (class047982 == class04798.field_27887) {
            return 3;
        }
        return 0;
    }

    static float getDarknessFactor() {
        class07055 class070552;
        class07049 class070492 = client.F();
        if (class070492 instanceof class07438 && (class070552 = ((class07438)class070492).method_6112(class07047.J)) != null) {
            return class070552.N((class07438)class070492, CapturedRenderingState.INSTANCE.getTickDelta());
        }
        return 0.0f;
    }

    private static float getPlayerMood() {
        if (!(client.F() instanceof class04453)) {
            return 0.0f;
        }
        return org.joml.Math.clamp((float)0.0f, (float)1.0f, (float)((class04453)client.F()).m());
    }

    private static Vector3d getSkyColor() {
        if ((class03448)CommonUniforms.client.T_3 == null || client.F() == null) {
            return ZERO_VECTOR_3d;
        }
        int n = (Integer)((class03386)CommonUniforms.client.i_5).s().U().N(class00608.Z, CapturedRenderingState.INSTANCE.getTickDelta());
        return new Vector3d((double)class02566.m((int)n), (double)class02566.P((int)n), (double)class02566.s((int)n));
    }

    static float getRainStrength() {
        if ((class03448)CommonUniforms.client.T_3 == null) {
            return 0.0f;
        }
        return org.joml.Math.clamp((float)0.0f, (float)1.0f, (float)((class03448)CommonUniforms.client.T_3).method_8430(CapturedRenderingState.INSTANCE.getTickDelta()));
    }

    public static void addCommonUniforms(DynamicUniformHolder dynamicUniformHolder, IdMap idMap, PackDirectives packDirectives, FrameUpdateNotifier frameUpdateNotifier, FogMode fogMode) {
        CommonUniforms.addNonDynamicUniforms((UniformHolder)dynamicUniformHolder, idMap, packDirectives, frameUpdateNotifier);
        CommonUniforms.addDynamicUniforms(dynamicUniformHolder, fogMode);
    }

    private static Vector2i getEyeBrightness() {
        if (client.F() == null || (class03448)CommonUniforms.client.T_3 == null) {
            return ZERO_VECTOR_2i;
        }
        class06889 class068892 = client.F().method_73189();
        class06889 class068893 = new class06889(class068892.M, client.F().method_23320(), class068892.Z);
        class07209 class072092 = class07209.method_49638((class00737)class068893);
        int n = ((class03448)CommonUniforms.client.T_3).method_8314(class00772.field_9282, class072092);
        int n2 = ((class03448)CommonUniforms.client.T_3).method_8314(class00772.field_9284, class072092);
        return new Vector2i(n * 16, n2 * 16);
    }

    static float getBlindness() {
        class07055 class070552;
        class07049 class070492 = client.F();
        if (class070492 instanceof class07438 && (class070552 = ((class07438)class070492).method_6112(class07047.P)) != null) {
            if (class070552.y()) {
                return 1.0f;
            }
            return org.joml.Math.clamp((float)0.0f, (float)1.0f, (float)((float)class070552.u() / 20.0f));
        }
        return 0.0f;
    }

    private static float getNightVision() {
        float f;
        class07049 class070492 = client.F();
        if (class070492 instanceof class07438) {
            class07438 class074382 = (class07438)class070492;
            try {
                float f2 = class03386.N((class07438)class074382, (float)CapturedRenderingState.INSTANCE.getTickDelta());
                if (f2 > 0.0f) {
                    return org.joml.Math.clamp((float)0.0f, (float)1.0f, (float)f2);
                }
            }
            catch (NullPointerException nullPointerException) {
                return 0.0f;
            }
        }
        if ((class04453)CommonUniforms.client.T_4 != null && ((class04453)CommonUniforms.client.T_4).method_6059(class07047.Q) && (f = ((class04453)CommonUniforms.client.T_4).j()) > 0.0f) {
            return org.joml.Math.clamp((float)0.0f, (float)1.0f, (float)f);
        }
        return 0.0f;
    }

    private static boolean isInvisible() {
        if ((class04453)CommonUniforms.client.T_4 != null) {
            return ((class04453)CommonUniforms.client.T_4).method_5767();
        }
        return false;
    }

    public static void addNonDynamicUniforms(UniformHolder uniformHolder, IdMap idMap, PackDirectives packDirectives, FrameUpdateNotifier frameUpdateNotifier) {
        CameraUniforms.addCameraUniforms(uniformHolder, frameUpdateNotifier);
        ViewportUniforms.addViewportUniforms(uniformHolder);
        WorldTimeUniforms.addWorldTimeUniforms(uniformHolder);
        SystemTimeUniforms.addSystemTimeUniforms(uniformHolder);
        BiomeUniforms.addBiomeUniforms(uniformHolder);
        new CelestialUniforms(packDirectives.getSunPathRotation()).addCelestialUniforms(uniformHolder);
        IrisExclusiveUniforms.addIrisExclusiveUniforms(uniformHolder, frameUpdateNotifier);
        IrisTimeUniforms.addTimeUniforms(uniformHolder);
        MatrixUniforms.addMatrixUniforms(uniformHolder, packDirectives);
        IdMapUniforms.addIdMapUniforms(frameUpdateNotifier, uniformHolder, idMap, packDirectives.isOldHandLight());
        CommonUniforms.generalCommonUniforms(uniformHolder, frameUpdateNotifier, packDirectives);
    }

    private static boolean isBurning() {
        if ((class04453)CommonUniforms.client.T_4 != null) {
            return ((class04453)CommonUniforms.client.T_4).method_5809();
        }
        return false;
    }

    private static boolean isHurt() {
        if ((class04453)CommonUniforms.client.T_4 != null) {
            return ((class04453)CommonUniforms.client.T_4).fields_2212a028292fd3c078969e3ee4c71d9e8_0 > 0;
        }
        return false;
    }

    private static boolean isOnGround() {
        return (class04453)CommonUniforms.client.T_4 != null && ((class04453)CommonUniforms.client.T_4).method_24828();
    }

    private static boolean isSprinting() {
        if ((class04453)CommonUniforms.client.T_4 != null) {
            return ((class04453)CommonUniforms.client.T_4).method_5624();
        }
        return false;
    }
}

