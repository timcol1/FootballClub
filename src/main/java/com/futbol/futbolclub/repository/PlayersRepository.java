package com.futbol.futbolclub.repository;

import com.futbol.futbolclub.models.Player;
import org.springframework.data.repository.CrudRepository;

public interface PlayersRepository extends CrudRepository<Player, Long> {

}
