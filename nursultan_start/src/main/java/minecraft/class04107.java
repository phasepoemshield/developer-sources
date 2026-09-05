/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02692
 *  minecraft.class06581
 *  minecraft.class06918
 *  minecraft.class07310
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import minecraft.class02692;
import minecraft.class04206;
import minecraft.class06581;
import minecraft.class06918;
import minecraft.class07310;
import org.jspecify.annotations.Nullable;

public interface class04107 {
    public class02692 L();

    public static List<class04107> u() {
        return class04206.B.j().map(class04107::N).filter(Objects::nonNull).collect(Collectors.toList());
    }

    public static @Nullable class04107 N(class07310 class073102) {
        Object object;
        class06581 class065812 = class073102.B();
        if (class065812 instanceof class06918 && (class065812 = (object = (class06918)class065812).L()) instanceof class04107) {
            class04107 class041072 = (class04107)class065812;
            return class041072;
        }
        class06581 class065813 = class073102.B();
        if (class065813 instanceof class04107) {
            object = (class04107)class065813;
            return object;
        }
        return null;
    }
}

