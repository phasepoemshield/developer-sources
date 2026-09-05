/*
 * Decompiled with CFR 0.152.
 */
package org.jcp.xml.dsig.internal.dom;

import com.sun.org.apache.xml.internal.security.c14n.Canonicalizer;
import com.sun.org.apache.xml.internal.security.c14n.InvalidCanonicalizerException;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.crypto.Data;
import javax.xml.crypto.MarshalException;
import javax.xml.crypto.XMLCryptoContext;
import javax.xml.crypto.XMLStructure;
import javax.xml.crypto.dsig.TransformException;
import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;
import javax.xml.crypto.dsig.spec.ExcC14NParameterSpec;
import javax.xml.crypto.dsig.spec.TransformParameterSpec;
import org.jcp.xml.dsig.internal.dom.ApacheCanonicalizer;
import org.jcp.xml.dsig.internal.dom.DOMSubTreeData;
import org.jcp.xml.dsig.internal.dom.DOMUtils;
import org.w3c.dom.Element;

public final class DOMExcC14NMethod
extends ApacheCanonicalizer {
    @Override
    public void init(TransformParameterSpec transformParameterSpec) throws InvalidAlgorithmParameterException {
        if (transformParameterSpec != null) {
            if (!(transformParameterSpec instanceof ExcC14NParameterSpec)) {
                throw new InvalidAlgorithmParameterException("params must be of type ExcC14NParameterSpec");
            }
            this.params = (C14NMethodParameterSpec)transformParameterSpec;
        }
    }

    @Override
    public void init(XMLStructure xMLStructure, XMLCryptoContext xMLCryptoContext) throws InvalidAlgorithmParameterException {
        super.init(xMLStructure, xMLCryptoContext);
        Element element = DOMUtils.getFirstChildElement(this.transformElem);
        if (element == null) {
            this.params = null;
            this.inclusiveNamespaces = null;
            return;
        }
        this.unmarshalParams(element);
    }

    private void unmarshalParams(Element element) {
        String string;
        this.inclusiveNamespaces = string = element.getAttributeNS(null, "PrefixList");
        int n = 0;
        int n2 = string.indexOf(32);
        ArrayList<String> arrayList = new ArrayList<String>();
        while (n2 != -1) {
            arrayList.add(string.substring(n, n2));
            n = n2 + 1;
            n2 = string.indexOf(32, n);
        }
        if (n <= string.length()) {
            arrayList.add(string.substring(n));
        }
        this.params = new ExcC14NParameterSpec(arrayList);
    }

    public List<String> getParameterSpecPrefixList(ExcC14NParameterSpec excC14NParameterSpec) {
        return excC14NParameterSpec.getPrefixList();
    }

    @Override
    public void marshalParams(XMLStructure xMLStructure, XMLCryptoContext xMLCryptoContext) throws MarshalException {
        super.marshalParams(xMLStructure, xMLCryptoContext);
        AlgorithmParameterSpec algorithmParameterSpec = this.getParameterSpec();
        if (algorithmParameterSpec == null) {
            return;
        }
        String string = DOMUtils.getNSPrefix(xMLCryptoContext, "http://www.w3.org/2001/10/xml-exc-c14n#");
        Element element = DOMUtils.createElement(this.ownerDoc, "InclusiveNamespaces", "http://www.w3.org/2001/10/xml-exc-c14n#", string);
        if (string == null || string.length() == 0) {
            element.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns", "http://www.w3.org/2001/10/xml-exc-c14n#");
        } else {
            element.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns:" + string, "http://www.w3.org/2001/10/xml-exc-c14n#");
        }
        ExcC14NParameterSpec excC14NParameterSpec = (ExcC14NParameterSpec)algorithmParameterSpec;
        StringBuilder stringBuilder = new StringBuilder("");
        List<String> list = this.getParameterSpecPrefixList(excC14NParameterSpec);
        int n = list.size();
        for (int i = 0; i < n; ++i) {
            stringBuilder.append(list.get(i));
            if (i >= n - 1) continue;
            stringBuilder.append(' ');
        }
        DOMUtils.setAttribute(element, "PrefixList", stringBuilder.toString());
        this.inclusiveNamespaces = stringBuilder.toString();
        this.transformElem.appendChild(element);
    }

    public String getParamsNSURI() {
        return "http://www.w3.org/2001/10/xml-exc-c14n#";
    }

    @Override
    public Data transform(Data data, XMLCryptoContext xMLCryptoContext) throws TransformException {
        DOMSubTreeData dOMSubTreeData;
        if (data instanceof DOMSubTreeData && (dOMSubTreeData = (DOMSubTreeData)data).excludeComments()) {
            try {
                this.canonicalizer = Canonicalizer.getInstance("http://www.w3.org/2001/10/xml-exc-c14n#");
            }
            catch (InvalidCanonicalizerException invalidCanonicalizerException) {
                throw new TransformException("Couldn't find Canonicalizer for: http://www.w3.org/2001/10/xml-exc-c14n#: " + invalidCanonicalizerException.getMessage(), invalidCanonicalizerException);
            }
        }
        return this.canonicalize(data, xMLCryptoContext);
    }
}

