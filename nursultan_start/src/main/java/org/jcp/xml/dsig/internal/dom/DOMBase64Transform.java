/*
 * Decompiled with CFR 0.152.
 */
package org.jcp.xml.dsig.internal.dom;

import java.security.InvalidAlgorithmParameterException;
import javax.xml.crypto.dsig.spec.TransformParameterSpec;
import org.jcp.xml.dsig.internal.dom.ApacheTransform;

public final class DOMBase64Transform
extends ApacheTransform {
    @Override
    public void init(TransformParameterSpec transformParameterSpec) throws InvalidAlgorithmParameterException {
        if (transformParameterSpec != null) {
            throw new InvalidAlgorithmParameterException("params must be null");
        }
    }
}

