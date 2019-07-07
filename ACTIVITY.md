# Your Task

A few weeks after fixing the last bug left in your code by a real life wizard, you are called in to fix another one!

You find the following email in your inbox and immediately put on your Sherlock Holmes hat:

> Hi there friend!
>
> We were so grateful that you managed to fix that last bug which impacted our sales teams.
>
> Saroman de Wit was helping us out by cleaning up the code and adding a class to convert our saddle sizes 
> from centimeters to meters.
>
> Sadly, he left us for Middle Earth shortly after making this change and we 
> can no longer estimate saddle sizes!
> 
> Saroman was new to Java and chose to write his code by concocting a spell.
> Sadly, it's not working! 
>
> You'll find the code on the *activity* branch.
> Try it our for yourself by checking it out and running the `gradlew run` task.
>
> This produces output like:
>> In the year 2019, dragons born in the year 1 AD will have a saddle size of 0.32757564452389476 meters
> This should have been 20.18 meters, not 0.32757....!
>
> Our Warlock friend had created a new class called `com.openclassrooms.debugging.MetricConverter`
> This class has unit tests which pass. In fact all the existing tests pass!
> Try running them with `gradlew test`
> 
> Clair Voyant, an external consultant, has confirmed that the solution to this problem should be very similar to the 
> last bug you fixed and estimated that it can be fixed in three lines of code.
> 
> Since we want to learn from this mistake, we'd like you to investigate the issue and explain its cause so that we can
> avoid repeating it in the future.
>
> Help us please. You are our only hope!

## Deliverable Guidelines

### Checkout the branch
1. Checkout the *activity* branch with ``git checkout activity``
1. Create a new branch for your solution called *activity-solution* with `git checkout -b activity-solution`

### Use the scientific method to solve the bug
1. Examine the evidence provided below.
1. Create and commit a failing test case which reproduces the bug in a *test* class called:
   com.openclassrooms.debugger.MetricConverterBugTest.
1. Investigate the cause of failure by stepping through the code in the debugger.
1. Collect evidence from the debugger, using screenshots of:
    * The variables pane when you find the variables causing the issue. 
    * The call stack (in the Frames pane) when you find key parts of the code where the issue occurs
    * The Breakpoints which you found most helpful.
1. Formulate a theory and apply a fix.
1. If your tests pass, enjoy the praise of Dragon Riders everywhere.
1. Create a screenshot of the passing test.
1. If not apply a new theory and test it.
1. Summarise your investigation and the cause of the bug in no more than a few paragraphs in a 
new *LEARNINGS.md* markdown file.
   1.List any theories you tested
   1.List debugging techniques you found useful. 
1. `git add SOLUTION.md && git commit -m 'Added solution'`
1. Ensure you have committed your solution on the activity-solution branch
1. Provide us with:
   1. Either a zip or a git repository they can clone to see your branch and run all the `fixed` program
   1. Key screenshots of the debugger during moments of your investigation which you found valuable
1. This code is written by Warlocks, so when you do get shocked by code which needs changing add a *FIXME* comment.


### Evidence
* Saroman modified `com.openclassrooms.debugging.DragonSaddleSizeGuesser` so that it uses a new MetricConverter
class to convert a saddle size in centimeters to meters.
* The MetricConverter has passing unit tests. A key difference between DragonSaddleSizeGuesser and the test is that
the test creates a MetricConverter by using the no arguments constructor. DragonSaddleSizeGuesser, which is currently
failing, uses the singleton returned by calling `MetricConverter.INSTANCE`.
* There was *supposed to be* logic in the metric converter to return an alternative magical estimate in the event of a 
DragonApocalypse. There seem to be comments and a conditional statement referrering to this.

## Evaluation Guidelines
To validate the skill of *finding and fixing a bug using the debugger* the submitted solution should be checked for 
the following criteria (all criteria must be validated in order to acquire the skill):

* The failing test and fix should be committed to the *activity-solution branch*; To test this:
   * Either clone or unzip the project
   * Checkout the branch with `git checkout activity-solution` 
   * Use `git log` to view the history on the activity-solution branch
     * You should see the test under *src/test/java/com/openclassrooms/debugging/MetricConverterBugTest.java* 
     * Any code changes made should also be visible in the commit history. There may be multiple commits if different
     theories were tested.
* Running gradle with the *test* task (`./gradlew test`) should result in tests passing.
* Running gradle with the *run* task (`./gradlew run`) will produce an correct estimate:
  * For instance, running `./gradlew run` or `gradlew.sh run` in 2019, results in: 
    > In the year 2019, dragons born in the year 1 AD will have a saddle size of 20.18 meters
  * The output should contain the current year(eg. 2019, 2020, 2021 etc.) and a saddle size set to the the 
  value of the *previous year divided by 100* (eg. 20.18 for the year 2019, 20.19 for the year 2020, etc.) 
* A brief summary of the investigation should be included in a *LEARNINGS.md* file, with an explanation of the cause of
the bug and theories tested. This should be no longer than 800 words and can ideally just consist of a few paragraphs.
* Screenshots should be provided and referenced in the LEARNINGS.md file. These should show:
     * key variables which cause the bug to manifest:
      * The static variable MetricConverter.NOT_A_DRAGON_APOCALYPSE and a related field is key to this. Screenshots
      should  be used to demonstrate identifying whether they are set as expected.
     * The call stack leading to areas which were considered relevant to solving the bug.
     * Breakpoints which were helpful

# Evaluation of the Skill
This skill will be validated by providing evidence of debugging a Java bug using a scientific method, a failing test and 
the Java Debugger