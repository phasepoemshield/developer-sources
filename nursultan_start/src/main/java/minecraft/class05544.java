/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class01990
 *  minecraft.class03719
 *  minecraft.class03762
 *  minecraft.class04206
 *  minecraft.class04227
 *  minecraft.class05946
 *  minecraft.class06521
 *  minecraft.class06581
 *  minecraft.class06915
 *  minecraft.class07310
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class01894;
import minecraft.class01990;
import minecraft.class03719;
import minecraft.class03762;
import minecraft.class04206;
import minecraft.class04227;
import minecraft.class05946;
import minecraft.class06521;
import minecraft.class06581;
import minecraft.class06915;
import minecraft.class07310;
import org.jspecify.annotations.Nullable;

public interface class05544 {
    public static final class01894 N = class01894.y((String)"recipes/root");

    public static class01894 y(class07310 class073102) {
        return class04206.B.y((Object)class073102.B());
    }

    public class05544 y(String var1, class06915<?> var2);

    public class05544 y(@Nullable String var1);

    public void N(class03719 var1, class05946<class06521<?>> var2);

    public static class03762 N(class01990 class019902) {
        return switch (class019902) {
            case class01990.field_40634 -> class03762.field_40248;
            case class01990.field_40638, class01990.field_40639 -> class03762.field_40250;
            case class01990.field_40636 -> class03762.field_40249;
            default -> class03762.field_40251;
        };
    }

    default public void N(class03719 class037192) {
        this.N(class037192, class05946.N((class05946)class04227.yV, (class01894)class05544.y((class07310)this.N())));
    }

    default public void N(class03719 class037192, String string) {
        class01894 class018942 = class05544.y((class07310)this.N());
        class01894 class018943 = class01894.N((String)string);
        if (class018943.equals((Object)class018942)) {
            throw new IllegalStateException("Recipe " + string + " should remove its 'save' argument as it is equal to default one");
        }
        this.N(class037192, class05946.N((class05946)class04227.yV, (class01894)class018943));
    }

    public class06581 N();
}

