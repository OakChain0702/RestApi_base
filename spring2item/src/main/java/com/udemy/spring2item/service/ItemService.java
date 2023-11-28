package com.udemy.spring2item.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.udemy.spring2item.model.Item;

@Service
public class ItemService {
	
	private List<Item> allItems = new ArrayList<> (Arrays.asList(
			new Item("10001", "ネックレス", "ジュエリー"),
			new Item("10002", "パーカー", "ファッション"),
			new Item("10003", "フィエイスクリーム", "ビューティー"),
			new Item("10004", "サプリ", "ヘルス"),
			new Item("10005", "ブルーベリー", "フード")));
	
	public List<Item> getAllItems(){
		return allItems;
	}
	
	public Item getItem(String itemId) {
		for(int i = 0; i < allItems.size(); i++) {
			if(allItems.get(i).getItemId().equals(itemId)) {
				return (Item)allItems.get(i);
			}
		}
		return null;
	}
	
	public void addItem(Item item) {
		allItems.add(item);
	}

}
