/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.ByteTag
 *  com.viaversion.nbt.tag.IntTag
 *  com.viaversion.nbt.tag.ShortTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.nbt.tag.Tag
 */
package net.raphimc.viabedrock.api.util;

import com.viaversion.nbt.tag.ByteTag;
import com.viaversion.nbt.tag.IntTag;
import com.viaversion.nbt.tag.ShortTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.nbt.tag.Tag;

public class NbtUtil {
    public static Tag createTag(Object obj) {
        if (obj instanceof Byte) {
            return new ByteTag(((Byte)obj).byteValue());
        }
        if (obj instanceof Integer) {
            return new IntTag(((Integer)obj).intValue());
        }
        if (obj instanceof String) {
            return new StringTag((String)obj);
        }
        if (obj instanceof Short) {
            return new ShortTag(((Short)obj).shortValue());
        }
        throw new IllegalArgumentException("Unknown value type: " + String.valueOf(obj.getClass()));
    }
}

