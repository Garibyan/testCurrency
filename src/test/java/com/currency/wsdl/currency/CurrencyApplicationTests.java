package com.currency.wsdl.currency;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.Calendar;

@SpringBootTest
class CurrencyApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void currency(){
		GetConversionAmountResponse getConversionAmountResponse = new GetConversionAmountResponse();
		Calendar calendar = null;
		BigDecimal amount = new BigDecimal("1");
		GetConversionAmount getConversionAmount = new GetConversionAmount("USD",
				"GEL", calendar, amount);
		System.out.println(getConversionAmount.getTypeDesc());
		System.out.println(getConversionAmountResponse.getGetConversionAmountResult());
	}
}
