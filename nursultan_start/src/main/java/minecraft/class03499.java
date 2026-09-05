/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01622
 *  minecraft.class03652
 *  org.apache.commons.lang3.ArrayUtils
 */
package minecraft;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import minecraft.class01622;
import minecraft.class03652;
import org.apache.commons.lang3.ArrayUtils;

public final class class03499
extends Enum<class03499> {
    public static final /* enum */ class03499 field_44650 = new class03499("icons");
    public static final /* enum */ class03499 field_44651 = new class03499("icons", "snapshot");
    private final String[] field_44652;
    private static final /* synthetic */ class03499[] field_44653;

    private class03499(String ... stringArray) {
        this.field_44652 = stringArray;
    }

    public static class03499[] values() {
        return (class03499[])field_44653.clone();
    }

    public static class03499 valueOf(String string) {
        return Enum.valueOf(class03499.class, string);
    }

    public class03652<InputStream> y(class01622 class016222) throws IOException {
        return this.N(class016222, "minecraft.icns");
    }

    private static /* synthetic */ class03499[] N() {
        return new class03499[]{field_44650, field_44651};
    }

    public List<class03652<InputStream>> N(class01622 class016222) throws IOException {
        return List.of(this.N(class016222, "icon_16x16.png"), this.N(class016222, "icon_32x32.png"), this.N(class016222, "icon_48x48.png"), this.N(class016222, "icon_128x128.png"), this.N(class016222, "icon_256x256.png"));
    }

    private class03652<InputStream> N(class01622 class016222, String string) throws IOException {
        CharSequence[] charSequenceArray = (String[])ArrayUtils.add((Object[])this.field_44652, (Object)string);
        class03652 var4 = class016222.method_14410((String[])charSequenceArray);
        if (var4 == null) {
            throw new FileNotFoundException(String.join((CharSequence)"/", charSequenceArray));
        }
        return var4;
    }

    static {
        field_44653 = class03499.N();
    }
}

