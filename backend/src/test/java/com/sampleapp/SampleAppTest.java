package com.sampleapp;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

class SampleAppTest {

  @Test
  void mainStartsSpringApplication() {
    try (MockedStatic<SpringApplication> springAppMock = mockStatic(SpringApplication.class)) {
      ConfigurableApplicationContext mockContext = mock(ConfigurableApplicationContext.class);

      springAppMock
          .when(() -> SpringApplication.run(eq(SampleApp.class), any(String[].class)))
          .thenReturn(mockContext);

      SampleApp.main(new String[] {"test"});

      springAppMock.verify(
          () -> SpringApplication.run(eq(SampleApp.class), any(String[].class)));
    }

    SampleApp app = new SampleApp();
    assertNotNull(app);
  }
}
