/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Node
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.serializer;

import java.text.NumberFormat;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Node;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.serializer.AnchorGenerator;

public class NumberAnchorGenerator
implements AnchorGenerator {
    private int lastAnchorId = 0;

    public NumberAnchorGenerator(int n) {
        this.lastAnchorId = n;
    }

    @Override
    public String nextAnchor(Node node) {
        ++this.lastAnchorId;
        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        numberFormat.setMinimumIntegerDigits(3);
        numberFormat.setMaximumFractionDigits(0);
        numberFormat.setGroupingUsed(false);
        String string = numberFormat.format(this.lastAnchorId);
        return "id" + string;
    }
}

