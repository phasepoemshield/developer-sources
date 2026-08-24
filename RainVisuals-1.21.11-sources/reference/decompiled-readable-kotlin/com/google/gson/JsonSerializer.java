package com.google.gson;

import java.lang.reflect.Type;

// $VF: Compiled from JsonSerializer.java
public interface JsonSerializer<T> {
   JsonElement serialize(T var1, Type var2, JsonSerializationContext var3);
}
