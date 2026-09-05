/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  minecraft.class08394
 */
package minecraft;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import java.util.Locale;
import minecraft.class08394;

public final class class08743
extends Enum<class08743> {
    public static final /* enum */ class08743 field_60923 = new class08743(class08394.d, 0x400000, false);
    public static final /* enum */ class08743 field_60925 = new class08743(class08394.Y, 0x400000, false);
    public static final /* enum */ class08743 field_60926 = new class08743(class08394.Q, 786432, true);
    public static final /* enum */ class08743 field_60927 = new class08743(class08394.g, 1536, true);
    private final RenderPipeline field_60928;
    private final int field_60929;
    private final boolean field_60931;
    private final String field_60932;
    private static final /* synthetic */ class08743[] field_60933;

    public String L() {
        return this.field_60932;
    }

    private class08743(RenderPipeline renderPipeline, int n2, boolean bl) {
        this.field_60928 = renderPipeline;
        this.field_60929 = n2;
        this.field_60931 = bl;
        this.field_60932 = this.toString().toLowerCase(Locale.ROOT);
    }

    public static class08743[] values() {
        return (class08743[])field_60933.clone();
    }

    public static class08743 valueOf(String string) {
        return Enum.valueOf(class08743.class, string);
    }

    private static /* synthetic */ class08743[] i() {
        return new class08743[]{field_60923, field_60925, field_60926, field_60927};
    }

    public boolean u() {
        return this.field_60931;
    }

    public int y() {
        return this.field_60929;
    }

    public RenderPipeline N() {
        return this.field_60928;
    }

    static {
        field_60933 = class08743.i();
    }
}

