package com.example.demo.Driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Bauka on 01-Oct-19
 */
@RestController
public class DriverController {
    @Autowired
    DriverService driverService;

    @GetMapping("readDriver/{id}")
    public Driver readDriver(Long id) {
        return driverService.readDriver(id);
    }

    @PostMapping("createDriver")
    public String createDriver(Driver driver) {
        return driverService.createDriver(driver);
    }

    @DeleteMapping("deleteDriver")
    public String deleteDriver(Long id) {
        return driverService.deleteDriver(id);
    }

    @PostMapping("updateDriver")
    public String updateDriver(Driver driver){
        return driverService.updateDriver(driver);
    }
}
