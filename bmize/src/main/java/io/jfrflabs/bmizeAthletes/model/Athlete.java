package io.jfrflabs.bmizeAthletes.model;

import java.util.UUID;

public class Athlete {

    private final UUID athleteId;
    private final String firstName;
    private final String lastName;
    private final float metricHeight;
    private final float metricWeight;

    public Athlete(UUID athleteId,
                   String firstName,
                   String lastName,
                   float metricHeight,
                   float metricWeight) {
        this.athleteId = athleteId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.metricHeight = metricHeight;
        this.metricWeight = metricWeight;
    }

    public UUID getAthleteId() {
        return athleteId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public float getMetricHeight() {
        return metricHeight;
    }

    public float getMetricWeight() {
        return metricWeight;
    }
}
