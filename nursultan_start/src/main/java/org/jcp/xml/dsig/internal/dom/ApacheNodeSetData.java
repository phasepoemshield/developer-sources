/*
 * Decompiled with CFR 0.152.
 */
package org.jcp.xml.dsig.internal.dom;

import com.sun.org.apache.xml.internal.security.signature.NodeFilter;
import com.sun.org.apache.xml.internal.security.signature.XMLSignatureInput;
import com.sun.org.apache.xml.internal.security.transforms.TransformationException;
import com.sun.org.apache.xml.internal.security.utils.XMLUtils;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.xml.crypto.NodeSetData;
import org.jcp.xml.dsig.internal.dom.ApacheData;
import org.w3c.dom.Node;

public class ApacheNodeSetData
implements ApacheData,
NodeSetData<Node> {
    private XMLSignatureInput xi;

    public ApacheNodeSetData(XMLSignatureInput xMLSignatureInput) {
        this.xi = xMLSignatureInput;
    }

    @Override
    public Iterator<Node> iterator() {
        try {
            if (this.xi.getNodeFilters() != null && !this.xi.getNodeFilters().isEmpty()) {
                return Collections.unmodifiableSet(this.getNodeSet(this.xi.getNodeFilters())).iterator();
            }
            return Collections.unmodifiableSet(this.xi.getNodeSet()).iterator();
        }
        catch (Exception exception) {
            throw new RuntimeException("unrecoverable error retrieving nodeset", exception);
        }
    }

    @Override
    public XMLSignatureInput getXMLSignatureInput() {
        return this.xi;
    }

    private Set<Node> getNodeSet(List<NodeFilter> list) throws TransformationException {
        if (this.xi.isNeedsToBeExpanded()) {
            XMLUtils.circumventBug2650(XMLUtils.getOwnerDocument(this.xi.getSubNode()));
        }
        LinkedHashSet<Node> linkedHashSet = new LinkedHashSet<Node>();
        XMLUtils.getSet(this.xi.getSubNode(), linkedHashSet, null, !this.xi.isExcludeComments());
        LinkedHashSet<Node> linkedHashSet2 = new LinkedHashSet<Node>();
        for (Node node : linkedHashSet) {
            Iterator<NodeFilter> iterator = list.iterator();
            boolean bl = false;
            while (iterator.hasNext() && !bl) {
                NodeFilter nodeFilter = iterator.next();
                if (nodeFilter.isNodeInclude(node) == 1) continue;
                bl = true;
            }
            if (bl) continue;
            linkedHashSet2.add(node);
        }
        return linkedHashSet2;
    }
}

