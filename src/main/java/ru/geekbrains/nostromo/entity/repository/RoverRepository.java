package ru.geekbrains.nostromo.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.geekbrains.nostromo.entity.Rover;

public interface RoverRepository extends JpaRepository <Rover, Long> {

}
