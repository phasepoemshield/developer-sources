/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlTimestamp
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.YAMLException
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Node
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.ScalarNode
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Tag
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.AbstractConstruct;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.Construct;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.Constructor;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.ConstructorException;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.SafeConstructor;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlFloat;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.YAMLException;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Node;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.ScalarNode;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Tag;

public class Constructor$ConstructScalar
extends AbstractConstruct {
    final /* synthetic */ Constructor this$0;

    protected Constructor$ConstructScalar(Constructor constructor) {
        this.this$0 = constructor;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public Object construct(Node node) {
        ScalarNode scalarNode = (ScalarNode)node;
        Class clazz = scalarNode.getType();
        try {
            return this.this$0.newInstance(clazz, (Node)scalarNode, false);
        }
        catch (InstantiationException instantiationException) {
            Object object;
            if (clazz.isPrimitive() || clazz == String.class || Number.class.isAssignableFrom(clazz) || clazz == Boolean.class || Date.class.isAssignableFrom(clazz) || clazz == Character.class || clazz == BigInteger.class || clazz == BigDecimal.class || Enum.class.isAssignableFrom(clazz) || Tag.BINARY.equals((Object)scalarNode.getTag()) || Calendar.class.isAssignableFrom(clazz) || clazz == UUID.class) {
                object = this.constructStandardJavaInstance(clazz, scalarNode);
            } else {
                java.lang.reflect.Constructor<?>[] constructorArray = clazz.getDeclaredConstructors();
                int n = 0;
                java.lang.reflect.Constructor<Object> constructor = null;
                for (java.lang.reflect.Constructor<?> constructor2 : constructorArray) {
                    if (constructor2.getParameterTypes().length != 1) continue;
                    ++n;
                    constructor = constructor2;
                }
                if (constructor == null) {
                    try {
                        return this.this$0.newInstance(clazz, (Node)scalarNode, false);
                    }
                    catch (InstantiationException instantiationException2) {
                        throw new YAMLException("No single argument constructor found for " + clazz + " : " + instantiationException2.getMessage());
                    }
                }
                if (n == 1) {
                    Object object2 = this.constructStandardJavaInstance(constructor.getParameterTypes()[0], scalarNode);
                } else {
                    String string = this.this$0.constructScalar(scalarNode);
                    try {
                        constructor = clazz.getDeclaredConstructor(String.class);
                    }
                    catch (Exception exception) {
                        throw new YAMLException("Can't construct a java object for scalar " + scalarNode.getTag() + "; No String constructor found. Exception=" + exception.getMessage(), (Throwable)exception);
                    }
                }
                try {
                    void var8_12;
                    constructor.setAccessible(true);
                    object = constructor.newInstance(var8_12);
                }
                catch (Exception exception) {
                    throw new ConstructorException(null, null, "Can't construct a java object for scalar " + scalarNode.getTag() + "; exception=" + exception.getMessage(), scalarNode.getStartMark(), exception);
                }
            }
            return object;
        }
    }

    private Object constructStandardJavaInstance(Class clazz, ScalarNode scalarNode) {
        Object object;
        if (clazz == String.class) {
            Construct construct = (Construct)this.this$0.yamlConstructors.get(Tag.STR);
            object = construct.construct((Node)scalarNode);
        } else if (clazz == Boolean.class || clazz == Boolean.TYPE) {
            Construct construct = (Construct)this.this$0.yamlConstructors.get(Tag.BOOL);
            object = construct.construct((Node)scalarNode);
        } else if (clazz == Character.class || clazz == Character.TYPE) {
            Construct construct = (Construct)this.this$0.yamlConstructors.get(Tag.STR);
            String string = (String)construct.construct((Node)scalarNode);
            if (string.length() == 0) {
                object = null;
            } else {
                if (string.length() != 1) {
                    throw new YAMLException("Invalid node Character: '" + string + "'; length: " + string.length());
                }
                object = Character.valueOf(string.charAt(0));
            }
        } else if (Date.class.isAssignableFrom(clazz)) {
            Construct construct = (Construct)this.this$0.yamlConstructors.get(Tag.TIMESTAMP);
            Date date = (Date)construct.construct((Node)scalarNode);
            if (clazz == Date.class) {
                object = date;
            } else {
                try {
                    java.lang.reflect.Constructor constructor = clazz.getConstructor(Long.TYPE);
                    object = constructor.newInstance(date.getTime());
                }
                catch (RuntimeException runtimeException) {
                    throw runtimeException;
                }
                catch (Exception exception) {
                    throw new YAMLException("Cannot construct: '" + clazz + "'");
                }
            }
        } else if (clazz == Float.class || clazz == Double.class || clazz == Float.TYPE || clazz == Double.TYPE || clazz == BigDecimal.class) {
            if (clazz == BigDecimal.class) {
                object = new BigDecimal(scalarNode.getValue());
            } else {
                Construct construct = (Construct)this.this$0.yamlConstructors.get(Tag.FLOAT);
                object = construct.construct((Node)scalarNode);
                if (clazz == Float.class || clazz == Float.TYPE) {
                    object = Float.valueOf(((Double)object).floatValue());
                }
            }
        } else if (clazz == Byte.class || clazz == Short.class || clazz == Integer.class || clazz == Long.class || clazz == BigInteger.class || clazz == Byte.TYPE || clazz == Short.TYPE || clazz == Integer.TYPE || clazz == Long.TYPE) {
            Construct construct = (Construct)this.this$0.yamlConstructors.get(Tag.INT);
            object = construct.construct((Node)scalarNode);
            object = clazz == Byte.class || clazz == Byte.TYPE ? (Number)Integer.valueOf(object.toString()).byteValue() : (Number)(clazz == Short.class || clazz == Short.TYPE ? (Number)Integer.valueOf(object.toString()).shortValue() : (Number)(clazz == Integer.class || clazz == Integer.TYPE ? (Number)Integer.parseInt(object.toString()) : (Number)(clazz == Long.class || clazz == Long.TYPE ? Long.valueOf(object.toString()) : new BigInteger(object.toString()))));
        } else if (Enum.class.isAssignableFrom(clazz)) {
            String string = scalarNode.getValue();
            try {
                object = Enum.valueOf(clazz, string);
            }
            catch (Exception exception) {
                throw new YAMLException("Unable to find enum value '" + string + "' for enum class: " + clazz.getName());
            }
        } else if (Calendar.class.isAssignableFrom(clazz)) {
            SafeConstructor.ConstructYamlTimestamp constructYamlTimestamp = new SafeConstructor.ConstructYamlTimestamp();
            constructYamlTimestamp.construct((Node)scalarNode);
            object = constructYamlTimestamp.getCalendar();
        } else if (Number.class.isAssignableFrom(clazz)) {
            SafeConstructor$ConstructYamlFloat safeConstructor$ConstructYamlFloat = new SafeConstructor$ConstructYamlFloat(this.this$0);
            object = safeConstructor$ConstructYamlFloat.construct((Node)scalarNode);
        } else if (UUID.class == clazz) {
            object = UUID.fromString(scalarNode.getValue());
        } else if (this.this$0.yamlConstructors.containsKey(scalarNode.getTag())) {
            object = ((Construct)this.this$0.yamlConstructors.get(scalarNode.getTag())).construct((Node)scalarNode);
        } else {
            throw new YAMLException("Unsupported class: " + clazz);
        }
        return object;
    }
}

