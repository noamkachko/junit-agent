Example story

Narrative:
I would like to use music search

Scenario: search music
Meta:
@Features 1290
@Classification Integration
Given user enters music search tab
When user press recommendation button
Then recommendation list is opened

Scenario: As a user, I can search for an album by entering the artists first name
Meta:
@UserStories 1316
@Classification Integration
Given user enters music search tab
When search song by artist first name
Then song is presented in the grid

Scenario: As a user, I can search for an album by entering the artists last name
Meta:
@UserStories 1317
@Classification Integration
Given user enters music search tab
When search song by artist last name
Then song is presented in the grid


Scenario: As a user, I can search for free music
Meta:
@UserStories 1427
@Classification Integration
Given user enters music search tab
When search song by artist first name
Then song is presented in the grid