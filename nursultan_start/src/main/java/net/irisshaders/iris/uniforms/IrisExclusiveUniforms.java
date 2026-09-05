/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2IntFunction
 *  java.lang.MatchException
 *  minecraft.class00500
 *  minecraft.class00672
 *  minecraft.class01056
 *  minecraft.class01894
 *  minecraft.class03386
 *  minecraft.class03443
 *  minecraft.class03448
 *  minecraft.class04206
 *  minecraft.class04453
 *  minecraft.class05363
 *  minecraft.class05455
 *  minecraft.class05630
 *  minecraft.class06183
 *  minecraft.class06202
 *  minecraft.class06532
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07089
 *  minecraft.class07113
 *  minecraft.class07209
 *  minecraft.class07282
 *  minecraft.class07438
 *  net.irisshaders.iris.gl.uniform.UniformHolder
 *  net.irisshaders.iris.gl.uniform.UniformUpdateFrequency
 *  net.irisshaders.iris.gui.option.IrisVideoSettings
 *  net.irisshaders.iris.helpers.JomlConversions
 *  net.irisshaders.iris.mixin.GameRendererAccessor
 *  net.irisshaders.iris.shaderpack.materialmap.NamespacedId
 *  net.irisshaders.iris.shaderpack.materialmap.WorldRenderingSettings
 *  org.joml.Math
 *  org.joml.Vector3d
 *  org.joml.Vector3dc
 *  org.joml.Vector3f
 *  org.joml.Vector4f
 */
package net.irisshaders.iris.uniforms;

import it.unimi.dsi.fastutil.objects.Object2IntFunction;
import java.util.Objects;
import java.util.stream.StreamSupport;
import minecraft.class00500;
import minecraft.class00672;
import minecraft.class01056;
import minecraft.class01894;
import minecraft.class03386;
import minecraft.class03443;
import minecraft.class03448;
import minecraft.class04206;
import minecraft.class04453;
import minecraft.class05363;
import minecraft.class05455;
import minecraft.class05630;
import minecraft.class06183;
import minecraft.class06202;
import minecraft.class06532;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07089;
import minecraft.class07113;
import minecraft.class07209;
import minecraft.class07282;
import minecraft.class07438;
import net.irisshaders.iris.gl.uniform.UniformHolder;
import net.irisshaders.iris.gl.uniform.UniformUpdateFrequency;
import net.irisshaders.iris.gui.option.IrisVideoSettings;
import net.irisshaders.iris.helpers.JomlConversions;
import net.irisshaders.iris.mixin.GameRendererAccessor;
import net.irisshaders.iris.shaderpack.materialmap.NamespacedId;
import net.irisshaders.iris.shaderpack.materialmap.WorldRenderingSettings;
import net.irisshaders.iris.uniforms.CameraUniforms;
import net.irisshaders.iris.uniforms.CapturedRenderingState;
import net.irisshaders.iris.uniforms.EndFlashStorage;
import net.irisshaders.iris.uniforms.FrameUpdateNotifier;
import net.irisshaders.iris.uniforms.IrisExclusiveUniforms$WorldInfoUniforms;
import org.joml.Math;
import org.joml.Vector3d;
import org.joml.Vector3dc;
import org.joml.Vector3f;
import org.joml.Vector4f;

public class IrisExclusiveUniforms {
    private static final Vector3d ZERO = new Vector3d(0.0);

