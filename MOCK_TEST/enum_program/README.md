Problem Statement
You are building an application that helps users organize their seasonal activities based on the 
weather conditions. You want to use EnumSet to efficiently manage the activities for each 
season.
-> Create a Season enum that includes various types of seasons SPRING, SUMMER, 
AUTUMN (Fall), and WINTER.
->Create an Activity enum that includes various types of activities like HIKING, SWIMMING, 
SKIING, PUMPKIN_CARVING
class SeasonalActivityOrganizer
->Your task is to implement the following:
->Create an EnumSet for each season to store the activities that are appropriate for that 
season.
->getActivitiesForSeason(Season season):
● This method takes a Season enum value as input and returns a set of Activity enum 
values that are suitable for the given season.
The default case in the switch statement should include appropriate error handling 
for cases where an unknown or unsupported season value is provided. 
("Unknown season: " + season)
->addActivityForSeason(Activity activity, Season season):
● This method adds an Activity enum value to the set of activities appropriate for the 
specified season and then returns the updated set of activities for that season("Unknown 
season: " + season).
The default case in the switch statement should include appropriate error handling 
for cases where an unknown or unsupported season value is provided("Unknown 
season: " + season). 
->removeActivityFromAllSeasons(Activity activity):
● This method removes an Activity enum value from the set of activities for all seasons if it 
exists and then returns the updated set of all activities.
->getAllActivities():
● This method returns a set containing all the Activity enum values from all seasons.
