/*
 * Decompiled with CFR 0.152.
 */
package org.jcp.xml.dsig.internal.dom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import javax.xml.crypto.NodeSetData;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

public class DOMSubTreeData
implements NodeSetData<Node> {
    private boolean excludeComments;
    private Node root;

    public DOMSubTreeData(Node node, boolean bl) {
        this.root = node;
        this.excludeComments = bl;
    }

    @Override
    public Iterator<Node> iterator() {
        return new DelayedNodeIterator(this.root, this.excludeComments);
    }

    public Node getRoot() {
        return this.root;
    }

    public boolean excludeComments() {
        return this.excludeComments;
    }

    static class DelayedNodeIterator
    implements Iterator<Node> {
        private Node root;
        private List<Node> nodeSet;
        private ListIterator<Node> li;
        private boolean withComments;

        DelayedNodeIterator(Node node, boolean bl) {
            this.root = node;
            this.withComments = !bl;
        }

        @Override
        public boolean hasNext() {
            if (this.nodeSet == null) {
                this.nodeSet = this.dereferenceSameDocumentURI(this.root);
                this.li = this.nodeSet.listIterator();
            }
            return this.li.hasNext();
        }

        @Override
        public Node next() {
            if (this.nodeSet == null) {
                this.nodeSet = this.dereferenceSameDocumentURI(this.root);
                this.li = this.nodeSet.listIterator();
            }
            if (this.li.hasNext()) {
                return this.li.next();
            }
            throw new NoSuchElementException();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private List<Node> dereferenceSameDocumentURI(Node node) {
            ArrayList<Node> arrayList = new ArrayList<Node>();
            if (node != null) {
                this.nodeSetMinusCommentNodes(node, arrayList, null);
            }
            return arrayList;
        }

        private void nodeSetMinusCommentNodes(Node node, List<Node> list, Node node2) {
            switch (node.getNodeType()) {
                case 1: {
                    NamedNodeMap namedNodeMap = node.getAttributes();
                    if (namedNodeMap != null) {
                        int n = namedNodeMap.getLength();
                        for (int i = 0; i < n; ++i) {
                            list.add(namedNodeMap.item(i));
                        }
                    }
                    list.add(node);
                    Node node3 = null;
                    for (Node node4 = node.getFirstChild(); node4 != null; node4 = node4.getNextSibling()) {
                        this.nodeSetMinusCommentNodes(node4, list, node3);
                        node3 = node4;
                    }
                    break;
                }
                case 9: {
                    Node node5 = null;
                    for (Node node6 = node.getFirstChild(); node6 != null; node6 = node6.getNextSibling()) {
                        this.nodeSetMinusCommentNodes(node6, list, node5);
                        node5 = node6;
                    }
                    break;
                }
                case 3: 
                case 4: {
                    if (node2 != null && (node2.getNodeType() == 3 || node2.getNodeType() == 4)) {
                        return;
                    }
                    list.add(node);
                    break;
                }
                case 7: {
                    list.add(node);
                    break;
                }
                case 8: {
                    if (!this.withComments) break;
                    list.add(node);
                }
            }
        }
    }
}

