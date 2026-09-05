/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.Constructor
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.Constructor$ConstructMapping
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.extensions.compactnotation;

import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.Constructor;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.extensions.compactnotation.CompactConstructor;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.extensions.compactnotation.CompactData;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.MappingNode;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Node;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.NodeTuple;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.ScalarNode;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.SequenceNode;

public class CompactConstructor$ConstructCompactObject
extends Constructor.ConstructMapping {
    final /* synthetic */ CompactConstructor this$0;

    public CompactConstructor$ConstructCompactObject(CompactConstructor compactConstructor) {
        this.this$0 = compactConstructor;
        super((Constructor)compactConstructor);
    }

    public void construct2ndStep(Node node, Object object) {
        MappingNode mappingNode = (MappingNode)node;
        NodeTuple nodeTuple = mappingNode.getValue().iterator().next();
        Node node2 = nodeTuple.getValueNode();
        if (node2 instanceof MappingNode) {
            node2.setType(object.getClass());
            this.constructJavaBean2ndStep((MappingNode)node2, object);
        } else {
            this.this$0.applySequence(object, CompactConstructor.access$000(this.this$0, (SequenceNode)node2));
        }
    }

    public Object construct(Node node) {
        ScalarNode scalarNode;
        Object object;
        if (node instanceof MappingNode) {
            object = (MappingNode)node;
            NodeTuple nodeTuple = ((MappingNode)object).getValue().iterator().next();
            node.setTwoStepsConstruction(true);
            scalarNode = (ScalarNode)nodeTuple.getKeyNode();
        } else {
            scalarNode = (ScalarNode)node;
        }
        object = this.this$0.getCompactData(scalarNode.getValue());
        if (object == null) {
            return CompactConstructor.access$100(this.this$0, scalarNode);
        }
        return this.this$0.constructCompactFormat(scalarNode, (CompactData)object);
    }
}

