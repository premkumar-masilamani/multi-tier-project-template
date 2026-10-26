package com.sampleapp.api;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

class SampleControllerTest {

  @Test
  void getSampleReturnsOk() {
    SampleController controller = new SampleController();
    ResponseEntity<Void> response = controller.getSample();

    assertNotNull(response);
    assertEquals(HttpStatus.OK, response.getStatusCode());
  }
}
