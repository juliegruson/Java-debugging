# Dragon Saddle Size Checker

# This Branch

This branch is instrumented with log events.

# Your challenge 

* Add info and debug level logging to the DragonSaddleSizeVerifier class.
  * Create a new Logger in that class, passing in that Class to the slf4j LoggerFactory.
  * Add Info, Debug level logging to that class.
  * Add Error level logging before throwing an exception.
  * Check the log level in  src/main/resources/application.properties.
  * Start the application with `./gradlew bootRun`
  * Visit http://localhost:9999/dragon/size to see an estimate
  * Visit http://localhost:9999/dragon/size/year/-2 to cause an InvalidSaddleSizeException
  * Check the logs.
  * Change the log levels and try again.
  

# The bug that defeated a dragon
As everyone knows Dragons are mythical creatures which do not exist
in nature. Not naturally, that is. 

It is a little known fact that in the year 1 AD, the wise
alchemist Lou Tan Dey-ta created a small batch
of dragons using unnatural means and a number of fizzy potions.
Those dragons still fly the skies today.

Dragons are extremely long lived and grow at a constant, but slow rate. 
Buying the right dragon saddle is a tricky business.

In order to help those lucky enough to one day ride on these dragons
Lou Tan published an algorithm for calculating the size of a saddle based
on the age of a Dragon. 

Centuries later this algorithm was hurriedly re-written in Java in
order to help those fortunate enough to require dragon saddles. The code leaves
a lot to be desired.


The Dragon Saddle Size Guesser has also become an unlikely party favourite!

Sadly, it now has a bug.

# Running this Application

### Calculate the Saddle Size of a Dragon in the Current Year

`./gradlew bootRun`

This will start the web application.

* Visit http://localhost:9999/dragon/size to see an estimate for the current year
* Visit http://localhost:9999/dragon/size/year/2019 to see an estimate for 2019. Replace the year as appropriate.


