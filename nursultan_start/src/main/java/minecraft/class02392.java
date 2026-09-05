/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMultimap
 *  com.google.common.collect.ImmutableMultimap$Builder
 *  com.google.common.collect.Multimap
 *  com.mojang.authlib.properties.Property
 *  com.mojang.authlib.properties.PropertyMap
 *  io.netty.buffer.ByteBuf
 *  minecraft.class00667
 *  minecraft.class01663
 */
package minecraft;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.mojang.authlib.properties.Property;
import com.mojang.authlib.properties.PropertyMap;
import io.netty.buffer.ByteBuf;
import minecraft.class00667;
import minecraft.class01663;
import minecraft.class02362;
import minecraft.class02389;

class class02392
implements class02362<ByteBuf, PropertyMap> {
    class02392() {
    }

    public void encode(ByteBuf byteBuf2, PropertyMap propertyMap) {
        class02389.N(byteBuf2, propertyMap.size(), 16);
        for (Property property : propertyMap.values()) {
            class01663.N((ByteBuf)byteBuf2, (CharSequence)property.name(), (int)64);
            class01663.N((ByteBuf)byteBuf2, (CharSequence)property.value(), (int)Short.MAX_VALUE);
            class00667.N((ByteBuf)byteBuf2, (Object)property.signature(), (byteBuf, string) -> class01663.N((ByteBuf)byteBuf, (CharSequence)string, (int)1024));
        }
    }

    public PropertyMap decode(ByteBuf byteBuf2) {
        int n = class02389.N(byteBuf2, 16);
        ImmutableMultimap.Builder builder = ImmutableMultimap.builder();
        for (int i = 0; i < n; ++i) {
            String string = class01663.N((ByteBuf)byteBuf2, (int)64);
            String string2 = class01663.N((ByteBuf)byteBuf2, (int)Short.MAX_VALUE);
            String string3 = (String)class00667.N((ByteBuf)byteBuf2, byteBuf -> class01663.N((ByteBuf)byteBuf, (int)1024));
            Property property = new Property(string, string2, string3);
            builder.put((Object)property.name(), (Object)property);
        }
        return new PropertyMap((Multimap)builder.build());
    }
}

