package com.wedocode.jenkinsdevopsspring.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class JenkinsServiceTest {
    @Test
    void sayHello() {
        Assertions.assertEquals("Hello Rachid", "Hello Rachid M.Saadi");
    }
}