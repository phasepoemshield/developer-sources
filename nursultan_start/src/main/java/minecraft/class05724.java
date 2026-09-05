/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01212
 *  minecraft.class01295
 *  minecraft.class02089
 *  minecraft.class02106
 *  minecraft.class02116
 *  minecraft.class03428
 *  minecraft.class03457
 *  minecraft.class04654
 *  minecraft.class06202
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00392;
import minecraft.class01212;
import minecraft.class01295;
import minecraft.class02089;
import minecraft.class02106;
import minecraft.class02116;
import minecraft.class03428;
import minecraft.class03457;
import minecraft.class04654;
import minecraft.class05699;
import minecraft.class06202;
import org.jspecify.annotations.Nullable;

public abstract class class05724<E extends class05699<E>>
extends class01212<E> {
    private static final class00392 field_33783 = class00392.L((String)"narration.selection.usage");

    public class05724(class06202 class062022, int n, int n2, int n3, int n4) {
        super(class062022, n, n2, n3, n4);
    }

    public @Nullable class02106 method_48205(class02089 class020892) {
        if (this.method_25340() == 0) {
            return null;
        }
        if (this.method_25370() && class020892 instanceof class02116) {
            class02116 class021162 = (class02116)class020892;
            class05699 class056992 = (class05699)this.method_48197(class021162.y());
            if (class056992 != null) {
                return class02106.N((class01295)this, (class02106)class02106.N((class04654)class056992));
            }
            this.method_25395(null);
            this.method_25313(null);
            return null;
        }
        if (!this.method_25370()) {
            class05699 class056993 = (class05699)this.method_25334();
            if (class056993 == null) {
                class056993 = (class05699)this.method_48197(class020892.N());
            }
            if (class056993 == null) {
                return null;
            }
            return class02106.N((class01295)this, (class02106)class02106.N((class04654)class056993));
        }
        return null;
    }

    public void method_47399(class03428 class034282) {
        class05699 class056992 = (class05699)this.method_37019();
        if (class056992 != null) {
            this.method_37017(class034282.N(), class056992);
            class056992.method_37020(class034282);
        } else {
            class05699 class056993 = (class05699)this.method_25334();
            if (class056993 != null) {
                this.method_37017(class034282.N(), class056993);
                class056993.method_37020(class034282);
            }
        }
        if (this.method_25370()) {
            class034282.N(class03457.field_33791, field_33783);
        }
    }
}

