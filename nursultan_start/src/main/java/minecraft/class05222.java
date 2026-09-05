/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  minecraft.class00392
 *  minecraft.class01028
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class03434
 *  minecraft.class04654
 *  minecraft.class05936
 *  minecraft.class06478
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Lists;
import java.util.List;
import minecraft.class00392;
import minecraft.class01028;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class03434;
import minecraft.class04654;
import minecraft.class05191;
import minecraft.class05211;
import minecraft.class05936;
import minecraft.class06478;
import org.jspecify.annotations.Nullable;

public abstract class class05222
extends class05211 {
    public List<class01028> field_25629;
    protected final List<class06478> field_25630;
    final /* synthetic */ class05191 field_25631;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public class05222(@Nullable class05191 class051912, List list, class00392 class003922) {
        this.field_25631 = class051912;
        super(list);
        this.field_25630 = Lists.newArrayList();
        this.field_25629 = ((class01590)class05191.y((class05191)class051912).i_3).L((class05936)class003922, 175);
    }

    public List<? extends class04654> method_25396() {
        return this.field_25630;
    }

    protected void method_29989(class01054 class010542, int n, int n2) {
        if (this.field_25629.size() == 1) {
            class010542.y((class01590)class05191.L((class05191)this.field_25631).i_3, this.field_25629.get(0), n2, n + 5, -1);
        } else if (this.field_25629.size() >= 2) {
            class010542.y((class01590)class05191.u((class05191)this.field_25631).i_3, this.field_25629.get(0), n2, n, -1);
            class010542.y((class01590)class05191.i((class05191)this.field_25631).i_3, this.field_25629.get(1), n2, n + 10, -1);
        }
    }

    public List<? extends class03434> method_37025() {
        return this.field_25630;
    }
}

