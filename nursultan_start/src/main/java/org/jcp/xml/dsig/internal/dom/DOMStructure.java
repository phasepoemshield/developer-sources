/*
 * Decompiled with CFR 0.152.
 */
package org.jcp.xml.dsig.internal.dom;

import java.util.List;
import javax.xml.crypto.MarshalException;
import javax.xml.crypto.XMLStructure;
import javax.xml.crypto.dom.DOMCryptoContext;
import org.jcp.xml.dsig.internal.dom.DOMUtils;
import org.w3c.dom.Node;

public abstract class DOMStructure
implements XMLStructure {
    @Override
    public final boolean isFeatureSupported(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        return false;
    }

    public abstract void marshal(Node var1, String var2, DOMCryptoContext var3) throws MarshalException;

    protected boolean equalsContent(List<XMLStructure> list, List<XMLStructure> list2) {
        int n = list.size();
        if (n != list2.size()) {
            return false;
        }
        for (int i = 0; i < n; ++i) {
            XMLStructure xMLStructure = list2.get(i);
            XMLStructure xMLStructure2 = list.get(i);
            if (xMLStructure instanceof javax.xml.crypto.dom.DOMStructure) {
                if (!(xMLStructure2 instanceof javax.xml.crypto.dom.DOMStructure)) {
                    return false;
                }
                Node node = ((javax.xml.crypto.dom.DOMStructure)xMLStructure).getNode();
                Node node2 = ((javax.xml.crypto.dom.DOMStructure)xMLStructure2).getNode();
                if (DOMUtils.nodesEqual(node2, node)) continue;
                return false;
            }
            if (xMLStructure2.equals(xMLStructure)) continue;
            return false;
        }
        return true;
    }
}

