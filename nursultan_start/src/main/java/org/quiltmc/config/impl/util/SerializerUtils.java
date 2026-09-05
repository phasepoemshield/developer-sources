/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.quiltmc.config.api.Config
 *  org.quiltmc.config.api.annotations.Alias
 *  org.quiltmc.config.api.annotations.SerializedName
 *  org.quiltmc.config.api.annotations.SerializedNameConvention
 *  org.quiltmc.config.api.metadata.Aliases
 *  org.quiltmc.config.api.metadata.MetadataType
 *  org.quiltmc.config.api.metadata.NamingScheme
 *  org.quiltmc.config.api.metadata.SerialName
 *  org.quiltmc.config.api.values.CompoundConfigValue
 */
package org.quiltmc.config.impl.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.quiltmc.config.api.Config;
import org.quiltmc.config.api.annotations.Alias;
import org.quiltmc.config.api.annotations.SerializedName;
import org.quiltmc.config.api.annotations.SerializedNameConvention;
import org.quiltmc.config.api.metadata.Aliases;
import org.quiltmc.config.api.metadata.MetadataType;
import org.quiltmc.config.api.metadata.NamingScheme;
import org.quiltmc.config.api.metadata.SerialName;
import org.quiltmc.config.api.values.CompoundConfigValue;
import org.quiltmc.config.api.values.ValueKey;
import org.quiltmc.config.api.values.ValueTreeNode;
import org.quiltmc.config.impl.values.ValueKeyImpl;

public class SerializerUtils {
    public static Optional createEnumOptionsComment(Object object) {
        if (object.getClass().isEnum()) {
            StringBuilder stringBuilder;
            Object object2 = object;
            object = stringBuilder;
            stringBuilder = new StringBuilder("options: ");
            ?[] objArray = object2.getClass().getEnumConstants();
            int n = objArray.length;
            for (int i = 0; i < n; ++i) {
                ((StringBuilder)object).append(objArray[i]);
                if (i >= n - 1) continue;
                ((StringBuilder)object).append(", ");
            }
            return Optional.of(((StringBuilder)object).toString());
        }
        return Optional.empty();
    }

    public static Optional getDefaultValueString(Object object) {
        block4: {
            try {
                if (object.getClass().getMethod("toString", null).getDeclaringClass() == Object.class) break block4;
            }
            catch (NoSuchMethodException noSuchMethodException) {}
            if (object instanceof CompoundConfigValue) break block4;
            return Optional.of(object.toString());
        }
        return Optional.empty();
    }

    public static ValueKey getSerializedKey(Config config, ValueTreeNode valueTreeNode) {
        ArrayList<String> arrayList;
        ArrayList<String> arrayList2;
        ArrayList<String> arrayList3 = arrayList2;
        arrayList2 = new ArrayList<String>();
        ValueKey valueKey = valueTreeNode.key();
        ArrayList<String> arrayList4 = arrayList;
        arrayList = new ArrayList<String>();
        for (int i = 0; i < valueTreeNode.key().length(); ++i) {
            ArrayList<String> arrayList5 = arrayList4;
            arrayList5.add(valueKey.getKeyComponent(i));
            arrayList3.add(SerializerUtils.getSerializedName(config.getNode(arrayList5)));
        }
        return new ValueKeyImpl(arrayList3.toArray(new String[0]));
    }

    public static String getSerializedName(ValueTreeNode valueTreeNode) {
        MetadataType metadataType = SerializedName.TYPE;
        if (valueTreeNode.hasMetadata(metadataType)) {
            return ((SerialName)valueTreeNode.metadata(metadataType)).getName();
        }
        metadataType = SerializedNameConvention.TYPE;
        if (valueTreeNode.hasMetadata(metadataType)) {
            return ((NamingScheme)valueTreeNode.metadata(metadataType)).coerce(valueTreeNode.key().getLastComponent());
        }
        return valueTreeNode.key().getLastComponent();
    }

    public static List getPossibleKeys(Config object, ValueTreeNode valueTreeNode) {
        ArrayList<ValueKey> arrayList;
        ArrayList<ValueKey> arrayList2 = arrayList;
        arrayList2();
        arrayList.add(SerializerUtils.getSerializedKey((Config)object, valueTreeNode));
        object = Alias.TYPE;
        if (valueTreeNode.hasMetadata((MetadataType)object)) {
            for (String string : (Aliases)valueTreeNode.metadata((MetadataType)object)) {
                ArrayList<String> arrayList3;
                ArrayList<String> arrayList4 = arrayList3;
                arrayList3 = new ArrayList<String>();
                for (int i = 0; i < valueTreeNode.key().length(); ++i) {
                    if (i != valueTreeNode.key().length() - 1) {
                        arrayList4.add(valueTreeNode.key().getKeyComponent(i));
                        continue;
                    }
                    arrayList4.add(string);
                }
                arrayList2.add(new ValueKeyImpl(arrayList4.toArray(new String[0])));
            }
        }
        return arrayList2;
    }
}

