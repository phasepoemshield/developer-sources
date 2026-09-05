/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  java.lang.MatchException
 *  minecraft.class00392
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import minecraft.class00392;

public final class class04575
extends Enum<class04575> {
    public static final /* enum */ class04575 field_3768 = new class04575("enabled");
    public static final /* enum */ class04575 field_3764 = new class04575("disabled");
    public static final /* enum */ class04575 field_3767 = new class04575("prompt");
    public static final MapCodec<class04575> field_56800;
    private final class00392 field_3765;
    private static final /* synthetic */ class04575[] field_3766;

    private class04575(String string2) {
        this.field_3765 = class00392.L((String)("manageServer.resourcePack." + string2));
    }

    public static class04575[] values() {
        return (class04575[])field_3766.clone();
    }

    public static class04575 valueOf(String string) {
        return Enum.valueOf(class04575.class, string);
    }

    private static /* synthetic */ class04575[] y() {
        return new class04575[]{field_3768, field_3764, field_3767};
    }

    public class00392 N() {
        return this.field_3765;
    }

    static {
        field_3766 = class04575.y();
        field_56800 = Codec.BOOL.optionalFieldOf("acceptTextures").xmap(optional -> optional.map(bl -> bl != false ? field_3768 : field_3764).orElse(field_3767), class045752 -> switch (class045752.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> Optional.of(true);
            case 1 -> Optional.of(false);
            case 2 -> Optional.empty();
        });
    }
}

