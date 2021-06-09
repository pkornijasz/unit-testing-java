package pl.devfoundry.testing;

import org.junit.jupiter.api.Test;

//import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.Matchers.*;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;


class AccountTest {
    @Test
    void newlyCreatedAccountShouldNotBeActive() {
        // given
        Account newAccount = new Account();
        // then
        assertFalse(newAccount.isActive(), "Check if new accont is not active");
//        assertThat(newAccount.isActive(), equalTo(false));
//        assertThat(newAccount.isActive(), is(false));
        assertThat(newAccount.isActive()).isFalse();
    }

    @Test
    void activatedAccountShouldHaveActiveFlagSet() {
        // given
        Account newAccount = new Account();
        assertFalse(newAccount.isActive());
        // when
        newAccount.activate();
        // then
        assertTrue(newAccount.isActive());
//        assertThat(newAccount.isActive(), equalTo(true));
//        assertThat(newAccount.isActive(), is(true));
        assertThat(newAccount.isActive()).isTrue();
    }

    @Test
    void newlyCreatedAccountShouldNotHaveDefaultDeliveryAddressSet() {
        // given
        Account newAccount = new Account();
        // when
        Address address = newAccount.getDefaultDeliveryAddress();
        // then
        assertNull(address);
//        assertThat(address, nullValue());
        assertThat(address).isNull();
    }

    @Test
    void defaultDeliveryAddressShouldNotBeNullAfterBeingSet() {
        // given
        Address address = new Address("Krakowska", "67C");
        Account account = new Account();
        account.setDefaultDeliveryAddress(address);
        // when
        Address defaultAddress = account.getDefaultDeliveryAddress();
        // then
        assertNotNull(defaultAddress);
//        assertThat(defaultAddress, notNullValue());
//        assertThat(defaultAddress, is(notNullValue()));
        assertThat(defaultAddress).isNotNull();
    }
}
