package com.google.gson;

import com.google.gson.reflect.TypeToken;

// $VF: Compiled from TypeAdapterFactory.java
public interface TypeAdapterFactory {
   <T> TypeAdapter<T> create(Gson var1, TypeToken<T> var2);
}
