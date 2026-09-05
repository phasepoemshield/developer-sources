/*
 * Decompiled with CFR 0.152.
 */
package org.jcp.xml.dsig.internal.dom;

import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.Provider;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import javax.xml.crypto.Data;
import javax.xml.crypto.MarshalException;
import javax.xml.crypto.XMLCryptoContext;
import javax.xml.crypto.dsig.CanonicalizationMethod;
import javax.xml.crypto.dsig.TransformException;
import javax.xml.crypto.dsig.TransformService;
import org.jcp.xml.dsig.internal.dom.ApacheCanonicalizer;
import org.jcp.xml.dsig.internal.dom.DOMTransform;
import org.jcp.xml.dsig.internal.dom.DOMUtils;
import org.w3c.dom.Element;

public class DOMCanonicalizationMethod
extends DOMTransform
implements CanonicalizationMethod {
    private static final Set<String> C14N_ALGORITHMS;

    public DOMCanonicalizationMethod(TransformService transformService) throws InvalidAlgorithmParameterException {
        super(transformService);
        if (!(transformService instanceof ApacheCanonicalizer) && !DOMCanonicalizationMethod.isC14Nalg(transformService.getAlgorithm())) {
            throw new InvalidAlgorithmParameterException("Illegal CanonicalizationMethod");
        }
    }

    public DOMCanonicalizationMethod(Element element, XMLCryptoContext xMLCryptoContext, Provider provider) throws MarshalException {
        super(element, xMLCryptoContext, provider);
        if (!(this.spi instanceof ApacheCanonicalizer) && !DOMCanonicalizationMethod.isC14Nalg(this.spi.getAlgorithm())) {
            throw new MarshalException("Illegal CanonicalizationMethod");
        }
    }

    public Data canonicalize(Data data, XMLCryptoContext xMLCryptoContext) throws TransformException {
        return this.transform(data, xMLCryptoContext);
    }

    public Data canonicalize(Data data, XMLCryptoContext xMLCryptoContext, OutputStream outputStream) throws TransformException {
        return this.transform(data, xMLCryptoContext, outputStream);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof CanonicalizationMethod)) {
            return false;
        }
        CanonicalizationMethod canonicalizationMethod = (CanonicalizationMethod)object;
        return this.getAlgorithm().equals(canonicalizationMethod.getAlgorithm()) && DOMUtils.paramsEqual(this.getParameterSpec(), canonicalizationMethod.getParameterSpec());
    }

    @Override
    public int hashCode() {
        int n = 17;
        n = 31 * n + this.getAlgorithm().hashCode();
        AlgorithmParameterSpec algorithmParameterSpec = this.getParameterSpec();
        if (algorithmParameterSpec != null) {
            n = 31 * n + algorithmParameterSpec.hashCode();
        }
        return n;
    }

    private static boolean isC14Nalg(String string) {
        return string != null && C14N_ALGORITHMS.contains(string);
    }

    static {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("http://www.w3.org/TR/2001/REC-xml-c14n-20010315");
        hashSet.add("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments");
        hashSet.add("http://www.w3.org/2001/10/xml-exc-c14n#");
        hashSet.add("http://www.w3.org/2001/10/xml-exc-c14n#WithComments");
        hashSet.add("http://www.w3.org/2006/12/xml-c14n11");
        hashSet.add("http://www.w3.org/2006/12/xml-c14n11#WithComments");
        C14N_ALGORITHMS = Collections.unmodifiableSet(hashSet);
    }
}

