# Pseudocode for the Optimization Algorithm:

    function optimizeSignalTiming(trafficDataList):
    for each intersection in trafficDataList:
        trafficDensity = calculateTrafficDensity(intersection)
        vehicleQueue = calculateVehicleQueue(intersection)
        pedestrianFlow = calculatePedestrianFlow(intersection)
        peakHourFactor = getPeakHourFactor()

        greenTime = baseGreenTime * trafficDensity * peakHourFactor
        redTime = baseRedTime + pedestrianFlow

        updateSignalTiming(intersection, greenTime, redTime)
