/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class04453
 *  minecraft.class05096
 *  minecraft.class06202
 *  minecraft.class07482
 *  minecraft.class08044
 */
package minecraft;

import minecraft.class00392;
import minecraft.class04453;
import minecraft.class05096;
import minecraft.class05851;
import minecraft.class05868;
import minecraft.class06202;
import minecraft.class07482;
import minecraft.class08044;

public interface class05877<T extends class07482, U extends class05096> {
    public U create(T var1, class08044 var2, class00392 var3);

    default public void N(class00392 class003922, class05851<T> class058512, class06202 class062022, int n) {
        U u = this.create(class058512.method_17434(n, ((class04453)class062022.T_4).method_31548()), ((class04453)class062022.T_4).method_31548(), class003922);
        ((class04453)class062022.T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3 = ((class05868)u).E();
        class062022.N(u);
    }
}

