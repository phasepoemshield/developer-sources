/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class02267
 *  minecraft.class02298
 *  minecraft.class02968
 *  minecraft.class03652
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;
import java.util.Set;
import minecraft.class01593;
import minecraft.class01603;
import minecraft.class01894;
import minecraft.class02267;
import minecraft.class02298;
import minecraft.class02968;
import minecraft.class03652;
import org.jspecify.annotations.Nullable;

public interface class01622
extends AutoCloseable {
    public static final String y = ".mcmeta";
    public static final String L = "pack.mcmeta";

    @Override
    public void close();

    default public Optional<class02298> N() {
        return this.method_56926().u();
    }

    default public String method_14409() {
        return this.method_56926().N();
    }

    public @Nullable class03652<InputStream> method_14410(String ... var1);

    public class02267 method_56926();

    public Set<String> method_14406(class01603 var1);

    public @Nullable class03652<InputStream> method_14405(class01603 var1, class01894 var2);

    public void method_14408(class01603 var1, String var2, String var3, class01593 var4);

    public <T> @Nullable T method_14407(class02968<T> var1) throws IOException;
}

