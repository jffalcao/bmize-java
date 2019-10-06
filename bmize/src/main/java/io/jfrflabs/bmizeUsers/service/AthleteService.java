package io.jfrflabs.bmizeUsers.service;

import io.jfrflabs.bmizeUsers.dao.AthleteDao;
import io.jfrflabs.bmizeUsers.model.Athlete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;
import java.util.UUID;

public class AthleteService {
    private final AthleteDao athleteDao;

    @Autowired
    public AthleteService(@Qualifier("FakeDao") AthleteDao athleteDao) {
        this.athleteDao = athleteDao;
    }

    int createAthlete(UUID athleteId, Athlete athlete){
        UUID athleteUUID = athleteId == null ? UUID.randomUUID(): athleteId;
        athleteDao.createAthlete(athleteId, athlete);
        return 1;
    }

    Athlete readAthleteById(UUID athleteId){
        return athleteDao.readAthleteById(athleteId);
    }

    List<Athlete> readAllAthletes(){
        return athleteDao.readAllAthletes();
    }

    int updateAthlete(UUID athleteId, Athlete updatedAthlete){
        athleteDao.updateAthlete(athleteId, updatedAthlete);
        return 1;
    }

    int deleteAthlete(UUID athleteId){
        athleteDao.deleteAthlete(athleteId);
        return 1;
    }

}
