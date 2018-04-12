Program Description
----
This program takes prints weather data from different regions.

Each region is expected to have a List of Weather station objects.

## The problem
The weather stations from a 3rd party vendor (the NOAA) are returned in an Array.

Because of this, our program can't print that data.

There are a couple ways we could account for the Array-List mismatch. 

The adapter pattern is the best way to go because we're dealing with a 3rd party vendor.

Remember we "can't" change the implementation of NooaRegionalWeather. 

(Imagine if the Nooa classes were contained in a .jar, for instance)

## Implement the solution
There's a file named _NoaaToStandardRegionalWeatherAdapter.java_. It is located in the _region_ package.

The skeleton class is already created. You just have to implement the second method inside.

If you get really stuck, take a look at _StandardRegionalWeatherImpl.java_.