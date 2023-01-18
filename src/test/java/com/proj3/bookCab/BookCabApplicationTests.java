package com.proj3.bookCab;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import static org.assertj.core.api.Assertions.assertThat;

import com.proj3.bookCab.Controller.*;

@SpringBootTest
class BookCabApplicationTests {
	
	@Autowired
	private BookingsController controller;

	@Test
	public void contextLoads() throws Exception {
		assertThat(controller).isNotNull();
	}

}
