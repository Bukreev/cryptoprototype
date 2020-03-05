package ru.bukreev.cryptoprototype.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.bukreev.cryptoprototype.model.entities.Pair;

import javax.persistence.Id;

@Repository
public interface PairRepository extends CrudRepository<Pair, Id> {
}
