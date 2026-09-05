/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.SafeConstructor
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Node
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.ScalarNode
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor;

import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.AbstractConstruct;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.SafeConstructor;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Node;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.ScalarNode;

public class SafeConstructor$ConstructYamlFloat
extends AbstractConstruct {
    final /* synthetic */ SafeConstructor this$0;

    public SafeConstructor$ConstructYamlFloat(SafeConstructor safeConstructor) {
        this.this$0 = safeConstructor;
    }

    @Override
    public Object construct(Node node) {
        String string = this.this$0.constructScalar((ScalarNode)node).toString().replaceAll("_", "");
        int n = 1;
        char c = string.charAt(0);
        if (c == '-') {
            n = -1;
            string = string.substring(1);
        } else if (c == '+') {
            string = string.substring(1);
        }
        String string2 = string.toLowerCase();
        if (".inf".equals(string2)) {
            return n == -1 ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY;
        }
        if (".nan".equals(string2)) {
            return Double.NaN;
        }
        if (string.indexOf(58) != -1) {
            String[] stringArray = string.split(":");
            int n2 = 1;
            double d = 0.0;
            int n3 = stringArray.length;
            for (int i = 0; i < n3; ++i) {
                d += Double.parseDouble(stringArray[n3 - i - 1]) * (double)n2;
                n2 *= 60;
            }
            return (double)n * d;
        }
        Double d = Double.valueOf(string);
        return d * (double)n;
    }
}

