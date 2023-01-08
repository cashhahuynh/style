package com.style.style.model.data;

import com.style.style.model.StyleCategory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.swing.text.Style;

@Repository
public interface StyleCategoryRepository extends CrudRepository<StyleCategory, Integer> {
}
