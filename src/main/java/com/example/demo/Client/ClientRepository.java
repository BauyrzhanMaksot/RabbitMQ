package com.example.demo.Client;

import com.example.demo.Client.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Bauka on 01-Oct-19
 */
@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
