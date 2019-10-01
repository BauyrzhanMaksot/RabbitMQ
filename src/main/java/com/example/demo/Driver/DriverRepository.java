package com.example.demo.Driver;

import com.example.demo.Driver.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Bauka on 01-Oct-19
 */
@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {
}
