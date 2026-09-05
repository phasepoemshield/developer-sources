/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.Construct
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor;

import java.util.Set;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.Construct;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.SafeConstructor;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.YAMLException;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.MappingNode;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Node;

public class SafeConstructor$ConstructYamlSet
implements Construct {
    final /* synthetic */ SafeConstructor this$0;

    public SafeConstructor$ConstructYamlSet(SafeConstructor safeConstructor) {
        this.this$0 = safeConstructor;
    }

    public void construct2ndStep(Node node, Object object) {
        if (!node.isTwoStepsConstruction()) {
            throw new YAMLException("Unexpected recursive set structure. Node: " + node);
        }
        this.this$0.constructSet2ndStep((MappingNode)node, (Set)object);
    }

    public Object construct(Node node) {
        if (node.isTwoStepsConstruction()) {
            return this.this$0.constructedObjects.containsKey(node) ? this.this$0.constructedObjects.get(node) : this.this$0.createDefaultSet(((MappingNode)node).getValue().size());
        }
        return this.this$0.constructSet((MappingNode)node);
    }
}

