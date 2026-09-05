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

public class SafeConstructor$ConstructYamlInt
extends AbstractConstruct {
    final /* synthetic */ SafeConstructor this$0;

    public SafeConstructor$ConstructYamlInt(SafeConstructor safeConstructor) {
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
        int n2 = 10;
        if ("0".equals(string)) {
            return 0;
        }
        if (string.startsWith("0b")) {
            string = string.substring(2);
            n2 = 2;
        } else if (string.startsWith("0x")) {
            string = string.substring(2);
            n2 = 16;
        } else if (string.startsWith("0")) {
            string = string.substring(1);
            n2 = 8;
        } else {
            if (string.indexOf(58) != -1) {
                String[] stringArray = string.split(":");
                int n3 = 1;
                int n4 = 0;
                int n5 = stringArray.length;
                for (int i = 0; i < n5; ++i) {
                    n4 = (int)((long)n4 + Long.parseLong(stringArray[n5 - i - 1]) * (long)n3);
                    n3 *= 60;
                }
                return SafeConstructor.access$100((SafeConstructor)this.this$0, (int)n, (String)String.valueOf(n4), (int)10);
            }
            return SafeConstructor.access$100((SafeConstructor)this.this$0, (int)n, (String)string, (int)10);
        }
        return SafeConstructor.access$100((SafeConstructor)this.this$0, (int)n, (String)string, (int)n2);
    }
}

