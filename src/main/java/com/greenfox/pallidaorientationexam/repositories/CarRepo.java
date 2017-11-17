package com.greenfox.pallidaorientationexam.repositories;

import com.greenfox.pallidaorientationexam.models.Car;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CarRepo extends CrudRepository<Car, Long> {

    @Query(value = "SELECT * FROM licence_plates WHERE plate LIKE %?1%", nativeQuery = true)
    List<Car> findAllByPlate(String search);

    @Query(value = "SELECT * FROM licence_plates WHERE plate LIKE 'RB%'", nativeQuery = true)
    List<Car> findAllPolice();

    @Query(value = "SELECT * FROM licence_plates WHERE plate LIKE 'DT%'", nativeQuery = true)
    List<Car> findAllDiplomat();

    List<Car> findAllByBrand(String brand);

    @Query(value="SELECT * FROM licence_plates LIMIT 10 OFFSET ?1", nativeQuery = true)
    List<Car> findAllByTen(long l);
}