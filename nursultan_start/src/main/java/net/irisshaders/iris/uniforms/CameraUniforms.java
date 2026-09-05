/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03386
 *  minecraft.class05630
 *  minecraft.class06202
 *  minecraft.class06889
 *  net.irisshaders.iris.gl.uniform.UniformHolder
 *  net.irisshaders.iris.gl.uniform.UniformUpdateFrequency
 *  net.irisshaders.iris.helpers.JomlConversions
 *  org.joml.Vector3d
 *  org.joml.Vector3f
 *  org.joml.Vector3i
 */
package net.irisshaders.iris.uniforms;

import minecraft.class03386;
import minecraft.class05630;
import minecraft.class06202;
import minecraft.class06889;
import net.irisshaders.iris.gl.uniform.UniformHolder;
import net.irisshaders.iris.gl.uniform.UniformUpdateFrequency;
import net.irisshaders.iris.helpers.JomlConversions;
import net.irisshaders.iris.uniforms.CameraUniforms$CameraPositionTracker;
import net.irisshaders.iris.uniforms.FrameUpdateNotifier;
import org.joml.Vector3d;
import org.joml.Vector3f;
import org.joml.Vector3i;

public class CameraUniforms {
    private static final class06202 client = class06202.Nq();

    private CameraUniforms() {
    }

    public static Vector3d getUnshiftedCameraPosition() {
        return JomlConversions.fromVec3((class06889)((class03386)CameraUniforms.client.i_5).s().y());
    }

    private static int getRenderDistanceInBlocks() {
        return ((class05630)CameraUniforms.client.i_7).Nh() * 16;
    }

    public static Vector3f getCameraPositionFract(Vector3d vector3d) {
        return new Vector3f((float)(vector3d.x - Math.floor(vector3d.x)), (float)(vector3d.y - Math.floor(vector3d.y)), (float)(vector3d.z - Math.floor(vector3d.z)));
    }

    public static Vector3i getCameraPositionInt(Vector3d vector3d) {
        return new Vector3i((int)Math.floor(vector3d.x), (int)Math.floor(vector3d.y), (int)Math.floor(vector3d.z));
    }

    public static void addCameraUniforms(UniformHolder uniformHolder, FrameUpdateNotifier frameUpdateNotifier) {
        CameraUniforms$CameraPositionTracker cameraUniforms$CameraPositionTracker = new CameraUniforms$CameraPositionTracker(frameUpdateNotifier);
        uniformHolder.uniform1f(UniformUpdateFrequency.ONCE, "near", () -> 0.05).uniform1f(UniformUpdateFrequency.PER_FRAME, "far", CameraUniforms::getRenderDistanceInBlocks).uniform3d(UniformUpdateFrequency.PER_FRAME, "cameraPosition", cameraUniforms$CameraPositionTracker::getCurrentCameraPosition).uniform1f(UniformUpdateFrequency.PER_FRAME, "eyeAltitude", cameraUniforms$CameraPositionTracker::getCurrentCameraPositionY).uniform3d(UniformUpdateFrequency.PER_FRAME, "previousCameraPosition", cameraUniforms$CameraPositionTracker::getPreviousCameraPosition).uniform3i(UniformUpdateFrequency.PER_FRAME, "cameraPositionInt", () -> CameraUniforms.getCameraPositionInt(CameraUniforms.getUnshiftedCameraPosition())).uniform3f(UniformUpdateFrequency.PER_FRAME, "cameraPositionFract", () -> CameraUniforms.getCameraPositionFract(CameraUniforms.getUnshiftedCameraPosition())).uniform3i(UniformUpdateFrequency.PER_FRAME, "previousCameraPositionInt", () -> CameraUniforms.getCameraPositionInt(cameraUniforms$CameraPositionTracker.getPreviousCameraPositionUnshifted())).uniform3f(UniformUpdateFrequency.PER_FRAME, "previousCameraPositionFract", () -> CameraUniforms.getCameraPositionFract(cameraUniforms$CameraPositionTracker.getPreviousCameraPositionUnshifted()));
    }
}

