package com.stackroute.keepnote.test.repository;

import java.util.Date;
import java.util.NoSuchElementException;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.stackroute.keepnote.model.User;
import com.stackroute.keepnote.repository.UserRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;
    private User user;


    @Before
    public void setUp() throws Exception {
        user = new User();
        user.setUserId("Jhon123");
        user.setUserName("Jhon Simon");
        user.setUserMobile("9898989898");
        user.setUserPassword("123456");
        user.setUserAddedDate(new Date());
    }

    @After
    public void tearDown() throws Exception {

        userRepository.deleteAll();

    }

    @Test
    public void registerUserTest() {

        userRepository.save(user);
        User fetcheduser = userRepository.findById("Jhon123").get();
        Assert.assertEquals(user.getUserId(), fetcheduser.getUserId());

    }

    @Test(expected = NoSuchElementException.class)
    public void deleteUserTest() {
        userRepository.save(user);
        User fetcheduser = userRepository.findById("Jhon123").get();
        Assert.assertEquals("Jhon123", fetcheduser.getUserId());
        userRepository.delete(fetcheduser);
        fetcheduser = userRepository.findById("Jhon123").get();

    }

    @Test
    public void updateUserTest() {
        userRepository.save(user);
        User fetcheduser = userRepository.findById("Jhon123").get();
        fetcheduser.setUserPassword("987654321");
        userRepository.save(fetcheduser);
        fetcheduser = userRepository.findById("Jhon123").get();
        Assert.assertEquals("987654321", fetcheduser.getUserPassword());
    }

    @Test
    public void getUserByIdTest() {
        userRepository.save(user);
        User fetcheduser = userRepository.findById("Jhon123").get();
        Assert.assertEquals(user.getUserId(),fetcheduser.getUserId());

    }
}
