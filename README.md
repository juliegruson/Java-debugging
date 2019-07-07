# Dragon Saddle Size Checker

# Your Task
This program has recently been updated by a Warlock using a Wizard's Guide to Java book.
Sadly, it's not working. Try it our for your self by running the `gradlew run` task.

This produces output like:

> In the year 2019, dragons born in the year 1 AD will have a saddle size of 0.32757564452389476 meters

This should have been 20.18 meters!

Our Warlock friend attempted to create a new class called `com.openclassrooms.debugging.MetricConverter`
This class has unit tests which pass. In fact all the existing tests pass!
Try running them with `gradlew test`

## What should you do?

### Checkout the branch
1. Checkout the *activity* branch with ``git checkout activity``
1. Create a new branch for your solution with `git checkout -b activity-solution`

### Use the scientific method to solve the bug
1. Examine the clues provided below.
1. Create a failing test case which reproduces the bug.
1. Investigate the cause of failure by stepping through the code in the debugger.
1. Collect evidence in the form of debugger screenshots of the variables pane when you find 
the variables causing the issue.
1. Formulate a theory and apply a fix.
1. If your tests pass, enjoy the praise of Dragon Riders everywhere.
1. Create a screenshot of the passing test.
1. If not apply a new theory and test it.
1. Summarise your investigation in a few paragraphs in a new *SOULTION.md* markdown file.
1. `git add SOLUTION.md && git commit -m 'Added solution'`
1. Ensure you have commited your solution to your local branch
1. Provide your colleague with:
   1. Either a zip or a git repository they can clone to see your branch and run all the `fixed` program
   1. Key screenshots of the debugger during moments of your investigation which you found valuable
Clues:
* The Warlock modified `com.openclassrooms.debugging.DragonSaddleSizeGuesser` so that it uses a new MetricConverter
class to convert a saddle size in centimeters to meters.
* The MetricConverter has passing unit tests. A key difference between DragonSaddleSizeGuesser and the test is that
the test creates a MetricConverter by using the default constructor. DragonSaddleSizeGuesser, which is currently
failing, uses the singleton returned by calling MetricConverter.INSTANCE.
* There was supposed to be logic in the metric converter to return an alternative magical estimate in the event of a 
DragonApocalypse. You will see comments and a conditional referrering to this.
* Look for variables which help decide whether we are in a dragon apocalypse and ensure they are correct.
Tips:
* Remember to focus on understanding *why* before you change things.
* This code is written by Warlocks, so when you do get shocked by things which need changing add a *FIXME* comment.
* Our focus is on understanding the bug.



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

`./gradlew run`

This will default to the current year and provide you with an appopriate estimate.

### Calculate the Saddle Size of a Dragon in ANY year

You can pass any year to gradlew command using *--args <yyyymmdd>* 
Eg.

`./gradlew run --args 2019` 


This will return the saddle size in the year 2019
