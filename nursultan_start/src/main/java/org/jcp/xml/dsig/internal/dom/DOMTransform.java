/*
 * Decompiled with CFR 0.152.
 */
package org.jcp.xml.dsig.internal.dom;

import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.spec.AlgorithmParameterSpec;
import javax.xml.crypto.Data;
import javax.xml.crypto.MarshalException;
import javax.xml.crypto.XMLCryptoContext;
import javax.xml.crypto.dom.DOMCryptoContext;
import javax.xml.crypto.dsig.Transform;
import javax.xml.crypto.dsig.TransformException;
import javax.xml.crypto.dsig.TransformService;
import javax.xml.crypto.dsig.dom.DOMSignContext;
import org.jcp.xml.dsig.internal.dom.DOMStructure;
import org.jcp.xml.dsig.internal.dom.DOMUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class DOMTransform
extends DOMStructure
implements Transform {
    protected TransformService spi;

    public DOMTransform(TransformService transformService) {
        this.spi = transformService;
    }

    public DOMTransform(Element element, XMLCryptoContext xMLCryptoContext, Provider provider) throws MarshalException {
        String string = DOMUtils.getAttributeValue(element, "Algorithm");
        if (provider == null) {
            try {
                this.spi = TransformService.getInstance(string, "DOM");
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                throw new MarshalException(noSuchAlgorithmException);
            }
        }
        try {
            this.spi = TransformService.getInstance(string, "DOM", provider);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            try {
                this.spi = TransformService.getInstance(string, "DOM");
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException2) {
                throw new MarshalException(noSuchAlgorithmException2);
            }
        }
        try {
            this.spi.init(new javax.xml.crypto.dom.DOMStructure(element), xMLCryptoContext);
        }
        catch (InvalidAlgorithmParameterException invalidAlgorithmParameterException) {
            throw new MarshalException(invalidAlgorithmParameterException);
        }
    }

    @Override
    public final AlgorithmParameterSpec getParameterSpec() {
        return this.spi.getParameterSpec();
    }

    @Override
    public final String getAlgorithm() {
        return this.spi.getAlgorithm();
    }

    @Override
    public void marshal(Node node, String string, DOMCryptoContext dOMCryptoContext) throws MarshalException {
        Document document = DOMUtils.getOwnerDocument(node);
        Element element = null;
        element = "Transforms".equals(node.getLocalName()) ? DOMUtils.createElement(document, "Transform", "http://www.w3.org/2000/09/xmldsig#", string) : DOMUtils.createElement(document, "CanonicalizationMethod", "http://www.w3.org/2000/09/xmldsig#", string);
        DOMUtils.setAttribute(element, "Algorithm", this.getAlgorithm());
        this.spi.marshalParams(new javax.xml.crypto.dom.DOMStructure(element), dOMCryptoContext);
        node.appendChild(element);
    }

    @Override
    public Data transform(Data data, XMLCryptoContext xMLCryptoContext) throws TransformException {
        return this.spi.transform(data, xMLCryptoContext);
    }

    @Override
    public Data transform(Data data, XMLCryptoContext xMLCryptoContext, OutputStream outputStream) throws TransformException {
        return this.spi.transform(data, xMLCryptoContext, outputStream);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Transform)) {
            return false;
        }
        Transform transform = (Transform)object;
        return this.getAlgorithm().equals(transform.getAlgorithm()) && DOMUtils.paramsEqual(this.getParameterSpec(), transform.getParameterSpec());
    }

    public int hashCode() {
        int n = 17;
        n = 31 * n + this.getAlgorithm().hashCode();
        AlgorithmParameterSpec algorithmParameterSpec = this.getParameterSpec();
        if (algorithmParameterSpec != null) {
            n = 31 * n + algorithmParameterSpec.hashCode();
        }
        return n;
    }

    Data transform(Data data, XMLCryptoContext xMLCryptoContext, DOMSignContext dOMSignContext) throws MarshalException, TransformException {
        this.marshal(dOMSignContext.getParent(), DOMUtils.getSignaturePrefix(dOMSignContext), dOMSignContext);
        return this.transform(data, xMLCryptoContext);
    }
}

