package tddapp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
@RunWith(MockitoJUnitRunner.class)
public class TestAccount1 {

	@InjectMocks
	AddAccountService accountservice = new AddAccountService();
	@Mock
	IService service;
	@Test
	public void testAccount() {
//		when(service.createAccount(new Account())).thenReturn("Success");
//		accountservice.createNewAccount(new Account());
	}
}
