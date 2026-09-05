/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01383
 */
package net.irisshaders.iris.shadows.frustum;

import minecraft.class01383;

public class FrustumHolder {
    private class01383 frustum;
    private String distanceInfo = "(unavailable)";
    private String cullingInfo = "(unavailable)";

    public FrustumHolder setInfo(class01383 class013832, String string, String string2) {
        this.frustum = class013832;
        this.distanceInfo = string;
        this.cullingInfo = string2;
        return this;
    }

    public String getDistanceInfo() {
        return this.distanceInfo;
    }

    public String getCullingInfo() {
        return this.cullingInfo;
    }

    public class01383 getFrustum() {
        return this.frustum;
    }
}

