/*
 * Decompiled with CFR 0.152.
 */
package org.jcp.xml.dsig.internal.dom;

import com.sun.org.apache.xml.internal.security.signature.XMLSignatureInput;
import java.io.IOException;
import javax.xml.crypto.OctetStreamData;
import org.jcp.xml.dsig.internal.dom.ApacheData;

public class ApacheOctetStreamData
extends OctetStreamData
implements ApacheData {
    private XMLSignatureInput xi;

    public ApacheOctetStreamData(XMLSignatureInput xMLSignatureInput) throws IOException {
        super(xMLSignatureInput.getOctetStream(), xMLSignatureInput.getSourceURI(), xMLSignatureInput.getMIMEType());
        this.xi = xMLSignatureInput;
    }

    @Override
    public XMLSignatureInput getXMLSignatureInput() {
        return this.xi;
    }
}

