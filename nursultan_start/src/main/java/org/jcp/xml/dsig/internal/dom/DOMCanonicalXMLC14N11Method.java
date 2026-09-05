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

public final class DOMCanonicalXMLC14N11Method
extends ApacheCanonicalizer {
    public static final String C14N_11 = "http://www.w3.org/2006/12/xml-c14n11";
    public static final String C14N_11_WITH_COMMENTS = "http://www.w3.org/2006/12/xml-c14n11#WithComments";

    @Override
    public void init(TransformParameterSpec transformParameterSpec) throws InvalidAlgorithmParameterException {
        if (transformParameterSpec != null) {
            throw new InvalidAlgorithmParameterException("no parameters should be specified for Canonical XML 1.1 algorithm");
        }
    }

    @Override
    public Data transform(Data data, XMLCryptoContext xMLCryptoContext) throws TransformException {
        DOMSubTreeData dOMSubTreeData;
        if (data instanceof DOMSubTreeData && (dOMSubTreeData = (DOMSubTreeData)data).excludeComments()) {
            try {
                this.canonicalizer = Canonicalizer.getInstance(C14N_11);
            }
            catch (InvalidCanonicalizerException invalidCanonicalizerException) {
                throw new TransformException("Couldn't find Canonicalizer for: http://www.w3.org/2006/12/xml-c14n11: " + invalidCanonicalizerException.getMessage(), invalidCanonicalizerException);
            }
        }
        return this.canonicalize(data, xMLCryptoContext);
    }
}

