package io.jfrflabs.bmizeUsers.dao;

import io.jfrflabs.bmizeUsers.model.Athlete;

import java.util.List;
import java.util.UUID;

public interface AthleteDao {

    int createAthlete(UUID athleteId, Athlete athlete);

    Athlete readAthleteById(UUID athleteId);

    List<Athlete> readAllAthletes();

    int updateAthlete(UUID athleteId, Athlete updatedAthlete);

    int deleteAthlete(UUID athleteId);

}
