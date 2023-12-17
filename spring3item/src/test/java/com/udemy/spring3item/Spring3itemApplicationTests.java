package com.udemy.spring3item;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.udemy.spring3item.controller.ItemController;
import com.udemy.spring3item.repo.ItemRepository;
import com.udemy.spring3item.service.ItemService;

@SpringBootTest
class Spring3itemApplicationTests {
	
	@Autowired
	private ItemController itemController;
	
	@Autowired
	private ItemService itemService;
	
	@Autowired
	private ItemRepository itemRepository;

	//アプリケーションがSpringコンテキストを正常にダウンロードできたかどうかを検証する
	@Test
	void contextLoads() {
		//AssertJを利用した検証を実装する
		//assertTahtの引数に検証の値を入れる
		//続けてメソッドにて期待値を指定、この場合はNullでないこと
		assertThat(itemController).isNotNull();
		assertThat(itemService).isNotNull();
		assertThat(itemRepository).isNotNull();
	}

}
