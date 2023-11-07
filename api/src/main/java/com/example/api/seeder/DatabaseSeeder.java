package com.example.api.seeder;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Component
@Transactional
@RequiredArgsConstructor
public class DatabaseSeeder implements CommandLineRunner {

    private static final String SEED_FLAG = "--seed";
    private final EngineSeeder engineSeeder;
    private final EquipmentOptionSeeder equipmentOptionSeeder;
    private final CarSeeder carSeeder;

    @Override
    public void run(String... args) {
        if (Arrays.asList(args).contains(SEED_FLAG)) {
            engineSeeder.seed(100);
            equipmentOptionSeeder.seed(200);
            carSeeder.seed(200);
        }
    }

}
