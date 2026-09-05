/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector3d
 *  org.joml.Vector3dc
 */
package net.irisshaders.iris.uniforms;

import net.irisshaders.iris.uniforms.CameraUniforms;
import net.irisshaders.iris.uniforms.FrameUpdateNotifier;
import org.joml.Vector3d;
import org.joml.Vector3dc;

class CameraUniforms$CameraPositionTracker {
    private static final double WALK_RANGE = 30000.0;
    private static final double TP_RANGE = 1000.0;
    private final Vector3d shift = new Vector3d();
    private Vector3d previousCameraPosition = new Vector3d();
    private Vector3d currentCameraPosition = new Vector3d();
    private Vector3d previousCameraPositionUnshifted = new Vector3d();
    private Vector3d currentCameraPositionUnshifted = new Vector3d();

    CameraUniforms$CameraPositionTracker(FrameUpdateNotifier frameUpdateNotifier) {
        frameUpdateNotifier.addListener(this::update);
    }

    private void update() {
        this.previousCameraPosition = this.currentCameraPosition;
        this.previousCameraPositionUnshifted = this.currentCameraPositionUnshifted;
        this.currentCameraPosition = CameraUniforms.getUnshiftedCameraPosition().add((Vector3dc)this.shift);
        this.currentCameraPositionUnshifted = CameraUniforms.getUnshiftedCameraPosition();
        this.updateShift();
    }

    public double getCurrentCameraPositionY() {
        return this.currentCameraPosition.y;
    }

    public Vector3d getPreviousCameraPosition() {
        return this.previousCameraPosition;
    }

    public Vector3d getCurrentCameraPosition() {
        return this.currentCameraPosition;
    }

    public Vector3d getPreviousCameraPositionUnshifted() {
        return this.previousCameraPositionUnshifted;
    }

    private void updateShift() {
        double d = CameraUniforms$CameraPositionTracker.getShift(this.currentCameraPosition.x, this.previousCameraPosition.x);
        double d2 = CameraUniforms$CameraPositionTracker.getShift(this.currentCameraPosition.z, this.previousCameraPosition.z);
        if (d != 0.0 || d2 != 0.0) {
            this.applyShift(d, d2);
        }
    }

    private void applyShift(double d, double d2) {
        this.shift.x += d;
        this.currentCameraPosition.x += d;
        this.previousCameraPosition.x += d;
        this.shift.z += d2;
        this.currentCameraPosition.z += d2;
        this.previousCameraPosition.z += d2;
    }

    private static double getShift(double d, double d2) {
        if (Math.abs(d) > 30000.0 || Math.abs(d - d2) > 1000.0) {
            return -(d - d % 30000.0);
        }
        return 0.0;
    }
}

