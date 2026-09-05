/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00751
 *  minecraft.class04227
 *  minecraft.class05946
 */
package minecraft;

import java.nio.file.Path;
import minecraft.class00751;
import minecraft.class01997;
import minecraft.class02024;
import minecraft.class04227;
import minecraft.class05946;

public class class01996 {
    private final Path field_40597;

    public class01996(Path path) {
        this.field_40597 = path;
    }

    public Path method_45972(class02024 class020242) {
        return this.method_45971().resolve(class020242.field_39370);
    }

    public class01997 method_60917(class05946<? extends class00751<?>> class059462) {
        return this.method_45973(class02024.field_39367, class04227.L(class059462));
    }

    public class01997 method_60918(class05946<? extends class00751<?>> class059462) {
        return this.method_45973(class02024.field_39367, class04227.u(class059462));
    }

    public class01997 method_45973(class02024 class020242, String string) {
        return new class01997(this, class020242, string);
    }

    public Path method_45971() {
        return this.field_40597;
    }
}

