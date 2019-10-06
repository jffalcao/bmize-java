package io.jfrflabs.bmizeUsers.dao;

import io.jfrflabs.bmizeUsers.model.Athlete;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository("FakeDao")
public class FakeAthleteDaoImpl implements AthleteDao {

    private final Map<UUID, Athlete> database;

    public FakeAthleteDaoImpl() {
        database = new HashMap<>();
    }

    @Override
    public int createAthlete(UUID athleteId, Athlete athlete) {
        database.put(athleteId, athlete);
        return 1;
    }

    @Override
    public Athlete readAthleteById(UUID athleteId) {
        return database.get(athleteId);
    }

    @Override
    public List<Athlete> readAllAthletes() {
        return new ArrayList<>(database.values());
    }

    @Override
    public int updateAthlete(UUID athleteId, Athlete UpdatedAthlete) {
        database.put(athleteId, UpdatedAthlete);
        return 1;
    }

    @Override
    public int deleteAthlete(UUID athleteId) {
        database.remove(athleteId);
        return 1;
    }
}
