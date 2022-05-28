package com.moklyak.Game.server.DAOs;

import com.moklyak.Game.server.models.BullCowGameDto;
import lombok.Data;

@Data
public class KafkaDao{
    long id;
    int responseCode;
    BullCowGameDto object;
}
