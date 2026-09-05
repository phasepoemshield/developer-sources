/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.SafeConstructor
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.YAMLException
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.MappingNode
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Node
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor;

import java.util.Map;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.Construct;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.SafeConstructor;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.YAMLException;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.MappingNode;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Node;

public class SafeConstructor$ConstructYamlMap
implements Construct {
    final /* synthetic */ SafeConstructor this$0;

    public SafeConstructor$ConstructYamlMap(SafeConstructor safeConstructor) {
        this.this$0 = safeConstructor;
    }

    @Override
    public void construct2ndStep(Node node, Object object) {
        if (!node.isTwoStepsConstruction()) {
            throw new YAMLException("Unexpected recursive mapping structure. Node: " + node);
        }
        this.this$0.constructMapping2ndStep((MappingNode)node, (Map)object);
    }

    @Override
    public Object construct(Node node) {
        MappingNode mappingNode = (MappingNode)node;
        if (node.isTwoStepsConstruction()) {
            return this.this$0.createDefaultMap(mappingNode.getValue().size());
        }
        return this.this$0.constructMapping(mappingNode);
    }
}

