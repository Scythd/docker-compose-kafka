package com.moklyak.Game.server.DAOs;

import lombok.Data;

import java.math.BigInteger;

@Data
public class KafkaDao2 {
    BigInteger id;
    String method;
    String token;
    String arg;
}
