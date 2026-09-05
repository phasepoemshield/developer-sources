/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.AbstractConstruct
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor;

import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.AbstractConstruct;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.SafeConstructor;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Node;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.ScalarNode;

public class SafeConstructor$ConstructYamlStr
extends AbstractConstruct {
    final /* synthetic */ SafeConstructor this$0;

    public SafeConstructor$ConstructYamlStr(SafeConstructor safeConstructor) {
        this.this$0 = safeConstructor;
    }

    public Object construct(Node node) {
        return this.this$0.constructScalar((ScalarNode)node);
    }
}

