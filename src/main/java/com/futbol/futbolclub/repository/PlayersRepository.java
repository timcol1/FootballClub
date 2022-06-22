package com.futbol.futbolclub.repository;

import com.futbol.futbolclub.models.Players;
import org.springframework.data.repository.CrudRepository;

public interface PlayersRepository extends CrudRepository<Players, Long> {

}
