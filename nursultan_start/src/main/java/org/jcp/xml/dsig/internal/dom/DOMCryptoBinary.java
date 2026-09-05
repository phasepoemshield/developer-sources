/*
 * Decompiled with CFR 0.152.
 */
package org.jcp.xml.dsig.internal.dom;

import com.sun.org.apache.xml.internal.security.utils.XMLUtils;
import java.math.BigInteger;
import javax.xml.crypto.MarshalException;
import javax.xml.crypto.dom.DOMCryptoContext;
import org.jcp.xml.dsig.internal.dom.DOMStructure;
import org.jcp.xml.dsig.internal.dom.DOMUtils;
import org.w3c.dom.Node;
import org.w3c.dom.Text;

public final class DOMCryptoBinary
extends DOMStructure {
    private final BigInteger bigNum;
    private final String value;

    public DOMCryptoBinary(BigInteger bigInteger) {
        if (bigInteger == null) {
            throw new NullPointerException("bigNum is null");
        }
        this.bigNum = bigInteger;
        byte[] byArray = XMLUtils.getBytes(bigInteger, bigInteger.bitLength());
        this.value = XMLUtils.encodeToString(byArray);
    }

    public DOMCryptoBinary(Node node) throws MarshalException {
        this.value = node.getNodeValue();
        try {
            this.bigNum = new BigInteger(1, XMLUtils.decode(((Text)node).getData()));
        }
        catch (Exception exception) {
            throw new MarshalException(exception);
        }
    }

    public BigInteger getBigNum() {
        return this.bigNum;
    }

    @Override
    public void marshal(Node node, String string, DOMCryptoContext dOMCryptoContext) throws MarshalException {
        node.appendChild(DOMUtils.getOwnerDocument(node).createTextNode(this.value));
    }
}

