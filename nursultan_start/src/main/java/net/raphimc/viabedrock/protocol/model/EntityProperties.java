/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2IntMap
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectMap
 */
package net.raphimc.viabedrock.protocol.model;

import com.viaversion.viaversion.libs.fastutil.ints.Int2IntMap;
import com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectMap;

public record EntityProperties(Int2IntMap intProperties, Int2ObjectMap<Float> floatProperties) {
}

