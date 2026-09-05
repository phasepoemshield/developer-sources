/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00100
 *  minecraft.class00134
 *  minecraft.class00392
 *  minecraft.class00647
 *  minecraft.class02102
 *  minecraft.class04141
 *  minecraft.class05361
 *  minecraft.class05362
 *  minecraft.class05373
 *  minecraft.class09009
 *  minecraft.class09015
 *  minecraft.class09027
 */
package minecraft;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;
import minecraft.class00100;
import minecraft.class00134;
import minecraft.class00392;
import minecraft.class00647;
import minecraft.class02102;
import minecraft.class04141;
import minecraft.class05361;
import minecraft.class05362;
import minecraft.class05373;
import minecraft.class08734;
import minecraft.class08737;
import minecraft.class08752;
import minecraft.class09009;
import minecraft.class09015;
import minecraft.class09027;

public class class08770 {
    public static final Supplier<Optional<class00647>> N = Optional::empty;
    private final class00134<?> y;
    private final Map<String, class08737> L = new HashMap<String, class08737>();

    public class08770(class00134<?> class001342) {
        this.y = class001342;
    }

    public class05373 N(class08734 class087342) {
        Supplier<Optional<class00647>> var2 = this.N(class087342.y());
        return class08770.N(class087342.N(), class053622 -> this.y.N((Optional)var2.get()));
    }

    public void N(class09009 class090092, Consumer<class02102> consumer) {
        String string = class090092.N();
        class00100.N((class09015)class090092.y(), this.y, (class021022, class087372) -> {
            this.L.put(string, class087372);
            consumer.accept(class021022);
        });
    }

    public Supplier<Optional<class00647>> N(Optional<class08752> optional) {
        if (optional.isPresent()) {
            class08752 class087522 = optional.get();
            return () -> class087522.N(this.L);
        }
        return N;
    }

    private static class05373 N(class09027 class090272, class05361 class053612) {
        class05373 class053732 = class05362.method_46430((class00392)class090272.N(), (class05361)class053612);
        class053732.N(class090272.L());
        if (class090272.y().isPresent()) {
            class053732 = class053732.N(class04141.N((class00392)((class00392)class090272.y().get())));
        }
        return class053732;
    }
}

