/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.SafeConstructor
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.MappingNode
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Node
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.NodeTuple
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.SequenceNode
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor;

import java.util.ArrayList;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.AbstractConstruct;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.ConstructorException;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.SafeConstructor;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.MappingNode;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Node;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.NodeTuple;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.SequenceNode;

public class SafeConstructor$ConstructYamlPairs
extends AbstractConstruct {
    final /* synthetic */ SafeConstructor this$0;

    public SafeConstructor$ConstructYamlPairs(SafeConstructor safeConstructor) {
        this.this$0 = safeConstructor;
    }

    @Override
    public Object construct(Node node) {
        if (!(node instanceof SequenceNode)) {
            throw new ConstructorException("while constructing pairs", node.getStartMark(), "expected a sequence, but found " + node.getNodeId(), node.getStartMark());
        }
        SequenceNode sequenceNode = (SequenceNode)node;
        ArrayList<Object[]> arrayList = new ArrayList<Object[]>(sequenceNode.getValue().size());
        for (Node node2 : sequenceNode.getValue()) {
            if (!(node2 instanceof MappingNode)) {
                throw new ConstructorException("while constructingpairs", node.getStartMark(), "expected a mapping of length 1, but found " + node2.getNodeId(), node2.getStartMark());
            }
            MappingNode mappingNode = (MappingNode)node2;
            if (mappingNode.getValue().size() != 1) {
                throw new ConstructorException("while constructing pairs", node.getStartMark(), "expected a single mapping item, but found " + mappingNode.getValue().size() + " items", mappingNode.getStartMark());
            }
            Node node3 = ((NodeTuple)mappingNode.getValue().get(0)).getKeyNode();
            Node node4 = ((NodeTuple)mappingNode.getValue().get(0)).getValueNode();
            Object object = this.this$0.constructObject(node3);
            Object object2 = this.this$0.constructObject(node4);
            arrayList.add(new Object[]{object, object2});
        }
        return arrayList;
    }
}

