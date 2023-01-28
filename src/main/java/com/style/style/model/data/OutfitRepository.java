package com.style.style.model.data;

import com.style.style.model.Outfit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OutfitRepository extends CrudRepository<Outfit, Integer> {
}
