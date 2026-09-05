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

import java.util.LinkedHashMap;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.AbstractConstruct;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.ConstructorException;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.SafeConstructor;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.MappingNode;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Node;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.NodeTuple;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.SequenceNode;

public class SafeConstructor$ConstructYamlOmap
extends AbstractConstruct {
    final /* synthetic */ SafeConstructor this$0;

    public SafeConstructor$ConstructYamlOmap(SafeConstructor safeConstructor) {
        this.this$0 = safeConstructor;
    }

    @Override
    public Object construct(Node node) {
        LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>();
        if (!(node instanceof SequenceNode)) {
            throw new ConstructorException("while constructing an ordered map", node.getStartMark(), "expected a sequence, but found " + node.getNodeId(), node.getStartMark());
        }
        SequenceNode sequenceNode = (SequenceNode)node;
        for (Node node2 : sequenceNode.getValue()) {
            if (!(node2 instanceof MappingNode)) {
                throw new ConstructorException("while constructing an ordered map", node.getStartMark(), "expected a mapping of length 1, but found " + node2.getNodeId(), node2.getStartMark());
            }
            MappingNode mappingNode = (MappingNode)node2;
            if (mappingNode.getValue().size() != 1) {
                throw new ConstructorException("while constructing an ordered map", node.getStartMark(), "expected a single mapping item, but found " + mappingNode.getValue().size() + " items", mappingNode.getStartMark());
            }
            Node node3 = ((NodeTuple)mappingNode.getValue().get(0)).getKeyNode();
            Node node4 = ((NodeTuple)mappingNode.getValue().get(0)).getValueNode();
            Object object = this.this$0.constructObject(node3);
            Object object2 = this.this$0.constructObject(node4);
            linkedHashMap.put(object, object2);
        }
        return linkedHashMap;
    }
}

