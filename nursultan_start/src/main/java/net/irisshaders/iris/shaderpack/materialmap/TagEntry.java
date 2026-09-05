/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.shaderpack.materialmap.Entry
 *  net.irisshaders.iris.shaderpack.materialmap.NamespacedId
 */
package net.irisshaders.iris.shaderpack.materialmap;

import java.util.Map;
import net.irisshaders.iris.shaderpack.materialmap.Entry;
import net.irisshaders.iris.shaderpack.materialmap.NamespacedId;

public record TagEntry(NamespacedId id, Map<String, String> propertyPredicates) implements Entry
{
}

