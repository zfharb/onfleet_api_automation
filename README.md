-This is a simple framework that uses https://openweathermap.org/ to demo how to test an API. 
There will be no real authentication with token using an API because this is just a demo.

-Assumption: This will be run on a window machine. therefore,
the gradle commands will start with : gradle
if used with mac, then start the commands with ./gradlew

-To execute the test and see the report, run these commands:

git clone https://github.com/zfharb/onfleet_api_automation.git  ###this will clone the repo.

gradle  ###this will get the dependencies.

/*this will execute the test and prepare the report.*/
gradle clean build allureReport   /*this will execute the test and prepare the report.*/

gradle build allureServe   //this will open the report.
