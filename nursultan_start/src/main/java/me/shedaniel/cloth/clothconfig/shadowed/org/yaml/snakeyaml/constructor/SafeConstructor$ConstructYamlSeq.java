/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.SafeConstructor
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.YAMLException
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Node
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.SequenceNode
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor;

import java.util.Collection;
import java.util.List;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.Construct;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.SafeConstructor;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.YAMLException;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Node;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.SequenceNode;

public class SafeConstructor$ConstructYamlSeq
implements Construct {
    final /* synthetic */ SafeConstructor this$0;

    public SafeConstructor$ConstructYamlSeq(SafeConstructor safeConstructor) {
        this.this$0 = safeConstructor;
    }

    @Override
    public void construct2ndStep(Node node, Object object) {
        if (!node.isTwoStepsConstruction()) {
            throw new YAMLException("Unexpected recursive sequence structure. Node: " + node);
        }
        this.this$0.constructSequenceStep2((SequenceNode)node, (Collection)((List)object));
    }

    @Override
    public Object construct(Node node) {
        SequenceNode sequenceNode = (SequenceNode)node;
        if (node.isTwoStepsConstruction()) {
            return this.this$0.newList(sequenceNode);
        }
        return this.this$0.constructSequence(sequenceNode);
    }
}

