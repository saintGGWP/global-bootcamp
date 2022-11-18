package com.personal.globalbootcamp.resource;

import com.personal.globalbootcamp.model.Car;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@org.springframework.web.bind.annotation.RestController
// TODO refactor to use OpenAPI 3.0.
public class RestController {

  @PostMapping("/cars")
  public void addCar(Car car) {

  }

  @GetMapping("/cars")
  public List<Car> getCars() {
    return new ArrayList<>();
  }

}
