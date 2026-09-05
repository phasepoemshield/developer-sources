/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.quiltmc.config.api.annotations.DisplayNameConvention
 *  org.quiltmc.config.api.annotations.SerializedNameConvention
 *  org.quiltmc.config.api.metadata.NamingScheme
 */
package org.quiltmc.config.impl.util;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import org.quiltmc.config.api.annotations.DisplayNameConvention;
import org.quiltmc.config.api.annotations.SerializedNameConvention;
import org.quiltmc.config.api.metadata.NamingScheme;

public final class NamingSchemeHelper {
    private final ClassLoader classLoader;
    private final Map customSchemeCache;

    public NamingSchemeHelper(ClassLoader classLoader) {
        HashMap hashMap;
        ((NamingSchemeHelper)((Object)hashMap2)).classLoader = classLoader;
        HashMap hashMap2 = hashMap;
        hashMap = new HashMap();
        v1.customSchemeCache = hashMap2;
    }

    public NamingSchemeHelper() {
        this(NamingSchemeHelper.class.getClassLoader());
    }

    public NamingScheme getNamingScheme(SerializedNameConvention serializedNameConvention, BiFunction biFunction) {
        if (serializedNameConvention.custom().isEmpty()) {
            return serializedNameConvention.value();
        }
        return this.createCustomNamingScheme(serializedNameConvention.custom(), biFunction);
    }

    public NamingScheme getNamingScheme(DisplayNameConvention displayNameConvention, BiFunction biFunction) {
        if (displayNameConvention.custom().isEmpty()) {
            return displayNameConvention.value();
        }
        return this.createCustomNamingScheme(displayNameConvention.custom(), biFunction);
    }

    private NamingScheme createCustomNamingScheme(String string2, BiFunction biFunction) {
        return this.customSchemeCache.computeIfAbsent(string2, string -> {
            ClassNotFoundException classNotFoundException2;
            block6: {
                void var0_6;
                block5: {
                    boolean bl = true;
                    try {
                        return (NamingScheme)Class.forName(string, bl, this.classLoader).newInstance();
                    }
                    catch (ClassCastException classCastException) {
                    }
                    catch (IllegalAccessException illegalAccessException) {
                        break block5;
                    }
                    catch (InstantiationException instantiationException) {
                        break block5;
                    }
                    catch (ClassNotFoundException classNotFoundException2) {
                        break block6;
                    }
                    throw (RuntimeException)biFunction.apply("Class '" + string + "' does not implement '" + NamingScheme.class.getName() + "'", classCastException);
                }
                throw (RuntimeException)biFunction.apply("Couldn't create instance of custom name scheme class '" + string + "'", var0_6);
            }
            throw (RuntimeException)biFunction.apply("Couldn't find custom naming scheme class '" + string + "'", classNotFoundException2);
        });
    }
}

