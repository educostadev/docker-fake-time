package com.example.demo;


import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

  @GetMapping
  public Data getTime() {
    return new Data(LocalDateTime.now(), ZonedDateTime.now(),1);
  }

  static class Data {

    LocalDateTime LocalDateTime;

    ZonedDateTime zonedDateTime;


    int version;

    public Data(LocalDateTime localDateTime, ZonedDateTime zonedDateTime, int version) {
      this.LocalDateTime = localDateTime;
      this.zonedDateTime = zonedDateTime;
      this.version = version;
    }

    public java.time.LocalDateTime getLocalDateTime() {
      return LocalDateTime;
    }

    public ZonedDateTime getZonedDateTime() {
      return zonedDateTime;
    }


    public int getVersion() {
      return version;
    }
  }

}
