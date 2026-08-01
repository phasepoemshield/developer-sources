package ru.destra.social;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public interface Account {
   void setFavorite(boolean var1);
   String getName();
   boolean isFavorite();
   void setCreationTime(LocalDateTime var1);
   LocalDateTime getCreationTime();
   UUID getUuid();

   default String getFormattedCreationTime() {
      if (this.getCreationTime() == null) {
         return "";
      }
      DateTimeFormatter var1 = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
      return this.getCreationTime().format(var1);
   }
}
