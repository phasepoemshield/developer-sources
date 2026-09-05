/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Node
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor;

import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.Construct;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.Constructor;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.ConstructorException;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Node;

public class Constructor$ConstructYamlObject
implements Construct {
    final /* synthetic */ Constructor this$0;

    protected Constructor$ConstructYamlObject(Constructor constructor) {
        this.this$0 = constructor;
    }

    private Construct getConstructor(Node node) {
        Class<?> clazz = this.this$0.getClassForNode(node);
        node.setType(clazz);
        Construct construct = (Construct)this.this$0.yamlClassConstructors.get(node.getNodeId());
        return construct;
    }

    @Override
    public void construct2ndStep(Node node, Object object) {
        try {
            this.getConstructor(node).construct2ndStep(node, object);
        }
        catch (Exception exception) {
            throw new ConstructorException(null, null, "Can't construct a second step for a java object for " + node.getTag() + "; exception=" + exception.getMessage(), node.getStartMark(), exception);
        }
    }

    @Override
    public Object construct(Node node) {
        try {
            return this.getConstructor(node).construct(node);
        }
        catch (ConstructorException constructorException) {
            throw constructorException;
        }
        catch (Exception exception) {
            throw new ConstructorException(null, null, "Can't construct a java object for " + node.getTag() + "; exception=" + exception.getMessage(), node.getStartMark(), exception);
        }
    }
}

