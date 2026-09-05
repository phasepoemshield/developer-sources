/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.mojang.brigadier.arguments.ArgumentType
 *  minecraft.class00667
 */
package minecraft;

import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;
import minecraft.class00667;
import minecraft.class06763;

public interface class06799<A extends ArgumentType<?>, T extends class06763<A>> {
    public T y(class00667 var1);

    public T N(A var1);

    public void N(T var1, JsonObject var2);

    public void N(T var1, class00667 var2);
}

