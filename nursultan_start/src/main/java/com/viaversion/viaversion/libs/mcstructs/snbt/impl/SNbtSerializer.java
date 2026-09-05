/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.libs.mcstructs.snbt.exceptions.SNbtSerializeException
 */
package com.viaversion.viaversion.libs.mcstructs.snbt.impl;

import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.libs.mcstructs.snbt.exceptions.SNbtSerializeException;

public interface SNbtSerializer {
    public String serialize(Tag var1) throws SNbtSerializeException;
}