    public static void addIrisExclusiveUniforms(UniformHolder uniformHolder, FrameUpdateNotifier frameUpdateNotifier) {
        IrisExclusiveUniforms$WorldInfoUniforms.addWorldInfoUniforms(uniformHolder);
        EndFlashStorage endFlashStorage = new EndFlashStorage();
        frameUpdateNotifier.addListener(endFlashStorage::tick);
        uniformHolder.uniform1i(UniformUpdateFrequency.PER_TICK, "currentColorSpace", () -> IrisVideoSettings.colorSpace.ordinal());
        uniformHolder.uniform1f(UniformUpdateFrequency.PER_FRAME, "chunkFadeTimeInv", () -> (float)(1.0 / ((Double)((class05630)class06202.Nq().i_7).b().method_41753() * 1000.0)));
        uniformHolder.uniform1i(UniformUpdateFrequency.PER_FRAME, "textureFilteringMode", () -> switch ((class06532)((class05630)class06202.Nq().i_7).c().method_41753()) {
            default -> throw new MatchException(null, null);
            case class06532.field_64663 -> 0;
            case class06532.field_64664 -> 1;
            case class06532.field_64665 -> 2;
        });
        uniformHolder.uniform1b(UniformUpdateFrequency.PER_TICK, "feetInWater", IrisExclusiveUniforms::getIsInShallowWater);
        uniformHolder.uniform1b(UniformUpdateFrequency.PER_TICK, "inSwimmingAnimation", IrisExclusiveUniforms::getIsSwimming);
        uniformHolder.uniform1b(UniformUpdateFrequency.PER_TICK, "isRiding", IrisExclusiveUniforms::getIsPassenger);
        uniformHolder.uniform1b(UniformUpdateFrequency.PER_TICK, "isElytraFlying", IrisExclusiveUniforms::isElytraFlying);
        uniformHolder.uniform1b(UniformUpdateFrequency.PER_TICK, "vehicleInWater", IrisExclusiveUniforms::getVehicleInShallowWater);
        uniformHolder.uniform1i(UniformUpdateFrequency.PER_TICK, "vehicleId", IrisExclusiveUniforms::getVehicleId);
        uniformHolder.uniform3d(UniformUpdateFrequency.PER_FRAME, "vehicleLookVector", IrisExclusiveUniforms::getVehicleLookVector);
        uniformHolder.uniform3d(UniformUpdateFrequency.PER_FRAME, "relativeVehiclePosition", IrisExclusiveUniforms::getRelativeVehiclePosition);
        uniformHolder.uniform1f(UniformUpdateFrequency.PER_FRAME, "thunderStrength", IrisExclusiveUniforms::getThunderStrength);
        uniformHolder.uniform1f(UniformUpdateFrequency.PER_TICK, "currentPlayerHealth", IrisExclusiveUniforms::getCurrentHealth);
        uniformHolder.uniform1b(UniformUpdateFrequency.PER_TICK, "heavyFog", IrisExclusiveUniforms::isHeavyFog);
        uniformHolder.uniform1f(UniformUpdateFrequency.PER_TICK, "maxPlayerHealth", IrisExclusiveUniforms::getMaxHealth);
        uniformHolder.uniform1f(UniformUpdateFrequency.PER_TICK, "currentPlayerHunger", IrisExclusiveUniforms::getCurrentHunger);
        uniformHolder.uniform1f(UniformUpdateFrequency.PER_TICK, "maxPlayerHunger", () -> 20);
        uniformHolder.uniform1f(UniformUpdateFrequency.PER_TICK, "endFlashIntensity", endFlashStorage::getCurrentEndFlash);
        uniformHolder.uniform1f(UniformUpdateFrequency.PER_TICK, "previousEndFlashIntensity", endFlashStorage::getLastEndFlash);
        uniformHolder.uniform1f(UniformUpdateFrequency.PER_TICK, "currentPlayerArmor", IrisExclusiveUniforms::getCurrentArmor);
        uniformHolder.uniform1f(UniformUpdateFrequency.PER_TICK, "maxPlayerArmor", () -> 50);
        uniformHolder.uniform1f(UniformUpdateFrequency.PER_TICK, "currentPlayerAir", IrisExclusiveUniforms::getCurrentAir);
        uniformHolder.uniform1f(UniformUpdateFrequency.PER_TICK, "maxPlayerAir", IrisExclusiveUniforms::getMaxAir);
        uniformHolder.uniform1b(UniformUpdateFrequency.PER_FRAME, "firstPersonCamera", IrisExclusiveUniforms::isFirstPersonCamera);
        uniformHolder.uniform1b(UniformUpdateFrequency.PER_TICK, "isSpectator", IrisExclusiveUniforms::isSpectator);
        uniformHolder.uniform1i(UniformUpdateFrequency.PER_FRAME, "currentSelectedBlockId", IrisExclusiveUniforms::getCurrentSelectedBlockId);
        uniformHolder.uniform1i(UniformUpdateFrequency.PER_FRAME, "seaLevel", () -> (class03448)class06202.Nq().T_3 == null ? 0 : ((class03448)class06202.Nq().T_3).method_8615());
        uniformHolder.uniform3f(UniformUpdateFrequency.PER_FRAME, "currentSelectedBlockPos", IrisExclusiveUniforms::getCurrentSelectedBlockPos);
        uniformHolder.uniform3d(UniformUpdateFrequency.PER_FRAME, "eyePosition", IrisExclusiveUniforms::getEyePosition);
        uniformHolder.uniform1f(UniformUpdateFrequency.PER_TICK, "cloudTime", CapturedRenderingState.INSTANCE::getCloudTime);
        uniformHolder.uniform3d(UniformUpdateFrequency.PER_FRAME, "relativeEyePosition", () -> CameraUniforms.getUnshiftedCameraPosition().sub((Vector3dc)IrisExclusiveUniforms.getEyePosition()));
        uniformHolder.uniform3d(UniformUpdateFrequency.PER_FRAME, "playerLookVector", () -> {
            class07049 class070492 = class06202.Nq().F();
            if (class070492 instanceof class07438) {
                class07438 class074382 = (class07438)class070492;
                return JomlConversions.fromVec3((class06889)class074382.method_5828(CapturedRenderingState.INSTANCE.getTickDelta()));
            }
            return ZERO;
        });
        uniformHolder.uniform3d(UniformUpdateFrequency.PER_FRAME, "playerBodyVector", () -> JomlConversions.fromVec3((class06889)class06202.Nq().F().method_5663()));
        Vector4f vector4f = new Vector4f(0.0f, 0.0f, 0.0f, 0.0f);
        uniformHolder.uniform4f(UniformUpdateFrequency.PER_TICK, "lightningBoltPosition", () -> {
            if ((class03448)class06202.Nq().T_3 != null) {
                return StreamSupport.stream(((class03448)class06202.Nq().T_3).M().spliterator(), false).filter(class070492 -> class070492 instanceof class00672).findAny().map(class070492 -> {
                    Vector3d vector3d = CameraUniforms.getUnshiftedCameraPosition();
                    class06889 class068892 = class070492.method_30950(class06202.Nq().NK().N(true));
                    return new Vector4f((float)(class068892.M - vector3d.x), (float)(class068892.B - vector3d.y), (float)(class068892.Z - vector3d.z), 1.0f);
                }).orElse(vector4f);
            }
            return vector4f;
        });
    }

