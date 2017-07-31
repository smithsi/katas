package uk.co.mcguigan.trains;

import java.util.List;

public interface RailwayNetworkService {


    Integer calculateNumberOfRoutesWithExactNumberOfStops(final Station startingStation, final Station terminatingStation,
                                                          final Integer exactNumberOfStops);

    String calculateShortestDistance(final Station startingStation, final Station terminatingStation);

    String calculateDistance(final List<Station> visitedStations);

    Integer calculateNumberOfRoutesUnderASetDistance(final Station startingStation, final Station terminatingStation, final Integer distanceRemaining);
}