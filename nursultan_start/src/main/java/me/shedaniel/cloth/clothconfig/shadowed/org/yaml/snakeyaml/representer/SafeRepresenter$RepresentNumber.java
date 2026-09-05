/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Node
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Tag
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.representer.Represent
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.representer;

import java.math.BigInteger;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Node;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Tag;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.representer.Represent;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.representer.SafeRepresenter;

public class SafeRepresenter$RepresentNumber
implements Represent {
    final /* synthetic */ SafeRepresenter this$0;

    protected SafeRepresenter$RepresentNumber(SafeRepresenter safeRepresenter) {
        this.this$0 = safeRepresenter;
    }

    public Node representData(Object object) {
        String string;
        Tag tag;
        if (object instanceof Byte || object instanceof Short || object instanceof Integer || object instanceof Long || object instanceof BigInteger) {
            tag = Tag.INT;
            string = object.toString();
        } else {
            Number number = (Number)object;
            tag = Tag.FLOAT;
            string = number.equals(Double.NaN) ? ".NaN" : (number.equals(Double.POSITIVE_INFINITY) ? ".inf" : (number.equals(Double.NEGATIVE_INFINITY) ? "-.inf" : number.toString()));
        }
        return this.this$0.representScalar(this.this$0.getTag(object.getClass(), tag), string);
    }
}

