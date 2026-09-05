/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.quiltmc.config.api.values.ValueList
 *  org.quiltmc.config.api.values.ValueMap
 */
package org.quiltmc.config.api;

import java.util.function.BiFunction;
import org.quiltmc.config.api.MarshallingUtils$ListCoercer;
import org.quiltmc.config.api.MarshallingUtils$MapCoercer;
import org.quiltmc.config.api.MarshallingUtils$ValueMapCreator;
import org.quiltmc.config.api.exceptions.ConfigParseException;
import org.quiltmc.config.api.values.ConfigSerializableObject;
import org.quiltmc.config.api.values.ValueList;
import org.quiltmc.config.api.values.ValueMap;

public final class MarshallingUtils {
    static /* synthetic */ Object access$200(Object object, Object object2, BiFunction biFunction, BiFunction biFunction2) {
        return MarshallingUtils.coerce(object, object2, biFunction, biFunction2);
    }

    private MarshallingUtils() {
    }

    private static Object coerce(Object object, Object object2, BiFunction objArray, BiFunction biFunction) {
        if (object2 instanceof Integer) {
            return ((Number)object).intValue();
        }
        if (object2 instanceof Long) {
            return ((Number)object).longValue();
        }
        if (object2 instanceof Float) {
            return Float.valueOf(((Number)object).floatValue());
        }
        if (object2 instanceof Double) {
            return ((Number)object).doubleValue();
        }
        if (object2 instanceof String) {
            return object;
        }
        if (object2 instanceof Boolean) {
            return object;
        }
        if (object2 instanceof ConfigSerializableObject) {
            ConfigSerializableObject configSerializableObject = (ConfigSerializableObject)object2;
            return configSerializableObject.convertFrom(MarshallingUtils.coerce(object, configSerializableObject.getRepresentation(), (BiFunction)objArray, biFunction));
        }
        if (object2 instanceof ValueMap) {
            return objArray.apply(object, (ValueMap)object2);
        }
        if (object2 instanceof ValueList) {
            return biFunction.apply(object, (ValueList)object2);
        }
        if (object2.getClass().isEnum()) {
            for (Object obj : object2.getClass().getEnumConstants()) {
                if (!((Enum)obj).name().equalsIgnoreCase((String)object)) continue;
                return obj;
            }
            throw new ConfigParseException("Unexpected value '" + object + "' for enum class '" + object2.getClass() + "'");
        }
        throw new ConfigParseException("Unexpected value type: " + object2.getClass());
    }

    public static Object coerce(Object object, Object object2, MarshallingUtils$ValueMapCreator marshallingUtils$ValueMapCreator) {
        MarshallingUtils$ListCoercer marshallingUtils$ListCoercer;
        MarshallingUtils$MapCoercer marshallingUtils$MapCoercer;
        Object object3 = object;
        Object object4 = object2;
        object = marshallingUtils$MapCoercer;
        marshallingUtils$MapCoercer = new MarshallingUtils$MapCoercer(marshallingUtils$ValueMapCreator, null);
        object2 = marshallingUtils$ListCoercer;
        marshallingUtils$ListCoercer = new MarshallingUtils$ListCoercer((BiFunction)object, null);
        return MarshallingUtils.coerce(object3, object4, (BiFunction)object, (BiFunction)object2);
    }
}

