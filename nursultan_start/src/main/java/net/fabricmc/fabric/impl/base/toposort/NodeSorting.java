/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package net.fabricmc.fabric.impl.base.toposort;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import net.fabricmc.fabric.impl.base.toposort.NodeSorting$NodeScc;
import net.fabricmc.fabric.impl.base.toposort.SortableNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NodeSorting {
    private static final Logger LOGGER = LoggerFactory.getLogger((String)"fabric-api-base");
    public static boolean ENABLE_CYCLE_WARNING = true;

    private static <N extends SortableNode<N>> void forwardVisit(N n, N n2, List<N> list) {
        if (!n.visited) {
            n.visited = true;
            for (SortableNode sortableNode : n.subsequentNodes) {
                NodeSorting.forwardVisit(sortableNode, n, list);
            }
            list.add(n);
        }
    }

    private static <N extends SortableNode<N>> void backwardVisit(N n, List<N> list) {
        if (!n.visited) {
            n.visited = true;
            list.add(n);
            for (SortableNode sortableNode : n.previousNodes) {
                NodeSorting.backwardVisit(sortableNode, list);
            }
        }
    }

    public static <N extends SortableNode<N>> boolean sort(List<N> list, String string, Comparator<N> comparator) {
        Object object42;
        Object object222;
        Object object322;
        ArrayList arrayList = new ArrayList(list.size());
        for (Object object322 : list) {
            NodeSorting.forwardVisit(object322, null, arrayList);
        }
        NodeSorting.clearStatus(arrayList);
        Collections.reverse(arrayList);
        IdentityHashMap identityHashMap = new IdentityHashMap();
        for (Iterator iterator : arrayList) {
            if (((SortableNode)((Object)iterator)).visited) continue;
            object222 = new ArrayList<N>();
            NodeSorting.backwardVisit(iterator, object222);
            object222.sort(comparator);
            object42 = new NodeSorting$NodeScc(object222);
            Iterator iterator2 = object222.iterator();
            while (iterator2.hasNext()) {
                SortableNode sortableNode = (SortableNode)iterator2.next();
                identityHashMap.put(sortableNode, object42);
            }
        }
        NodeSorting.clearStatus(arrayList);
        for (Iterator iterator : identityHashMap.values()) {
            for (Object object42 : ((NodeSorting$NodeScc)((Object)iterator)).nodes) {
                for (SortableNode sortableNode : ((SortableNode)object42).subsequentNodes) {
                    NodeSorting$NodeScc nodeSorting$NodeScc2 = (NodeSorting$NodeScc)identityHashMap.get(sortableNode);
                    if (nodeSorting$NodeScc2 == iterator) continue;
                    ((NodeSorting$NodeScc)((Object)iterator)).subsequentSccs.add(nodeSorting$NodeScc2);
                    ++nodeSorting$NodeScc2.inDegree;
                }
            }
        }
        object322 = new PriorityQueue<NodeSorting$NodeScc>(Comparator.comparing(nodeSorting$NodeScc -> (SortableNode)nodeSorting$NodeScc.nodes.get(0), comparator));
        list.clear();
        for (Object object222 : identityHashMap.values()) {
            if (((NodeSorting$NodeScc)object222).inDegree != 0) continue;
            ((PriorityQueue)object322).add(object222);
            ((NodeSorting$NodeScc)object222).inDegree = -1;
        }
        boolean bl = true;
        while (!((AbstractCollection)object322).isEmpty()) {
            object222 = (NodeSorting$NodeScc)((PriorityQueue)object322).poll();
            list.addAll(((NodeSorting$NodeScc)object222).nodes);
            if (((NodeSorting$NodeScc)object222).nodes.size() > 1) {
                bl = false;
                if (ENABLE_CYCLE_WARNING) {
                    object42 = new StringBuilder();
                    ((StringBuilder)object42).append("Found cycle while sorting ").append(string).append(":\n");
                    for (SortableNode sortableNode : ((NodeSorting$NodeScc)object222).nodes) {
                        ((StringBuilder)object42).append("\t").append(sortableNode.getDescription()).append("\n");
                    }
                    LOGGER.warn(((StringBuilder)object42).toString());
                }
            }
            for (NodeSorting$NodeScc nodeSorting$NodeScc3 : ((NodeSorting$NodeScc)object222).subsequentSccs) {
                --nodeSorting$NodeScc3.inDegree;
                if (nodeSorting$NodeScc3.inDegree != 0) continue;
                ((PriorityQueue)object322).add(nodeSorting$NodeScc3);
            }
        }
        return bl;
    }

    private static <N extends SortableNode<N>> void clearStatus(List<N> list) {
        for (SortableNode sortableNode : list) {
            sortableNode.visited = false;
        }
    }
}

