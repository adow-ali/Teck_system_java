package com.example.dependiceioc.entity;

public interface ItemRepo extends CrudRepository<Item, Integer> {
//  @Query("SELECT")
//  List<Item> findByItemId(int item_id);
}
