package ru.metaculture.protection;

public record O000000O0OOOOO(String text, boolean training, boolean loadingModel, long queuedRecords, long writtenRecords, long droppedRecords, long updatedAtMs) {
   public static O000000O0OOOOO idle() {
      return new O000000O0OOOOO("AI idle", false, false, 0L, 0L, 0L, System.currentTimeMillis());
   }
}
