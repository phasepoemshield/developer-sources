/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00874
 *  minecraft.class00894
 *  minecraft.class01929
 *  minecraft.class04457
 *  minecraft.class04782
 *  minecraft.class07001
 *  minecraft.class07209
 *  minecraft.class07701
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;
import minecraft.class00394;
import minecraft.class00874;
import minecraft.class00894;
import minecraft.class01929;
import minecraft.class04457;
import minecraft.class04782;
import minecraft.class07001;
import minecraft.class07209;
import minecraft.class07701;
import org.jspecify.annotations.Nullable;

public record class00397(String y, @Nullable class00874 L) implements class04457
{
    public static final MapCodec<class00397> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.STRING.fieldOf("block").forGetter(class00397::y)).apply(instance, class00397::new));

    public class00397(String string) {
        this(string, class00397.N(string));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof class00397)) return false;
        class00397 class003972 = (class00397)((Object)object);
        if (!this.y.equals(class003972.y)) return false;
        return true;
    }

    public String toString() {
        return "block=" + this.y;
    }

    public int hashCode() {
        return this.y.hashCode();
    }

    public MapCodec<class00397> N() {
        return N;
    }

    private static @Nullable class00874 N(String string) {
        try {
            return class00894.N().parse(new StringReader(string));
        }
        catch (CommandSyntaxException commandSyntaxException) {
            return null;
        }
    }

    public Stream<class07001> N(class07701 class077012) {
        class00394 class003942;
        class07209 class072092;
        class04782 class047822;
        if (this.L != null && (class047822 = class077012.R()).method_8477(class072092 = this.L.L(class077012)) && (class003942 = class047822.method_8321(class072092)) != null) {
            return Stream.of(class003942.y_2((class01929)class077012.t()));
        }
        return Stream.empty();
    }
}

