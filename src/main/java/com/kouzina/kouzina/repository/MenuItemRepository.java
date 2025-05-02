package com.kouzina.kouzina.repository;


import com.kouzina.kouzina.model.MenuItem;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {
    // Custom query methods can be defined here if needed

}