    private static boolean getIsInShallowWater() {
        if ((class04453)class06202.Nq().T_4 == null) {
            return false;
        }
        return ((class04453)class06202.Nq().T_4).method_74016();
    }

    private static Vector3d getRelativeVehiclePosition() {
        if ((class04453)class06202.Nq().T_4 == null) {
            return ZERO;
        }
        if (((class04453)class06202.Nq().T_4).method_5854() == null) {
            return ZERO;
        }
        class06889 class068892 = ((class04453)class06202.Nq().T_4).method_5854().method_30950(CapturedRenderingState.INSTANCE.getTickDelta());
        Vector3d vector3d = new Vector3d(class068892.M, class068892.B, class068892.Z);
        return CameraUniforms.getUnshiftedCameraPosition().sub((Vector3dc)vector3d);
    }

    private static Vector3d getVehicleLookVector() {
        if ((class04453)class06202.Nq().T_4 == null) {
            return ZERO;
        }
        if (((class04453)class06202.Nq().T_4).method_5854() == null) {
            return ZERO;
        }
        return JomlConversions.fromVec3((class06889)((class04453)class06202.Nq().T_4).method_5854().method_5663());
    }

    private static boolean isFirstPersonCamera() {
        return switch (((class05630)class06202.Nq().i_7).NS()) {
            case class05455.field_26665, class05455.field_26666 -> false;
            default -> true;
        };
    }

    private static Vector3f getCurrentSelectedBlockPos() {
        class07089 class070892 = (class07089)class06202.Nq().M_3;
        if ((class03448)class06202.Nq().T_3 != null && ((GameRendererAccessor)((class03386)class06202.Nq().i_5)).shouldRenderBlockOutlineA() && class070892 != null && class070892.N() == class07113.field_1332) {
            class07209 class072092 = ((class06183)class070892).u();
            return class072092.method_46558().u(((class03386)class06202.Nq().i_5).s().y()).W();
        }
        return new Vector3f(-256.0f);
    }

    private static int getCurrentSelectedBlockId() {
        class07209 class072092;
        class00500 class005002;
        class07089 class070892 = (class07089)class06202.Nq().M_3;
        if ((class03448)class06202.Nq().T_3 != null && ((GameRendererAccessor)((class03386)class06202.Nq().i_5)).shouldRenderBlockOutlineA() && class070892 != null && class070892.N() == class07113.field_1332 && !(class005002 = ((class03448)class06202.Nq().T_3).method_8320(class072092 = ((class06183)class070892).u())).P() && ((class03448)class06202.Nq().T_3).method_8621().N(class072092)) {
            return WorldRenderingSettings.INSTANCE.getBlockStateIds().getInt((Object)class005002);
        }
        return 0;
    }

