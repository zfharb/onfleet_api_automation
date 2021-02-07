-This is a simple framework that uses https://openweathermap.org/ to demo how to test an API. 
There will be no real authentication with token using an API because this is just a demo.

-Assumption: This will be run on a window machine. therefore,
the gradle commands will start with : gradle
if used with mac, then start the commands with ./gradlew

-To execute the test and see the report, run these commands:

##this will clone the repo. <br />
git clone https://github.com/zfharb/onfleet_api_automation.git

###this will get the dependencies. <br />
gradle

###this will execute the test and prepare the report. <br />
gradle clean build allureReport 

###this will open the report. <br />
gradle build allureServe
