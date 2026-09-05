/*
 * Decompiled with CFR 0.152.
 */
package org.jcp.xml.dsig.internal.dom;

import com.sun.org.apache.xml.internal.security.c14n.Canonicalizer;
import com.sun.org.apache.xml.internal.security.c14n.InvalidCanonicalizerException;
import java.security.InvalidAlgorithmParameterException;
import javax.xml.crypto.Data;
import javax.xml.crypto.XMLCryptoContext;
import javax.xml.crypto.dsig.TransformException;
import javax.xml.crypto.dsig.spec.TransformParameterSpec;
import org.jcp.xml.dsig.internal.dom.ApacheCanonicalizer;
import org.jcp.xml.dsig.internal.dom.DOMSubTreeData;

public final class DOMCanonicalXMLC14NMethod
extends ApacheCanonicalizer {
    @Override
    public void init(TransformParameterSpec transformParameterSpec) throws InvalidAlgorithmParameterException {
        if (transformParameterSpec != null) {
            throw new InvalidAlgorithmParameterException("no parameters should be specified for Canonical XML C14N algorithm");
        }
    }

    @Override
    public Data transform(Data data, XMLCryptoContext xMLCryptoContext) throws TransformException {
        DOMSubTreeData dOMSubTreeData;
        if (data instanceof DOMSubTreeData && (dOMSubTreeData = (DOMSubTreeData)data).excludeComments()) {
            try {
                this.canonicalizer = Canonicalizer.getInstance("http://www.w3.org/TR/2001/REC-xml-c14n-20010315");
            }
            catch (InvalidCanonicalizerException invalidCanonicalizerException) {
                throw new TransformException("Couldn't find Canonicalizer for: http://www.w3.org/TR/2001/REC-xml-c14n-20010315: " + invalidCanonicalizerException.getMessage(), invalidCanonicalizerException);
            }
        }
        return this.canonicalize(data, xMLCryptoContext);
    }
}

