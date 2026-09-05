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
 *  minecraft.class00809
 *  minecraft.class04457
 *  minecraft.class06790
 *  minecraft.class06794
 *  minecraft.class07001
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
import minecraft.class00809;
import minecraft.class04457;
import minecraft.class06790;
import minecraft.class06794;
import minecraft.class07001;
import minecraft.class07701;
import org.jspecify.annotations.Nullable;

public record class00403(String y, @Nullable class06794 L) implements class04457
{
    public static final MapCodec<class00403> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.STRING.fieldOf("entity").forGetter(class00403::y)).apply(instance, class00403::new));

    public class00403(String string) {
        this(string, class00403.N(string));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof class00403)) return false;
        class00403 class004032 = (class00403)((Object)object);
        if (!this.y.equals(class004032.y)) return false;
        return true;
    }

    public String toString() {
        return "entity=" + this.y;
    }

    public int hashCode() {
        return this.y.hashCode();
    }

    public MapCodec<class00403> N() {
        return N;
    }

    private static @Nullable class06794 N(String string) {
        try {
            return new class06790(new StringReader(string), true).v();
        }
        catch (CommandSyntaxException commandSyntaxException) {
            return null;
        }
    }

    public Stream<class07001> N(class07701 class077012) throws CommandSyntaxException {
        if (this.L != null) {
            return this.L.y(class077012).stream().map(class00809::y);
        }
        return Stream.empty();
    }
}

