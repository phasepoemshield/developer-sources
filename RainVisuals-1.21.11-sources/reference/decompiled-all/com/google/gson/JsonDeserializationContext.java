package com.google.gson;

import java.lang.reflect.Type;

// $VF: Compiled from JsonDeserializationContext.java
public interface JsonDeserializationContext {
   <T> T deserialize(JsonElement var1, Type var2) throws JsonParseException;
}
