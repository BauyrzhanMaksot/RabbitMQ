package com.example.demo.Driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Bauka on 01-Oct-19
 */
@Service
public class DriverService {
    @Autowired
    DriverRepository driverRepository;

    public Driver readDriver(Long id) {
        return driverRepository.getOne(id);
    }

    public String createDriver(Driver driver) {
        driverRepository.save(driver);
        return "success";
    }

    public String updateDriver(Driver driver) {
        driverRepository.save(driver);
        return "success";
    }

    public String deleteDriver(Long id) {
        driverRepository.deleteById(id);
        return "success";
    }
}
