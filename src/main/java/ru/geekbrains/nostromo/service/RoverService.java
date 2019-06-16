package ru.geekbrains.nostromo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.geekbrains.nostromo.entity.Rover;
import ru.geekbrains.nostromo.entity.repository.RoverRepository;

import java.util.List;

@Service
@Slf4j
public class RoverService {

    private final RoverRepository roverRepository;

    @Autowired
    public RoverService(RoverRepository roverRepository) {
        this.roverRepository = roverRepository;
    }

    public List<Rover> getAllRovers () {
        log.info ("Get all rovers");
        return roverRepository.findAll();
    }
}
