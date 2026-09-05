/*
 * Decompiled with CFR 0.152.
 */
package org.jcp.xml.dsig.internal.dom;

import java.security.InvalidAlgorithmParameterException;
import javax.xml.crypto.MarshalException;
import javax.xml.crypto.XMLCryptoContext;
import javax.xml.crypto.XMLStructure;
import javax.xml.crypto.dom.DOMStructure;
import javax.xml.crypto.dsig.spec.TransformParameterSpec;
import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import org.jcp.xml.dsig.internal.dom.ApacheTransform;
import org.jcp.xml.dsig.internal.dom.DOMUtils;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public final class DOMXSLTTransform
extends ApacheTransform {
    @Override
    public void init(TransformParameterSpec transformParameterSpec) throws InvalidAlgorithmParameterException {
        if (transformParameterSpec == null) {
            throw new InvalidAlgorithmParameterException("params are required");
        }
        if (!(transformParameterSpec instanceof XSLTTransformParameterSpec)) {
            throw new InvalidAlgorithmParameterException("unrecognized params");
        }
        this.params = transformParameterSpec;
    }

    @Override
    public void init(XMLStructure xMLStructure, XMLCryptoContext xMLCryptoContext) throws InvalidAlgorithmParameterException {
        super.init(xMLStructure, xMLCryptoContext);
        this.unmarshalParams(DOMUtils.getFirstChildElement(this.transformElem));
    }

    private void unmarshalParams(Element element) {
        this.params = new XSLTTransformParameterSpec(new DOMStructure(element));
    }

    @Override
    public void marshalParams(XMLStructure xMLStructure, XMLCryptoContext xMLCryptoContext) throws MarshalException {
        super.marshalParams(xMLStructure, xMLCryptoContext);
        XSLTTransformParameterSpec xSLTTransformParameterSpec = (XSLTTransformParameterSpec)this.getParameterSpec();
        Node node = ((DOMStructure)xSLTTransformParameterSpec.getStylesheet()).getNode();
        DOMUtils.appendChild(this.transformElem, node);
    }
}

