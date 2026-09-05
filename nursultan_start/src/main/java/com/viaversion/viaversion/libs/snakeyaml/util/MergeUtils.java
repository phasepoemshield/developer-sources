/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.snakeyaml.nodes.MappingNode
 *  com.viaversion.viaversion.libs.snakeyaml.nodes.Node
 *  com.viaversion.viaversion.libs.snakeyaml.nodes.NodeTuple
 *  com.viaversion.viaversion.libs.snakeyaml.nodes.ScalarNode
 *  com.viaversion.viaversion.libs.snakeyaml.nodes.SequenceNode
 *  com.viaversion.viaversion.libs.snakeyaml.nodes.Tag
 *  com.viaversion.viaversion.libs.snakeyaml.util.Tuple
 */
package com.viaversion.viaversion.libs.snakeyaml.util;

import com.viaversion.viaversion.libs.snakeyaml.nodes.MappingNode;
import com.viaversion.viaversion.libs.snakeyaml.nodes.Node;
import com.viaversion.viaversion.libs.snakeyaml.nodes.NodeTuple;
import com.viaversion.viaversion.libs.snakeyaml.nodes.ScalarNode;
import com.viaversion.viaversion.libs.snakeyaml.nodes.SequenceNode;
import com.viaversion.viaversion.libs.snakeyaml.nodes.Tag;
import com.viaversion.viaversion.libs.snakeyaml.util.Tuple;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class MergeUtils {
    public List<NodeTuple> flatten(MappingNode node) {
        ArrayList<NodeTuple> toProcess;
        ArrayList<NodeTuple> result = toProcess = node.getValue();
        boolean process = true;
        while (process) {
            process = false;
            ArrayList<NodeTuple> updated = new ArrayList<NodeTuple>(toProcess.size());
            HashSet<String> keys = new HashSet<String>(toProcess.size());
            ArrayList<NodeTuple> merges = new ArrayList<NodeTuple>(2);
            for (NodeTuple tuple : toProcess) {
                Node keyNode = tuple.getKeyNode();
                if (keyNode.getTag().equals((Object)Tag.MERGE)) {
                    merges.add(tuple);
                    continue;
                }
                updated.add(tuple);
                if (!(keyNode instanceof ScalarNode)) continue;
                ScalarNode sNode = (ScalarNode)keyNode;
                keys.add(sNode.getValue());
            }
            for (NodeTuple tuple : merges) {
                Node valueNode = tuple.getValueNode();
                if (valueNode instanceof SequenceNode) {
                    SequenceNode seqNode = (SequenceNode)valueNode;
                    for (Node ref : seqNode.getValue()) {
                        MappingNode mergable = this.asMappingNode(ref);
                        process = process || mergable.isMerged();
                        Tuple<List<NodeTuple>, Set<String>> filtered = this.filter(mergable.getValue(), keys);
                        updated.addAll((Collection)filtered._1());
                        keys.addAll((Collection)filtered._2());
                    }
                    continue;
                }
                MappingNode mergable = this.asMappingNode(valueNode);
                process = process || mergable.isMerged();
                Tuple<List<NodeTuple>, Set<String>> filtered = this.filter(mergable.getValue(), keys);
                updated.addAll((Collection)filtered._1());
                keys.addAll((Collection)filtered._2());
            }
            result = updated;
            if (!process) continue;
            toProcess = updated;
        }
        return result;
    }

    private Tuple<List<NodeTuple>, Set<String>> filter(List<NodeTuple> mergables, Set<String> filter) {
        int size = mergables.size();
        HashSet<String> keys = new HashSet<String>(size);
        ArrayList<NodeTuple> result = new ArrayList<NodeTuple>(size);
        for (NodeTuple tuple : mergables) {
            Node key = tuple.getKeyNode();
            if (key instanceof ScalarNode) {
                ScalarNode sNode = (ScalarNode)key;
                String nodeValue = sNode.getValue();
                if (filter.contains(nodeValue)) continue;
                result.add(tuple);
                keys.add(nodeValue);
                continue;
            }
            result.add(tuple);
        }
        return new Tuple(result, keys);
    }

    public abstract MappingNode asMappingNode(Node var1);
}