    private static boolean getVehicleInShallowWater() {
        if ((class04453)class06202.Nq().T_4 == null) {
            return false;
        }
        if (((class04453)class06202.Nq().T_4).method_5854() == null) {
            return false;
        }
        return ((class04453)class06202.Nq().T_4).method_5854().method_74016();
    }

    private static boolean isElytraFlying() {
        if ((class04453)class06202.Nq().T_4 == null) {
            return false;
        }
        return ((class04453)class06202.Nq().T_4).method_6128();
    }

    private static float getCurrentHealth() {
        if ((class04453)class06202.Nq().T_4 == null || !((class03443)class06202.Nq().T_2).U().M()) {
            return -1.0f;
        }
        return ((class04453)class06202.Nq().T_4).method_6032() / ((class04453)class06202.Nq().T_4).method_6063();
    }

    private static float getMaxHealth() {
        if ((class04453)class06202.Nq().T_4 == null || !((class03443)class06202.Nq().T_2).U().M()) {
            return -1.0f;
        }
        return ((class04453)class06202.Nq().T_4).method_6063();
    }

    private static float getCurrentArmor() {
        if ((class04453)class06202.Nq().T_4 == null || !((class03443)class06202.Nq().T_2).U().M()) {
            return -1.0f;
        }
        return (float)((class04453)class06202.Nq().T_4).method_6096() / 50.0f;
    }

    private static float getCurrentAir() {
        if ((class04453)class06202.Nq().T_4 == null || !((class03443)class06202.Nq().T_2).U().M()) {
            return -1.0f;
        }
        return (float)((class04453)class06202.Nq().T_4).method_5669() / (float)((class04453)class06202.Nq().T_4).method_5748();
    }

    private static boolean isSpectator() {
        return ((class03443)class06202.Nq().T_2).U() == class07282.field_9219;
    }

    private static Vector3d getEyePosition() {
        Objects.requireNonNull(class06202.Nq().F());
        class06889 class068892 = class06202.Nq().F().method_5836(CapturedRenderingState.INSTANCE.getTickDelta());
        return new Vector3d(class068892.M, class068892.B, class068892.Z);
    }

    private static boolean getIsPassenger() {
        if ((class04453)class06202.Nq().T_4 == null) {
            return false;
        }
        return ((class04453)class06202.Nq().T_4).method_5765();
    }

    private static float getThunderStrength() {
        return Math.clamp((float)0.0f, (float)1.0f, (float)((class03448)class06202.Nq().T_3).method_8478(CapturedRenderingState.INSTANCE.getTickDelta()));
    }

    private static boolean getIsSwimming() {
        if ((class04453)class06202.Nq().T_4 == null) {
            return false;
        }
        return ((class04453)class06202.Nq().T_4).method_5681();
    }

    private static float getCurrentHunger() {
        if ((class04453)class06202.Nq().T_4 == null || !((class03443)class06202.Nq().T_2).U().M()) {
            return -1.0f;
        }
        return (float)((class04453)class06202.Nq().T_4).method_7344().N() / 20.0f;
    }

    private static int getVehicleId() {
        if ((class04453)class06202.Nq().T_4 == null) {
            return 0;
        }
        if (((class04453)class06202.Nq().T_4).method_5854() == null) {
            return 0;
        }
        Object2IntFunction object2IntFunction = WorldRenderingSettings.INSTANCE.getEntityIds();
        if (object2IntFunction == null) {
            return 0;
        }
        class01894 class018942 = class04206.M.y((Object)((class04453)class06202.Nq().T_4).method_5854().method_5864());
        if (class018942 == null) {
            return 0;
        }
        return object2IntFunction.applyAsInt((Object)new NamespacedId(class018942.y(), class018942.N()));
    }

    private static boolean isHeavyFog() {
        if ((class03448)class06202.Nq().T_3 != null) {
            class05363 class053632 = ((class03386)class06202.Nq().i_5).s();
            return ((class01056)class06202.Nq().i_6).U().u();
        }
        return false;
    }

    private static float getMaxAir() {
        if ((class04453)class06202.Nq().T_4 == null || !((class03443)class06202.Nq().T_2).U().M()) {
            return -1.0f;
        }
        return ((class04453)class06202.Nq().T_4).method_5748();
    }
}

