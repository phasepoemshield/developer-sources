/*
 * Decompiled with CFR 0.152.
 */
package net.irisshaders.iris.pipeline.transform;

import net.irisshaders.iris.pipeline.transform.parameter.Parameters;

class TransformPatcher$CacheKey {
    final Parameters parameters;
    final String vertex;
    final String geometry;
    final String tessControl;
    final String tessEval;
    final String fragment;
    final String compute;

    public TransformPatcher$CacheKey(Parameters parameters, String string, String string2, String string3, String string4, String string5) {
        this.parameters = parameters;
        this.vertex = string;
        this.geometry = string2;
        this.tessControl = string3;
        this.tessEval = string4;
        this.fragment = string5;
        this.compute = null;
    }

    public TransformPatcher$CacheKey(Parameters parameters, String string) {
        this.parameters = parameters;
        this.vertex = null;
        this.geometry = null;
        this.tessControl = null;
        this.tessEval = null;
        this.fragment = null;
        this.compute = string;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        TransformPatcher$CacheKey transformPatcher$CacheKey = (TransformPatcher$CacheKey)object;
        if (this.parameters == null ? transformPatcher$CacheKey.parameters != null : !this.parameters.equals(transformPatcher$CacheKey.parameters)) {
            return false;
        }
        if (this.vertex == null ? transformPatcher$CacheKey.vertex != null : !this.vertex.equals(transformPatcher$CacheKey.vertex)) {
            return false;
        }
        if (this.geometry == null ? transformPatcher$CacheKey.geometry != null : !this.geometry.equals(transformPatcher$CacheKey.geometry)) {
            return false;
        }
        if (this.tessControl == null ? transformPatcher$CacheKey.tessControl != null : !this.tessControl.equals(transformPatcher$CacheKey.tessControl)) {
            return false;
        }
        if (this.tessEval == null ? transformPatcher$CacheKey.tessEval != null : !this.tessEval.equals(transformPatcher$CacheKey.tessEval)) {
            return false;
        }
        if (this.fragment == null ? transformPatcher$CacheKey.fragment != null : !this.fragment.equals(transformPatcher$CacheKey.fragment)) {
            return false;
        }
        if (this.compute == null) {
            return transformPatcher$CacheKey.compute == null;
        }
        return this.compute.equals(transformPatcher$CacheKey.compute);
    }

    public int hashCode() {
        int n = 31;
        int n2 = 1;
        n2 = 31 * n2 + (this.parameters == null ? 0 : this.parameters.hashCode());
        n2 = 31 * n2 + (this.vertex == null ? 0 : this.vertex.hashCode());
        n2 = 31 * n2 + (this.geometry == null ? 0 : this.geometry.hashCode());
        n2 = 31 * n2 + (this.tessControl == null ? 0 : this.tessControl.hashCode());
        n2 = 31 * n2 + (this.tessEval == null ? 0 : this.tessEval.hashCode());
        n2 = 31 * n2 + (this.fragment == null ? 0 : this.fragment.hashCode());
        n2 = 31 * n2 + (this.compute == null ? 0 : this.compute.hashCode());
        return n2;
    }
}

